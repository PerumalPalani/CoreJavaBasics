import java.util.Scanner;
public class FibnacciEx1 {
static int n1=0, n2=1, n3=0;
static void printFibnacci(int count) {
if(count > 0) {
n3 = n1+n2;
n1=n2;
n2=n3;
System.out.println("" +n3);
printFibnacci(count-1);
}
}
public static void main(String args[]) {
Scanner obj = new Scanner(System.in);
System.out.println("Enter the numeric value");
int count = obj.nextInt();
System.out.println(n1+ "\n" +n2);
printFibnacci(count-2);
}
}