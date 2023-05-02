class Account {
int acc_no;
String name;
float amount;
void insert(int a,String n,float amt) {
acc_no = a;
name = n;
amount = amt;
}
void deposit(float amt) {
amount = amount+amt;
System.out.println(amt+"Amount deposited");
}
void withdraw(float amt) {
if(amount<amt) {
System.out.println("Amount has insufficient:");
} else {
amount = amount-amt;
System.out.println("Amount is withdraw:"+amt);
}}
void checkBalance() {
System.out.println("Your account balance is:"+amount);
}
void display() {
System.out.println("The account holder No:"+acc_no+"in name of:"+name+"the remaining balance have"+amount);
}
}
class TestAccount {
public static void main(String args[]) {
Account a1=new Account();
Account a2=new Account();
a1.insert(10001,"Perumal",10000);
a2.insert(10002,"kumarvel",20000);
a1.display();
a2.display();
a1.deposit(10000);
a2.deposit(15000);
a1.checkBalance();
a2.checkBalance();
a1.withdraw(15000);
a2.withdraw(10000);
a1.checkBalance();
a2.checkBalance();
a1.display();
a2.display();
}
}



