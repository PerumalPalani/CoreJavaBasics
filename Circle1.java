import java.util.Scanner;
class Circle1 {
public static void main(String args[]) {
double r;
double pi=3.14;
double result;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the circle radius:\n");
r = sc.nextDouble();
result = pi*r*r;
System.out.println("Print the results:" +result);
}
}

