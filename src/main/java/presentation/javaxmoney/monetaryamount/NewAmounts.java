package presentation.javaxmoney.monetaryamount;

import org.javamoney.moneta.FastMoney;
import org.javamoney.moneta.Money;

import javax.money.Monetary;
import javax.money.MonetaryContextBuilder;
import java.math.MathContext;

/**
 * Created by Serhii K. on 12/1/2015.
 */
public class NewAmounts {

    public static void main(String[] args) {
        FastMoney m1 = Monetary.getAmountFactory(FastMoney.class).setCurrency("USD").setNumber(200.20).create();
        FastMoney m2 = FastMoney.of(200.20, "USD");

        Money m3 = Monetary.getAmountFactory(Money.class).setCurrency("USD").setNumber(200.20).create();
        Money m4 = Money.of(200.20, "USD");

        // MathContext
        Money money1 = Money.of(200, "CHF", MonetaryContextBuilder.of().set(MathContext.DECIMAL128).build());

        Money money2 = Money.of(200, "CHF", MonetaryContextBuilder.of().set(MathContext.DECIMAL128).build());

        Money money = Monetary.getAmountFactory(Money.class)
                .setCurrency("CHF")
                .setNumber(200)
                .setContext(MonetaryContextBuilder
                        .of()
                        .set(MathContext.DECIMAL128)
                        .build())
                .create();


    }
}
