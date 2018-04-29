package com.sv.java8.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * 
 * @author venkat
 * ref: http://www.vogella.com/tutorials/JavaCollections/article.html
 *
 */
public class MyArrayList {

    public static void main(String[] args) {

        // create a list using the
        List<String> list = Arrays.asList("Lars", "Simon");

        // alternatively
        List<String> anotherList = new ArrayList<>();
        anotherList.add("Lars");
        anotherList.add("Simon");


        // print each element to the console using method references
        list.forEach(System.out::println);
        anotherList.forEach(System.out::println);

    }
}