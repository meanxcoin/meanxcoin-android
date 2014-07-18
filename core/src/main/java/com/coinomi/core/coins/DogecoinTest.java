package com.coinomi.core.coins;

import com.coinomi.core.Constants;

/**
 * @author Giannis Dzegoutanis
 */
public class DogecoinTest extends CoinType {
    public DogecoinTest() {
        id = Constants.ID_DOGECOIN_TEST;

        addressHeader = 113;
        p2shHeader = 196;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };

        name = "Dogecoin Test";
        symbol = "DOGE";
        bip44Index = 5;
    }

    private static DogecoinTest instance;
    public static synchronized DogecoinTest get() {
        if (instance == null) {
            instance = new DogecoinTest();
        }
        return instance;
    }
}
