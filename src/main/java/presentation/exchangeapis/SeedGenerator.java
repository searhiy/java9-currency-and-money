package presentation.exchangeapis;

import com.google.gson.Gson;

import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

/**
 * Created by Serhii K. on 11/25/2015.
 */
public class SeedGenerator {

    static class Result {
        private String lhs;
        private String rhs;

        public String getLhs() {
            return lhs;
        }

        public String getRhs() {
            return rhs;
        }

        public void setLhs(String lhs) {
            this.lhs = lhs;
        }

        public void setRhs(String rhs) {
            this.rhs = rhs;
        }
    }

    public static void main(String[] args) throws Exception {
        String google = "https://www.google.com/finance/converter?a=1&";
        String baseCurrency = "GBP";
        String termCurrency = "AUD";
        String charset = "UTF-8";
        //double amount = 1;
        // https://www.google.com/finance/converter?a=16.6700&from=GBP&to=USD
        URL url = new URL(google + "&from=" + baseCurrency + "&to=" + termCurrency);

        Reader reader = new InputStreamReader(url.openStream(), charset);
        Result result = new Gson().fromJson(reader, Result.class);
        // Get the value without the term currency.
        String amount = result.getRhs().split("\\s+")[0];

        System.out.println(amount);
    }
}
