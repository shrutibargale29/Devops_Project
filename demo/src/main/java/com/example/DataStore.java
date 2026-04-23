package com.example;

import java.util.ArrayList;

public class DataStore {

    public static ArrayList<Student> students = new ArrayList<>();

    // Safety initialization (VERY IMPORTANT)
    static {
        if (students == null) {
            students = new ArrayList<>();
        }
    }
}