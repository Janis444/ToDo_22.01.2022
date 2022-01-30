package com.KRT;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    ArrayList<String> toDo = new ArrayList<>();                     // izveido array list objektu

    Scanner scan = new Scanner(System.in);                          // izveido scanner objektu
    String name;
    String plan1;
    String yn;


    System.out.println("");
    System.out.println("Welcome to ToDo list!");
    System.out.println("Ievadiet, ko plānotiet darīt:");
    plan1 = scan.nextLine();
    toDo.add(plan1);                                                   //pirmo atbildi pievine toDo arrayList

    do {
        System.out.println("Vai vēlaties papildināt saraktu? y/n");
        yn = scan.nextLine();
        if (!yn.equals("y"));
        {
            System.out.println("Ievadiet, ko plānotiet darīt:");
            plan1 = scan.nextLine();
            toDo.add(plan1);
        }

    } while (!yn.equals("n"));
        System.out.println("ok, gaidīs nakamo reizi!");
        System.out.println(toDo);                                       // izdrukā sarakstu - plan












    }
}
