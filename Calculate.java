public class Calculate {
  public static void main (String[] arg) {
  	System.out.println("Calculate...");
  	int first = Integer.valueOf(arg[0]);
  	int second = Integer.valueOf(arg[1]);
  	int summ = first + second;
  	int minus = first - second;
  	int multiply = first * second;
  	double division = (double) first / second;
  	int pow = 1;
  	for (int i = 1; i <= second; i++) {
  		pow *= first;
  	}
  	System.out.println("Addition = " + summ);
  	System.out.println("Substraction = " + minus);
  	System.out.println("Multilication = " + multiply);
  	System.out.println("Division = " + division);
  	System.out.println("Pow = " + pow);
  }
}