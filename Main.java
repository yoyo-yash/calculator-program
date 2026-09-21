import java.util.Scanner; // importing scanner
class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); // set up new scanner object

        //heading and design
        System.out.println("CALCULATOR");
        System.out.println("----------------");

        // declare variables
        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean ValidOperation = true;

        // prompt for user input
        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Choose an operator (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        // calculation
        switch(operator){
            
            case '+' : result = num1 + num2;
            break;
            
            case '-' : result = num1 - num2;
            break;
            
            case '*' : result = num1 * num2;
            break;
            
            case '/' : {
                if(num2 == 0){
                    System.out.println("ERROR! Cannot divide by zero."); // divide by 0 exception
                    ValidOperation = false;
                }
                else{
                    result = num1 / num2;
                }
            }
            break;
            
            case '^' : result = Math.pow(num1, num2);
            break;

            default : System.out.println("Please choose a valid operator."); // enetering an invalid operator exceptions
            ValidOperation = false;

         }

        // result
         if(ValidOperation){
            System.out.printf("%.1f %c %.1f is %.1f", num1, operator, num2, result);
         }
         else{

         }

        scanner.close(); // close scanner

    }
}
