import java.util.Scanner;
import java.util.Set;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int defaultPasswordLength = 8;
    private int mailboxCapacity = 500;
    private String email;
    private String alternateEmail;

    // Constructor to recieve first and lastname

    // ask for the dept

    // generate random password

    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMONPQRSTVWXYZ123456789!@#$%^&*()";
        char[] password = new char[length];
        for(int i = 0; i<length; i++){
           int rand = (int) (Math.random() * passwordSet.length());
           password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

//    private String generateCustomEmail(String customEmail){
//        customEmail = this.firstName + "." + this.lastName + "@" + this.department + ".company.com";
//    }


    // set mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    // set alt email

    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    // change password
    public void changepassword(String password){
        this.password = password;
    }

    public Email(String firstName, String lastName){
        //this.firstName refers to the class var, the one after the equal sign refers to the local var in the arguments
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Owner of email: " + this.firstName + " " + this.lastName);

        // setting the dept from the user input and caslling that method in this constructor.
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        // call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        //combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + ".company.com";
        System.out.println("Your email is: " + email);
    }

    // Set dept
    private String setDepartment(){
        System.out.print("Enter the dept\nOne for sales\ntwo for development\nthree for accoutning\nfour for nothing\nEnter Department code:\n");
        Scanner sc = new Scanner(System.in);
        int deptChoice = sc.nextInt();
        if(deptChoice == 1) {
            return "sales";
        } else if (deptChoice == 2) {
            return "dev";
        } else if (deptChoice == 3) {
            return "accounting";
        }else{
            return "";
        }
    }



    @Override
    public String toString() {
        return "Email{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", department='" + department + '\'' +
                ", defaultPasswordLength=" + defaultPasswordLength +
                ", mailboxCapacity=" + mailboxCapacity +
                ", email='" + email + '\'' +
                ", alternateEmail='" + alternateEmail + '\'' +
                '}';
    }
}
