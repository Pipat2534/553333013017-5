package Pipat2534;

import java.util.Arrays;


public class Sakho {
	   public static void main(String[]args){
		  
		   
			Mamadou mamadou = new Mamadou();
			System.out.println("name : "+mamadou.getName());
			System.out.println("position : "+mamadou.getPosition());
			
			String[] arr = mamadou.getFriend();
			System.out.print("Friend:");
			System.out.print(Arrays.toString(arr));
			

	   }
}




