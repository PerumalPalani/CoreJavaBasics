class TestingPrivate{
int a = 50;
void msg() {
System.out.println("Hello java");
}
}
class TestingPrivate1 extends TestingPrivate {
public static void main(String args[]) {
TestingPrivate tp = new TestingPrivate();
System.out.println(tp.a);
tp.msg();
}
}