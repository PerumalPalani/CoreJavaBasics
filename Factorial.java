import java.util.Scanner;
class Factorial{
public static void main(String args[])
{
int num;
int fact=1;
System.out.println("Enter the integer number");
Scanner s=new Scanner(System.in);
num=s.nextInt();
for(int i=1; i<=num; i++)
{
fact*=i;
}
System.out.println("the factorial" +num+ "is" +fact);
}
}