import java.util.Scanner;

/**
 *	Класс для запуска калькулятора.
 *	Поддерживает пользовательский воод.
 */
public class InterractRunner{

    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        try {
            Calculator calc = new Calculator();
            String exit = "no";
            while (!exit.equals("yes")) {
                System.out.print("Enter first arg: ");
                String first = reader.next();
                System.out.print("Enter second arg: ");
                String second = reader.next();
                calc.add(Integer.valueOf(first), Integer.valueOf(second));
                System.out.println("Add Result = " + calc.getResult());
                calc.cleanResult();
                System.out.print("Would you like to exit? (yes/no): ");
                exit = reader.next();
            }
        } finally {
            reader.close();
        }
    }

}