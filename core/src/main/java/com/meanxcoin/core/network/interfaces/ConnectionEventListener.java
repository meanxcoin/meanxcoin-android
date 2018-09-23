package com.meanxcoin.core.network.interfaces;

import com.meanxcoin.core.coins.CoinType;

/**
 * @author John L. Jegutanis
 */
public interface ConnectionEventListener {
    void onConnection(BlockchainConnection blockchainConnection);
    void onDisconnect();
}
