/**
 * SampleWebService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.smartbear;

public interface SampleWebService extends javax.xml.rpc.Service {

/**
 * This sample web service is used to demonstrate how to test web
 * services with SmartBear's TestComplete.
 */
    public java.lang.String getSampleWebServiceSoapAddress();

    public com.smartbear.SampleWebServiceSoap getSampleWebServiceSoap() throws javax.xml.rpc.ServiceException;

    public com.smartbear.SampleWebServiceSoap getSampleWebServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
