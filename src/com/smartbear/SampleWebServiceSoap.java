/**
 * SampleWebServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.smartbear;

public interface SampleWebServiceSoap extends java.rmi.Remote {

    /**
     * This method returns a string value.
     */
    public java.lang.String helloWorld() throws java.rmi.RemoteException;

    /**
     * This method returns an array of integer values.
     */
    public int[] getArray() throws java.rmi.RemoteException;

    /**
     * This method returns the current system time.
     */
    public java.util.Calendar getCurrentTime() throws java.rmi.RemoteException;

    /**
     * This method returns an object.
     */
    public com.smartbear.SampleTestClass getSampleObject(int no) throws java.rmi.RemoteException;

    /**
     * This method uses an object as a parameter.
     */
    public java.lang.String setSampleObject(com.smartbear.SampleTestClass obj) throws java.rmi.RemoteException;

    /**
     * This method returns an object that is an XML node.
     */
    public com.smartbear.GetXmlDataResponseGetXmlDataResult getXmlData() throws java.rmi.RemoteException;
}
