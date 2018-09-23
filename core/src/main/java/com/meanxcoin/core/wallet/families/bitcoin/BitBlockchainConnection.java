package com.meanxcoin.core.wallet.families.bitcoin;

import com.meanxcoin.core.network.AddressStatus;
import com.meanxcoin.core.network.interfaces.BlockchainConnection;

/**
 * @author John L. Jegutanis
 */
public interface BitBlockchainConnection extends BlockchainConnection<BitTransaction> {
    void getUnspentTx(AddressStatus status, BitTransactionEventListener listener);
}
