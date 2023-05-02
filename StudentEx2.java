class CustomerEx1 {
int amount = 10000;
synchronized void withdraw(int amount) {
System.out.println("Going to the withdraw");
if(this.amount<amount) {
System.out.println("this is insufficient amount: Waiting for withdraw");
try {
wait();
}
catch (Exception e){
}
}
this.amount-=amount;
System.out.println("Amount withdraw it is completed");
}
synchronized void deposit(int amount) {
System.out.println("going to the deposit");
this.amount+=amount;
System.out.println("Deposit it is completed");
notify();
}
}
class StudentEx2 {
public static void main(String args[]) {
final CustomerEx1 c = new CustomerEx1();
new Thread()
{
public void run() {
c.withdraw(15000);
}
}.start();
new Thread() {
public void run() {
c.deposit(20000);
}
}.start();
}
}
