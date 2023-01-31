package be.ephec.java.exercice.e01;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Bonjour !");
        System.out.println("Veuillez introduire votre nom : ");
        String nomDeFamille = kb.nextLine();
        System.out.println("Veuillez introduire votre prénom : ");
        String prenom = kb.nextLine();
        System.out.println("Veuillez introduire votre âge : ");
        int age = kb.nextInt();

        Person Driton = new Person();
        Driton.firstName = prenom;
        Driton.lastName = nomDeFamille;
        Driton.age = age;

        Driton.display();

    }
}
