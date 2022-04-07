import java.util.*;
public class Practice{ 
	public static void main(String[]args){
		int sum;
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		if(a>b){
			System.out.println("a is greater");
		}else{
			if(a<b){
				System.out.println("a is lesser");
			}else{
				if(a==b){
					System.out.println("a is equal to b");
				}
			}
		}
	}
}
