import java.util.*;
import java.util.stream.Collectors;
public class ExString2 {
public static void main(String args[]) {
List<String> liststr = Arrays.asList("It", "is", "an", "earth.");
String str = liststr.stream().collect(Collectors.joining(" "));
System.out.println(str.toString());
}
}