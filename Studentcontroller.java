package com.controller;

import java.util.Scanner;

import com.entities.Studententities;
import com.servise.Studentservise;

public class Studentcontroller {

    public void insertData(Studententities s) throws Exception {
        Studentservise service = new Studentservise();
        service.insertStudent(s);
    }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your ID:");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter your Name:");
        String name = sc.nextLine();

        System.out.println("Enter your City:");
        String city = sc.nextLine();

        Studententities s = new Studententities(id, name, city);

        Studentcontroller controller = new Studentcontroller();
        controller.insertData(s);

        sc.close();
    }
}
