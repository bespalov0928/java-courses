package ru.lesson.lessons.lesson_12;

public class Counter {
    private int amount;

    public synchronized int increase(){
        amount++;
        return amount;
    }

}
