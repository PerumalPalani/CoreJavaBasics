interface Apple {
void a();
void b();
void c();
void d();
}
abstract class Ball implements Apple {
public void d() {
System.out.println("It is printing by the D:");
}
}
class Catch extends Ball {
public void a() {
System.out.println("It is printing by the A:");
}
public void b() {
System.out.println("It is printing by the B:");
}
public void c() {
System.out.println("It is printing by the C:");
}
}
class Display {
public static void main(String args[]) {
Apple a = new Catch();
a.a();
a.b();
a.c();
a.d();
}
}
