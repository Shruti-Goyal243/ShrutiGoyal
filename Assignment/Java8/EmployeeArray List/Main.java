

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args)
	{

		// create a list
		List<EmployeeClass> lt = new ArrayList<>();

		// add the member of list
		lt.add(new EmployeeClass(1, "amay"));
		lt.add(new EmployeeClass(2, "amit"));
		lt.add(new EmployeeClass(3, "manish"));
		lt.add(new EmployeeClass(4, "Anshul"));
		lt.add(new EmployeeClass(5, "Gurvinder"));
		lt.add(new EmployeeClass(6, "Shruti"));
		lt.add(new EmployeeClass(7, "Dharmesh"));
		lt.add(new EmployeeClass(8, "ramesh"));
		lt.add(new EmployeeClass(9, "jamunda"));
		lt.add(new EmployeeClass(10, "Suresh"));
		lt.add(new EmployeeClass(10, "rajesh"));

		// create map with the help of
		// Collectors.toMap() method
		LinkedHashMap<Integer, String>
			map = lt.stream()
					.collect(
						Collectors
							.toMap(
									EmployeeClass::getId,
									EmployeeClass::getName,
								(x, y)
									-> x + ", " + y,
								LinkedHashMap::new));

		// print map
		map.forEach(
			(x, y) -> System.out.println(x + "=" + y));
	}
}
