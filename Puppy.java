public class Puppy
{
int puppyAge;
public Puppy(String name)
{
System.out.println("name is choosen:" +name);
}
public void setAge(int age)
{
puppyAge = age;
}
public int getAge()
{
System.out.println("Puppy's age is:" +puppyAge );
return puppyAge;
}
public static void main (String args[])
{
Puppy myPuppy = new Puppy ("Tommy");
myPuppy.setAge (2);
myPuppy.getAge();
System.out.println("variable value:" +myPuppy.puppyAge);
}
}
