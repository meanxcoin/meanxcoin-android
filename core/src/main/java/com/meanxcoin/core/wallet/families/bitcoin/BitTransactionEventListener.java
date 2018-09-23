package com.meanxcoin.core.wallet.families.bitcoin;

import com.meanxcoin.core.network.AddressStatus;
import com.meanxcoin.core.network.ServerClient.UnspentTx;
import com.meanxcoin.core.network.interfaces.TransactionEventListener;

import java.util.List;

/**
 * @author John L. Jegutanis
 */
public interface BitTransactionEventListener extends TransactionEventListener<BitTransaction> {
    void onUnspentTransactionUpdate(AddressStatus status, List<UnspentTx> UnspentTxes);
}
