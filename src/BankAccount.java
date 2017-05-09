public class BankAccount {
int accountNumber;
String Name;
int balance;
public BankAccount(int aNumber, String name, int initialBalance) {
// TODO Auto-generated constructor stub
accountNumber=aNumber;
this.Name= name;
this.balance= initialBalance;
}
public void deposit(int amount){
balance+=amount;
}
public int withdraw(int amount) {

balance-=amount;
return balance;
}
int getBalance(){
return balance;
}

}