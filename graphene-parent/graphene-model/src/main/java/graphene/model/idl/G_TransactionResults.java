/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package graphene.model.idl;  
@SuppressWarnings("all")
/** The set of transactions from a single call to getAllTransactions. */
@org.apache.avro.specific.AvroGenerated
public class G_TransactionResults extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"G_TransactionResults\",\"namespace\":\"graphene.model.idl\",\"doc\":\"The set of transactions from a single call to getAllTransactions.\",\"fields\":[{\"name\":\"total\",\"type\":\"long\",\"doc\":\"total number of results FOUND, which may be more than the number returned.\",\"default\":0},{\"name\":\"results\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"G_Link\",\"doc\":\"* The links in the social, financial, communications or other graphs. May\\r\\n\\t * represent communication events, financial transactions or social\\r\\n\\t * connections.\",\"fields\":[{\"name\":\"source\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"source entity uid\",\"default\":null},{\"name\":\"target\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"target entity uid\",\"default\":null},{\"name\":\"directed\",\"type\":\"boolean\",\"doc\":\"true if directed, false if undirected\",\"default\":true},{\"name\":\"provenance\",\"type\":[{\"type\":\"record\",\"name\":\"G_Provenance\",\"doc\":\"* This is a placeholder for future modeling of provenance. It is not a\\r\\n\\t * required field in any service calls.\",\"fields\":[{\"name\":\"uri\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Placeholder for now. Express provenance as a single URI.\"}]},\"null\"],\"default\":null},{\"name\":\"uncertainty\",\"type\":[{\"type\":\"record\",\"name\":\"G_Uncertainty\",\"doc\":\"* This is a placeholder for future modeling of uncertainty. It is not a\\r\\n\\t * required field in any service calls.\\r\\n\\t *\",\"fields\":[{\"name\":\"confidence\",\"type\":\"double\",\"doc\":\"* Placeholder for now. Express original source confidence as a single\\r\\n\\t\\t * number from 0 to 1.\",\"default\":1},{\"name\":\"type\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"* For describing the nature of the uncertainty (source data, algorithm,\\r\\n\\t\\t * unit, etc)\",\"default\":null}]},\"null\"],\"default\":null},{\"name\":\"properties\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"G_Property\",\"doc\":\"* Each property on an Entity or Link is a name-value pair, with data type\\r\\n\\t * information, as well as optional provenance. Tags provide a way for the\\r\\n\\t * data provider to associate semantic annotations to each property in terms\\r\\n\\t * of the semantics of the application.\\r\\n\\t *\",\"fields\":[{\"name\":\"key\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"the field name in the underlying data source\"},{\"name\":\"friendlyText\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"user-friendly short-text for key (displayable)\",\"default\":null},{\"name\":\"range\",\"type\":[{\"type\":\"record\",\"name\":\"G_SingletonRange\",\"doc\":\"* Single value\\r\\n\\t *\",\"fields\":[{\"name\":\"value\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"int\",\"float\",\"double\",\"long\",\"boolean\",{\"type\":\"record\",\"name\":\"G_GeoData\",\"doc\":\"* Structured representation of geo-spatial data.\",\"fields\":[{\"name\":\"text\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"an address or other place reference; unstructured text field\",\"default\":null},{\"name\":\"lat\",\"type\":[\"double\",\"null\"],\"doc\":\"latitude\",\"default\":null},{\"name\":\"lon\",\"type\":[\"double\",\"null\"],\"doc\":\"longitude\",\"default\":null},{\"name\":\"cc\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"ISO 3 digit country code\",\"default\":null}]}]},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"G_PropertyType\",\"doc\":\"* The 21st century meaning, \\\"conceal from unauthorized\\r\\n\\t\\t\\t\\t\\t\\t * view; censor but do not destroy\\\"\",\"symbols\":[\"DOUBLE\",\"LONG\",\"BOOLEAN\",\"STRING\",\"DATE\",\"GEO\",\"IMAGE\",\"URI\",\"OTHER\",\"REDACTED\"]},\"doc\":\"One of DOUBLE, LONG, BOOLEAN, STRING, DATE, GEO, OTHER\"}]},{\"type\":\"record\",\"name\":\"G_ListRange\",\"doc\":\"* List of values\\r\\n\\t *\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"int\",\"float\",\"double\",\"long\",\"boolean\",\"G_GeoData\"]}},{\"name\":\"type\",\"type\":\"G_PropertyType\",\"doc\":\"One of DOUBLE, LONG, BOOLEAN, STRING, DATE, GEO, OTHER\"}]},{\"type\":\"record\",\"name\":\"G_BoundedRange\",\"doc\":\"* Bounded or unbounded range values\\r\\n\\t *\",\"fields\":[{\"name\":\"start\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"int\",\"float\",\"double\",\"long\",\"boolean\",\"G_GeoData\",\"null\"],\"doc\":\"start of range, or null if unbounded start\"},{\"name\":\"end\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"int\",\"float\",\"double\",\"long\",\"boolean\",\"G_GeoData\",\"null\"],\"doc\":\"end of range, or null if unbounded start\"},{\"name\":\"inclusive\",\"type\":\"boolean\",\"doc\":\"* If true, range includes specified endpoint. If false, range is\\r\\n\\t\\t * exclusive.\"},{\"name\":\"type\",\"type\":\"G_PropertyType\",\"doc\":\"One of DOUBLE, LONG, BOOLEAN, STRING, DATE, GEO, OTHER\"}]},{\"type\":\"record\",\"name\":\"G_DistributionRange\",\"doc\":\"* Describes a distribution of values.\\r\\n\\t *\",\"fields\":[{\"name\":\"distribution\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"G_Frequency\",\"doc\":\"* A frequency or probability element of a distribution.\\r\\n\\t *\",\"fields\":[{\"name\":\"range\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"int\",\"float\",\"double\",\"long\",\"boolean\",\"G_GeoData\",\"G_ListRange\",\"G_BoundedRange\"],\"doc\":\"the value range which occurs with some specified frequency\"},{\"name\":\"frequency\",\"type\":\"double\",\"doc\":\"frequency as a count, or probability as a value from 0-1.\"}]}}},{\"name\":\"rangeType\",\"type\":{\"type\":\"enum\",\"name\":\"G_RangeType\",\"doc\":\"* Allowed types for Ranges of values.\\r\\n\\t *\",\"symbols\":[\"SINGLETON\",\"LIST\",\"BOUNDED\",\"DISTRIBUTION\"]},\"doc\":\"Describes how the values in the distribution are summarized\"},{\"name\":\"type\",\"type\":\"G_PropertyType\",\"doc\":\"* The type of value that the distribution describes. One of DOUBLE,\\r\\n\\t\\t * LONG, BOOLEAN, STRING, DATE, GEO, OTHER\"},{\"name\":\"isProbability\",\"type\":\"boolean\",\"doc\":\"True if a probability distribution, false if a frequency distribution\",\"default\":false}]}],\"doc\":\"range of values\",\"default\":null},{\"name\":\"provenance\",\"type\":[\"G_Provenance\",\"null\"],\"default\":null},{\"name\":\"uncertainty\",\"type\":[\"G_Uncertainty\",\"null\"],\"default\":null},{\"name\":\"tags\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"enum\",\"name\":\"G_PropertyTag\",\"doc\":\"* Tags are defined by the application layer as a taxonomy of user and\\r\\n\\t * application concepts, independent of the data sources. This allows\\r\\n\\t * application semantics to be re-used with new data, with a minimum of new\\r\\n\\t * software design and development. Data layer entity types, link types and\\r\\n\\t * properties should be mapped into the list of tags. The application layer\\r\\n\\t * must be able to search by native field name or by tag interchangeably,\\r\\n\\t * and properties returned must contain both native field names as well as\\r\\n\\t * tags.\\r\\n\\t * \\r\\n\\t * The list of tags may change as application features evolve, though that\\r\\n\\t * will require collaboration with the data layer providers. Evolving the\\r\\n\\t * tag list should not change the Data Access or Search APIs.\\r\\n\\t * \\r\\n\\t * This is the current list of tags for Properties:\\r\\n\\t * \\r\\n\\t *\",\"symbols\":[\"ID\",\"TYPE\",\"ENTITY_TYPE\",\"ACCOUNT_OWNER\",\"CLUSTER_SUMMARY\",\"NAME\",\"LABEL\",\"STAT\",\"TEXT\",\"STATUS\",\"ANNOTATION\",\"WARNING\",\"LINKED_DATA\",\"IMAGE\",\"VIDEO\",\"AUDIO\",\"GEO\",\"COUNTRY_CODE\",\"DATE\",\"AMOUNT\",\"INFLOWING\",\"OUTFLOWING\",\"COUNT\",\"SERIES\",\"CONSTRUCTED\",\"RAW\",\"USD\",\"DURATION\",\"REDACTED\"]}},\"doc\":\"* one or more tags from the Tag list, used to map this source-specific\\r\\n\\t\\t * field into the semantics of applications\"}]}}},{\"name\":\"tags\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"enum\",\"name\":\"G_LinkTag\",\"doc\":\"* The 21st century meaning, \\\"conceal from unauthorized\\r\\n\\t\\t\\t\\t\\t\\t * view; censor but do not destroy\\\"\",\"symbols\":[\"FINANCIAL\",\"SOCIAL\",\"COMMUNICATION\",\"EVENT\",\"OTHER\",\"REDACTED\",\"FATHER_OF\",\"SON_OF\",\"MOTHER_OF\",\"DAUGHTER_OF\",\"BROTHER_OF\",\"SISTER_OF\",\"GUARDIAN_OF\",\"KIN_OF\",\"COUSIN_OF\",\"WIFE_OF\",\"HUSBAND_OF\",\"EMPLOYEE_OF\",\"OWNER_OF\",\"SELLER_OF\",\"BUYER_OF\",\"CREATOR_OF\",\"FRIEND_OF\",\"ENEMY_OF\",\"KNOWS\"]}},\"doc\":\"Link Tags\"}]}},\"doc\":\"an array of transactions\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** total number of results FOUND, which may be more than the number returned. */
   private long total;
  /** an array of transactions */
   private java.util.List<graphene.model.idl.G_Link> results;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public G_TransactionResults() {}

  /**
   * All-args constructor.
   */
  public G_TransactionResults(java.lang.Long total, java.util.List<graphene.model.idl.G_Link> results) {
    this.total = total;
    this.results = results;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return total;
    case 1: return results;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: total = (java.lang.Long)value$; break;
    case 1: results = (java.util.List<graphene.model.idl.G_Link>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'total' field.
   * total number of results FOUND, which may be more than the number returned.   */
  public java.lang.Long getTotal() {
    return total;
  }

  /**
   * Sets the value of the 'total' field.
   * total number of results FOUND, which may be more than the number returned.   * @param value the value to set.
   */
  public void setTotal(java.lang.Long value) {
    this.total = value;
  }

  /**
   * Gets the value of the 'results' field.
   * an array of transactions   */
  public java.util.List<graphene.model.idl.G_Link> getResults() {
    return results;
  }

  /**
   * Sets the value of the 'results' field.
   * an array of transactions   * @param value the value to set.
   */
  public void setResults(java.util.List<graphene.model.idl.G_Link> value) {
    this.results = value;
  }

  /** Creates a new G_TransactionResults RecordBuilder */
  public static graphene.model.idl.G_TransactionResults.Builder newBuilder() {
    return new graphene.model.idl.G_TransactionResults.Builder();
  }
  
  /** Creates a new G_TransactionResults RecordBuilder by copying an existing Builder */
  public static graphene.model.idl.G_TransactionResults.Builder newBuilder(graphene.model.idl.G_TransactionResults.Builder other) {
    return new graphene.model.idl.G_TransactionResults.Builder(other);
  }
  
  /** Creates a new G_TransactionResults RecordBuilder by copying an existing G_TransactionResults instance */
  public static graphene.model.idl.G_TransactionResults.Builder newBuilder(graphene.model.idl.G_TransactionResults other) {
    return new graphene.model.idl.G_TransactionResults.Builder(other);
  }
  
  /**
   * RecordBuilder for G_TransactionResults instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<G_TransactionResults>
    implements org.apache.avro.data.RecordBuilder<G_TransactionResults> {

    private long total;
    private java.util.List<graphene.model.idl.G_Link> results;

    /** Creates a new Builder */
    private Builder() {
      super(graphene.model.idl.G_TransactionResults.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(graphene.model.idl.G_TransactionResults.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.total)) {
        this.total = data().deepCopy(fields()[0].schema(), other.total);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.results)) {
        this.results = data().deepCopy(fields()[1].schema(), other.results);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing G_TransactionResults instance */
    private Builder(graphene.model.idl.G_TransactionResults other) {
            super(graphene.model.idl.G_TransactionResults.SCHEMA$);
      if (isValidValue(fields()[0], other.total)) {
        this.total = data().deepCopy(fields()[0].schema(), other.total);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.results)) {
        this.results = data().deepCopy(fields()[1].schema(), other.results);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'total' field */
    public java.lang.Long getTotal() {
      return total;
    }
    
    /** Sets the value of the 'total' field */
    public graphene.model.idl.G_TransactionResults.Builder setTotal(long value) {
      validate(fields()[0], value);
      this.total = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'total' field has been set */
    public boolean hasTotal() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'total' field */
    public graphene.model.idl.G_TransactionResults.Builder clearTotal() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'results' field */
    public java.util.List<graphene.model.idl.G_Link> getResults() {
      return results;
    }
    
    /** Sets the value of the 'results' field */
    public graphene.model.idl.G_TransactionResults.Builder setResults(java.util.List<graphene.model.idl.G_Link> value) {
      validate(fields()[1], value);
      this.results = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'results' field has been set */
    public boolean hasResults() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'results' field */
    public graphene.model.idl.G_TransactionResults.Builder clearResults() {
      results = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public G_TransactionResults build() {
      try {
        G_TransactionResults record = new G_TransactionResults();
        record.total = fieldSetFlags()[0] ? this.total : (java.lang.Long) defaultValue(fields()[0]);
        record.results = fieldSetFlags()[1] ? this.results : (java.util.List<graphene.model.idl.G_Link>) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}