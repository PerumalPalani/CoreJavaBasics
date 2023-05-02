import java.util.Scanner;
class Operation {
int square(int n) {
return n*n;
}
}
class CircleTest {
Operation op;
double pi=3.14;
double area(int radius) {
Operation op = new Operation();
int rsquare = op.square(radius);
return pi*rsquare;
}
public static void main(String args[]) {
CircleTest c = new CircleTest();
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Circle radius value:\n");
int m = sc.nextInt();
double result =c.area(m);
System.out.println(result);
}
}