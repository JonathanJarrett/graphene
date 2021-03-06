package graphene.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import org.apache.tapestry5.ioc.services.SymbolProvider;
import org.apache.tapestry5.ioc.util.CaseInsensitiveMap;
import org.slf4j.Logger;

/**
 * A simple provider that attempts to read a properties file from the classpath
 * or filesystem (you specify). Values are read into a map, which can then be
 * accessed using valueForSymbol(String key)
 * 
 * Here are two examples you would specify in your nearest module class:
 * 
 * // make configuration from 'test.properties' on the classpath available as
 * symbols
 * 
 * public PropertiesFileSymbolProvider
 * buildClasspathPropertiesFileSymbolProvider(Logger logger) {
 * 
 * return new PropertiesFileSymbolProvider(logger, "test.properties", true);
 * 
 * }
 * 
 * 
 * // make configuration from 'test2.properties' on the filesystem available as
 * symbols
 * 
 * public PropertiesFileSymbolProvider
 * buildFilesystemPropertiesFileSymbolProvider(Logger logger) {
 * 
 * return new PropertiesFileSymbolProvider(logger,
 * "src/main/webapp/WEB-INF/test2.properties", false);
 * 
 * }
 * 
 * 
 * Then you can inject
 * 
 * @author djue
 * 
 */
public class PropertiesFileSymbolProvider implements SymbolProvider {

	private final Map<String, String> propertiesMap = new CaseInsensitiveMap<String>();
	private String resourceName;

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	/**
	 * Instantiate a new PropertiesFileSymbolProvider using a given resource
	 * name
	 * 
	 * @param logger
	 *            the logger to log error messages to
	 * @param resourceName
	 *            the name of the resource to load
	 * @param classPath
	 *            whether to look on the classpath or filesystem
	 */
	public PropertiesFileSymbolProvider(Logger logger, String resourceName,
			boolean classPath) {
		this.resourceName = resourceName;
		try {
			InputStream in;

			if (classPath) {
				in = this.getClass().getClassLoader()
						.getResourceAsStream(resourceName);
				if (in == null) {
					in = ClassLoader.getSystemResourceAsStream(resourceName);
				}

				// ClassLoader.getSystemResourceAsStream() returns null if
				// the resource cannot be found on the classpath
				if (in == null)
					throw new FileNotFoundException();
			} else
				in = new FileInputStream(resourceName);

			initialize(logger, in);

		} catch (FileNotFoundException e) {
			String msg = "Could not find '" + resourceName + "'";

			logger.error(msg);

			throw new IllegalArgumentException(msg, e);
		}
	}

	/**
	 * Instantiate a PropertiesFileSymbolProvider using a given InputStream
	 * 
	 * @param logger
	 *            the logger
	 * @param in
	 *            an InputStream representing the resource
	 */
	public PropertiesFileSymbolProvider(Logger logger, InputStream in) {
		initialize(logger, in);
	}

	/**
	 * Instantiate a PropertiesFileSymbolProvider from a given URL.
	 * 
	 * @param logger
	 *            the logger
	 * @param url
	 *            an URL to open
	 */
	public PropertiesFileSymbolProvider(Logger logger, URL url) {
		try {
			initialize(logger, url.openStream());
		} catch (IOException e) {
			String msg = "IOException while opening URL '" + url + "': "
					+ e.getMessage();

			logger.error(msg);

			throw new IllegalArgumentException(msg, e);
		}
	}

	/**
	 * 
	 * @param logger
	 * @param in
	 */
	private void initialize(Logger logger, InputStream in) {
		Properties properties = new Properties();

		try {
			properties.load(in);
			// For some reason putAll() wasn't available. JVM version change?
			for (Entry<?, ?> e : properties.entrySet()) {
				propertiesMap.put((String) e.getKey(), (String) e.getValue());
			}
		} catch (IOException e) {
			String msg = "IOEception while loading properties: "
					+ e.getMessage();

			logger.error(msg);

			throw new IllegalArgumentException(msg, e);
		}
	}

	/**
	 * Return the value for the key, or null if not set.
	 */
	public String valueForSymbol(String arg0) {
		return propertiesMap.get(arg0);
	}

}