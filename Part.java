
public class Part {
static int n1=0, n2=1, n3=0;
static void printNumber(int val) {
if(val>0) {
n3=n1+n2;
n1=n2;
n2=n3;
System.out.println("\n"+n3);
printNumber(val-1);
}
}
public static void main(String args[]) {
int val=15;
System.out.println(n1+"\n"+n2);
printNumber(val-2);
}
}

