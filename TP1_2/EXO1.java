package TP1_2;

import java.util.Scanner;

public class EXO1 {
	public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Entrez un entier positif : ");
        int nombre = scanner.nextInt();
        if (nombre <= 0) {
            System.out.println("Veuillez entrer un entier positif.");
            return;
        }
        afficherDiviseurs(nombre);

        scanner.close();
    }
    public static void afficherDiviseurs(int nombre) {
        int nombreDiviseurs = 0;
        int sommeDiviseurs = 0;
        System.out.println("Les diviseurs de " + nombre + " sont :");
        for (int i = 1; i <= nombre; i++) {
            if (nombre % i == 0) {
                System.out.print(i + " ");
                nombreDiviseurs++;
                sommeDiviseurs += i;
            }
        }
        System.out.println("\nLe nombre de diviseurs est : " + nombreDiviseurs);
        System.out.println("La somme des diviseurs est : " + sommeDiviseurs);
	}
}