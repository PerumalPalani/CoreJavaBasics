public class View {
public static void main(String args[]) {
int i, j, num=10;
for(i=0;i<num;i++)
{
for(j=0;j<=i;j++)
{
System.out.print("*");
}
System.out.println();
}
}
static void print(int val=10) {
int k, l;
for(k=0;k<val;k++)
{
for(l=2*(val-k);l>=0;l--)
{
System.out.print("");
}
for(l=0;l<=k;l++)
{
System.out.print("#");
}
System.out.println();
}
}
static void printView(int q=10) {
int m, n;
for(m=0;m<q;m++)
{
for(n=q-m;n>=0;n--)
{
System.out.print("");
}
for(n=0;n<=m;n++)
{
System.out.print("#");
}
System.out.println();
}
}
}
