import java.util.Scanner;
class Jug
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the no.of month:\n");
int month=sc.nextInt();
String monthName="";
switch(month)
{
case 1:
monthName="1-January";
break;
case 2:
monthName="2-February";
break;
case 3:
monthName="3-March";
case 4:
monthName="4-April";
break;
case 5:
monthName="5-May";
break;
case 6:
monthName="6-June";
break;
case 7:
monthName="7-July";
break;
case 8:
monthName="8-August";
break;
case 9:
monthName="9-September";
break;
case 10:
monthName="10-October";
break;
case 11:
monthName="11-November";
break;
case 12:
monthName="12-December";
break;
default:
System.out.println("this is not valid month number");
}
System.out.println(monthName);
sc.close();
}
}