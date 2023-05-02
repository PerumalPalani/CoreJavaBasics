import java.util.Scanner;
public class PalindromeRest1 {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
String original, reverse="";
System.out.println("Enter the strings/numeric charcters:\n");
original=sc.nextLine();
int length=original.length();
for(int j=length-1;j>=0;--j)
{
reverse=reverse+original.charAt(j);
}
if(original.equals(reverse)) {
System.out.println("It is prime character");
}
else {
System.out.println("It is not prime character");
}
}
}