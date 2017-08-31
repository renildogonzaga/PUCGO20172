package br.pucgoias.cmp1144;

public class PrimeiroServicoProxy implements br.pucgoias.cmp1144.PrimeiroServico {
  private String _endpoint = null;
  private br.pucgoias.cmp1144.PrimeiroServico primeiroServico = null;
  
  public PrimeiroServicoProxy() {
    _initPrimeiroServicoProxy();
  }
  
  public PrimeiroServicoProxy(String endpoint) {
    _endpoint = endpoint;
    _initPrimeiroServicoProxy();
  }
  
  private void _initPrimeiroServicoProxy() {
    try {
      primeiroServico = (new br.pucgoias.cmp1144.PrimeiroServicoServiceLocator()).getPrimeiroServico();
      if (primeiroServico != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)primeiroServico)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)primeiroServico)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (primeiroServico != null)
      ((javax.xml.rpc.Stub)primeiroServico)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.pucgoias.cmp1144.PrimeiroServico getPrimeiroServico() {
    if (primeiroServico == null)
      _initPrimeiroServicoProxy();
    return primeiroServico;
  }
  
  public java.lang.String getMeuServico(java.lang.String nome) throws java.rmi.RemoteException{
    if (primeiroServico == null)
      _initPrimeiroServicoProxy();
    return primeiroServico.getMeuServico(nome);
  }
  
  
}