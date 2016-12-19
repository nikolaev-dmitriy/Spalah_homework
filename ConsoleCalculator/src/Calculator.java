import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
/**
 * Created by Дмитрий on 15.12.2016.
 */
public class Calculator {
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        double a;
        double b=-1;
        String act;
        Scanner in=new Scanner(System.in);
        String[] arr=new String[3];
        String input="";
        double result=0;
        System.out.println("Start Calculator");
        Boolean t=true;
        while (t)
        {
            input=in.nextLine();
            if (input.equalsIgnoreCase("exit")){
                t=false;
                break;
            }
            else{
            arr=input.split(" ");
            if (arr.length==2){
                a=result;
                b=Double.parseDouble(arr[1]);
                act=arr[0];
            }
            else{
                result=0;
                a=Double.parseDouble(arr[0]);
                b=Double.parseDouble(arr[2]);
                act=arr[1];
            }
            switch(act){
            case "+":{
                    result=a+b;
                //System.out.println("Result = "+result);

                break;
                }
                case "-":{
                    result=a-b;
                  //  System.out.println("Result = "+result);


                    break;
                }
                case "*":{
                    result=a*b;
                    //System.out.println("Result = "+result);


                    break;
                }
                case "/":{
                    result=a/b;
                    //System.out.println("Result = "+result);

                    break;
                }
                default:{

                        break;
                    }

                }
                DecimalFormat df = new DecimalFormat("#.###");
                System.out.println("Result = " + df.format(result));
            }
        }

        }
    }

