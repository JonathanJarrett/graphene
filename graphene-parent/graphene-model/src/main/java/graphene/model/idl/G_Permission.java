/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package graphene.model.idl;  
@SuppressWarnings("all")
/** * This is the permission object used in security concerns.  A G_Role has zero or more G_Permissions
	 * */
@org.apache.avro.specific.AvroGenerated
public class G_Permission extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"G_Permission\",\"namespace\":\"graphene.model.idl\",\"doc\":\"* This is the permission object used in security concerns.  A G_Role has zero or more G_Permissions\\r\\n\\t *\",\"fields\":[{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"* Name of the permission\",\"default\":null},{\"name\":\"description\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"* For describing the nature of the permission\",\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** * Name of the permission */
   private java.lang.String name;
  /** * For describing the nature of the permission */
   private java.lang.String description;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public G_Permission() {}

  /**
   * All-args constructor.
   */
  public G_Permission(java.lang.String name, java.lang.String description) {
    this.name = name;
    this.description = description;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return description;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.String)value$; break;
    case 1: description = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'name' field.
   * * Name of the permission   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * * Name of the permission   * @param value the value to set.
   */
  public void setName(java.lang.String value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'description' field.
   * * For describing the nature of the permission   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Sets the value of the 'description' field.
   * * For describing the nature of the permission   * @param value the value to set.
   */
  public void setDescription(java.lang.String value) {
    this.description = value;
  }

  /** Creates a new G_Permission RecordBuilder */
  public static graphene.model.idl.G_Permission.Builder newBuilder() {
    return new graphene.model.idl.G_Permission.Builder();
  }
  
  /** Creates a new G_Permission RecordBuilder by copying an existing Builder */
  public static graphene.model.idl.G_Permission.Builder newBuilder(graphene.model.idl.G_Permission.Builder other) {
    return new graphene.model.idl.G_Permission.Builder(other);
  }
  
  /** Creates a new G_Permission RecordBuilder by copying an existing G_Permission instance */
  public static graphene.model.idl.G_Permission.Builder newBuilder(graphene.model.idl.G_Permission other) {
    return new graphene.model.idl.G_Permission.Builder(other);
  }
  
  /**
   * RecordBuilder for G_Permission instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<G_Permission>
    implements org.apache.avro.data.RecordBuilder<G_Permission> {

    private java.lang.String name;
    private java.lang.String description;

    /** Creates a new Builder */
    private Builder() {
      super(graphene.model.idl.G_Permission.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(graphene.model.idl.G_Permission.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.description)) {
        this.description = data().deepCopy(fields()[1].schema(), other.description);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing G_Permission instance */
    private Builder(graphene.model.idl.G_Permission other) {
            super(graphene.model.idl.G_Permission.SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.description)) {
        this.description = data().deepCopy(fields()[1].schema(), other.description);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'name' field */
    public java.lang.String getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public graphene.model.idl.G_Permission.Builder setName(java.lang.String value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'name' field */
    public graphene.model.idl.G_Permission.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'description' field */
    public java.lang.String getDescription() {
      return description;
    }
    
    /** Sets the value of the 'description' field */
    public graphene.model.idl.G_Permission.Builder setDescription(java.lang.String value) {
      validate(fields()[1], value);
      this.description = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'description' field has been set */
    public boolean hasDescription() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'description' field */
    public graphene.model.idl.G_Permission.Builder clearDescription() {
      description = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public G_Permission build() {
      try {
        G_Permission record = new G_Permission();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.String) defaultValue(fields()[0]);
        record.description = fieldSetFlags()[1] ? this.description : (java.lang.String) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
