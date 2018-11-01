package com.datastructure.tree.coin.distribution;

import java.util.ArrayList;
import java.util.List;

public class CoinNode {
    private List<CoinNode> coinNodes = new ArrayList<>();
    private int coin;
    private CoinNode parentNode;

    public CoinNode getParentNode() {
        return parentNode;
    }

    public void setParentNode(CoinNode parentNode) {
        this.parentNode = parentNode;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public List<CoinNode> getCoinNodes() {
        return coinNodes;
    }

    public CoinNode(int coin,CoinNode parentNode)
    {
        this.coin=coin;
        this.parentNode  = parentNode;
    }

    @Override
    public String toString() {
        return (new Integer(coin)).toString();
    }
}
