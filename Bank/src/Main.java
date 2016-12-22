import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Man on 22.12.2016.
 */
public class Main {
    public static void main(String[] args){
        Bank PrivateBank=new Bank("PrivateBank");
        Scanner in=new Scanner(System.in);
        int i=-1;
        do{
            System.out.println("MENU:");
            System.out.println("1.Add deposit to bank");
            System.out.println("2.Show client's profits");
            System.out.println("0.Exit");
            i=in.nextInt();
            menu(PrivateBank,i);
        }while(i!=0);
    }
    public static void menu(Bank PrivateBank,int i){
        switch (i){
            case 1:{
                addDepositToBank(PrivateBank);
                break;
            }
            case 2:{
             profitsOutput(PrivateBank );
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
            for (Double userProf: userProfits) {
                results[j]+=" earns " + userProf + " UAH during " + years + " year(s)";
                j++;
            }
            for (String result:results ){
                System.out.println(result);
            }
        }
    }

