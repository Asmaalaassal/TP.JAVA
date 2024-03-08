package TP2;

import java.util.Scanner;

public class EXO4 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nombre de lignes pour le triangle : ");
        int N = scanner.nextInt();
        
        afficherTriangleEtoiles(N);
        
        scanner.close();
    }
    
    public static void afficherTriangleEtoiles(int N) {
        for (int i = 1; i <= N; i++) {
        	for (int j = 1; j <= i; j++) {
        }
                System.out.print("* ");
            }
            System.out.println();

}
}