import java.util.Random;
public class RandomUnion {
public static void main(String args[]) {
randomInts(5);
randomInts(9, 50, 85);
}
public static void randomInts(int num) {
Random random1=new Random();
random1.ints(num).forEach(System.out::println);
}
public static void randomInts(int num, int origin, int bound)
{
Random random2=new Random();
random2.ints(num, origin, bound).forEach(System.out::println);
}
}