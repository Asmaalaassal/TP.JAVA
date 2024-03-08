package TP2;

import java.util.Scanner;

public class EXO2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la base X : ");
        int X = scanner.nextInt();
        
        System.out.print("Entrez l'exposant N : ");
        int N = scanner.nextInt();
        
        int resultat = calculPuissance(X, N);
        System.out.println(X + "^" + N + " = " + resultat);
        
        scanner.close();
    }
    
    public static int calculPuissance(int base, int exposant) {
        int resultat = 1;
        for (int i = 0; i < exposant; i++) {
            resultat *= base;
        }
        return resultat;

}
}
