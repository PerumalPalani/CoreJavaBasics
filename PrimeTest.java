import java.util.Scanner;
public class PrimeTest {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the first number:\n");
int start=sc.nextInt();
System.out.println("enter the ending number:\n");
int end=sc.nextInt();
System.out.println("list of prime number"+start+"and"+end);
for(int k=start; k<=end;k++)
{
if(isPrime(k)) {
System.out.println(k);
}
}
}
public static boolean isPrime(int o) {
if(o<=1) {
return false;
}
for(int k=2;k<=Math.sqrt(o);k++) {
if(o%k==0) {
return false;
}
}
return true;
}
}