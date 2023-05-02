public class Cat {
public static void main(String args[])
{
int a=10;
int b=-10;
boolean c=true;
boolean d=false;
System.out.println(~a);
System.out.println(~b);
System.out.println(!c);
System.out.println(!d);
System.out.println(10<<2);
System.out.println(100<<5);
System.out.println(15<<2);
System.out.println(4<<5);
System.out.println(10>>2);
System.out.println(100>>5);
System.out.println(15>>2);
System.out.println(4>>5);
System.out.println(50>>5);
System.out.println(50>>>5);
System.out.println(-100>>5);
System.out.println(-100>>>5);
int e=15;
int f =17;
int g=2;
System.out.println(e<f && e<g);
System.out.println(f>g && g>f);
System.out.println(f<g && f>g);
System.out.println(g<f && f<g);
System.out.println(e<f && g<f);
System.out.println(f>e & g<e);
System.out.println(f>g && e++<f);
System.out.println(e);
System.out.println(g>e & f++>e);
System.out.println(f);
System.out.println(e>f||f>e);
System.out.println(f>e||g<f);
System.out.println(g>f|e<f);
System.out.println(e<f|g<e);
System.out.println(e>f|g<f);
System.out.println(f<e || g++>f);
System.out.println(g);
System.out.println(g>f | f++>e);
System.out.println(f);
int h=25;
int i=5;
int min=((h>i)? h:i);
System.out.println(min);


}
}