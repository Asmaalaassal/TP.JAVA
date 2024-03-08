package TP2;

import java.util.Scanner;

public class EXO5 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un entier n : ");
        int n = scanner.nextInt();
 
        long factorielWhile = calculerFactorielWhile(n);
        long factorielFor = calculerFactorielFor(n);
        
        System.out.println("n! calculé avec une boucle while : " + factorielWhile);
        System.out.println("n! calculé avec une boucle for   : " + factorielFor);
        
        scanner.close();
        }
    public static long calculerFactorielWhile(int n) {
        long resultat = 1;
        int i = 1;
        while (i <= n) {
            resultat *= i;
            i++;
        }
        return resultat;
        }
    public static long calculerFactorielFor(int n) {
        long resultat = 1;
        for (int i = 1; i <= n; i++) {
            resultat *= i;
        }
        return resultat;

}
}
