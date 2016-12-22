import java.util.ArrayList;

/**
 * Created by Man on 22.12.2016.
 */
public class Bank {
    private String Bank_name;
    private ArrayList<Deposit > deposits=new ArrayList<Deposit>();

    public Bank(String bank_name) {
        Bank_name = bank_name;
    }
    public void addDeposit(Deposit deposit){
        this.deposits.add(deposit);
    }

    public ArrayList<Deposit> getDeposits() {
        return deposits;
    }

    public ArrayList<Double> profirFromBank(int years){
        ArrayList<Double> profit=new ArrayList<Double>();
        for (Deposit deposit : this.deposits ) {
            profit.add(deposit.netProfit(years));
        }
        return profit;
    }
}
