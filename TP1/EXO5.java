package TP1;
import java.util.Scanner;

public class EXO5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
	       int fact=1;
	       for(int i = 1;i<=n;i++){
	           fact=fact*i;
	       }
	       System.out.println("factorielle est: "+fact);
}
}
