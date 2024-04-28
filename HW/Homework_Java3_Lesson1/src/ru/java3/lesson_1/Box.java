package ru.java3.lesson_1;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    private List<T> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public List<T> getFruits() {
        fruits.isEmpty();
        return fruits;
    }

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public boolean compare(Box<T> other) {

        float curWeight = fruits.get(0).getWeight() * fruits.size();
        float anoWeight = other.getFruits().get(0).getWeight() * other.getFruits().size();

        return curWeight == anoWeight;
    }

    public void fillBox(Box<T> other) {

        fruits.addAll(other.getFruits());
        other.getFruits().clear();
    }

}
