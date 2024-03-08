package TP1;
import java.util.Scanner;

public class EXO7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float a=scanner.nextFloat();
	       float b =scanner.nextFloat();
	       float c=scanner.nextFloat();
	       double delta = Math.pow(b, 2)-(4*(a*c));
	       if(delta > 0){
	           System.out.println("L'equation admet deux solutions");
	           double sol_1 = (float)(Math.pow(b,2)-Math.pow(delta,1/2))/(2*a);
	           double sol_2 = (float) (Math.pow(b,2)+Math.pow(delta,1/2))/(2*a);
	           System.out.println("les 2 solutions sont : "+sol_1);
	           System.out.println("et "+sol_2);
	       }
	       else if(delta == 0){
	           System.out.println("L'equation admet une seule solution");
	           double sol= -b/(2*a);
	           System.out.println("la solution est: "+sol);   
	       }
	       else
	           System.out.println("L'equation n'admet pas de solutions");
	    }

}
