public class Account {
    double balance;
    String userFullName;
    byte age;
    String img;

    void withdrawal(double balanceWithdrawal) {
        balance -= balanceWithdrawal;

    }

    void deposit(double balanceDeposit) {
        balance += balanceDeposit;
    }

    void getInfo() {
        System.out.println("User name: " + userFullName + "\n" +
                "User age: " + age + "\n" +
                "User balance: " + balance + " $\n" +
                "User img: " + img + "\n");
    }

}
