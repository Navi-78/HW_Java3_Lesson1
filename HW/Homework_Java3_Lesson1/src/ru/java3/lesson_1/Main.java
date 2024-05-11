package ru.java3.lesson_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String[] arr = {"Hello", "World"};
        doTask1(arr);
        var check = doArrayList(arr);
        check.add("Works");
        System.out.println(check);
    }

    public static <T> void doTask1(T[] e) {
        System.out.println("Первоначальное значение: " + doArrayList(e));
        T val1 = e[0];
        e[0] = e[1];
        e[1] = val1;
        System.out.println("Полученный резултат    : " + doArrayList(e));
    }

    public static <T> List<T> doArrayList(T[] arr) {

        return new ArrayList<>(Arrays.asList(arr));

    }

}
