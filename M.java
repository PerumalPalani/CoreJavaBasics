package com.webpage;
/** this class user-contained class that contains one method cube*/
public class M {
/** the cube methods print the cube of given number*/
public static void cube(int n) {
System.out.println(n*n*n);
}
public static void main(String args[]) {
M obj = new M();
/** print the cube of number*/
obj.cube(5);

}
}