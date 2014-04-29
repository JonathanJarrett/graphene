/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package graphene.model.idl;  
@SuppressWarnings("all")
/** * Each property on an Entity or Link is a name-value pair, with data type
	 * information, as well as optional provenance. Tags provide a way for the
	 * data provider to associate semantic annotations to each property in terms
	 * of the semantics of the application.
	 * */
@org.apache.avro.specific.AvroGenerated
public class G_Property extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"G_Property\",\"namespace\":\"graphene.model.idl\",\"doc\":\"* Each property on an Entity or Link is a name-value pair, with data type\\r\\n\\t * information, as well as optional provenance. Tags provide a way for the\\r\\n\\t * data provider to associate semantic annotations to each property in terms\\r\\n\\t * of the semantics of the application.\\r\\n\\t *\",\"fields\":[{\"name\":\"key\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"the field name in the underlying data source\"},{\"name\":\"friendlyText\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"user-friendly short-text for key (displayable)\",\"default\":null},{\"name\":\"range\",\"type\":[{\"type\":\"record\",\"name\":\"G_SingletonRange\",\"doc\":\"* Single value\\r\\n\\t *\",\"fields\":[{\"name\":\"value\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"int\",\"float\",\"double\",\"long\",\"boolean\",{\"type\":\"record\",\"name\":\"G_GeoData\",\"doc\":\"* Structured representation of geo-spatial data.\",\"fields\":[{\"name\":\"text\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"an address or other place reference; unstructured text field\",\"default\":null},{\"name\":\"lat\",\"type\":[\"double\",\"null\"],\"doc\":\"latitude\",\"default\":null},{\"name\":\"lon\",\"type\":[\"double\",\"null\"],\"doc\":\"longitude\",\"default\":null},{\"name\":\"cc\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"ISO 3 digit country code\",\"default\":null}]}]},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"G_PropertyType\",\"doc\":\"* The 21st century meaning, \\\"conceal from unauthorized\\r\\n\\t\\t\\t\\t\\t\\t * view; censor but do not destroy\\\"\",\"symbols\":[\"DOUBLE\",\"LONG\",\"BOOLEAN\",\"STRING\",\"DATE\",\"GEO\",\"IMAGE\",\"URI\",\"OTHER\",\"REDACTED\"]},\"doc\":\"One of DOUBLE, LONG, BOOLEAN, STRING, DATE, GEO, OTHER\"}]},{\"type\":\"record\",\"name\":\"G_ListRange\",\"doc\":\"* List of values\\r\\n\\t *\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"int\",\"float\",\"double\",\"long\",\"boolean\",\"G_GeoData\"]}},{\"name\":\"type\",\"type\":\"G_PropertyType\",\"doc\":\"One of DOUBLE, LONG, BOOLEAN, STRING, DATE, GEO, OTHER\"}]},{\"type\":\"record\",\"name\":\"G_BoundedRange\",\"doc\":\"* Bounded or unbounded range values\\r\\n\\t *\",\"fields\":[{\"name\":\"start\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"int\",\"float\",\"double\",\"long\",\"boolean\",\"G_GeoData\",\"null\"],\"doc\":\"start of range, or null if unbounded start\"},{\"name\":\"end\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"int\",\"float\",\"double\",\"long\",\"boolean\",\"G_GeoData\",\"null\"],\"doc\":\"end of range, or null if unbounded start\"},{\"name\":\"inclusive\",\"type\":\"boolean\",\"doc\":\"* If true, range includes specified endpoint. If false, range is\\r\\n\\t\\t * exclusive.\"},{\"name\":\"type\",\"type\":\"G_PropertyType\",\"doc\":\"One of DOUBLE, LONG, BOOLEAN, STRING, DATE, GEO, OTHER\"}]},{\"type\":\"record\",\"name\":\"G_DistributionRange\",\"doc\":\"* Describes a distribution of values.\\r\\n\\t *\",\"fields\":[{\"name\":\"distribution\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"G_Frequency\",\"doc\":\"* A frequency or probability element of a distribution.\\r\\n\\t *\",\"fields\":[{\"name\":\"range\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"int\",\"float\",\"double\",\"long\",\"boolean\",\"G_GeoData\",\"G_ListRange\",\"G_BoundedRange\"],\"doc\":\"the value range which occurs with some specified frequency\"},{\"name\":\"frequency\",\"type\":\"double\",\"doc\":\"frequency as a count, or probability as a value from 0-1.\"}]}}},{\"name\":\"rangeType\",\"type\":{\"type\":\"enum\",\"name\":\"G_RangeType\",\"doc\":\"* Allowed types for Ranges of values.\\r\\n\\t *\",\"symbols\":[\"SINGLETON\",\"LIST\",\"BOUNDED\",\"DISTRIBUTION\"]},\"doc\":\"Describes how the values in the distribution are summarized\"},{\"name\":\"type\",\"type\":\"G_PropertyType\",\"doc\":\"* The type of value that the distribution describes. One of DOUBLE,\\r\\n\\t\\t * LONG, BOOLEAN, STRING, DATE, GEO, OTHER\"},{\"name\":\"isProbability\",\"type\":\"boolean\",\"doc\":\"True if a probability distribution, false if a frequency distribution\",\"default\":false}]}],\"doc\":\"range of values\",\"default\":null},{\"name\":\"provenance\",\"type\":[{\"type\":\"record\",\"name\":\"G_Provenance\",\"doc\":\"* This is a placeholder for future modeling of provenance. It is not a\\r\\n\\t * required field in any service calls.\",\"fields\":[{\"name\":\"uri\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Placeholder for now. Express provenance as a single URI.\"}]},\"null\"],\"default\":null},{\"name\":\"uncertainty\",\"type\":[{\"type\":\"record\",\"name\":\"G_Uncertainty\",\"doc\":\"* This is a placeholder for future modeling of uncertainty. It is not a\\r\\n\\t * required field in any service calls.\\r\\n\\t *\",\"fields\":[{\"name\":\"confidence\",\"type\":\"double\",\"doc\":\"* Placeholder for now. Express original source confidence as a single\\r\\n\\t\\t * number from 0 to 1.\",\"default\":1},{\"name\":\"type\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"* For describing the nature of the uncertainty (source data, algorithm,\\r\\n\\t\\t * unit, etc)\",\"default\":null}]},\"null\"],\"default\":null},{\"name\":\"tags\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"enum\",\"name\":\"G_PropertyTag\",\"doc\":\"* Tags are defined by the application layer as a taxonomy of user and\\r\\n\\t * application concepts, independent of the data sources. This allows\\r\\n\\t * application semantics to be re-used with new data, with a minimum of new\\r\\n\\t * software design and development. Data layer entity types, link types and\\r\\n\\t * properties should be mapped into the list of tags. The application layer\\r\\n\\t * must be able to search by native field name or by tag interchangeably,\\r\\n\\t * and properties returned must contain both native field names as well as\\r\\n\\t * tags.\\r\\n\\t * \\r\\n\\t * The list of tags may change as application features evolve, though that\\r\\n\\t * will require collaboration with the data layer providers. Evolving the\\r\\n\\t * tag list should not change the Data Access or Search APIs.\\r\\n\\t * \\r\\n\\t * This is the current list of tags for Properties:\\r\\n\\t * \\r\\n\\t *\",\"symbols\":[\"ID\",\"TYPE\",\"ENTITY_TYPE\",\"ACCOUNT_OWNER\",\"CLUSTER_SUMMARY\",\"NAME\",\"LABEL\",\"STAT\",\"TEXT\",\"STATUS\",\"ANNOTATION\",\"WARNING\",\"LINKED_DATA\",\"IMAGE\",\"VIDEO\",\"AUDIO\",\"GEO\",\"COUNTRY_CODE\",\"DATE\",\"AMOUNT\",\"INFLOWING\",\"OUTFLOWING\",\"COUNT\",\"SERIES\",\"CONSTRUCTED\",\"RAW\",\"USD\",\"DURATION\",\"REDACTED\"]}},\"doc\":\"* one or more tags from the Tag list, used to map this source-specific\\r\\n\\t\\t * field into the semantics of applications\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** the field name in the underlying data source */
   private java.lang.String key;
  /** user-friendly short-text for key (displayable) */
   private java.lang.String friendlyText;
  /** range of values */
   private java.lang.Object range;
   private graphene.model.idl.G_Provenance provenance;
   private graphene.model.idl.G_Uncertainty uncertainty;
  /** * one or more tags from the Tag list, used to map this source-specific
		 * field into the semantics of applications */
   private java.util.List<graphene.model.idl.G_PropertyTag> tags;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public G_Property() {}

  /**
   * All-args constructor.
   */
  public G_Property(java.lang.String key, java.lang.String friendlyText, java.lang.Object range, graphene.model.idl.G_Provenance provenance, graphene.model.idl.G_Uncertainty uncertainty, java.util.List<graphene.model.idl.G_PropertyTag> tags) {
    this.key = key;
    this.friendlyText = friendlyText;
    this.range = range;
    this.provenance = provenance;
    this.uncertainty = uncertainty;
    this.tags = tags;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return key;
    case 1: return friendlyText;
    case 2: return range;
    case 3: return provenance;
    case 4: return uncertainty;
    case 5: return tags;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: key = (java.lang.String)value$; break;
    case 1: friendlyText = (java.lang.String)value$; break;
    case 2: range = (java.lang.Object)value$; break;
    case 3: provenance = (graphene.model.idl.G_Provenance)value$; break;
    case 4: uncertainty = (graphene.model.idl.G_Uncertainty)value$; break;
    case 5: tags = (java.util.List<graphene.model.idl.G_PropertyTag>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'key' field.
   * the field name in the underlying data source   */
  public java.lang.String getKey() {
    return key;
  }

  /**
   * Sets the value of the 'key' field.
   * the field name in the underlying data source   * @param value the value to set.
   */
  public void setKey(java.lang.String value) {
    this.key = value;
  }

  /**
   * Gets the value of the 'friendlyText' field.
   * user-friendly short-text for key (displayable)   */
  public java.lang.String getFriendlyText() {
    return friendlyText;
  }

  /**
   * Sets the value of the 'friendlyText' field.
   * user-friendly short-text for key (displayable)   * @param value the value to set.
   */
  public void setFriendlyText(java.lang.String value) {
    this.friendlyText = value;
  }

  /**
   * Gets the value of the 'range' field.
   * range of values   */
  public java.lang.Object getRange() {
    return range;
  }

  /**
   * Sets the value of the 'range' field.
   * range of values   * @param value the value to set.
   */
  public void setRange(java.lang.Object value) {
    this.range = value;
  }

  /**
   * Gets the value of the 'provenance' field.
   */
  public graphene.model.idl.G_Provenance getProvenance() {
    return provenance;
  }

  /**
   * Sets the value of the 'provenance' field.
   * @param value the value to set.
   */
  public void setProvenance(graphene.model.idl.G_Provenance value) {
    this.provenance = value;
  }

  /**
   * Gets the value of the 'uncertainty' field.
   */
  public graphene.model.idl.G_Uncertainty getUncertainty() {
    return uncertainty;
  }

  /**
   * Sets the value of the 'uncertainty' field.
   * @param value the value to set.
   */
  public void setUncertainty(graphene.model.idl.G_Uncertainty value) {
    this.uncertainty = value;
  }

  /**
   * Gets the value of the 'tags' field.
   * * one or more tags from the Tag list, used to map this source-specific
		 * field into the semantics of applications   */
  public java.util.List<graphene.model.idl.G_PropertyTag> getTags() {
    return tags;
  }

  /**
   * Sets the value of the 'tags' field.
   * * one or more tags from the Tag list, used to map this source-specific
		 * field into the semantics of applications   * @param value the value to set.
   */
  public void setTags(java.util.List<graphene.model.idl.G_PropertyTag> value) {
    this.tags = value;
  }

  /** Creates a new G_Property RecordBuilder */
  public static graphene.model.idl.G_Property.Builder newBuilder() {
    return new graphene.model.idl.G_Property.Builder();
  }
  
  /** Creates a new G_Property RecordBuilder by copying an existing Builder */
  public static graphene.model.idl.G_Property.Builder newBuilder(graphene.model.idl.G_Property.Builder other) {
    return new graphene.model.idl.G_Property.Builder(other);
  }
  
  /** Creates a new G_Property RecordBuilder by copying an existing G_Property instance */
  public static graphene.model.idl.G_Property.Builder newBuilder(graphene.model.idl.G_Property other) {
    return new graphene.model.idl.G_Property.Builder(other);
  }
  
  /**
   * RecordBuilder for G_Property instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<G_Property>
    implements org.apache.avro.data.RecordBuilder<G_Property> {

    private java.lang.String key;
    private java.lang.String friendlyText;
    private java.lang.Object range;
    private graphene.model.idl.G_Provenance provenance;
    private graphene.model.idl.G_Uncertainty uncertainty;
    private java.util.List<graphene.model.idl.G_PropertyTag> tags;

    /** Creates a new Builder */
    private Builder() {
      super(graphene.model.idl.G_Property.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(graphene.model.idl.G_Property.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.key)) {
        this.key = data().deepCopy(fields()[0].schema(), other.key);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.friendlyText)) {
        this.friendlyText = data().deepCopy(fields()[1].schema(), other.friendlyText);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.range)) {
        this.range = data().deepCopy(fields()[2].schema(), other.range);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.provenance)) {
        this.provenance = data().deepCopy(fields()[3].schema(), other.provenance);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.uncertainty)) {
        this.uncertainty = data().deepCopy(fields()[4].schema(), other.uncertainty);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.tags)) {
        this.tags = data().deepCopy(fields()[5].schema(), other.tags);
        fieldSetFlags()[5] = true;
      }
    }
    
    /** Creates a Builder by copying an existing G_Property instance */
    private Builder(graphene.model.idl.G_Property other) {
            super(graphene.model.idl.G_Property.SCHEMA$);
      if (isValidValue(fields()[0], other.key)) {
        this.key = data().deepCopy(fields()[0].schema(), other.key);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.friendlyText)) {
        this.friendlyText = data().deepCopy(fields()[1].schema(), other.friendlyText);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.range)) {
        this.range = data().deepCopy(fields()[2].schema(), other.range);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.provenance)) {
        this.provenance = data().deepCopy(fields()[3].schema(), other.provenance);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.uncertainty)) {
        this.uncertainty = data().deepCopy(fields()[4].schema(), other.uncertainty);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.tags)) {
        this.tags = data().deepCopy(fields()[5].schema(), other.tags);
        fieldSetFlags()[5] = true;
      }
    }

    /** Gets the value of the 'key' field */
    public java.lang.String getKey() {
      return key;
    }
    
    /** Sets the value of the 'key' field */
    public graphene.model.idl.G_Property.Builder setKey(java.lang.String value) {
      validate(fields()[0], value);
      this.key = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'key' field has been set */
    public boolean hasKey() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'key' field */
    public graphene.model.idl.G_Property.Builder clearKey() {
      key = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'friendlyText' field */
    public java.lang.String getFriendlyText() {
      return friendlyText;
    }
    
    /** Sets the value of the 'friendlyText' field */
    public graphene.model.idl.G_Property.Builder setFriendlyText(java.lang.String value) {
      validate(fields()[1], value);
      this.friendlyText = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'friendlyText' field has been set */
    public boolean hasFriendlyText() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'friendlyText' field */
    public graphene.model.idl.G_Property.Builder clearFriendlyText() {
      friendlyText = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'range' field */
    public java.lang.Object getRange() {
      return range;
    }
    
    /** Sets the value of the 'range' field */
    public graphene.model.idl.G_Property.Builder setRange(java.lang.Object value) {
      validate(fields()[2], value);
      this.range = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'range' field has been set */
    public boolean hasRange() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'range' field */
    public graphene.model.idl.G_Property.Builder clearRange() {
      range = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'provenance' field */
    public graphene.model.idl.G_Provenance getProvenance() {
      return provenance;
    }
    
    /** Sets the value of the 'provenance' field */
    public graphene.model.idl.G_Property.Builder setProvenance(graphene.model.idl.G_Provenance value) {
      validate(fields()[3], value);
      this.provenance = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'provenance' field has been set */
    public boolean hasProvenance() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'provenance' field */
    public graphene.model.idl.G_Property.Builder clearProvenance() {
      provenance = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'uncertainty' field */
    public graphene.model.idl.G_Uncertainty getUncertainty() {
      return uncertainty;
    }
    
    /** Sets the value of the 'uncertainty' field */
    public graphene.model.idl.G_Property.Builder setUncertainty(graphene.model.idl.G_Uncertainty value) {
      validate(fields()[4], value);
      this.uncertainty = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'uncertainty' field has been set */
    public boolean hasUncertainty() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'uncertainty' field */
    public graphene.model.idl.G_Property.Builder clearUncertainty() {
      uncertainty = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'tags' field */
    public java.util.List<graphene.model.idl.G_PropertyTag> getTags() {
      return tags;
    }
    
    /** Sets the value of the 'tags' field */
    public graphene.model.idl.G_Property.Builder setTags(java.util.List<graphene.model.idl.G_PropertyTag> value) {
      validate(fields()[5], value);
      this.tags = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'tags' field has been set */
    public boolean hasTags() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'tags' field */
    public graphene.model.idl.G_Property.Builder clearTags() {
      tags = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    public G_Property build() {
      try {
        G_Property record = new G_Property();
        record.key = fieldSetFlags()[0] ? this.key : (java.lang.String) defaultValue(fields()[0]);
        record.friendlyText = fieldSetFlags()[1] ? this.friendlyText : (java.lang.String) defaultValue(fields()[1]);
        record.range = fieldSetFlags()[2] ? this.range : (java.lang.Object) defaultValue(fields()[2]);
        record.provenance = fieldSetFlags()[3] ? this.provenance : (graphene.model.idl.G_Provenance) defaultValue(fields()[3]);
        record.uncertainty = fieldSetFlags()[4] ? this.uncertainty : (graphene.model.idl.G_Uncertainty) defaultValue(fields()[4]);
        record.tags = fieldSetFlags()[5] ? this.tags : (java.util.List<graphene.model.idl.G_PropertyTag>) defaultValue(fields()[5]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}