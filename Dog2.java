import java.util.Scanner;
import com.formula.Cat1;
public class Dog2 {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the circle radius value:");
int m = sc.nextInt();
Cat1 b = new Cat1();
System.out.println(b.result(m, 3.14));
}
}