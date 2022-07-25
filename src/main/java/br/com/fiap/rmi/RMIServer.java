package br.com.fiap.rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import br.com.fiap.service.ClienteService;
import br.com.fiap.service.ClienteServiceImpl;

public class RMIServer {
	
	public static void main(String[] args) throws Exception {
		ClienteService service = new ClienteServiceImpl();
		
		ClienteService skeleton = (ClienteService) UnicastRemoteObject.exportObject(service,0);
		
		Registry registro = LocateRegistry.createRegistry(8081);
		registro.bind("cliente", skeleton);
		System.out.println("Objeto remoto no ar!");
	}

}
