interface Printable { }
class Apple implements Printable {
public void a() {
System.out.println("A is accepted:");
}
}
class Ball implements Printable {
void b() {
System.out.println("B is accepted:");
}
}
class Call {
void invoke(Printable p) {
if (p instanceof Apple) {
Apple a = (Apple)p;
a.a();
}
if(p instanceof Ball) {
Ball b = (Ball)p;
b.b();
}
}
}
class Dog1 {
public static void main(String args[]) {
Printable p = new Apple();
Call c = new Call();
c.invoke(p);
}
}

