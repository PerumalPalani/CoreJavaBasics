import java.util.Scanner;
public class CharactersAZ {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
for(int i=65; i<=90; i++) {
System.out.println("Print the characters value of:"+(char)i+"="+i);
}
for(int j=97; j<=122; j++) {
System.out.println("Print the Alphabetic characters value"+(char)j+"="+j);
}
System.out.println("Enter the Alphabetic characters:\n");
char ch=sc.next().charAt(0);
int k = ch;
System.out.println("The character is:"+k);
}
}