import java.util.*;
public class EmNameComparator implements Comparator<EmployeeName>
{
	@Override
	public int compare(EmployeeName e1, EmployeeName e2)
	{
		if(e1.getName().equals(e2.getName()))
			return 0;
		return e1.getName().compareTo(e2.getName());
	}

} 