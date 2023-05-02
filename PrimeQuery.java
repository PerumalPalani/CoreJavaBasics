import java.util.Scanner;
public class PrimeQuery {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number:\n");
int n=sc.nextInt();
int i,m=0, flag=0;
m=n/2;
if(n==0 ||n==1) {
System.out.println(n+"It is not prime number");
} else {
for(i=2;i<=m;i++)
{
if(n%i==0){
System.out.println(n+"It is not prime number");
flag=1;
break;
}
}
if(flag==0) {
System.out.println(n+"It is a prime number");
}
}
System.out.println("Enter the integer value:\n");
int num=sc.nextInt();
int count=0;
for(int j=1;j<=num;j++) {
if(num%j == 0) {
System.out.println(num+"It is not prime");
count++;
}
}
if(count==2)
{
System.out.println(num+"It is prime number");
}
else {
System.out.println(num+"It is not prime");
}
}
}