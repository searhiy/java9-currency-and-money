package presentation.exchangeapis;

import com.tunyk.currencyconverter.BankUaCom;
import com.tunyk.currencyconverter.api.Currency;
import com.tunyk.currencyconverter.api.CurrencyConverter;
import com.tunyk.currencyconverter.api.CurrencyConverterException;

/**
 * Created by Serhii K. on 11/27/2015.
 */
public class MyCurrencyConverter {

    public static void main(String[] args) throws CurrencyConverterException {
        // create an instance where USD is a default currency to convert from, and EUR a default one to convert to
        // Using one of the implementation: BankUaCom
        CurrencyConverter currencyConverter = new BankUaCom(Currency.USD, Currency.EUR);

        // convert USD to EUR (the first parameter is amount of money you'd like to convert)
        System.out.println(currencyConverter.convertCurrency(1f));

        // the same
        System.out.println(currencyConverter.convertCurrency(1f, Currency.EUR));

        // the same
        System.out.println(currencyConverter.convertCurrency(1f, Currency.USD, Currency.EUR));

        // convert EUR to USD
        System.out.println(currencyConverter.convertCurrency(1f, Currency.EUR, Currency.USD));
    }
}
