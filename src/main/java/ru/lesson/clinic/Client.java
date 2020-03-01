public class Client{
	private String id;
	private final Pet pet;
	
	public Client(String id, Pet pet){
		this.id = id;
		this.pet = pet;
	}
	public String getNameClient(){
		return this.id;
	}
	
	public Pet getPet(){
		return this.pet;
	}
	
	public void setNameClient(String nameClient){
		this.id = nameClient;
	}
}