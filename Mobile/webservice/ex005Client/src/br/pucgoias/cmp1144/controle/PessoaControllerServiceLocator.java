/**
 * PessoaControllerServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.pucgoias.cmp1144.controle;

public class PessoaControllerServiceLocator extends org.apache.axis.client.Service implements br.pucgoias.cmp1144.controle.PessoaControllerService {

    public PessoaControllerServiceLocator() {
    }


    public PessoaControllerServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PessoaControllerServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PessoaController
    private java.lang.String PessoaController_address = "http://localhost:8080/ex005/services/PessoaController";

    public java.lang.String getPessoaControllerAddress() {
        return PessoaController_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PessoaControllerWSDDServiceName = "PessoaController";

    public java.lang.String getPessoaControllerWSDDServiceName() {
        return PessoaControllerWSDDServiceName;
    }

    public void setPessoaControllerWSDDServiceName(java.lang.String name) {
        PessoaControllerWSDDServiceName = name;
    }

    public br.pucgoias.cmp1144.controle.PessoaController getPessoaController() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PessoaController_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPessoaController(endpoint);
    }

    public br.pucgoias.cmp1144.controle.PessoaController getPessoaController(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.pucgoias.cmp1144.controle.PessoaControllerSoapBindingStub _stub = new br.pucgoias.cmp1144.controle.PessoaControllerSoapBindingStub(portAddress, this);
            _stub.setPortName(getPessoaControllerWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPessoaControllerEndpointAddress(java.lang.String address) {
        PessoaController_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.pucgoias.cmp1144.controle.PessoaController.class.isAssignableFrom(serviceEndpointInterface)) {
                br.pucgoias.cmp1144.controle.PessoaControllerSoapBindingStub _stub = new br.pucgoias.cmp1144.controle.PessoaControllerSoapBindingStub(new java.net.URL(PessoaController_address), this);
                _stub.setPortName(getPessoaControllerWSDDServiceName());
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
        if ("PessoaController".equals(inputPortName)) {
            return getPessoaController();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://controle.cmp1144.pucgoias.br", "PessoaControllerService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://controle.cmp1144.pucgoias.br", "PessoaController"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PessoaController".equals(portName)) {
            setPessoaControllerEndpointAddress(address);
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
