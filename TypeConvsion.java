public class TypeConvsion {
    public static void main(String[] args) {
        double decimal = 4.3;
        int integer = (int)decimal;
        System.out.println(integer);

        double salary = 5833.3333333;
        System.out.println("percys monthly salary is: $" + salary);

        int roundedsalary = (int)salary;
        System.out.println(roundedsalary);
        System.out.println("percys monthly salary is: $" + roundedsalary);

        double test = 60.94949;

        System.out.println((int)test);




    }

}