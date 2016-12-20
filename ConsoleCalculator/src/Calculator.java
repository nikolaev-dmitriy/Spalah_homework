import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
/**
 * Created by Дмитрий on 15.12.2016.
 */
public class Calculator {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        String input = "";
        System.out.println("Start Calculator");
        calculation(input);
    }
        public static void calculation(String input) {
            double a;
            double b = -1;
            String act;
            double result = 0;
            Scanner in = new Scanner(System.in);
            String[] arr = new String[3];
            Boolean t = true;
            while (t) {
                input = in.nextLine();
                if (input.equalsIgnoreCase("exit")) {
                    t = false;
                    break;
                } else {
                    arr = input.split(" ");
                    if (arr.length == 2) {
                        a = result;
                        b = Double.parseDouble(arr[1]);
                        act = arr[0];
                    } else {
                        result = 0;
                        a = Double.parseDouble(arr[0]);
                        b = Double.parseDouble(arr[2]);
                        act = arr[1];
                    }
                    switch (act) {
                        case "+": {
                            result = a + b;
                            break;
                        }
                        case "-": {
                            result = a - b;
                            break;
                        }
                        case "*": {
                            result = a * b;
                            break;
                        }
                        case "/": {
                            result = a / b;
                            break;
                        }
                        default: {

                            break;
                        }
                    }
                    out(result);
                }
            }
        }
                public static void out (double result) {
                DecimalFormat df = new DecimalFormat("#.###");
                System.out.println("Result = " + df.format(result));
            }
        }





