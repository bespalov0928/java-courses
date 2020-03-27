package ru.lesson.clinic;

import org.junit.Test;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.Assert.assertEquals;

public class BlockQueueClinicTest {

    @Test
    public void queue() throws InterruptedException {
        final BlockQueueClinic<User> queue = new BlockQueueClinic<>();
        final List<CustomerClinic> customers = Arrays.asList(new CustomerClinic(queue), new CustomerClinic(queue));
        for (CustomerClinic customer : customers) {
            customer.start();
        }

        ProducerClinic produser = new ProducerClinic(queue,
                Arrays.asList(new User("1", "1"),
                        new User("2", "2"),
                        new User("3", "3"),
                        new User("4", "4"))
        );

        produser.start();
        produser.join();
        Thread.sleep(101);
        int count = 0;
        for (CustomerClinic customer: customers) {
            count += customer.size();
        }
        assertEquals(count, produser.size());
    }



    public static final class ProducerClinic extends Thread {
        private final BlockQueueClinic<User> queue;
        private final List<User> store;

        public ProducerClinic(final BlockQueueClinic<User> queue, final List<User> store) {
            super();
            this.queue = queue;
            this.store = store;
        }

        @Override
        public void run() {
            for (User user: store) {
                this.queue.push(user);
            }
        }

        public int size(){
            return this.store.size();
        }
    }

    private static final class CustomerClinic extends Thread {
        private final BlockQueueClinic<User> queue;
        private final AtomicInteger counter = new AtomicInteger(0);

        private CustomerClinic(BlockQueueClinic<User> queue) {
            super();
            this.queue = queue;

        }

        @Override
        public void run() {
            while (true){
                System.out.println(String.format("%s, %s", Thread.currentThread().getId(), this.queue.poil()));
                counter.incrementAndGet();
            }
        }

        public int size(){
            return this.counter.get();
        }
    }

}