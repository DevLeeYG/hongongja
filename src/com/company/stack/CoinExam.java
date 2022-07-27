package com.company.stack;

import java.util.*;

public class CoinExam {
    public static void main(String[] args) {
        Stack<Coin> coinBox = new Stack<>();

        coinBox.push(new Coin(100));
        coinBox.push(new Coin(50));
        coinBox.push(new Coin(500));
        coinBox.push(new Coin(10));

        while (!coinBox.isEmpty()){

            Coin coin = coinBox.pop();

            System.out.println(coin.getValue());
        }

    }
}
