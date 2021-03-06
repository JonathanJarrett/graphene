package graphene.model.idl;

/**
 * Modeled after org.apache.tapestry5.SymbolConstants Note for version we use
 * SymbolConstants.APPLICATION_VERSION because it will also adjust caching and
 * asset versioning rules for us.
 * 
 * @author djue
 * 
 */
public class G_SymbolConstants {
	private G_SymbolConstants() {
		// TODO Auto-generated constructor stub
	}
	public static final String APPLICATION_NAME = "graphene.application-name";
	//The string for who to contact about this application
	public static final String APPLICATION_CONTACT = "graphene.application-contact";
	public static final String THEME_PATH = "graphene.theme-path";
	public static final String DATABASE_PROPERTIES_LOCATION = "graphene.database-properties-location";

	public static final String MIDTIER_SERVER_URL = "graphene.midtier-database-url";
	public static final String MIDTIER_SERVER_USERNAME = "graphene.midtier-database-username";
	public static final String MIDTIER_SERVER_PASSWORD = "graphene.midtier-database-password";

	public static final String MIDTIER_SERVER2_URL = "graphene.midtier2-database-url";
	public static final String MIDTIER_SERVER2_USERNAME = "graphene.midtier2-database-username";
	public static final String MIDTIER_SERVER2_PASSWORD = "graphene.midtier2-database-password";

	/**
	 * Should not be overriden by runtime properties. The value of this key is
	 * supplied by the core's app module, and it is hard coded into all the
	 * core's components and T5 pages at this time.
	 */
	public static final String GRAPHENE_WEB_CORE_PREFIX = "graphene.core-web-prefix";;
}
