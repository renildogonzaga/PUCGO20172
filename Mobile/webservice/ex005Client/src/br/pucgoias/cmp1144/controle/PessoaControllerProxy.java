package br.pucgoias.cmp1144.controle;

public class PessoaControllerProxy implements br.pucgoias.cmp1144.controle.PessoaController {
  private String _endpoint = null;
  private br.pucgoias.cmp1144.controle.PessoaController pessoaController = null;
  
  public PessoaControllerProxy() {
    _initPessoaControllerProxy();
  }
  
  public PessoaControllerProxy(String endpoint) {
    _endpoint = endpoint;
    _initPessoaControllerProxy();
  }
  
  private void _initPessoaControllerProxy() {
    try {
      pessoaController = (new br.pucgoias.cmp1144.controle.PessoaControllerServiceLocator()).getPessoaController();
      if (pessoaController != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)pessoaController)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)pessoaController)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (pessoaController != null)
      ((javax.xml.rpc.Stub)pessoaController)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.pucgoias.cmp1144.controle.PessoaController getPessoaController() {
    if (pessoaController == null)
      _initPessoaControllerProxy();
    return pessoaController;
  }
  
  public java.lang.String hello(java.lang.String nome) throws java.rmi.RemoteException{
    if (pessoaController == null)
      _initPessoaControllerProxy();
    return pessoaController.hello(nome);
  }
  
  public java.lang.String getPessoaXML(java.lang.String nome) throws java.rmi.RemoteException{
    if (pessoaController == null)
      _initPessoaControllerProxy();
    return pessoaController.getPessoaXML(nome);
  }
  
  public java.lang.String getPessoaJSON(java.lang.String nome) throws java.rmi.RemoteException{
    if (pessoaController == null)
      _initPessoaControllerProxy();
    return pessoaController.getPessoaJSON(nome);
  }
  
  
}