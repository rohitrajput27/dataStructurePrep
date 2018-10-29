package com.datastructure.tree.coin.distribution;

import java.util.ArrayList;
import java.util.List;

public class CoinNode {
    private List<CoinNode> coinNodes = new ArrayList<>();
    private Integer coin;

    public Integer getCoin() {
        return coin;
    }

    public void setCoin(Integer coin) {
        this.coin = coin;
    }

    public List<CoinNode> getCoinNodes() {
        return coinNodes;
    }

    public CoinNode(Integer coin)
    {
        this.coin=coin;
    }

}
