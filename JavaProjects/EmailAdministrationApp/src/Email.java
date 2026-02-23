import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String email;
    private String alternateEmail;
    private String password;
    private String department;
    private int emailBoxCapacity;
    private int defaultPasswordLength = 15;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email has been created\n");
        this.department=setDepartment();
        this.password= generatePassword(defaultPasswordLength);
        System.out.println("Your password is :\n"+password);
        this.email= firstName+"."+lastName+"@"+department+".mn.com";
        System.out.println("Your email is : "+email);
    }

    private String setDepartment(){
        System.out.println("Select department : \n 1.Sales \n 2.Accounting \n 3.Development \n");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:this.department = "sales";
            break;
            case 2:this.department = "accounting";
            break;
            case 3:this.department = "development";
            break;
            default:this.department = "";
        }
        return this.department;
    }

    public String generatePassword(int length) {

        String password = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789@$!$";
        char[] passwordArray = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordArray.length);
            passwordArray[rand] = password.charAt(i);
        }
        return new String(passwordArray);
    }

    public void setEmailBoxCapacity(int emailBoxCapacity) {
        this.emailBoxCapacity = emailBoxCapacity;
    }

    public int getEmailBoxCapacity() {
        return emailBoxCapacity;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public String changePassword() {
        this.password = generatePassword(this.defaultPasswordLength);
        System.out.println("Your new password is :"+password);
        return this.password;
    }

    @Override
    public String toString() {
        return "Email{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", alternateEmail='" + alternateEmail + '\'' +
                ", password='" + password + '\'' +
                ", department='" + department + '\'' +
                ", emailBoxCapacity=" + emailBoxCapacity +
                '}';
    }
}
