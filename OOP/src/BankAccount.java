public class BankAccount {

    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount () {
        this(9506,100.0,"Default name","default email","default phone number");
        System.out.println("Empty constructor");
    }

    public BankAccount(int accountNumber, double accountBalance, String customerName,
                       String email, String phoneNumber){
        System.out.println("BankAccount constructor with parameters called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(7846, 100.25, customerName, email, phoneNumber);
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double amount){
        this.accountBalance += amount;
        System.out.println(amount + " added to the account. Available funds = " + this.accountBalance);
    }

    public void withdrawFunds (double amount){
        if (amount > accountBalance) {
            System.out.println("Withdrawing more than available");
        } else {
            this.accountBalance -= amount;
            System.out.println(amount + " withdrawn from the account. Available funds = " + this.accountBalance);
        }
    }
}
