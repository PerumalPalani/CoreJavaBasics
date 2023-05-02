class Demo
{
int a =15;
void add()
{
int b = 15;
int c = a+b;
System.out.println("the addition of A and B is:" +c);
}
public static void main(String args[])
{
System.out.println("the A value is:" +new Demo().a);
new Demo().add();
}
}