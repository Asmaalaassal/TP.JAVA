package TP1;
import java.util.Scanner;

public class EXO8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a=scanner.nextInt();
	       int b =scanner.nextInt();
	       while(b !=0){
	           int temp = b;
	           b = a%b;
	           a=temp;
	       }
	       System.out.println("Le pgcd est: "+a);
	}
}
