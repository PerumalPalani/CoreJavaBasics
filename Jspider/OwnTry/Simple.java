class Simple{
	public static String rev(String str){
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		return sb.toString();
	}
public static void main(String args[]){
String str = "hello world";
String[] str1 = str.split(" ");
String str2 = "";
for(int i=0; i<str1.length; i++){
str2 = str2+" "+rev(str1[i]);
}
String str3 = str2.trim();
System.out.println("The reverse string is: " +str3);
}
}