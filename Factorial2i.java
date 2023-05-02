import java.util.Scanner;
public class Factorial2i {
public static void main(String args[]) {
//object creation
Scanner sc=new Scanner(System.in);
int fact=1, i;
System.out.println("Enter the numeric value:\n");
int num=sc.nextInt();
for(i=1; i<=num; i++) {
fact=fact*i;
}
System.out.println("This is Factorial series value:"+fact);
}
}


