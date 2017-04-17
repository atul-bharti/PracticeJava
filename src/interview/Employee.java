package interview;

import java.util.Comparator;

public class Employee {
	int exp_in_year;
	String name;
	Department dept;
	class a implements  Comparator{

		@Override
		public int compare(Object arg0, Object arg1) {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}
	

}

class Department{
	String name;
}
