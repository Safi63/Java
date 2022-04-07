// Test file for Result.java
//import java.util.Scanner;

public class ResultTest{
		public static void main(String[]args){
		 
		 Result safi = new Result(40,"urdu");
		 Result tafi = new Result(70,"urdu");
		 
		 System.out.printf("\nSafi's numbers are %d in %s and status is: %s\n",safi.getNumbers(),safi.getSubName(),safi.getStatus());
		 System.out.printf("Tafi's numbers are %d in %s and status is: %s",tafi.getNumbers(),tafi.getSubName(),safi.getStatus());

		}
}