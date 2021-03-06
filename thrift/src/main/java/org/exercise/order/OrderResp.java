/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.exercise.order;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2022-04-29")
public class OrderResp implements org.apache.thrift.TBase<OrderResp, OrderResp._Fields>, java.io.Serializable, Cloneable, Comparable<OrderResp> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("OrderResp");

  private static final org.apache.thrift.protocol.TField ORDER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("orderId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField PRODUCT_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("productName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PRODUCT_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("productList", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField PRIC_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("pricList", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("code", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField MSG_FIELD_DESC = new org.apache.thrift.protocol.TField("msg", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new OrderRespStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new OrderRespTupleSchemeFactory();

  public long orderId; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String productName; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> productList; // optional
  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> pricList; // optional
  public int code; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String msg; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ORDER_ID((short)1, "orderId"),
    PRODUCT_NAME((short)2, "productName"),
    PRODUCT_LIST((short)3, "productList"),
    PRIC_LIST((short)4, "pricList"),
    CODE((short)5, "code"),
    MSG((short)6, "msg");

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
        case 1: // ORDER_ID
          return ORDER_ID;
        case 2: // PRODUCT_NAME
          return PRODUCT_NAME;
        case 3: // PRODUCT_LIST
          return PRODUCT_LIST;
        case 4: // PRIC_LIST
          return PRIC_LIST;
        case 5: // CODE
          return CODE;
        case 6: // MSG
          return MSG;
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
  private static final int __ORDERID_ISSET_ID = 0;
  private static final int __CODE_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.PRODUCT_LIST,_Fields.PRIC_LIST};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ORDER_ID, new org.apache.thrift.meta_data.FieldMetaData("orderId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.PRODUCT_NAME, new org.apache.thrift.meta_data.FieldMetaData("productName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PRODUCT_LIST, new org.apache.thrift.meta_data.FieldMetaData("productList", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.PRIC_LIST, new org.apache.thrift.meta_data.FieldMetaData("pricList", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.CODE, new org.apache.thrift.meta_data.FieldMetaData("code", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.MSG, new org.apache.thrift.meta_data.FieldMetaData("msg", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(OrderResp.class, metaDataMap);
  }

  public OrderResp() {
  }

  public OrderResp(
    long orderId,
    java.lang.String productName,
    int code,
    java.lang.String msg)
  {
    this();
    this.orderId = orderId;
    setOrderIdIsSet(true);
    this.productName = productName;
    this.code = code;
    setCodeIsSet(true);
    this.msg = msg;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public OrderResp(OrderResp other) {
    __isset_bitfield = other.__isset_bitfield;
    this.orderId = other.orderId;
    if (other.isSetProductName()) {
      this.productName = other.productName;
    }
    if (other.isSetProductList()) {
      java.util.List<java.lang.String> __this__productList = new java.util.ArrayList<java.lang.String>(other.productList);
      this.productList = __this__productList;
    }
    if (other.isSetPricList()) {
      java.util.List<java.lang.String> __this__pricList = new java.util.ArrayList<java.lang.String>(other.pricList);
      this.pricList = __this__pricList;
    }
    this.code = other.code;
    if (other.isSetMsg()) {
      this.msg = other.msg;
    }
  }

  public OrderResp deepCopy() {
    return new OrderResp(this);
  }

  @Override
  public void clear() {
    setOrderIdIsSet(false);
    this.orderId = 0;
    this.productName = null;
    this.productList = null;
    this.pricList = null;
    setCodeIsSet(false);
    this.code = 0;
    this.msg = null;
  }

  public long getOrderId() {
    return this.orderId;
  }

  public OrderResp setOrderId(long orderId) {
    this.orderId = orderId;
    setOrderIdIsSet(true);
    return this;
  }

  public void unsetOrderId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ORDERID_ISSET_ID);
  }

  /** Returns true if field orderId is set (has been assigned a value) and false otherwise */
  public boolean isSetOrderId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ORDERID_ISSET_ID);
  }

  public void setOrderIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ORDERID_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getProductName() {
    return this.productName;
  }

  public OrderResp setProductName(@org.apache.thrift.annotation.Nullable java.lang.String productName) {
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

  public int getProductListSize() {
    return (this.productList == null) ? 0 : this.productList.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getProductListIterator() {
    return (this.productList == null) ? null : this.productList.iterator();
  }

  public void addToProductList(java.lang.String elem) {
    if (this.productList == null) {
      this.productList = new java.util.ArrayList<java.lang.String>();
    }
    this.productList.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.String> getProductList() {
    return this.productList;
  }

  public OrderResp setProductList(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> productList) {
    this.productList = productList;
    return this;
  }

  public void unsetProductList() {
    this.productList = null;
  }

  /** Returns true if field productList is set (has been assigned a value) and false otherwise */
  public boolean isSetProductList() {
    return this.productList != null;
  }

  public void setProductListIsSet(boolean value) {
    if (!value) {
      this.productList = null;
    }
  }

  public int getPricListSize() {
    return (this.pricList == null) ? 0 : this.pricList.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getPricListIterator() {
    return (this.pricList == null) ? null : this.pricList.iterator();
  }

  public void addToPricList(java.lang.String elem) {
    if (this.pricList == null) {
      this.pricList = new java.util.ArrayList<java.lang.String>();
    }
    this.pricList.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.String> getPricList() {
    return this.pricList;
  }

  public OrderResp setPricList(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> pricList) {
    this.pricList = pricList;
    return this;
  }

  public void unsetPricList() {
    this.pricList = null;
  }

  /** Returns true if field pricList is set (has been assigned a value) and false otherwise */
  public boolean isSetPricList() {
    return this.pricList != null;
  }

  public void setPricListIsSet(boolean value) {
    if (!value) {
      this.pricList = null;
    }
  }

  public int getCode() {
    return this.code;
  }

  public OrderResp setCode(int code) {
    this.code = code;
    setCodeIsSet(true);
    return this;
  }

  public void unsetCode() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CODE_ISSET_ID);
  }

  /** Returns true if field code is set (has been assigned a value) and false otherwise */
  public boolean isSetCode() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CODE_ISSET_ID);
  }

  public void setCodeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CODE_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getMsg() {
    return this.msg;
  }

  public OrderResp setMsg(@org.apache.thrift.annotation.Nullable java.lang.String msg) {
    this.msg = msg;
    return this;
  }

  public void unsetMsg() {
    this.msg = null;
  }

  /** Returns true if field msg is set (has been assigned a value) and false otherwise */
  public boolean isSetMsg() {
    return this.msg != null;
  }

  public void setMsgIsSet(boolean value) {
    if (!value) {
      this.msg = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case ORDER_ID:
      if (value == null) {
        unsetOrderId();
      } else {
        setOrderId((java.lang.Long)value);
      }
      break;

    case PRODUCT_NAME:
      if (value == null) {
        unsetProductName();
      } else {
        setProductName((java.lang.String)value);
      }
      break;

    case PRODUCT_LIST:
      if (value == null) {
        unsetProductList();
      } else {
        setProductList((java.util.List<java.lang.String>)value);
      }
      break;

    case PRIC_LIST:
      if (value == null) {
        unsetPricList();
      } else {
        setPricList((java.util.List<java.lang.String>)value);
      }
      break;

    case CODE:
      if (value == null) {
        unsetCode();
      } else {
        setCode((java.lang.Integer)value);
      }
      break;

    case MSG:
      if (value == null) {
        unsetMsg();
      } else {
        setMsg((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ORDER_ID:
      return getOrderId();

    case PRODUCT_NAME:
      return getProductName();

    case PRODUCT_LIST:
      return getProductList();

    case PRIC_LIST:
      return getPricList();

    case CODE:
      return getCode();

    case MSG:
      return getMsg();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ORDER_ID:
      return isSetOrderId();
    case PRODUCT_NAME:
      return isSetProductName();
    case PRODUCT_LIST:
      return isSetProductList();
    case PRIC_LIST:
      return isSetPricList();
    case CODE:
      return isSetCode();
    case MSG:
      return isSetMsg();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof OrderResp)
      return this.equals((OrderResp)that);
    return false;
  }

  public boolean equals(OrderResp that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_orderId = true;
    boolean that_present_orderId = true;
    if (this_present_orderId || that_present_orderId) {
      if (!(this_present_orderId && that_present_orderId))
        return false;
      if (this.orderId != that.orderId)
        return false;
    }

    boolean this_present_productName = true && this.isSetProductName();
    boolean that_present_productName = true && that.isSetProductName();
    if (this_present_productName || that_present_productName) {
      if (!(this_present_productName && that_present_productName))
        return false;
      if (!this.productName.equals(that.productName))
        return false;
    }

    boolean this_present_productList = true && this.isSetProductList();
    boolean that_present_productList = true && that.isSetProductList();
    if (this_present_productList || that_present_productList) {
      if (!(this_present_productList && that_present_productList))
        return false;
      if (!this.productList.equals(that.productList))
        return false;
    }

    boolean this_present_pricList = true && this.isSetPricList();
    boolean that_present_pricList = true && that.isSetPricList();
    if (this_present_pricList || that_present_pricList) {
      if (!(this_present_pricList && that_present_pricList))
        return false;
      if (!this.pricList.equals(that.pricList))
        return false;
    }

    boolean this_present_code = true;
    boolean that_present_code = true;
    if (this_present_code || that_present_code) {
      if (!(this_present_code && that_present_code))
        return false;
      if (this.code != that.code)
        return false;
    }

    boolean this_present_msg = true && this.isSetMsg();
    boolean that_present_msg = true && that.isSetMsg();
    if (this_present_msg || that_present_msg) {
      if (!(this_present_msg && that_present_msg))
        return false;
      if (!this.msg.equals(that.msg))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(orderId);

    hashCode = hashCode * 8191 + ((isSetProductName()) ? 131071 : 524287);
    if (isSetProductName())
      hashCode = hashCode * 8191 + productName.hashCode();

    hashCode = hashCode * 8191 + ((isSetProductList()) ? 131071 : 524287);
    if (isSetProductList())
      hashCode = hashCode * 8191 + productList.hashCode();

    hashCode = hashCode * 8191 + ((isSetPricList()) ? 131071 : 524287);
    if (isSetPricList())
      hashCode = hashCode * 8191 + pricList.hashCode();

    hashCode = hashCode * 8191 + code;

    hashCode = hashCode * 8191 + ((isSetMsg()) ? 131071 : 524287);
    if (isSetMsg())
      hashCode = hashCode * 8191 + msg.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(OrderResp other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetOrderId(), other.isSetOrderId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOrderId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.orderId, other.orderId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
    lastComparison = java.lang.Boolean.compare(isSetProductList(), other.isSetProductList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProductList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.productList, other.productList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetPricList(), other.isSetPricList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPricList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pricList, other.pricList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetCode(), other.isSetCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.code, other.code);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetMsg(), other.isSetMsg());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMsg()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.msg, other.msg);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("OrderResp(");
    boolean first = true;

    sb.append("orderId:");
    sb.append(this.orderId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("productName:");
    if (this.productName == null) {
      sb.append("null");
    } else {
      sb.append(this.productName);
    }
    first = false;
    if (isSetProductList()) {
      if (!first) sb.append(", ");
      sb.append("productList:");
      if (this.productList == null) {
        sb.append("null");
      } else {
        sb.append(this.productList);
      }
      first = false;
    }
    if (isSetPricList()) {
      if (!first) sb.append(", ");
      sb.append("pricList:");
      if (this.pricList == null) {
        sb.append("null");
      } else {
        sb.append(this.pricList);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("code:");
    sb.append(this.code);
    first = false;
    if (!first) sb.append(", ");
    sb.append("msg:");
    if (this.msg == null) {
      sb.append("null");
    } else {
      sb.append(this.msg);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'orderId' because it's a primitive and you chose the non-beans generator.
    if (productName == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'productName' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'code' because it's a primitive and you chose the non-beans generator.
    if (msg == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'msg' was not present! Struct: " + toString());
    }
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

  private static class OrderRespStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public OrderRespStandardScheme getScheme() {
      return new OrderRespStandardScheme();
    }
  }

  private static class OrderRespStandardScheme extends org.apache.thrift.scheme.StandardScheme<OrderResp> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, OrderResp struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ORDER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.orderId = iprot.readI64();
              struct.setOrderIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PRODUCT_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.productName = iprot.readString();
              struct.setProductNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PRODUCT_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.productList = new java.util.ArrayList<java.lang.String>(_list0.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = iprot.readString();
                  struct.productList.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setProductListIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PRIC_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list3 = iprot.readListBegin();
                struct.pricList = new java.util.ArrayList<java.lang.String>(_list3.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem4;
                for (int _i5 = 0; _i5 < _list3.size; ++_i5)
                {
                  _elem4 = iprot.readString();
                  struct.pricList.add(_elem4);
                }
                iprot.readListEnd();
              }
              struct.setPricListIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.code = iprot.readI32();
              struct.setCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // MSG
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.msg = iprot.readString();
              struct.setMsgIsSet(true);
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
      if (!struct.isSetOrderId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'orderId' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetCode()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'code' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, OrderResp struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ORDER_ID_FIELD_DESC);
      oprot.writeI64(struct.orderId);
      oprot.writeFieldEnd();
      if (struct.productName != null) {
        oprot.writeFieldBegin(PRODUCT_NAME_FIELD_DESC);
        oprot.writeString(struct.productName);
        oprot.writeFieldEnd();
      }
      if (struct.productList != null) {
        if (struct.isSetProductList()) {
          oprot.writeFieldBegin(PRODUCT_LIST_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.productList.size()));
            for (java.lang.String _iter6 : struct.productList)
            {
              oprot.writeString(_iter6);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.pricList != null) {
        if (struct.isSetPricList()) {
          oprot.writeFieldBegin(PRIC_LIST_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.pricList.size()));
            for (java.lang.String _iter7 : struct.pricList)
            {
              oprot.writeString(_iter7);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldBegin(CODE_FIELD_DESC);
      oprot.writeI32(struct.code);
      oprot.writeFieldEnd();
      if (struct.msg != null) {
        oprot.writeFieldBegin(MSG_FIELD_DESC);
        oprot.writeString(struct.msg);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class OrderRespTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public OrderRespTupleScheme getScheme() {
      return new OrderRespTupleScheme();
    }
  }

  private static class OrderRespTupleScheme extends org.apache.thrift.scheme.TupleScheme<OrderResp> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, OrderResp struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI64(struct.orderId);
      oprot.writeString(struct.productName);
      oprot.writeI32(struct.code);
      oprot.writeString(struct.msg);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetProductList()) {
        optionals.set(0);
      }
      if (struct.isSetPricList()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetProductList()) {
        {
          oprot.writeI32(struct.productList.size());
          for (java.lang.String _iter8 : struct.productList)
          {
            oprot.writeString(_iter8);
          }
        }
      }
      if (struct.isSetPricList()) {
        {
          oprot.writeI32(struct.pricList.size());
          for (java.lang.String _iter9 : struct.pricList)
          {
            oprot.writeString(_iter9);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, OrderResp struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.orderId = iprot.readI64();
      struct.setOrderIdIsSet(true);
      struct.productName = iprot.readString();
      struct.setProductNameIsSet(true);
      struct.code = iprot.readI32();
      struct.setCodeIsSet(true);
      struct.msg = iprot.readString();
      struct.setMsgIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list10 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRING);
          struct.productList = new java.util.ArrayList<java.lang.String>(_list10.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _elem11;
          for (int _i12 = 0; _i12 < _list10.size; ++_i12)
          {
            _elem11 = iprot.readString();
            struct.productList.add(_elem11);
          }
        }
        struct.setProductListIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list13 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRING);
          struct.pricList = new java.util.ArrayList<java.lang.String>(_list13.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _elem14;
          for (int _i15 = 0; _i15 < _list13.size; ++_i15)
          {
            _elem14 = iprot.readString();
            struct.pricList.add(_elem14);
          }
        }
        struct.setPricListIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

