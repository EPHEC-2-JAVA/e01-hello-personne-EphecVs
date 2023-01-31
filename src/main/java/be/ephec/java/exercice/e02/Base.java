package be.ephec.java.exercice.e02;

import java.util.Scanner;

public class Base {
    public static void main(String[] args) {


        int base =1;
        int nombre =1;


        while (nombre !=0 && base !=0) {
            Scanner kb = new Scanner(System.in);

            System.out.println("Veuillez introduire une base");
            base = kb.nextInt();

            System.out.println("Veuillez introduire un nombre : ");
            nombre = kb.nextInt();



            if(nombre !=0 && base !=0) {
                System.out.println(Integer.parseInt(String.valueOf(nombre), base));
            }
        }
    }
}
