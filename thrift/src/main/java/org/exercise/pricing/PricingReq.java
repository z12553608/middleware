/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.exercise.pricing;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2022-04-29")
public class PricingReq implements org.apache.thrift.TBase<PricingReq, PricingReq._Fields>, java.io.Serializable, Cloneable, Comparable<PricingReq> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PricingReq");

  private static final org.apache.thrift.protocol.TField PRODUCT_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("productName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("count", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new PricingReqStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new PricingReqTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String productName; // required
  public int count; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PRODUCT_NAME((short)1, "productName"),
    COUNT((short)2, "count");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // PRODUCT_NAME
          return PRODUCT_NAME;
        case 2: // COUNT
          return COUNT;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __COUNT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PRODUCT_NAME, new org.apache.thrift.meta_data.FieldMetaData("productName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.COUNT, new org.apache.thrift.meta_data.FieldMetaData("count", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PricingReq.class, metaDataMap);
  }

  public PricingReq() {
  }

  public PricingReq(
    java.lang.String productName,
    int count)
  {
    this();
    this.productName = productName;
    this.count = count;
    setCountIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PricingReq(PricingReq other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetProductName()) {
      this.productName = other.productName;
    }
    this.count = other.count;
  }

  public PricingReq deepCopy() {
    return new PricingReq(this);
  }

  @Override
  public void clear() {
    this.productName = null;
    setCountIsSet(false);
    this.count = 0;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getProductName() {
    return this.productName;
  }

  public PricingReq setProductName(@org.apache.thrift.annotation.Nullable java.lang.String productName) {
    this.productName = productName;
    return this;
  }

  public void unsetProductName() {
    this.productName = null;
  }

  /** Returns true if field productName is set (has been assigned a value) and false otherwise */
  public boolean isSetProductName() {
    return this.productName != null;
  }

  public void setProductNameIsSet(boolean value) {
    if (!value) {
      this.productName = null;
    }
  }

  public int getCount() {
    return this.count;
  }

  public PricingReq setCount(int count) {
    this.count = count;
    setCountIsSet(true);
    return this;
  }

  public void unsetCount() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __COUNT_ISSET_ID);
  }

  /** Returns true if field count is set (has been assigned a value) and false otherwise */
  public boolean isSetCount() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __COUNT_ISSET_ID);
  }

  public void setCountIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __COUNT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case PRODUCT_NAME:
      if (value == null) {
        unsetProductName();
      } else {
        setProductName((java.lang.String)value);
      }
      break;

    case COUNT:
      if (value == null) {
        unsetCount();
      } else {
        setCount((java.lang.Integer)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case PRODUCT_NAME:
      return getProductName();

    case COUNT:
      return getCount();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case PRODUCT_NAME:
      return isSetProductName();
    case COUNT:
      return isSetCount();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof PricingReq)
      return this.equals((PricingReq)that);
    return false;
  }

  public boolean equals(PricingReq that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_productName = true && this.isSetProductName();
    boolean that_present_productName = true && that.isSetProductName();
    if (this_present_productName || that_present_productName) {
      if (!(this_present_productName && that_present_productName))
        return false;
      if (!this.productName.equals(that.productName))
        return false;
    }

    boolean this_present_count = true;
    boolean that_present_count = true;
    if (this_present_count || that_present_count) {
      if (!(this_present_count && that_present_count))
        return false;
      if (this.count != that.count)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetProductName()) ? 131071 : 524287);
    if (isSetProductName())
      hashCode = hashCode * 8191 + productName.hashCode();

    hashCode = hashCode * 8191 + count;

    return hashCode;
  }

  @Override
  public int compareTo(PricingReq other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetProductName(), other.isSetProductName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProductName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.productName, other.productName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetCount(), other.isSetCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.count, other.count);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("PricingReq(");
    boolean first = true;

    sb.append("productName:");
    if (this.productName == null) {
      sb.append("null");
    } else {
      sb.append(this.productName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("count:");
    sb.append(this.count);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (productName == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'productName' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'count' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PricingReqStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PricingReqStandardScheme getScheme() {
      return new PricingReqStandardScheme();
    }
  }

  private static class PricingReqStandardScheme extends org.apache.thrift.scheme.StandardScheme<PricingReq> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PricingReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PRODUCT_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.productName = iprot.readString();
              struct.setProductNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.count = iprot.readI32();
              struct.setCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetCount()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'count' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, PricingReq struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.productName != null) {
        oprot.writeFieldBegin(PRODUCT_NAME_FIELD_DESC);
        oprot.writeString(struct.productName);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(COUNT_FIELD_DESC);
      oprot.writeI32(struct.count);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PricingReqTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PricingReqTupleScheme getScheme() {
      return new PricingReqTupleScheme();
    }
  }

  private static class PricingReqTupleScheme extends org.apache.thrift.scheme.TupleScheme<PricingReq> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PricingReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.productName);
      oprot.writeI32(struct.count);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PricingReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.productName = iprot.readString();
      struct.setProductNameIsSet(true);
      struct.count = iprot.readI32();
      struct.setCountIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

