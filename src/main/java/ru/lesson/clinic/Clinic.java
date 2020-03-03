package ru.lesson.clinic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Clinic{
	/*список клиентов*/
	private final Client[] clients;
	private String clientName;
	private Client clientFind;
	private Pet petFind;
	private String petName;
	
	public Clinic(final int size){
		this.clients = new Client[size];
	}
	
	/*добавить клиента*/
	public void addClient(final int position, final Client client){
		this.clients[position] = client;
//		System.out.println(position);
//		System.out.println(client);
	}
	
	
	public Client findClientsByClientName(final String name){
		
		System.out.println(clients.length);
		for(int i = 0; i<clients.length; i++){
			if(clients[i]==null){
				break;
			}
			clientName = clients[i].getNameClient();
//			System.out.println(i);
//			System.out.println(clientName);
			//System.out.println(name);
			if(clientName.equals(name)){
				System.out.println("find client: "+clients[i]+" "+clientName);
				//return clients[i];
				clientFind = clients[i];
				//break;
			}
		}
		return clientFind;
		/*реализовать*/
		//return new Client[]{};
	}
	public Client findClientsByPetName(final String name){
		
		System.out.println(clients.length);
		for(int i = 0; i<clients.length; i++){
			if(clients[i]==null){
				break;
			}
			petFind = clients[i].getPet();
			petName = petFind.getName();
//			System.out.println(i);
//			System.out.println(petName);
			//System.out.println(name);
			if(petName.equals(name)){
				System.out.println("find client: "+clients[i]+" "+petName);
				//return clients[i];
				clientFind = clients[i];
				//break;
			}
		}
		return clientFind;
		/*реализовать*/
		//return new Client[]{};
	}	
	

	public void editC(Integer position, String name){
		clients[position].setNameClient(name);
	}
	public void editP(Integer position, String name){
		petFind = clients[position].getPet();
		petFind.setName(name);
	}


	public void delC_old(Integer pos){
		List<Client> listOfClient = new ArrayList<Client>();
		Collections.addAll(listOfClient, clients);
//		System.out.println(pos);
		listOfClient.remove(pos.intValue());
//		System.out.println(listOfClient.toString());
		listOfClient.toArray(clients);//new Client[listOfClient.size()]);
//		System.out.println(Arrays.toString(clients)); //[bar, baz]
	}
	public void delC(String name){

		for (int i = 0; i<clients.length; i++){
			if (clients[i]==null)continue;
			if (clients[i].getNameClient().equals(name)){
				clients[i] = null;
			}
		}
	}
	public void delP(String name){
		for (int i = 0; i<clients.length; i++){
			if (clients[i]==null)continue;
			petFind = clients[i].getPet();
			if (petFind.getName().equals(name)){
				clients[i] = null;
			}
		}
	}


	public Client[] show(){
		/*for(int i = 0; i<clients.length; i++){
			if(clients[i]==null){
				continue;
			}
			clientName = clients[i].getNameClient();
			System.out.println(clients[i].getNameClient());
			petFind = clients[i].getPet();
			petName = petFind.getName();
			System.out.println("Client:"+clientName+" Pet:"+petName);
		}*/
		System.out.println(clients);
		return this.clients;
	}

	public int clinicLength(){
		return clients.length;
	}


}