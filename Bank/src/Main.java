import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Man on 22.12.2016.
 */
public class Main {
    public static void main(String[] args){
        Bank privateBank=new Bank("PrivateBank");
        Scanner in=new Scanner(System.in);
        int i=-1;
        do{
            System.out.println("MENU:");
            System.out.println("1.Add deposit to bank");
            System.out.println("2.Show client's profits");
            System.out.println("0.Exit");
            i=in.nextInt();
            menu(privateBank,i);
        }while(i!=0);
    }
    public static void menu(Bank privateBank,int i){
        switch (i){
            case 1:{
                addDepositToBank(privateBank);
                break;
            }
            case 2:{
             profitsOutput(privateBank );
                break;
            }
        }
        }
        public static void addDepositToBank(Bank bank){
            Scanner in=new Scanner(System.in);
            System.out.println("Write the client's name");
            String name=in.nextLine();
            System.out.println("Write the start capital(UAH)");
            Double start=in.nextDouble();
            System.out.println("Write the percent of year");
            Double perc=in.nextDouble();
            Deposit user=new Deposit(start,perc,name);
            bank.addDeposit(user);
        }
        public static void profitsOutput(Bank bank){
            Scanner in=new Scanner(System.in);
            System.out.println("Write the count of years to show profits");
            int years=in.nextInt();
            ArrayList<Double>userProfits=bank.profirFromBank(years);
            String[] results=new String[bank.getDeposits().size()];
            int j=0;
            for (Deposit user:bank.getDeposits()) {
                results[j] = "Client " + user.getClientName();
                j++;
            }
            j=0;
            double profit;
            for (Double userProf: userProfits) {
                profit = new BigDecimal(userProf).setScale(2, RoundingMode.HALF_UP).doubleValue();
                results[j]+=" earns " + profit + " UAH during " + years + " year(s)";
                j++;
            }
            for (String result:results ){
                System.out.println(result);
            }
        }
    }

