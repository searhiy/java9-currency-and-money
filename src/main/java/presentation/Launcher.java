package presentation;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;

/**
 * Created by Serhii K. on 11/24/2015.
 */
public class Launcher {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        CurrencyUnit currencyCHF = Monetary.getCurrency("CHF");
        CurrencyUnit currencyUSD = Monetary.getCurrency("USD");
        CurrencyUnit currencyEUR = Monetary.getCurrency("EUR");
    }
}
