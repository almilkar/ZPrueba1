/**
 * SampleTestClass.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.smartbear;

public class SampleTestClass  implements java.io.Serializable {
    private double x;

    private double y;

    private java.lang.String name;

    private int[] intArray;

    public SampleTestClass() {
    }

    public SampleTestClass(
           double x,
           double y,
           java.lang.String name,
           int[] intArray) {
           this.x = x;
           this.y = y;
           this.name = name;
           this.intArray = intArray;
    }


    /**
     * Gets the x value for this SampleTestClass.
     * 
     * @return x
     */
    public double getX() {
        return x;
    }


    /**
     * Sets the x value for this SampleTestClass.
     * 
     * @param x
     */
    public void setX(double x) {
        this.x = x;
    }


    /**
     * Gets the y value for this SampleTestClass.
     * 
     * @return y
     */
    public double getY() {
        return y;
    }


    /**
     * Sets the y value for this SampleTestClass.
     * 
     * @param y
     */
    public void setY(double y) {
        this.y = y;
    }


    /**
     * Gets the name value for this SampleTestClass.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this SampleTestClass.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the intArray value for this SampleTestClass.
     * 
     * @return intArray
     */
    public int[] getIntArray() {
        return intArray;
    }


    /**
     * Sets the intArray value for this SampleTestClass.
     * 
     * @param intArray
     */
    public void setIntArray(int[] intArray) {
        this.intArray = intArray;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SampleTestClass)) return false;
        SampleTestClass other = (SampleTestClass) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.x == other.getX() &&
            this.y == other.getY() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.intArray==null && other.getIntArray()==null) || 
             (this.intArray!=null &&
              java.util.Arrays.equals(this.intArray, other.getIntArray())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += new Double(getX()).hashCode();
        _hashCode += new Double(getY()).hashCode();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getIntArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIntArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIntArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SampleTestClass.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://smartbear.com", "SampleTestClass"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("x");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smartbear.com", "X"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("y");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smartbear.com", "Y"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smartbear.com", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intArray");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smartbear.com", "IntArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://smartbear.com", "int"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
