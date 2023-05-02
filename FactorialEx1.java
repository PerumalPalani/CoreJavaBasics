import java.util.Scanner;
public class FactorialEx1 {
static int factorial(int n) {
if(n == 1)
return 1;
else 
return (n*factorial(n-1));
}
public static void main(String args[]) {
Scanner obj = new Scanner(System.in);
System.out.println("Enter the numeric value");
int m = obj.nextInt();
System.out.println(factorial(m));
}
}