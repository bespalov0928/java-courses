package ru.lesson.clinic;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClinicTest {

    @Test
    public void addClient() {
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
        /*Assert.assertEquals(expected, actual);*/
    }

    @Test
    public void findClientsByClientName() {
        Clinic clinic = new Clinic(3);
        clinic.addClient(0, new Client("client", new Cat("cat")));
        clinic.addClient(1, new Client("client1", new Cat("cat1")));
        clinic.addClient(2, new Client("client2", new Cat("cat2")));

        Client client = clinic.findClientsByClientName("client");
        Assert.assertEquals(client.getNameClient(), "client");
    }

    @Test
    public void findClientsByPetName() {
        Clinic clinic = new Clinic(3);
        clinic.addClient(0, new Client("client", new Cat("cat")));
        clinic.addClient(1, new Client("client1", new Cat("cat1")));
        clinic.addClient(2, new Client("client2", new Cat("cat2")));

        Client client = clinic.findClientsByPetName("cat");
        Assert.assertEquals(client.getPet().getName(), "cat");
    }

    @Test
    public void editC() {
        Clinic clinic = new Clinic(3);
        clinic.addClient(0, new Client("client", new Cat("cat")));
        clinic.addClient(1, new Client("client1", new Cat("cat1")));
        clinic.addClient(2, new Client("client2", new Cat("cat2")));

        clinic.editC(0,"client3");
        Assert.assertEquals(clinic.findClientsByClientName("client3").getNameClient(), "client3");
    }

    @Test
    public void editP() {
        Clinic clinic = new Clinic(3);
        clinic.addClient(0, new Client("client", new Cat("cat")));
        clinic.addClient(1, new Client("client1", new Cat("cat1")));
        clinic.addClient(2, new Client("client2", new Cat("cat2")));

        clinic.editP(0,"cat3");
        Assert.assertEquals(clinic.findClientsByPetName("cat3").getPet().getName(), "cat3");

    }

    @Test
    public void delC() {
        Clinic clinic = new Clinic(3);
        clinic.addClient(0, new Client("client", new Cat("cat")));
        clinic.addClient(1, new Client("client1", new Cat("cat1")));
        clinic.addClient(2, new Client("client2", new Cat("cat2")));

        clinic.delC("client");
        Assert.assertEquals(clinic.findClientsByClientName("client"), null);
    }

    @Test
    public void delP() {
        Clinic clinic = new Clinic(3);
        clinic.addClient(0, new Client("client", new Cat("cat")));
        clinic.addClient(1, new Client("client1", new Cat("cat1")));
        clinic.addClient(2, new Client("client2", new Cat("cat2")));

        clinic.delP("cat");
        Assert.assertEquals(clinic.findClientsByClientName("cat"), null);
    }
}