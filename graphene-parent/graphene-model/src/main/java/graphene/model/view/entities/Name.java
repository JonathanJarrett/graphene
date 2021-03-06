package graphene.model.view.entities;

import java.util.Properties;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Note that some platforms have a EmailAddress table, which can be used to
 * traverse across entities sharing an address by using the unique ID
 * 
 * @author PWG for DARPA
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Name {

	private String datasource_id;
	private String fullName = null;
	private String id;
	// Following transients are for future use
	@JsonIgnore
	private Properties properties;

	public Name() {
	}

	/**
	 * 
	 * @param source
	 *            String datasource ID
	 * @param id
	 *            String unique ID for the EmailAddress within the source
	 * @param address
	 *            String the address
	 */
	public Name(final String source, final String id, final String name) {
		this.datasource_id = source;
		this.id = id;
		this.fullName = name;
	}

	/**
	 * @param name
	 * @param value
	 */
	public void addProperty(final String name, final String value) {
		properties.put(name, value);
	}

	public String getDatasource_id() {
		return datasource_id;
	}

	public String getFullName() {
		return fullName;
	}

	public String getId() {
		return id;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setDatasource_id(final String datasource_id) {
		this.datasource_id = datasource_id;
	}

	public void setFullName(final String n) {
		this.fullName = n;
	}

	public void setId(final String id) {
		this.id = id;
	}
	@Override
	public boolean equals(final Object o)
	{
		return this.fullName.equals(((Name) o).fullName);
	}
	@Override
	public int hashCode()
	{
		return this.fullName.hashCode();
	}	

}
