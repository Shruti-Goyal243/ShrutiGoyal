import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortEmployee
{
   public static void main(String[] args)
   {
      Employee[] employees = {
         new Employee("Jaynam"),
         new Employee("Krish"),
         new Employee("Mohan"),
         new Employee("Kartik"),
         new Employee("Lakhan"),
         new Employee("Divya"),
         new Employee("Amisha"),
         new Employee("Jayant"),
         new Employee("Krish"),
         new Employee("Mohana"),
         new Employee("Karthik"),
         new Employee("Lakhan Soni"),
         new Employee("Divya"),
         new Employee("Amisha Taneja")};
      
      
      List<Employee> list = Arrays.asList(employees);
      System.out.println("Complete Employee list:");
      list.stream().forEach(System.out::println);
      
      Function<Employee, String> byName = Employee::getEmployeeName;
     
      	Comparator<Employee> Name = 
        Comparator.comparing(byName);

    
      System.out.printf(
         "%nSorted Employees Names : %n");
      list.stream()
          .sorted(Name)
         
          .forEach(System.out::println);
      
      list.stream()
          .distinct();
          System.out.println("the name of distint employeesamay");
          System.out.println(employees);
   } 
}
class Employee
{
   private String Name;
  
   public Employee(String Name)
   {
      this.Name = Name;
   } 

   public void setName(String Name)
   {
      this.Name = Name;
   }

   public String getEmployeeName()
   {
      return Name;
   }

   @Override
   public String toString() 
   {
      return String.format("%-8s", 
         getEmployeeName());
   }

}





