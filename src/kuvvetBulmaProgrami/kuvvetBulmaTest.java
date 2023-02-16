package kuvvetBulmaProgrami;

import java.util.Scanner;

public class kuvvetBulmaTest {

	public static void main(String[] args) {
		
		int n;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:  ");
		 n = input.nextInt();
		 
		System.out.println("Girdiğiniz sayıya kadar olan 4'ün kuvvetleri:  ");
		
		 for (int i = 1 ; i <= n ; i*=4 )  {
			 System.out.println(i);
		 }
         System.out.println("*************************************************");
		 System.out.println("Girdiğiniz sayıya kadar olan 5'in kuvvetleri:  ");
         
		 for (int k=1; k<= n; k*=5) {
			 System.out.println(k);
			 
		 }
	}

}
