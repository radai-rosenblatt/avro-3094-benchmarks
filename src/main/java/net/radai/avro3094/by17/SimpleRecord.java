/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.radai.avro3094.by17;
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class SimpleRecord extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SimpleRecord\",\"namespace\":\"net.radai.avro3094.by17\",\"fields\":[{\"name\":\"stringField\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public CharSequence stringField;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public SimpleRecord() {}

  /**
   * All-args constructor.
   */
  public SimpleRecord(CharSequence stringField) {
    this.stringField = stringField;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public Object get(int field$) {
    switch (field$) {
    case 0: return stringField;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: stringField = (CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'stringField' field.
   */
  public CharSequence getStringField() {
    return stringField;
  }

  /**
   * Sets the value of the 'stringField' field.
   * @param value the value to set.
   */
  public void setStringField(CharSequence value) {
    this.stringField = value;
  }

  /** Creates a new SimpleRecord RecordBuilder */
  public static net.radai.avro3094.by17.SimpleRecord.Builder newBuilder() {
    return new net.radai.avro3094.by17.SimpleRecord.Builder();
  }
  
  /** Creates a new SimpleRecord RecordBuilder by copying an existing Builder */
  public static net.radai.avro3094.by17.SimpleRecord.Builder newBuilder(net.radai.avro3094.by17.SimpleRecord.Builder other) {
    return new net.radai.avro3094.by17.SimpleRecord.Builder(other);
  }
  
  /** Creates a new SimpleRecord RecordBuilder by copying an existing SimpleRecord instance */
  public static net.radai.avro3094.by17.SimpleRecord.Builder newBuilder(net.radai.avro3094.by17.SimpleRecord other) {
    return new net.radai.avro3094.by17.SimpleRecord.Builder(other);
  }
  
  /**
   * RecordBuilder for SimpleRecord instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SimpleRecord>
    implements org.apache.avro.data.RecordBuilder<SimpleRecord> {

    private CharSequence stringField;

    /** Creates a new Builder */
    private Builder() {
      super(net.radai.avro3094.by17.SimpleRecord.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.radai.avro3094.by17.SimpleRecord.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.stringField)) {
        this.stringField = data().deepCopy(fields()[0].schema(), other.stringField);
        fieldSetFlags()[0] = true;
      }
    }
    
    /** Creates a Builder by copying an existing SimpleRecord instance */
    private Builder(net.radai.avro3094.by17.SimpleRecord other) {
            super(net.radai.avro3094.by17.SimpleRecord.SCHEMA$);
      if (isValidValue(fields()[0], other.stringField)) {
        this.stringField = data().deepCopy(fields()[0].schema(), other.stringField);
        fieldSetFlags()[0] = true;
      }
    }

    /** Gets the value of the 'stringField' field */
    public CharSequence getStringField() {
      return stringField;
    }
    
    /** Sets the value of the 'stringField' field */
    public net.radai.avro3094.by17.SimpleRecord.Builder setStringField(CharSequence value) {
      validate(fields()[0], value);
      this.stringField = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'stringField' field has been set */
    public boolean hasStringField() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'stringField' field */
    public net.radai.avro3094.by17.SimpleRecord.Builder clearStringField() {
      stringField = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public SimpleRecord build() {
      try {
        SimpleRecord record = new SimpleRecord();
        record.stringField = fieldSetFlags()[0] ? this.stringField : (CharSequence) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
