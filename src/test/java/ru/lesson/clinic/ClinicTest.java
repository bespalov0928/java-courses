package ru.lesson.clinic;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import static org.junit.Assert.*;

public class ClinicTest {

    @Test
    public void addClient() throws Exception {
/*
        Client[] expected = new Client[3];
        Client[] actual = new Client[3];

        Client client = new Client("client", new Cat("cat"));
        Client client1 = new Client("client1", new Cat("cat1"));
        Client client2 = new Client("client2", new Cat("cat2"));
        expected[0] = client;
        expected[1] = client1;
        expected[2] = client2;

        Clinic clinic = new Clinic(3);
        clinic.addClient(0, new Client("client", new Cat("cat")));
        clinic.addClient(1, new Client("client1", new Cat("cat1")));
        clinic.addClient(2, new Client("client2", new Cat("cat2")));

        actual = clinic.show();

        for (int i=0; i<expected.length; i++){
            Assert.assertEquals(expected[i].getNameClient(), actual[i].getNameClient());
        }
        */


    }

    @Test(expected = UserException.class)
    public void addException() throws Exception {
/*        Client[] expected = new Client[3];
        Client[] actual = new Client[3];

        Client client = new Client("client", new Cat("cat"));
        Client client1 = new Client("client1", new Cat("cat1"));
        Client client2 = new Client("client2", new Cat("cat2"));
        expected[0] = client;
        expected[1] = client1;
        expected[2] = client2;

        Clinic clinic = new Clinic(3);
        clinic.addClient(0, new Client("client", new Cat("cat")));
        clinic.addClient(1, new Client("client1", new Cat("cat1")));
        clinic.addClient(2, new Client("client2", new Cat("cat2")));

        //actual = clinic.show();*/

    }

    @Test
    public void findClientsByClientName() throws Exception {
/*        Clinic clinic = new Clinic(3);
        clinic.addClient(0, new Client("client", new Cat("cat")));
        clinic.addClient(1, new Client("client1", new Cat("cat1")));
        clinic.addClient(2, new Client("client2", new Cat("cat2")));

        Client client = clinic.findClientsByClientName("client");
        Assert.assertEquals(client.getNameClient(), "client");*/
    }

    @Test
    public void findClientsByPetName() throws Exception {
/*        Clinic clinic = new Clinic(3);
        clinic.addClient(0, new Client("client", new Cat("cat")));
        clinic.addClient(1, new Client("client1", new Cat("cat1")));
        clinic.addClient(2, new Client("client2", new Cat("cat2")));

        Client client = clinic.findClientsByPetName("cat");
        Assert.assertEquals(client.getPet().getName(), "cat");*/
    }

    @Test
    public void editC() throws Exception {
/*        Clinic clinic = new Clinic(3);
        clinic.addClient(0, new Client("client", new Cat("cat")));
        clinic.addClient(1, new Client("client1", new Cat("cat1")));
        clinic.addClient(2, new Client("client2", new Cat("cat2")));

        clinic.editC(0,"client3");
        Assert.assertEquals(clinic.findClientsByClientName("client3").getNameClient(), "client3");*/
    }

    @Test
    public void editP() throws Exception {
/*        Clinic clinic = new Clinic(3);
        clinic.addClient(0, new Client("client", new Cat("cat")));
        clinic.addClient(1, new Client("client1", new Cat("cat1")));
        clinic.addClient(2, new Client("client2", new Cat("cat2")));

        clinic.editP(0,"cat3");
        Assert.assertEquals(clinic.findClientsByPetName("cat3").getPet().getName(), "cat3");*/

    }

    @Test
    public void delC() throws Exception {
/*        Clinic clinic = new Clinic(3);
        clinic.addClient(0, new Client("client", new Cat("cat")));
        clinic.addClient(1, new Client("client1", new Cat("cat1")));
        clinic.addClient(2, new Client("client2", new Cat("cat2")));

        clinic.delC("client");
        Assert.assertEquals(clinic.findClientsByClientName("client"), null);*/
    }

    @Test
    public void delP() throws Exception {
/*        Clinic clinic = new Clinic(3);
        clinic.addClient(0, new Client("client", new Cat("cat")));
        clinic.addClient(1, new Client("client1", new Cat("cat1")));
        clinic.addClient(2, new Client("client2", new Cat("cat2")));

        clinic.delP("cat");
        Assert.assertEquals(clinic.findClientsByClientName("cat"), null);*/
    }

    @Test
    public void addus() throws Exception {
        Clinic clinic = new Clinic();
        User user1 = new User("1", "client1");
        User user2 = new User("2", "client2");
        User user3 = new User("1", "client1");

        clinic.addUs(user1);
        clinic.addUs(user2);
        clinic.addUs(user3);

        LinkedList<User> userCl = clinic.showUs();

        for (User user : userCl) {
            if (user.equals(new User("1", "client1"))) {
                System.out.println("yes");
            } else {
                System.out.println("not");
            }
            break;
        }



/*        Set<User> users = new HashSet<User>();
        users.add(new User("1", "client1"));
        users.add(new User("2", "client2"));
        users.add(new User("1", "client1"));*/


    }


}


