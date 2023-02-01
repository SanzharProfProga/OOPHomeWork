public class Main {
    public static void main(String[] args)
    {
        Account account = new Account();
        account.userFullName = "Sanzhar Abdymomunov";
        account.age = 19;
        account.balance = 10000;
        account.img = "Cute guy ;)";
        account.getInfo();

        Account account1 = new Account();
        account1.userFullName = "Tilek uulu Ernazar";
        account1.age = 19;
        account1.balance = 13000;
        account1.img = "Truda is a loving guy :)";
        account1.getInfo();

        Account account2 = new Account();
        account2.userFullName = "Nurseit Sadirov";
        account2.age = 17;
        account2.balance = 8420;
        account2.img = "He also tries to keep up :)";
        account2.getInfo();

    }
}