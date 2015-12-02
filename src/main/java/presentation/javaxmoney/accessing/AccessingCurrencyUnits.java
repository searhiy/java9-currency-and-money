package presentation.javaxmoney.accessing;

import org.javamoney.moneta.CurrencyUnitBuilder;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import java.util.Collection;
import java.util.Locale;

/**
 * Created by Serhii K. on 12/1/2015.
 */
public class AccessingCurrencyUnits {

    public static void main(String[] args) {

        // by currency code
        CurrencyUnit currencyCHF = Monetary.getCurrency("CHF");
        CurrencyUnit currencyUSD = Monetary.getCurrency("USD");
        CurrencyUnit currencyEUR = Monetary.getCurrency("EUR");

        System.out.println(currencyCHF);
        System.out.println(currencyUSD);
        System.out.println(currencyEUR);

        // by locale
        String isoCountry = "USA";
        Locale country = new Locale("", isoCountry);
        CurrencyUnit currencyCHF2 = Monetary.getCurrency(new Locale("", "CH")); // Switzerland
        CurrencyUnit currencyUSD2 = Monetary.getCurrency(new Locale("", "US")); // United States of America
        CurrencyUnit currencyEUR2 = Monetary.getCurrency(new Locale("", "DE")); // Germany
        // CurrencyUnit currencyEUR3 = Monetary.getCurrency(new Locale("de"));  // MonetaryException:
                                                                                // No currency unit found for locale: de
        // all
        Collection<CurrencyUnit> allCurrencies = Monetary.getCurrencies();
        // allCurrencies.forEach(System.out::println);

        // building custom currency and register it (true flag)
        CurrencyUnit unit = CurrencyUnitBuilder.of("FLS22", "MyCurrencyProvider")
                .setDefaultFractionDigits(3)
                .build(true);
                //.build();
                //.build(true, Locale.FRANCE);

    }
}
