import java.util.Scanner;

/*работа клиники*/

public class ClinicRunner{
	public static void main(String[] arg){
		final Clinic clinic = new Clinic(10);
		clinic.addClient(0, new Client("Brown", new Cat("Digy")));
		
		clinic.addClient(1, new Client("Nick", new Dog(
			new Animal("Sparky"))
		));

		clinic.addClient(2, new Client("Ann", 
			new CatDog(
				new Cat("Tom"), new Dog(new Animal("Piccy"))
				)
			)
		);
	
		Scanner reader = new Scanner(System.in);
		try{
			//Clinic clinica = new Clinic(10);
			String exit = "";

			while(!exit.equals("yes")){
				System.out.println("Выберите операцию: add/findC/findP/editC/editP/delC/delP/show");
				String operator = reader.next();				
				if(operator.equals("add")){
					System.out.println("Enter position client");
					String pos = reader.next();
					System.out.println("Enter name client");
					String nameClient = reader.next();
					System.out.println("Enter name pet");
					String namePet = reader.next();
					Client client = new Client(pos, new Cat(namePet));
					clinic.addClient(Integer.valueOf(pos), client);
				}
				else if(operator.equals("findC")){
					System.out.println("Enter name client");
					String name = reader.next();
					clinic.findClientsByClientName(name);
				}
				else if(operator.equals("findP")){
					System.out.println("Enter name client");
					String name = reader.next();
					clinic.findClientsByPetName(name);
				}				
				else if(operator.equals("editC")){
					System.out.println("Enter position client");
					Integer position = Integer.valueOf(reader.next());
					System.out.println("Enter name client");
					String nameClient = reader.next();
					clinic.editC(position, nameClient);
				}
				else if(operator.equals("editP")){
					System.out.println("Enter position pet");
					Integer position = Integer.valueOf(reader.next());
					System.out.println("Enter name pet");
					String namePet = reader.next();
					clinic.editP(position, namePet);
				}				
				else if(operator.equals("delC")){
					System.out.println("Enter position Client");
					Integer position = Integer.valueOf(reader.next());
					clinic.delC(position);
					
				}
				else if(operator.equals("delP")){
					
				}				
				else if(operator.equals("show")){
					clinic.show();
					
				}
				System.out.println("Exit: yes/no");
				exit = reader.next();
			}
		}finally{
			reader.close();
		}
	}
}