package br.pucgoias.cmp1144.controle;
import java.rmi.RemoteException;
import javax.xml.rpc.ServiceException;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PessoaControllerServiceLocator pservice = new PessoaControllerServiceLocator();
		try {
			System.out.println(pservice.getPessoaController().hello("ola"));
			System.out.println(pservice.getPessoaController().getPessoaJSON("RENILDO"));
			//System.out.println("*******");
			System.out.println(pservice.getPessoaController().getPessoaXML("RENILDO"));
		} catch (RemoteException | ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
