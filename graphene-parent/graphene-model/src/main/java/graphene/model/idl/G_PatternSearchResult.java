/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package graphene.model.idl;  
@SuppressWarnings("all")
/** A single search result is some annotated subgraph */
@org.apache.avro.specific.AvroGenerated
public class G_PatternSearchResult extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"G_PatternSearchResult\",\"namespace\":\"graphene.model.idl\",\"doc\":\"A single search result is some annotated subgraph\",\"fields\":[{\"name\":\"score\",\"type\":\"double\",\"doc\":\"search score\",\"default\":0},{\"name\":\"entities\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"G_EntityMatchResult\",\"doc\":\"An entity that returns from pattern matching as part of a subgraph.\",\"fields\":[{\"name\":\"score\",\"type\":\"double\",\"doc\":\"search score\",\"default\":0},{\"name\":\"uid\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"UID of the matched G_EntityMatchDescriptor in the matched pattern\",\"default\":null},{\"name\":\"role\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"role name of the matched G_EntityMatchDescriptor in the matched pattern\",\"default\":null},{\"name\":\"entity\",\"type\":{\"type\":\"record\",\"name\":\"G_Entity\",\"doc\":\"* The nodes in the social, financial, communications or other graphs. May\\r\\n\\t * represent concrete individuals or organizations, specific proxies such as\\r\\n\\t * accounts, or the implicit individuals or groups behind those other\\r\\n\\t * entities.\",\"fields\":[{\"name\":\"uid\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"* This uid must represent either (1) a globally unique identifier that\\r\\n\\t\\t * can be used to retrieve data for an explicit entity, or (2) encoded\\r\\n\\t\\t * query information that can be used to find a set of associated record\\r\\n\\t\\t * notionally representing an implicit entity (e.g.\\r\\n\\t\\t * Loans&FirstName&LastName&Gender). Must not be used for IDs that\\r\\n\\t\\t * aren't globally unique. For example, in Kiva, \\\"Lenders\\\" has a UID\\r\\n\\t\\t * (\\\"L12345\\\") while \\\"Borrowers\\\" have an encoded search in the Loans\\r\\n\\t\\t * table for uid (\\\"B{loan:23456;name=Daniel}\\\"). The encoded information\\r\\n\\t\\t * is data layer-specific, may be different from entity to entity or\\r\\n\\t\\t * data set to data set, and should be considered opaque to the\\r\\n\\t\\t * consumers of the entities. Entities of type 2 should always have the\\r\\n\\t\\t * Entity Tag ANONYMOUS to help distinguish them when required.\"},{\"name\":\"tags\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"enum\",\"name\":\"G_EntityTag\",\"doc\":\"* The 21st century meaning, \\\"conceal from unauthorized\\r\\n\\t\\t\\t\\t\\t\\t * view; censor but do not destroy\\\"\",\"symbols\":[\"ACCOUNT_OWNER\",\"ACCOUNT\",\"GROUP\",\"CLUSTER\",\"CLUSTER_SUMMARY\",\"FILE\",\"ANONYMOUS\",\"OTHER\",\"REDACTED\"]}},\"doc\":\"Entity Tags (see above, e.g. \\\"ACCOUNT\\\")\"},{\"name\":\"provenance\",\"type\":[{\"type\":\"record\",\"name\":\"G_Provenance\",\"doc\":\"* This is a placeholder for future modeling of provenance. It is not a\\r\\n\\t * required field in any service calls.\",\"fields\":[{\"name\":\"uri\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Placeholder for now. Express provenance as a single URI.\"}]},\"null\"],\"default\":null},{\"name\":\"uncertainty\",\"type\":[{\"type\":\"record\",\"name\":\"G_Uncertainty\",\"doc\":\"* This is a placeholder for future modeling of uncertainty. It is not a\\r\\n\\t * required field in any service calls.\\r\\n\\t *\",\"fields\":[{\"name\":\"confidence\",\"type\":\"double\",\"doc\":\"* Placeholder for now. Express original source confidence as a single\\r\\n\\t\\t * number from 0 to 1.\",\"default\":1},{\"name\":\"type\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"* For describing the nature of the uncertainty (source data, algorithm,\\r\\n\\t\\t * unit, etc)\",\"default\":null}]},\"null\"],\"default\":null},{\"name\":\"properties\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"G_Property\",\"doc\":\"* Each property on an Entity or Link is a name-value pair, with data type\\r\\n\\t * information, as well as optional provenance. Tags provide a way for the\\r\\n\\t * data provider to associate semantic annotations to each property in terms\\r\\n\\t * of the semantics of the application.\\r\\n\\t *\",\"fields\":[{\"name\":\"key\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"the field name in the underlying data source\"},{\"name\":\"friendlyText\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"user-friendly short-text for key (displayable)\",\"default\":null},{\"name\":\"range\",\"type\":[{\"type\":\"record\",\"name\":\"G_SingletonRange\",\"doc\":\"* Single value\\r\\n\\t *\",\"fields\":[{\"name\":\"value\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"int\",\"float\",\"double\",\"long\",\"boolean\",{\"type\":\"record\",\"name\":\"G_GeoData\",\"doc\":\"* Structured representation of geo-spatial data.\",\"fields\":[{\"name\":\"text\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"an address or other place reference; unstructured text field\",\"default\":null},{\"name\":\"lat\",\"type\":[\"double\",\"null\"],\"doc\":\"latitude\",\"default\":null},{\"name\":\"lon\",\"type\":[\"double\",\"null\"],\"doc\":\"longitude\",\"default\":null},{\"name\":\"cc\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"ISO 3 digit country code\",\"default\":null}]}]},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"G_PropertyType\",\"doc\":\"* The 21st century meaning, \\\"conceal from unauthorized\\r\\n\\t\\t\\t\\t\\t\\t * view; censor but do not destroy\\\"\",\"symbols\":[\"DOUBLE\",\"LONG\",\"BOOLEAN\",\"STRING\",\"DATE\",\"GEO\",\"IMAGE\",\"URI\",\"OTHER\",\"REDACTED\"]},\"doc\":\"One of DOUBLE, LONG, BOOLEAN, STRING, DATE, GEO, OTHER\"}]},{\"type\":\"record\",\"name\":\"G_ListRange\",\"doc\":\"* List of values\\r\\n\\t *\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"int\",\"float\",\"double\",\"long\",\"boolean\",\"G_GeoData\"]}},{\"name\":\"type\",\"type\":\"G_PropertyType\",\"doc\":\"One of DOUBLE, LONG, BOOLEAN, STRING, DATE, GEO, OTHER\"}]},{\"type\":\"record\",\"name\":\"G_BoundedRange\",\"doc\":\"* Bounded or unbounded range values\\r\\n\\t *\",\"fields\":[{\"name\":\"start\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"int\",\"float\",\"double\",\"long\",\"boolean\",\"G_GeoData\",\"null\"],\"doc\":\"start of range, or null if unbounded start\"},{\"name\":\"end\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"int\",\"float\",\"double\",\"long\",\"boolean\",\"G_GeoData\",\"null\"],\"doc\":\"end of range, or null if unbounded start\"},{\"name\":\"inclusive\",\"type\":\"boolean\",\"doc\":\"* If true, range includes specified endpoint. If false, range is\\r\\n\\t\\t * exclusive.\"},{\"name\":\"type\",\"type\":\"G_PropertyType\",\"doc\":\"One of DOUBLE, LONG, BOOLEAN, STRING, DATE, GEO, OTHER\"}]},{\"type\":\"record\",\"name\":\"G_DistributionRange\",\"doc\":\"* Describes a distribution of values.\\r\\n\\t *\",\"fields\":[{\"name\":\"distribution\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"G_Frequency\",\"doc\":\"* A frequency or probability element of a distribution.\\r\\n\\t *\",\"fields\":[{\"name\":\"range\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"int\",\"float\",\"double\",\"long\",\"boolean\",\"G_GeoData\",\"G_ListRange\",\"G_BoundedRange\"],\"doc\":\"the value range which occurs with some specified frequency\"},{\"name\":\"frequency\",\"type\":\"double\",\"doc\":\"frequency as a count, or probability as a value from 0-1.\"}]}}},{\"name\":\"rangeType\",\"type\":{\"type\":\"enum\",\"name\":\"G_RangeType\",\"doc\":\"* Allowed types for Ranges of values.\\r\\n\\t *\",\"symbols\":[\"SINGLETON\",\"LIST\",\"BOUNDED\",\"DISTRIBUTION\"]},\"doc\":\"Describes how the values in the distribution are summarized\"},{\"name\":\"type\",\"type\":\"G_PropertyType\",\"doc\":\"* The type of value that the distribution describes. One of DOUBLE,\\r\\n\\t\\t * LONG, BOOLEAN, STRING, DATE, GEO, OTHER\"},{\"name\":\"isProbability\",\"type\":\"boolean\",\"doc\":\"True if a probability distribution, false if a frequency distribution\",\"default\":false}]}],\"doc\":\"range of values\",\"default\":null},{\"name\":\"provenance\",\"type\":[\"G_Provenance\",\"null\"],\"default\":null},{\"name\":\"uncertainty\",\"type\":[\"G_Uncertainty\",\"null\"],\"default\":null},{\"name\":\"tags\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"enum\",\"name\":\"G_PropertyTag\",\"doc\":\"* Tags are defined by the application layer as a taxonomy of user and\\r\\n\\t * application concepts, independent of the data sources. This allows\\r\\n\\t * application semantics to be re-used with new data, with a minimum of new\\r\\n\\t * software design and development. Data layer entity types, link types and\\r\\n\\t * properties should be mapped into the list of tags. The application layer\\r\\n\\t * must be able to search by native field name or by tag interchangeably,\\r\\n\\t * and properties returned must contain both native field names as well as\\r\\n\\t ","* tags.\\r\\n\\t * \\r\\n\\t * The list of tags may change as application features evolve, though that\\r\\n\\t * will require collaboration with the data layer providers. Evolving the\\r\\n\\t * tag list should not change the Data Access or Search APIs.\\r\\n\\t * \\r\\n\\t * This is the current list of tags for Properties:\\r\\n\\t * \\r\\n\\t *\",\"symbols\":[\"ID\",\"TYPE\",\"ENTITY_TYPE\",\"ACCOUNT_OWNER\",\"CLUSTER_SUMMARY\",\"NAME\",\"LABEL\",\"STAT\",\"TEXT\",\"STATUS\",\"ANNOTATION\",\"WARNING\",\"LINKED_DATA\",\"IMAGE\",\"VIDEO\",\"AUDIO\",\"GEO\",\"COUNTRY_CODE\",\"DATE\",\"AMOUNT\",\"INFLOWING\",\"OUTFLOWING\",\"COUNT\",\"SERIES\",\"CONSTRUCTED\",\"RAW\",\"USD\",\"DURATION\",\"REDACTED\"]}},\"doc\":\"* one or more tags from the Tag list, used to map this source-specific\\r\\n\\t\\t * field into the semantics of applications\"}]}}}]},\"doc\":\"the entity\"}]}},\"doc\":\"entity results \\r\\n\\t\\t\\tThere needs to be at least one entity in the result\"},{\"name\":\"links\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"G_LinkMatchResult\",\"doc\":\"A link that returns from pattern matching as part of a subgraph.\",\"fields\":[{\"name\":\"score\",\"type\":\"double\",\"doc\":\"search score\",\"default\":0},{\"name\":\"uid\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"UID of the matched G_LinkMatchDescriptor in the matched pattern\",\"default\":null},{\"name\":\"role\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"role name of the matched G_LinkMatchDescriptor in the matched pattern\",\"default\":null},{\"name\":\"link\",\"type\":{\"type\":\"record\",\"name\":\"G_Link\",\"doc\":\"* The links in the social, financial, communications or other graphs. May\\r\\n\\t * represent communication events, financial transactions or social\\r\\n\\t * connections.\",\"fields\":[{\"name\":\"source\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"source entity uid\",\"default\":null},{\"name\":\"target\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"target entity uid\",\"default\":null},{\"name\":\"directed\",\"type\":\"boolean\",\"doc\":\"true if directed, false if undirected\",\"default\":true},{\"name\":\"provenance\",\"type\":[\"G_Provenance\",\"null\"],\"default\":null},{\"name\":\"uncertainty\",\"type\":[\"G_Uncertainty\",\"null\"],\"default\":null},{\"name\":\"properties\",\"type\":{\"type\":\"array\",\"items\":\"G_Property\"}},{\"name\":\"tags\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"enum\",\"name\":\"G_LinkTag\",\"doc\":\"* The 21st century meaning, \\\"conceal from unauthorized\\r\\n\\t\\t\\t\\t\\t\\t * view; censor but do not destroy\\\"\",\"symbols\":[\"FINANCIAL\",\"SOCIAL\",\"COMMUNICATION\",\"EVENT\",\"OTHER\",\"REDACTED\",\"FATHER_OF\",\"SON_OF\",\"MOTHER_OF\",\"DAUGHTER_OF\",\"BROTHER_OF\",\"SISTER_OF\",\"GUARDIAN_OF\",\"KIN_OF\",\"COUSIN_OF\",\"WIFE_OF\",\"HUSBAND_OF\",\"EMPLOYEE_OF\",\"OWNER_OF\",\"SELLER_OF\",\"BUYER_OF\",\"CREATOR_OF\",\"FRIEND_OF\",\"ENEMY_OF\",\"KNOWS\"]}},\"doc\":\"Link Tags\"}]},\"doc\":\"the link\"}]}},\"null\"],\"doc\":\"links between those entities *\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** search score */
   private double score;
  /** entity results 
			There needs to be at least one entity in the result */
   private java.util.List<graphene.model.idl.G_EntityMatchResult> entities;
  /** links between those entities * */
   private java.util.List<graphene.model.idl.G_LinkMatchResult> links;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public G_PatternSearchResult() {}

  /**
   * All-args constructor.
   */
  public G_PatternSearchResult(java.lang.Double score, java.util.List<graphene.model.idl.G_EntityMatchResult> entities, java.util.List<graphene.model.idl.G_LinkMatchResult> links) {
    this.score = score;
    this.entities = entities;
    this.links = links;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return score;
    case 1: return entities;
    case 2: return links;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: score = (java.lang.Double)value$; break;
    case 1: entities = (java.util.List<graphene.model.idl.G_EntityMatchResult>)value$; break;
    case 2: links = (java.util.List<graphene.model.idl.G_LinkMatchResult>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'score' field.
   * search score   */
  public java.lang.Double getScore() {
    return score;
  }

  /**
   * Sets the value of the 'score' field.
   * search score   * @param value the value to set.
   */
  public void setScore(java.lang.Double value) {
    this.score = value;
  }

  /**
   * Gets the value of the 'entities' field.
   * entity results 
			There needs to be at least one entity in the result   */
  public java.util.List<graphene.model.idl.G_EntityMatchResult> getEntities() {
    return entities;
  }

  /**
   * Sets the value of the 'entities' field.
   * entity results 
			There needs to be at least one entity in the result   * @param value the value to set.
   */
  public void setEntities(java.util.List<graphene.model.idl.G_EntityMatchResult> value) {
    this.entities = value;
  }

  /**
   * Gets the value of the 'links' field.
   * links between those entities *   */
  public java.util.List<graphene.model.idl.G_LinkMatchResult> getLinks() {
    return links;
  }

  /**
   * Sets the value of the 'links' field.
   * links between those entities *   * @param value the value to set.
   */
  public void setLinks(java.util.List<graphene.model.idl.G_LinkMatchResult> value) {
    this.links = value;
  }

  /** Creates a new G_PatternSearchResult RecordBuilder */
  public static graphene.model.idl.G_PatternSearchResult.Builder newBuilder() {
    return new graphene.model.idl.G_PatternSearchResult.Builder();
  }
  
  /** Creates a new G_PatternSearchResult RecordBuilder by copying an existing Builder */
  public static graphene.model.idl.G_PatternSearchResult.Builder newBuilder(graphene.model.idl.G_PatternSearchResult.Builder other) {
    return new graphene.model.idl.G_PatternSearchResult.Builder(other);
  }
  
  /** Creates a new G_PatternSearchResult RecordBuilder by copying an existing G_PatternSearchResult instance */
  public static graphene.model.idl.G_PatternSearchResult.Builder newBuilder(graphene.model.idl.G_PatternSearchResult other) {
    return new graphene.model.idl.G_PatternSearchResult.Builder(other);
  }
  
  /**
   * RecordBuilder for G_PatternSearchResult instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<G_PatternSearchResult>
    implements org.apache.avro.data.RecordBuilder<G_PatternSearchResult> {

    private double score;
    private java.util.List<graphene.model.idl.G_EntityMatchResult> entities;
    private java.util.List<graphene.model.idl.G_LinkMatchResult> links;

    /** Creates a new Builder */
    private Builder() {
      super(graphene.model.idl.G_PatternSearchResult.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(graphene.model.idl.G_PatternSearchResult.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.score)) {
        this.score = data().deepCopy(fields()[0].schema(), other.score);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.entities)) {
        this.entities = data().deepCopy(fields()[1].schema(), other.entities);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.links)) {
        this.links = data().deepCopy(fields()[2].schema(), other.links);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing G_PatternSearchResult instance */
    private Builder(graphene.model.idl.G_PatternSearchResult other) {
            super(graphene.model.idl.G_PatternSearchResult.SCHEMA$);
      if (isValidValue(fields()[0], other.score)) {
        this.score = data().deepCopy(fields()[0].schema(), other.score);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.entities)) {
        this.entities = data().deepCopy(fields()[1].schema(), other.entities);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.links)) {
        this.links = data().deepCopy(fields()[2].schema(), other.links);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'score' field */
    public java.lang.Double getScore() {
      return score;
    }
    
    /** Sets the value of the 'score' field */
    public graphene.model.idl.G_PatternSearchResult.Builder setScore(double value) {
      validate(fields()[0], value);
      this.score = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'score' field has been set */
    public boolean hasScore() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'score' field */
    public graphene.model.idl.G_PatternSearchResult.Builder clearScore() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'entities' field */
    public java.util.List<graphene.model.idl.G_EntityMatchResult> getEntities() {
      return entities;
    }
    
    /** Sets the value of the 'entities' field */
    public graphene.model.idl.G_PatternSearchResult.Builder setEntities(java.util.List<graphene.model.idl.G_EntityMatchResult> value) {
      validate(fields()[1], value);
      this.entities = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'entities' field has been set */
    public boolean hasEntities() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'entities' field */
    public graphene.model.idl.G_PatternSearchResult.Builder clearEntities() {
      entities = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'links' field */
    public java.util.List<graphene.model.idl.G_LinkMatchResult> getLinks() {
      return links;
    }
    
    /** Sets the value of the 'links' field */
    public graphene.model.idl.G_PatternSearchResult.Builder setLinks(java.util.List<graphene.model.idl.G_LinkMatchResult> value) {
      validate(fields()[2], value);
      this.links = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'links' field has been set */
    public boolean hasLinks() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'links' field */
    public graphene.model.idl.G_PatternSearchResult.Builder clearLinks() {
      links = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public G_PatternSearchResult build() {
      try {
        G_PatternSearchResult record = new G_PatternSearchResult();
        record.score = fieldSetFlags()[0] ? this.score : (java.lang.Double) defaultValue(fields()[0]);
        record.entities = fieldSetFlags()[1] ? this.entities : (java.util.List<graphene.model.idl.G_EntityMatchResult>) defaultValue(fields()[1]);
        record.links = fieldSetFlags()[2] ? this.links : (java.util.List<graphene.model.idl.G_LinkMatchResult>) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
