public class Savings extends Account{

    private int safetyDepositId;
    private int safetyDepositKey;

    public Savings(String name,String sSN,double initDeposit){
        super(name,sSN,initDeposit);
    }

    @Override
    public String getAccountType() {
        return "S";
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Account Type= Savings Account\n");

    }
}
