import java.util.Scanner;
public class EmployeeTest1 {
int id;
String name;
float salary;
AddressTest address;
public EmployeeTest1(int id, String name, float salary, AddressTest address) {
this.id = id;
this.name = name;
this.salary = salary;
this.address = address;
}
void display() {
System.out.println("ID:\n" +id+ "Name:\n" +name+ "Salary:\n" +salary);
System.out.println("Address is:\n" +address.city+ "\n" +address.state+ "\n" +address.country);
}
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);

System.out.println("Enter the Employee City:");
String p = sc.nextLine();
System.out.println("Enter the Employee State:");
String q = sc.nextLine();
System.out.println("Enter the Employee Country:");
String r = sc.nextLine();
AddressTest address1 = new AddressTest(p,q,r);
System.out.println("Enter the Employee City:");
String p1 = sc.nextLine();
System.out.println("Enter the Employee State:");
String q1 = sc.nextLine();
System.out.println("Enter the Employee Country:");
String r1 = sc.nextLine();
AddressTest address2 = new AddressTest(p1,q1,r1);
System.out.println("Enter the Employee ID:");
int n = sc.nextInt();
System.out.println("Enter the Employee Name:");
String m = sc.next();
System.out.println("Enter the Employee Salary:");
float o = sc.nextFloat();
EmployeeTest1 emp1 = new EmployeeTest1(n,m,o,address1);
System.out.println("Enter the Employee ID:");
int n1 = sc.nextInt();
System.out.println("Enter the Employee Name:");
String m1 = sc.next();
System.out.println("Enter the Employee Salary:");
float o1 = sc.nextFloat();
EmployeeTest1 emp2 = new EmployeeTest1(n1,m1,o1,address2);
emp1.display();
emp2.display();
}
}






