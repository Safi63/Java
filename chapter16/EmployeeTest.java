import java.util.*;

public class EmployeeTest
{
	public static void main(String[] args) 
	{
		List<Employee> myList = new ArrayList<Employee>();
		
		Employee e1 = new Employee("Safi", 1, 299.9);  
		Employee e2 = new Employee("Tafi", 2, 399.9);
		Employee e3 = new Employee("Mutee", 3, 499.9);
		Employee e4 = new Employee("Naji", 4, 599.9);


		myList.add(e1);
		myList.add(e2);
		myList.add(e3);
		myList.add(e4);

		
		System.out.printf("There are currently %d elements in myList: %n%n", myList.size());
		
		for(Employee em: myList)
			System.out.printf("\n%s\t %d\t: $ %.2f\n",  em.getName(),em.getID(), em.getSalary());
	
					
		// Collections.sort(myList);
		// System.out.printf("\n Here is sorted list by Employeed ID %s\n", myList);
		
		/*Collections.sort(myList, Collections.reverseOrder(new EmPayComparator()));
		System.out.printf("\n Here is pay based sorted list %s\n", myList);
		
		Collections.sort(myList, new EmNameComparator());
		System.out.printf("\nHere is name based sorted list %s\n", myList);*/
		
		
		
		
		
		// Employeed e1 = new Employeed("Usman", 1, 299.8);
		// Employeed e2 = new Employeed("Rizwan", 2, 399.8);
		// Employeed e3 = new Employeed("Adnan", 3, 499.8);		
		
		// System.out.printf("Employee one :%n %s :\t %s :\t%s%n%n", e1.getName(), e1.getId(), e1.getPay());
		// System.out.printf("Employee two :%n %s :\t %s :\t%s%n%n", e2.getName(), e2.getId(), e2.getPay());
		// System.out.printf("Employee three :%n %s :\t %s :\t%s%n%n", e3.getName(), e3.getId(), e3.getPay());
	}
	
}