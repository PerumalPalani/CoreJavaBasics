import java.util.Scanner;
public class FactorialSimple {
static int factorial(int n) {
if(n==0)
return 1;
else
return(n*factorial(n-1));
}
public static void main(String args[]) {
int i, fact=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the numeric value:\n");
int num=sc.nextInt();
fact=factorial(num);
System.out.println("Entered number is"+num+"value of:"+fact);
int j, tar=1;
System.out.println("Enter the numeric value:\n");
int val=sc.nextInt();
for(j=1; j<=val; j++) {
tar=tar*j;
}
System.out.println("the entered number is"+val+"Factorial value for:"+tar);
}
}
