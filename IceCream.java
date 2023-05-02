import java.util.Scanner;
class IceCream
{
public static void main (String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the any number:\n");
int num=sc.nextInt();
if(num%2 ==0)
{
System.out.println("Entered number is even number");
}
else
{
System.out.println("Entered number is odd number");
}
System.out.println("Enter the Year:\n");
int year=sc.nextInt();
if(((year%4 ==0)&& (year%100!=0))||(year%400 ==0))
{
System.out.println("Entered year is leap year");
}
else
{
System.out.println("Entered year is not leap year");
}
System.out.println("Enter the normal number:\n");
int nor=sc.nextInt();
String output=(nor%2==0)?"even number":"odd number";
System.out.println(output);
System.out.println("Enter your mark:\n");
int mark=sc.nextInt();
if(mark<50)
{
System.out.println("Sorry! for this inform to you are fail");
}
else if(mark>=50 && mark<60)
{
System.out.println("You are in D Grade");
}
else if(mark>=60 && mark<70) {
System.out.println("You are in C Grade");
}
else if(mark>=70 && mark<80) {
System.out.println("you are in B Grage");
}
else if(mark>=80 && mark<90) {
System.out.println("you are in A Grade");
}
else if(mark>=90 && mark<100) {
System.out.println("you are in A+ Grade");
}
else {
System.out.println("enter value is invalid!");
}
System.out.println("Enter the value:\n");
int value=sc.nextInt();
if(value>0)
{
System.out.println("Entered value is Positive");
}
else if(value<0)
{
System.out.println("Entered value is Negative");
}
else {
System.out.println("Entered value is Zero");
}
System.out.println("Enter your age:\n");
int age=sc.nextInt();
System.out.println("Enter your weight:\n");
int weight=sc.nextInt();
if(age>=18)
{ if(weight>50){
System.out.println("You are eligible to donate blood");
}
else
{
System.out.println("you are not eligible to donate blood");
} }
else {
System.out.println("Age is must be greater than 18");
}
}
}