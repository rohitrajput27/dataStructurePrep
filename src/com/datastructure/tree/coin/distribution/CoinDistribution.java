package com.datastructure.tree.coin.distribution;

import java.util.ArrayList;
import java.util.List;

public class CoinDistribution {

    private CoinNode rootNode = null;

    public static void main(String[] args) {

        CoinDistribution coinDistribution = new CoinDistribution();
        coinDistribution.createTree();
        coinDistribution.printTree();
        coinDistribution.distributeCoin(coinDistribution.rootNode);
        coinDistribution.printTree();
    }

    private void createTree() {
        CoinNode node1 = new CoinNode(1,null);
        CoinNode node11 = new CoinNode(0,node1);
        CoinNode node12 = new CoinNode(1,node1);
        CoinNode node13 = new CoinNode(0,node1);
        CoinNode node21 = new CoinNode(3,node11);
//        CoinNode node22 = new CoinNode(1);
//        CoinNode node31 = new CoinNode(1);
        node1.getCoinNodes().add(node11);
        node1.getCoinNodes().add(node12);
        node1.getCoinNodes().add(node13);
        node11.getCoinNodes().add(node21);
//        node11.getCoinNodes().add(node22);
//        node21.getCoinNodes().add(node31);
        rootNode = node1;
    }

    private void printTree() {
        System.out.println(rootNode);
        printTree(rootNode.getCoinNodes());

    }

    private void printTree(List<CoinNode> coinNodes) {

        List<CoinNode> moreCoinNodes = new ArrayList<>();
        if (coinNodes != null && !coinNodes.isEmpty()) {
            for (CoinNode node1 : coinNodes) {
                System.out.print(node1 + " ");
                if (node1.getCoinNodes() != null && !node1.getCoinNodes().isEmpty()) {
                    moreCoinNodes.addAll(node1.getCoinNodes());
                }
            }
        }
        System.out.println();
        if (!moreCoinNodes.isEmpty()) {
            printTree(moreCoinNodes);
        }

    }

    private void distributeCoin(CoinNode node) {

        if (node.getCoin() > 1) {
            if (node.getCoinNodes() == null || node.getCoinNodes().isEmpty()) {
                // give it to parent
                if (node.getParentNode() != null) {
                    node.getParentNode().setCoin(node.getParentNode().getCoin() + 1);
                    node.setCoin(node.getCoin() - 1);
                    distributeCoin(node.getParentNode());
                }
            } else {
                //distribute to child
                boolean flag = false;
                for (CoinNode coinNode : node.getCoinNodes()) {
                    if (coinNode.getCoin() < 1) {
                        flag = false;
                        coinNode.setCoin(coinNode.getCoin() + 1);
                        node.setCoin(node.getCoin() - 1);
                        distributeCoin(coinNode);
                    }
                }
                if (flag) {
                    // give to parent again
                    if (node.getParentNode() != null) {
                        node.getParentNode().setCoin(node.getParentNode().getCoin() + 1);
                        node.setCoin(node.getCoin() - 1);
                        distributeCoin(node.getParentNode());
                    }
                }
            }
        } else {
            for (CoinNode node1 : node.getCoinNodes()) {
                distributeCoin(node1);
            }
        }

    }
}
