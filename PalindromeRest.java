import java.util.Scanner;
public class PalindromeRest {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int i, sum=0, temp, r;
System.out.println("Enter the numeric value");
int n=sc.nextInt();
temp=n;
while(n>0) {
r=n%10;
sum=(sum*10)+r;
n=n/10; 
}
if(temp==sum) {
System.out.println("This is panlindrome number");
}
else {
System.out.println("This is not palindrome number");
}
}
}