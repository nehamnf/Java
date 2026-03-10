public class BankApp {

    public static void main(String[] args) {
        Account neha= new Checking("neha","123499",1000);
        Account safi= new Savings("safi","123499",1000);
        neha.showInfo();
        safi.showInfo();
    }
}
