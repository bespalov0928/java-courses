package ru.lesson.lessons;

import java.util.Objects;

public class User {
    private String id;
    private String user;

    public User(String id, String user) {
        this.id = id;
        this.user = user;
    }

    public String getId() {
        return id;
    }

    public String getUser() {
        return user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user1 = (User) o;
        return Objects.equals(id, user1.id) &&
                Objects.equals(user, user1.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user);
    }

}
