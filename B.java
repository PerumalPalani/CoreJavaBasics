class A {
A getA() {
return this;
}
void msg() {
System.out.println("Hello Java");
}
}
class B {
public static void main(String args[]) {
new A().getA().msg();
}
}