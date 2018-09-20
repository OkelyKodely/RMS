
import java.text.DecimalFormat;

public class MoneyFormatter {

    private DecimalFormat df2 = new DecimalFormat( "#,###,###,##0.00" );
    
    public MoneyFormatter()
    {
    }
    
    public double getMoney(Double unformattedMoney)
    {
        double dd = unformattedMoney.doubleValue();
        double dd2dec = new Double(df2.format(dd)).doubleValue();
        return dd2dec;
    }
}
