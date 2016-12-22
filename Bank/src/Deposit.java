import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by Man on 22.12.2016.
 */
public class Deposit {
    private double start_sum;
    private double perc_year;
    private String clientName;

    public Deposit(double start_sum, double perc_year, String clientName) {
        this.start_sum = start_sum;
        this.perc_year = perc_year;
        this.clientName = clientName;
    }
    public double netProfit(int years){
        double NetProfit=start_sum * Math.pow(1 + perc_year/100 , years ) - start_sum;
        double NetProfitRounded = new BigDecimal(NetProfit).setScale(2, RoundingMode.HALF_UP).doubleValue();
        return NetProfitRounded;
    }
}
