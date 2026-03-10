public class Checking extends Account{
    private int debitCardNumber;
    private int pin;

    public Checking(String name,String sSN,double initDeposit) {
        super(name,sSN,initDeposit);
        safetyDepositBox();
    }

    private void safetyDepositBox(){
        int safetyDepositBoxId = (int)(Math.random() * 1000);
        int safetyDepositKey = (int)(Math.random() * 2000);
        System.out.println("Your Safety Deposit Box Id= "+safetyDepositBoxId+
                            " and Key= "+safetyDepositKey);
    }
    @Override
    public String getAccountType() {
        return "C";
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Account Type= Checking Account\n");
    }
}
