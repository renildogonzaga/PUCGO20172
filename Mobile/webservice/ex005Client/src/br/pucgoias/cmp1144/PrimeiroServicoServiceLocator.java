/**
 * PrimeiroServicoServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.pucgoias.cmp1144;

public class PrimeiroServicoServiceLocator extends org.apache.axis.client.Service implements br.pucgoias.cmp1144.PrimeiroServicoService {

    public PrimeiroServicoServiceLocator() {
    }


    public PrimeiroServicoServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PrimeiroServicoServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PrimeiroServico
    private java.lang.String PrimeiroServico_address = "http://localhost:8080/ex005/services/PrimeiroServico";

    public java.lang.String getPrimeiroServicoAddress() {
        return PrimeiroServico_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PrimeiroServicoWSDDServiceName = "PrimeiroServico";

    public java.lang.String getPrimeiroServicoWSDDServiceName() {
        return PrimeiroServicoWSDDServiceName;
    }

    public void setPrimeiroServicoWSDDServiceName(java.lang.String name) {
        PrimeiroServicoWSDDServiceName = name;
    }

    public br.pucgoias.cmp1144.PrimeiroServico getPrimeiroServico() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PrimeiroServico_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPrimeiroServico(endpoint);
    }

    public br.pucgoias.cmp1144.PrimeiroServico getPrimeiroServico(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.pucgoias.cmp1144.PrimeiroServicoSoapBindingStub _stub = new br.pucgoias.cmp1144.PrimeiroServicoSoapBindingStub(portAddress, this);
            _stub.setPortName(getPrimeiroServicoWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPrimeiroServicoEndpointAddress(java.lang.String address) {
        PrimeiroServico_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.pucgoias.cmp1144.PrimeiroServico.class.isAssignableFrom(serviceEndpointInterface)) {
                br.pucgoias.cmp1144.PrimeiroServicoSoapBindingStub _stub = new br.pucgoias.cmp1144.PrimeiroServicoSoapBindingStub(new java.net.URL(PrimeiroServico_address), this);
                _stub.setPortName(getPrimeiroServicoWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("PrimeiroServico".equals(inputPortName)) {
            return getPrimeiroServico();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://cmp1144.pucgoias.br", "PrimeiroServicoService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://cmp1144.pucgoias.br", "PrimeiroServico"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PrimeiroServico".equals(portName)) {
            setPrimeiroServicoEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
