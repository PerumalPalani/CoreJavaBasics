class Employee1 {
float salary = 50000;
}
class Programe1 extends Employee1 {
int bonus =10000;
public static void main(String args[]) {
Programe1 p = new Programe1();
System.out.println("This is your salary:" +p.salary);
System.out.println("This is your bonus amount:" +p.bonus);
}
}
