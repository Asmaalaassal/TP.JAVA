package TP1;
import java.util.Scanner;

public class EXO6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a=scanner.nextInt();
	       int b =scanner.nextInt();
	       if (a == 0){
	           System.out.println("PAS DE SOLUTION");
	       }
	       float sol = (float)(-b)/a;
	       System.out.println("solutin est x=  "+sol);
}

}
