package ru.lesson.lessons;

import java.util.*;

public class UserRunner {

    public static void main(String[] args) {
//        List<User> users = new ArrayList<>();
/*        Set<User> users = new HashSet<User>();
        users.add(new User("1", "first"));
        users.add(new User("2", "two"));
        users.add(new User("1", "first"));*/

/*
        for (User user : users) {
            System.out.println(user);
        }
*/

        Map<String, User> users = new HashMap<String, User>();
        users.put("1", new User("1", "first"));
        users.put("2", new User("2", "two"));
        users.put("3", new User("1", "first"));

        for (Map.Entry<String, User> user:users.entrySet()) {
            System.out.println(user);
        }

    }
}
