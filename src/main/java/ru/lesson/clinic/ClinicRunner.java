package ru.lesson.clinic;

import java.util.Scanner;

/*работа клиники*/

public class ClinicRunner {
    public static void main(String[] arg) throws UserException {
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
        try {
            //Clinic clinica = new Clinic(10);
            String exit = "";

            while (!exit.equals("yes")) {
                System.out.println("Выберите операцию: add/findC/findP/editC/editP/delC/delP/show");
                String operator = reader.next();
                if (operator.equals("add")) {
                    try {
                        System.out.println("Enter position client");
                        String pos = reader.next();
                        System.out.println("Enter name client");
                        String nameClient = reader.next();
                        System.out.println("Enter name pet");
                        String namePet = reader.next();
                        Client client = new Client(pos, new Cat(namePet));
                        clinic.addClient(Integer.valueOf(pos), client);
                    } catch (NumberFormatException e) {
                        System.out.println(e.getMessage());
                        System.out.println("параметр может быть только числом");
                    }
                } else if (operator.equals("findC")) {
                    System.out.println("Enter name client");
                    String name = reader.next();
                    clinic.findClientsByClientName(name);
                } else if (operator.equals("findP")) {
                    System.out.println("Enter name client");
                    String name = reader.next();
                    clinic.findClientsByPetName(name);
                } else if (operator.equals("editC")) {
                    try {
                        System.out.println("Enter position client");
                        Integer position = Integer.valueOf(reader.next());
                        System.out.println("Enter name client");
                        String nameClient = reader.next();
                        clinic.editC(position, nameClient);
                    } catch (NumberFormatException e) {
                        System.out.println(e.getMessage());
                        System.out.println("параметр может быть только числом");
                    }
                } else if (operator.equals("editP")) {
                    try {
                        System.out.println("Enter position pet");
                        Integer position = Integer.valueOf(reader.next());
                        System.out.println("Enter name pet");
                        String namePet = reader.next();
                        clinic.editP(position, namePet);
                    } catch (NumberFormatException e) {
                        System.out.println(e.getMessage());
                        System.out.println("параметр может быть только числом");
                    }
                } else if (operator.equals("delC")) {
                    try {
                        System.out.println("Enter name Client");
                        String position = reader.next();
                        //Integer.valueOf(reader.next());
                        clinic.delC(position);
                    } catch (NumberFormatException e) {
                        System.out.println(e.getMessage());
                        System.out.println("параметр может быть только числом");
                    } catch (UserException e) {
                        System.out.println(e.getMessage());
//						System.out.println("значение равно null");
                    }
                } else if (operator.equals("delP")) {
                    try {
                        System.out.println("Enter name Pet");
                        String position = reader.next();
                        //Integer.valueOf(reader.next());
                        clinic.delP(position);
                    } catch (NumberFormatException e) {
                        System.out.println(e.getMessage());
                        System.out.println("параметр может быть только числом");
                    }
                } else if (operator.equals("show")) {
                    clinic.show();

                }
                System.out.println("Exit: yes/no");
                exit = reader.next();
            }
        } finally {
            reader.close();
        }
    }
}