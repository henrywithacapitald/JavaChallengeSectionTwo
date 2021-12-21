import java.util.Scanner;
public class Suvery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What's you're name sir");
        int counter = 0;
        String name = scan.nextLine();
        System.out.println("The name that you have entered is : "+name); 
        counter++; 
        System.out.println("How much you spend on a tea");
        double tea = scan.nextDouble();
        counter++;
        System.out.println("This is how much you spend on a tea "+tea);
        counter++;
        System.out.println("How much do you spend on fast food?");
        double food = scan.nextDouble();
        System.out.println("The amount you spend on fast food is : "+food);
        counter++;
        System.out.println("How old are you sir");
        int age = scan.nextInt();
        System.out.println("You said your age was" + age);
        counter++;
        System.out.println("how many times a week do you buyc coffe");
        int coffeeAmount = scan.nextInt();
        counter++;
        System.out.println(coffeeAmount);
        
        System.out.println("\nMr " +name+ " you have answered "+counter+" this many questions well done");
        System.out.println("your fast food cost is");
        scan.close();

    }
}
