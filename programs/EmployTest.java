public class EmployTest{
	public static void main(String[]args){
		
		double year = 12.0;//let a double value for multiplication with Salary
		double bouns = 0.10; 
		
		Employ employ1 = new Employ("Safi","butt",150000.0);
		Employ employ2 = new Employ("Naji"," butt",140000.0);
		
		
		System.out.printf("%s%s%s%s\n%s%s\n","Employ1 name is: ",employ1.getFirstName()," ",employ1.getSecondName(),"Employ1 Yearly Salary is: ",employ1.getSalary()*year);
		System.out.printf("Employ1 Yearly Salary with bouns is: %s\n\n",((employ1.getSalary()*year)*bouns)+(employ1.getSalary()*year));
		
		System.out.printf("%s%s%s%s\n%s%s\n","Employ2 name is: ",employ2.getFirstName()," ",employ2.getSecondName(),"Employ1 Yearly Salary is: ",employ2.getSalary()*year);
		System.out.printf("Employ2 Yearly Salary with bouns is: %s\n",((employ2.getSalary()*year)*bouns)+(employ2.getSalary()*year));
	}
} 