/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.rubenvillar.apache.flink;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class DestinosInternosType extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -8715773203796826829L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DestinosInternosType\",\"namespace\":\"com.rubenvillar.apache.flink\",\"fields\":[{\"name\":\"codigosUnidadesOrganizativasDestino\",\"type\":{\"type\":\"array\",\"items\":[\"null\",\"string\"],\"default\":null}},{\"name\":\"unidadesOrganizativasDestino\",\"type\":{\"type\":\"array\",\"items\":[\"null\",\"string\"],\"default\":null}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<DestinosInternosType> ENCODER =
      new BinaryMessageEncoder<DestinosInternosType>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<DestinosInternosType> DECODER =
      new BinaryMessageDecoder<DestinosInternosType>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<DestinosInternosType> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<DestinosInternosType> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<DestinosInternosType>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this DestinosInternosType to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a DestinosInternosType from a ByteBuffer. */
  public static DestinosInternosType fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.util.List<java.lang.CharSequence> codigosUnidadesOrganizativasDestino;
  @Deprecated public java.util.List<java.lang.CharSequence> unidadesOrganizativasDestino;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public DestinosInternosType() {}

  /**
   * All-args constructor.
   * @param codigosUnidadesOrganizativasDestino The new value for codigosUnidadesOrganizativasDestino
   * @param unidadesOrganizativasDestino The new value for unidadesOrganizativasDestino
   */
  public DestinosInternosType(java.util.List<java.lang.CharSequence> codigosUnidadesOrganizativasDestino, java.util.List<java.lang.CharSequence> unidadesOrganizativasDestino) {
    this.codigosUnidadesOrganizativasDestino = codigosUnidadesOrganizativasDestino;
    this.unidadesOrganizativasDestino = unidadesOrganizativasDestino;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return codigosUnidadesOrganizativasDestino;
    case 1: return unidadesOrganizativasDestino;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: codigosUnidadesOrganizativasDestino = (java.util.List<java.lang.CharSequence>)value$; break;
    case 1: unidadesOrganizativasDestino = (java.util.List<java.lang.CharSequence>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'codigosUnidadesOrganizativasDestino' field.
   * @return The value of the 'codigosUnidadesOrganizativasDestino' field.
   */
  public java.util.List<java.lang.CharSequence> getCodigosUnidadesOrganizativasDestino() {
    return codigosUnidadesOrganizativasDestino;
  }

  /**
   * Sets the value of the 'codigosUnidadesOrganizativasDestino' field.
   * @param value the value to set.
   */
  public void setCodigosUnidadesOrganizativasDestino(java.util.List<java.lang.CharSequence> value) {
    this.codigosUnidadesOrganizativasDestino = value;
  }

  /**
   * Gets the value of the 'unidadesOrganizativasDestino' field.
   * @return The value of the 'unidadesOrganizativasDestino' field.
   */
  public java.util.List<java.lang.CharSequence> getUnidadesOrganizativasDestino() {
    return unidadesOrganizativasDestino;
  }

  /**
   * Sets the value of the 'unidadesOrganizativasDestino' field.
   * @param value the value to set.
   */
  public void setUnidadesOrganizativasDestino(java.util.List<java.lang.CharSequence> value) {
    this.unidadesOrganizativasDestino = value;
  }

  /**
   * Creates a new DestinosInternosType RecordBuilder.
   * @return A new DestinosInternosType RecordBuilder
   */
  public static com.rubenvillar.apache.flink.DestinosInternosType.Builder newBuilder() {
    return new com.rubenvillar.apache.flink.DestinosInternosType.Builder();
  }

  /**
   * Creates a new DestinosInternosType RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new DestinosInternosType RecordBuilder
   */
  public static com.rubenvillar.apache.flink.DestinosInternosType.Builder newBuilder(com.rubenvillar.apache.flink.DestinosInternosType.Builder other) {
    return new com.rubenvillar.apache.flink.DestinosInternosType.Builder(other);
  }

  /**
   * Creates a new DestinosInternosType RecordBuilder by copying an existing DestinosInternosType instance.
   * @param other The existing instance to copy.
   * @return A new DestinosInternosType RecordBuilder
   */
  public static com.rubenvillar.apache.flink.DestinosInternosType.Builder newBuilder(com.rubenvillar.apache.flink.DestinosInternosType other) {
    return new com.rubenvillar.apache.flink.DestinosInternosType.Builder(other);
  }

  /**
   * RecordBuilder for DestinosInternosType instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<DestinosInternosType>
    implements org.apache.avro.data.RecordBuilder<DestinosInternosType> {

    private java.util.List<java.lang.CharSequence> codigosUnidadesOrganizativasDestino;
    private java.util.List<java.lang.CharSequence> unidadesOrganizativasDestino;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.rubenvillar.apache.flink.DestinosInternosType.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.codigosUnidadesOrganizativasDestino)) {
        this.codigosUnidadesOrganizativasDestino = data().deepCopy(fields()[0].schema(), other.codigosUnidadesOrganizativasDestino);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.unidadesOrganizativasDestino)) {
        this.unidadesOrganizativasDestino = data().deepCopy(fields()[1].schema(), other.unidadesOrganizativasDestino);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing DestinosInternosType instance
     * @param other The existing instance to copy.
     */
    private Builder(com.rubenvillar.apache.flink.DestinosInternosType other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.codigosUnidadesOrganizativasDestino)) {
        this.codigosUnidadesOrganizativasDestino = data().deepCopy(fields()[0].schema(), other.codigosUnidadesOrganizativasDestino);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.unidadesOrganizativasDestino)) {
        this.unidadesOrganizativasDestino = data().deepCopy(fields()[1].schema(), other.unidadesOrganizativasDestino);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'codigosUnidadesOrganizativasDestino' field.
      * @return The value.
      */
    public java.util.List<java.lang.CharSequence> getCodigosUnidadesOrganizativasDestino() {
      return codigosUnidadesOrganizativasDestino;
    }

    /**
      * Sets the value of the 'codigosUnidadesOrganizativasDestino' field.
      * @param value The value of 'codigosUnidadesOrganizativasDestino'.
      * @return This builder.
      */
    public com.rubenvillar.apache.flink.DestinosInternosType.Builder setCodigosUnidadesOrganizativasDestino(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[0], value);
      this.codigosUnidadesOrganizativasDestino = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'codigosUnidadesOrganizativasDestino' field has been set.
      * @return True if the 'codigosUnidadesOrganizativasDestino' field has been set, false otherwise.
      */
    public boolean hasCodigosUnidadesOrganizativasDestino() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'codigosUnidadesOrganizativasDestino' field.
      * @return This builder.
      */
    public com.rubenvillar.apache.flink.DestinosInternosType.Builder clearCodigosUnidadesOrganizativasDestino() {
      codigosUnidadesOrganizativasDestino = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'unidadesOrganizativasDestino' field.
      * @return The value.
      */
    public java.util.List<java.lang.CharSequence> getUnidadesOrganizativasDestino() {
      return unidadesOrganizativasDestino;
    }

    /**
      * Sets the value of the 'unidadesOrganizativasDestino' field.
      * @param value The value of 'unidadesOrganizativasDestino'.
      * @return This builder.
      */
    public com.rubenvillar.apache.flink.DestinosInternosType.Builder setUnidadesOrganizativasDestino(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[1], value);
      this.unidadesOrganizativasDestino = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'unidadesOrganizativasDestino' field has been set.
      * @return True if the 'unidadesOrganizativasDestino' field has been set, false otherwise.
      */
    public boolean hasUnidadesOrganizativasDestino() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'unidadesOrganizativasDestino' field.
      * @return This builder.
      */
    public com.rubenvillar.apache.flink.DestinosInternosType.Builder clearUnidadesOrganizativasDestino() {
      unidadesOrganizativasDestino = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public DestinosInternosType build() {
      try {
        DestinosInternosType record = new DestinosInternosType();
        record.codigosUnidadesOrganizativasDestino = fieldSetFlags()[0] ? this.codigosUnidadesOrganizativasDestino : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[0]);
        record.unidadesOrganizativasDestino = fieldSetFlags()[1] ? this.unidadesOrganizativasDestino : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[1]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<DestinosInternosType>
    WRITER$ = (org.apache.avro.io.DatumWriter<DestinosInternosType>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<DestinosInternosType>
    READER$ = (org.apache.avro.io.DatumReader<DestinosInternosType>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
