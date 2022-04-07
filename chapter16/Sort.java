import java.util.*;

public class Sort{
	public static void main(String[]args)
	{
		 List<Employee> list = new  ArrayList<Employee>();
		
		Employee e1 = new Employee{"Waseem",1,3000};
		Employee e2 = new Employee{"Kaseem",2,4000};
		Employee e3 = new Employee{"Aleem",3,5000};
		Employee e4 = new Employee{"Kaleem",4,6000};
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(0,e4);
		
		System.out.println(list);
	}
}