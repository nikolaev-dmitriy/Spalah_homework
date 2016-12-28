import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by Man on 22.12.2016.
 */
public class Deposit {
    private double startSum;
    private double percYear;
    private String clientName;

    public Deposit(double startSum, double percYear, String clientName) {
        this.startSum = startSum;
        this.percYear = percYear;
        this.clientName = clientName;
    }

    public String getClientName() {
        return clientName;
    }

    public double netProfit(int years){
        double netProfit=(startSum * Math.pow(1 + percYear/100 , years )) - startSum;
        return netProfit;
    }
}
