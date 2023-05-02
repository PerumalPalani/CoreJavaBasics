class A1 {
A1 foo() {
return this;
}
void print() {
System.out.println("This is inside of: A1");
}
}
class B1 extends A1 {
A1 foo() {
return this;
}
void print() {
System.out.println("This is inside of: B1");
}
}
class C1 extends B1 {
A1 foo() {
return this;
}
void print() {
System.out.println("This is inside of: C1");
}
}
public class TestingCovariant {
public static void main(String args[]) {
A1 a = new A1();
a.foo().print();
B1 b = new B1();
b.foo().print();
C1 c = new C1();
c.foo().print();
}
}

