package com.meanxcoin.core.coins.families;

import com.meanxcoin.core.coins.CoinType;
import com.meanxcoin.core.wallet.AbstractAddress;
import com.meanxcoin.core.exceptions.AddressMalformedException;
import com.meanxcoin.core.wallet.families.bitcoin.BitAddress;

import org.bitcoinj.core.AddressFormatException;

/**
 * @author John L. Jegutanis
 *
 * This is the classical Bitcoin family that includes Litecoin, Dogecoin, Dash, etc
 */
public abstract class BitFamily extends CoinType {
    {
        family = Families.BITCOIN;
    }

    @Override
    public BitAddress newAddress(String addressStr) throws AddressMalformedException {
        return BitAddress.from(this, addressStr);
    }
}
