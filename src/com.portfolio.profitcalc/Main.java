package com.portfolio.profitcalc;

import com.portfolio.profitcalc.finance.service.ProfitService;

public class Main {
    public static void main(String[] args) {
        ProfitService service = new ProfitService();
        int lucro = service.calc(1000, 600);
        System.out.println("Lucro: " + lucro);
    }
}