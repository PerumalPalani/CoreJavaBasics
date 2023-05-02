import java.util.Scanner;
public class Mango {  
public static void main(String[] args) {  
for(int i=1;i<=5;i++){  
for(int j=1;j<=i;j++){  
        System.out.print("* ");  
}  
System.out.println();//new line  
} 
Scanner sc=new Scanner(System.in);
System.out.println("Enter the numeric value:\n");
int num=sc.nextInt();
for(int i=1;i<=num;i++){  
for(int j=num;j>=i;j--){  
        System.out.print("* ");  
}  
System.out.println();//new line  
}
System.out.println("Enter the number:\n");
int val=sc.nextInt();
for(int i=1;i<=val;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print("#");
}
System.out.println();
}
int arr[]={10,20,25,30,35,40,45,50,55,60,100};
for(int i:arr)
{
System.out.println(i);
}
aa:
for(int i=1;i<=4;i++) {
bb:
for(int j=1;j<=4;j++) {
if(i==2 && j==2)
{
break aa;
}
System.out.println(i+""+j);
}
}
for(;;)
{
System.out.println("This is infinity loop");
}
}  
}  