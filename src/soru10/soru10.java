package soru10;

import java.util.Scanner;

//klavyeden girilen string palindrom mudur
public class soru10 {
	public static void main(String[]args) {
		boolean palindrom=true;
		Scanner str= new Scanner (System.in);
		System.out.println("Enter the string: ");
		String k;
		k=str.nextLine();
		for(int i=0; i<k.length()/2; i++) {
			int j;
			if(k.charAt(i)!=k.charAt(k.length()-1-i)) {
			palindrom=false;
			break;
				
			}
		}
		if(palindrom) {
			System.out.println("Palindrom");
			
		}else {
			System.out.println("Not palindrom");
		}
		
	}

}
