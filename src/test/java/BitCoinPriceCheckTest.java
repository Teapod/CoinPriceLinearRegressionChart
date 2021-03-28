import coin.BitCoinPriceCheck;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BitCoinPriceCheckTest {

    /**
     * When creating new BitCoinPriceCheck ( CoinApiClient ) with NumberOfDaysToCheck -
     * Then you get 2 lists ( prices and dateStamps ) with same size as NumberOfDaysToCheck plus 1 day ( for Today )
     */
    @Test
    public void getBitPricesAndTimeStampsCheck() {
        int numberOfDaysToCheck = 5;
        BitCoinPriceCheck bitCoinPriceCheck = new BitCoinPriceCheck(numberOfDaysToCheck);
        Assertions.assertEquals(numberOfDaysToCheck + 1, bitCoinPriceCheck.getBitPrices().size());
        Assertions.assertEquals(numberOfDaysToCheck + 1, bitCoinPriceCheck.getDateStamps().size());
    }
}
