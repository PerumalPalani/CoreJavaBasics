import java.util.Scanner;
public class Fibnacci {
public static void main(String args[]) {
//object creation
Scanner sc=new Scanner(System.in);
System.out.println("Enter the numeric value:\n");
int num=sc.nextInt();
int n1=0, n2=1, n3=0, i;
System.out.println(n1+"\n"+n2);
for(i=2; i<=num; i++) {
n3 = n1+ n2;
System.out.println("\n"+n3);
n1=n2;
n2=n3;
}
}
}


