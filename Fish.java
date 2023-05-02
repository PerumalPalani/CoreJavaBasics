public class Fish implements Cloneable {
public static void main(String args[])
{
int num=3;
switch(num) {
case 0:
System.out.println("the number is 0");
break;
case 1:
System.out.println("the number is 1");
break;
case 2:
System.out.println("the number is 2");
break;
default:
System.out.println(num);
}
int sum=0;
for(int j=1; j<=10; j++)
{
sum = sum+j;
}
System.out.println("the sum of the first 10 numbers" +sum);
}
}
