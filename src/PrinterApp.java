public class PrinterApp {
    public static void main(String[] args) {
        String creator = "Shaharear Ahmed Badhon";
        // Declare and initialize a String variable to store the creator's name
        double number1 = 5.0; 
        double number2 = 2.0; 
        double multiplication;
        double addition;
        double division;
        double subtraction;
        System.out.println("Printer App");
        System.out.print("This app is made by: ");
        System.out.println(creator);
        System.out.println("The value of number1 is " + (int)number1);
        System.out.println("The value of number2 is " + (int)number2);
        multiplication = number1 * number2;
        System.out.println((int)number1 + " * " + (int)number2 + " = " + (int)multiplication);
        addition = number1 + number2;
        System.out.println((int)number1 + " + " + (int)number2 + " = " + (int)addition);
        division = number1 / number2;
        System.out.println((int)number1 + " / " + (int)number2 + " = " + division);
        subtraction = number1 - number2;
        System.out.println((int)number1 + " - " + (int)number2 + " = " + (int)subtraction);
    }
}
