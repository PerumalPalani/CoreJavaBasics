import java.util.Scanner;
public class Nuts {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the numeric value:\n");
int i=sc.nextInt();
while(i<=10)
{
System.out.println(i);
i++;
}
System.out.println("Enter the Do-While loop value:\n");
int num=sc.nextInt();
do {
System.out.println(num);
num++;
}
while(num<=15);
sc.close();
}
}
