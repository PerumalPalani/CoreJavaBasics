public class Bank1 {
public static void main(String args[]) {
Account1 acc = new Account1();
acc.setAcc_no(10004L);
acc.setName("Perumal");
acc.setE_mail("perumal1452@gmail.com");
acc.setAmount(50000f);
System.out.println("Account Number is:" +acc.getAcc_no()+ "Account Name:" +acc.getName()+ "Account E-mail ID:" +acc.getE_mail()+ "Account Balance:" +acc.getAmount());
}
}