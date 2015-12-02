package presentation.javaxmoney.accessing;

import org.javamoney.moneta.CurrencyUnitBuilder;

import javax.money.CurrencyQuery;
import javax.money.CurrencyUnit;
import javax.money.spi.CurrencyProviderSpi;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Serhii K. on 12/1/2015.
 */
public final class BitCoinProvider implements CurrencyProviderSpi {

    private Set<CurrencyUnit> bitcoinSet = new HashSet<>();

    public BitCoinProvider(){
        bitcoinSet.add(CurrencyUnitBuilder.of("BTC", "MyCurrencyBuilder").build());
        bitcoinSet = Collections.unmodifiableSet(bitcoinSet);
    }

    /**
     * Return a {@link CurrencyUnit} instances matching the given
     * {@link javax.money.CurrencyQuery}.
     *
     * @param query the {@link javax.money.CurrencyQuery} containing the parameters determining the query. not null.
     * @return the corresponding {@link CurrencyUnit}s matching, never null.
     */
    @Override
    public Set<CurrencyUnit> getCurrencies(CurrencyQuery query){
        // only ensure BTC is the code, or it is a default query.
        if(query.isEmpty()
                || query.getCurrencyCodes().contains("BTC")
                || query.getCurrencyCodes().isEmpty()){
            return bitcoinSet;
        }
        return Collections.emptySet();
    }

}