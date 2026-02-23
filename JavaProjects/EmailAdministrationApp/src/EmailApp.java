public class EmailApp {
    public static void main(String[] args)
    {
       Email email= new Email("neha","mn");
        System.out.println(email);
        email.setAlternateEmail("neha@gmail.com");
        email.changePassword();
        System.out.println(email);
    }
}
