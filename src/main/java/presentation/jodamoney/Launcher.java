package presentation.jodamoney;

import org.joda.money.BigMoney;
import org.joda.money.CurrencyUnit;
import org.joda.money.Money;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by Serhii K. on 11/25/2015.
 */
public class Launcher {

    public static void main(String[] args) {
        // create a monetary value
        Money money = Money.parse("USD 23.87");

        // add another amount with safe double conversion
        CurrencyUnit usd = CurrencyUnit.of("USD");
        money = money.plus(Money.of(usd, 12.43d));

        // subtracts an amount in dollars
        money = money.minusMajor(2);

        // multiplies by 3.5 with rounding
        money = money.multipliedBy(3.5d, RoundingMode.DOWN);

        // compare two amounts
        //boolean bigAmount = money.isGreaterThan(dailyWage);

        // convert to GBP using a supplied rate
        //BigDecimal conversionRate = ...;  // obtained from code outside Joda-Money
        //Money moneyGBP = money.convertTo(CurrencyUnit.GBP, conversionRate, RoundingMode.HALF_EVEN);

        // use a BigMoney for more complex calculations where scale matters
        BigMoney moneyCalc = money.toBigMoney();
        System.out.println(moneyCalc);
    }
}
