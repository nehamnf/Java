import java.util.Objects;

public abstract class Account implements InterestRate{
    private String name;
    private String sSN;
    private double balance;
    private double rate;
    private String accountNumber;
    private static int uniqueNumber= 5000;

    public Account(String name,String sSN,double initDeposit){
        this.name = name;
        this.sSN= sSN;
        this.balance= initDeposit;
        uniqueNumber++;
        this.accountNumber = setAccountNumber();

    }

    private String  setAccountNumber(){
        String lastTwoDigitsOfSSN = sSN.substring(sSN.length()-2,sSN.length());
        int randomNumber= (int)(Math.random()  * 1000.0);
        return getAccountType()+lastTwoDigitsOfSSN+uniqueNumber+randomNumber;
    }

    public abstract String getAccountType();

    public void  showInfo() {
        System.out.println(
                "Name= '" + name + '\'' +
                "\nsSN= '" + sSN + '\'' +
                "\nBalance= " + balance +
                "\nInterest Rate= " + rate +
                "\nAccountNumber= '" + accountNumber + '\'');
    }
}
