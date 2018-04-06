package com.smartbear;

public class SampleWebServiceSoapProxy implements com.smartbear.SampleWebServiceSoap {
  private String _endpoint = null;
  private com.smartbear.SampleWebServiceSoap sampleWebServiceSoap = null;
  
  public SampleWebServiceSoapProxy() {
    _initSampleWebServiceSoapProxy();
  }
  
  public SampleWebServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initSampleWebServiceSoapProxy();
  }
  
  private void _initSampleWebServiceSoapProxy() {
    try {
      sampleWebServiceSoap = (new com.smartbear.SampleWebServiceLocator()).getSampleWebServiceSoap();
      if (sampleWebServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sampleWebServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sampleWebServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sampleWebServiceSoap != null)
      ((javax.xml.rpc.Stub)sampleWebServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.smartbear.SampleWebServiceSoap getSampleWebServiceSoap() {
    if (sampleWebServiceSoap == null)
      _initSampleWebServiceSoapProxy();
    return sampleWebServiceSoap;
  }
  
  public java.lang.String helloWorld() throws java.rmi.RemoteException{
    if (sampleWebServiceSoap == null)
      _initSampleWebServiceSoapProxy();
    return sampleWebServiceSoap.helloWorld();
  }
  
  public int[] getArray() throws java.rmi.RemoteException{
    if (sampleWebServiceSoap == null)
      _initSampleWebServiceSoapProxy();
    return sampleWebServiceSoap.getArray();
  }
  
  public java.util.Calendar getCurrentTime() throws java.rmi.RemoteException{
    if (sampleWebServiceSoap == null)
      _initSampleWebServiceSoapProxy();
    return sampleWebServiceSoap.getCurrentTime();
  }
  
  public com.smartbear.SampleTestClass getSampleObject(int no) throws java.rmi.RemoteException{
    if (sampleWebServiceSoap == null)
      _initSampleWebServiceSoapProxy();
    return sampleWebServiceSoap.getSampleObject(no);
  }
  
  public java.lang.String setSampleObject(com.smartbear.SampleTestClass obj) throws java.rmi.RemoteException{
    if (sampleWebServiceSoap == null)
      _initSampleWebServiceSoapProxy();
    return sampleWebServiceSoap.setSampleObject(obj);
  }
  
  public com.smartbear.GetXmlDataResponseGetXmlDataResult getXmlData() throws java.rmi.RemoteException{
    if (sampleWebServiceSoap == null)
      _initSampleWebServiceSoapProxy();
    return sampleWebServiceSoap.getXmlData();
  }
  
  
}