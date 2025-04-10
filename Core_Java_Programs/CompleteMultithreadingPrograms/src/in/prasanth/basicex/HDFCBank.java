package in.prasanth.basicex;

public class HDFCBank {
 int accountBalance;
public HDFCBank(int accountBalance) {
	this.accountBalance = accountBalance;
}
 void withdraw(int wd) {
	accountBalance = this.accountBalance - wd;
}

 void deposit(int d) {
	accountBalance = this.accountBalance + d;
}
}
