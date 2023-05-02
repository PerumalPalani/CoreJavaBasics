public class Elephant 
{
public static void main(String args[])
{
int a=35;
int b=45;
int c=a+b;
if(a+b <100)
System.out.println("a+b value is greater than of 100");
if(a+b>100) {
System.out.println("A+B value is less than of 100");
}
else {
System.out.println("A+B value is greater than of 100");
}
String city="Vellore";
if(city == "Tirupattur")
{
System.out.println("the city is Tirupattur");
}
else if(city == "Vaniyambadi")
{
System.out.println("the city is Vaniyambadi");
}
else if(city == "Ambur")
{
System.out.println("the city is Ambur");
}
else if(city == "Alangayam")
{
System.out.println("the city is Alangayam");
}
else {
System.out.println(city);
}
String name="ABCD, XYZ";
if(name.endsWith("XYZ")) {
if(name.contains("EFGH")) {
System.out.println("The name is EFGH"); 
}
else if(name.contains("GHIJ"))
{
System.out.println("the name is GHIJ");
}
else {
System.out.println(name.split(",")[0]);
} 
}
}
}