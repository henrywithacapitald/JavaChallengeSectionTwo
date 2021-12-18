import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class SignUp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to JavaGram! Let's sign you up.");
        int counter = 0;


        //Task 1 - Using Scanner, ask the user questions

        //Ask for their first name.
        System.out.println("What's your name");
        String firstName = scan.nextLine();
        counter++;
        //Ask for their last name.
        System.out.println("Whats your last name");
        String lastName = scan.nextLine();
        counter++;
        //Ask: how old are you?
        System.out.println("How old are you");
        int age = scan.nextInt();
        counter++;
        //Ask them to make a username.
       System.out.println("\nCreate a username");
       String userName = scan.nextLine();
       counter++;
        //Ask what city they live in.
        System.out.println("What city do you live in?");
        String city = scan.nextLine();
        counter++;
        //Ask what country that's from.
        System.out.println("what country is that?");
        String country = scan.nextLine();
        counter++;



        //Task 2 - Print their information. 

        System.out.println("Thank you for joining JavaGram!");

        //Print their information like so:

        // Your information:
        //        First Name: Rayan
        //        Last Name: Slim
        //        Age: 27
        //        Username: monotonic_relu
        //        City: Ottawa
        //        Country: Canada
        //
        System.out.println("First Name: "+firstName);
        System.out.println("Last Name: "+lastName);
        System.out.println("Age: "+age);
        System.out.println("Username: "+userName);
        System.out.println("City: "+city);
        System.out.println("Country: "+country);
        System.out.println("Thanks for answering"+counter+" questions have a nice day :)");

        //close scanner. It's good practice :D ! 
        scan.close();
    }
}