import java.util.*;
public class EmployeeName implements Comparator<Employee>
{
	@Override public int compare(Employee e1, Employee e2)
	{
		if(e1.getName() == e2.getName())
			return 0;
		else
			return e1.getName().compareTo(e2.getName());
	}

} 