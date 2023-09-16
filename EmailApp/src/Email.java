import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int defaultPasswordLength = 8;
    private int mailboxCapacity;
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

    // call a method that returns a random password


    // set mailbox capacity

    // set alt email

    public Email(String firstName, String lastName){
        //this.firstName refers to the class var, the one after the equal sign refers to the local var in the arguments
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Owner of email: " + this.firstName + " " + this.lastName);

        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

    }

    // call a method asking for dept and return dept


    // ask for dept
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


}
