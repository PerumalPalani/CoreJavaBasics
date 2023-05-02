package com.formula;
public class Cat1 {
int r;
public double result(int r, double pi) {
int square = r*r;
return pi*square;
}
public static void main(String args[]) {
Cat1 b = new Cat1();
System.out.println(b.result(5, 3.14));
}
}




