package br.pucgoias.cmp1144;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrimeiroServicoServiceLocator service = new PrimeiroServicoServiceLocator();
		try {
			System.out.println(service.getPrimeiroServico().getMeuServico("ADS"));
		} catch (RemoteException | ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
