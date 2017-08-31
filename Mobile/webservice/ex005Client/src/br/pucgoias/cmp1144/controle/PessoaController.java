/**
 * PessoaController.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.pucgoias.cmp1144.controle;

public interface PessoaController extends java.rmi.Remote {
    public java.lang.String hello(java.lang.String nome) throws java.rmi.RemoteException;
    public br.pucgoias.cmp1144.entidade.Pessoa getPessoaXML(java.lang.String nome) throws java.rmi.RemoteException;
    public java.lang.String getPessoaJSON(java.lang.String nome) throws java.rmi.RemoteException;
}
