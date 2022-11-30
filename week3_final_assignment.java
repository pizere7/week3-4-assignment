package week3_project;

import java.util.Arrays;
import java.util.Scanner;

public class week3_final_assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Question 1
		int ages[]= {3, 9, 23, 64, 2, 8, 28, 93,96};
		int b=ages.length-1;
		for (int i=0; i< ages.length; i++) {
			if (i==b) {
			System.out.println("the difference between the value of the first element in the array from the value in the last element of array is: "+ (ages[i]-ages[0]));
			
		}
			
		}
		double average=0;
		for (int i=0; i< ages.length; i++) {
			
	average+=(ages[i]/ages.length);
			
			
		}
		System.out.println("the average is: "+ average);
		
		// Question 2
		String names[]= {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		double average_names=0;
		String fullnames="";
		for (int i=0; i< names.length; i++) {
			
	   average_names+=(names[i].length());
		fullnames= fullnames.concat(names[i]);	
		if (i < names.length - 1) {
	        fullnames = fullnames.concat(" ");
	    }
	
		}
		System.out.println("the average number of letters per name: "+ (average_names/names.length));
		// question 5
			int[] nameLengths= new int[names.length];
		
		for (int a=0; a < names.length; a++) {
			
			nameLengths[a]= names[a].length();
				
		}
		for (int name:nameLengths) {
			System.out.println(name);
		
		}
		System.out.println(Arrays.toString(nameLengths));
		
		// question 6
		int sum=0;
		for (int ai=0; ai < names.length; ai++) {
			
			sum+=nameLengths[ai];
				
		}
		System.out.println(sum);
		//question 7
		System.out.println(" all the names: " + (fullnames));
		 System.out.println(concatenatedq("hello",4));
		 
		 //question 8
		 String first =" Pascal";
		 String second ="Izere";
		 String name= fullname(first, second);
		 System.out.println(name);
		 
		 
		 // question 9
		 Scanner s = new Scanner(System.in);
		 System.out.println("how many numbers you want to enter? :");
		 
		 int numbers = s.nextInt();
		 int [] array= new int[numbers];
		 System.out.println("Enter your numbers:");
		 for (int k=0; k<numbers;  k++) {
			 array[k]=s.nextInt();
		 }
		System.out.println("sum of inputed number:" +" " + total(array));
		
		// Question 10
		Scanner p = new Scanner(System.in);
		  System.out.println("how many values?");
		   int enterednumbers = p.nextInt();
		   double [] arrays= new double[enterednumbers];
		   System.out.println("Enter your values");
		   for (int k=0; k<enterednumbers;  k++) {
				 arrays[k]=p.nextInt();
			 }
		   System.out.println("the sum of double number is :"+total_double(arrays));
		 
		
		//question 11
		double [] first1= {0.1,0.3,1.4,5.0};
		double [] second1= {0.9,0.3,1.8,5.0};
		if (getaverage(first1, second1)) {
			System.out.println("The first arr is greater");
		}
		else {
			System.out.println("Second array is greater.");
		}
		 // question 12
		System.out.println(willbuydrink(true,10));
		//question 13
		 int number = 89;
		 if(isodd(number) == true){
		      System.out.print("89 is an odd Number");
		 }else{
		       System.out.print("89 is an even Number");}     

		 
		
		   

		 }
			
		

		//System.out.println(nameLengths);
		//System.out.println(nameLengths);
		// Question 7
		
		public static String concatenatedq( String firststring, int n) {
			
			String output = "";
			
			for (int i=0; i< n; i++) {
				output += firststring;
				
			}
			return output;
		}
		//question 8
		public static String fullname( String firstname, String secondname ) {
			
			String name= firstname + " " + secondname;
			return name;
		}
		
	// question 9
		
		public static boolean total(int[] n) {
			int sum =0;
			for (int i :n) {
				sum += i;
		
			}
			 if(sum>100) {
					//System.out.println("Entered number is greater than 100");
				 return true;
				 } 
			 return false;
			
		}
		//question 10
		
		public static double total_double(double[] n_10) {
			double sum10 =0;
			for (double i : n_10) {
				sum10 += i;
		
			}
			 
			return sum10;
			
		}
		//Question 11
		public static boolean getaverage(double [] av1, double [] av2) {
			double sum_av1 =0;
			double sum_av2 =0;
			int c = 0;
			int d =0;
			for (double i : av1) {
				sum_av1 += i;
				c++;
			}
			for (double j : av2) {
				sum_av2 += j;
				d++;
			}
			
			double avg1 = sum_av1/c;
			double avg2 = sum_av2/d;

			if (avg1>avg2) {
				return true;
			}
			else {
				return false;
			}	
			
		}
		//question 12
	public static boolean willbuydrink(boolean ishotoutside, double moneyinpocket) {
		
		if ( ishotoutside && (moneyinpocket >10.50)) {
			return true;
			
		}
		return false;
		
		}
	//question 13 
	// This question takes the number and display if it is odd or even number.
 public static boolean isodd(int num) {
	 return (num % 2 !=0);
 }
	}
	
		/*
3.	How do you access the last element of any array?
	using index which is equal to the length of the array -1
4.	How do you access the first element of any array?
	using index which is equal to 0
	
		 */


	
	

