package com.dh.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TopStacks {

    public static String[] getTopStocks(String[] stocks, float [][] prices) {
        Map<String, Float> stockAvg = new HashMap<>();
        for (int i = 0; i < stocks.length; i++) {
            float sum = 0;
            for (float price : prices[i]) {
                sum = sum + price;
            }
            float avg = sum / prices[i].length;
            stockAvg.put(stocks[i], avg);
        }
        ArrayList<Map.Entry<String, Float>> sortedStock = new ArrayList<>(stockAvg.entrySet());
        sortedStock.sort((a, b) -> Float.compare(b.getValue(), a.getValue()));

        String[] topStocks = new String[3];
        for (int i = 0; i < 3; i++) {
            topStocks[i] = sortedStock.get(i).getKey();
        }
        return topStocks;


    }
        public static void main(String [] args){
            String[] stocks = {"AMZN", "CACC", "EQIX", "GOOG", "ORLY", "ULTA"};
            float [] [] prices = {
                    {(float) 9.3, (float) 9.83, (float) 8.14},
                    {(float) 10.34, (float) 10.56, (float) 10.14, (float) 12.17, (float) 13.1, (float) 11.22},
                    {(float) 11.53, (float) 10.6, (float) 9.87, (float) 12.11},
                    {(float) 13.5, (float) 14.2, (float) 13.8, (float) 12.9},
                    {(float) 11.3, (float) 12.1, (float) 13.2, (float) 14.5},
                    {(float) 8.9, (float) 9.5, (float) 9.3}
            };
            String[] topStocks = getTopStocks(stocks, prices);
            System.out.println(Arrays.toString(topStocks));
        }



}
