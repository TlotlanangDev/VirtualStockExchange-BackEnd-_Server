package com.tlotlanang.virtualstockexchangebackend.User.Investor.investorBuysShares.Controller;

import com.tlotlanang.virtualstockexchangebackend.User.StockTrader;
import org.springframework.http.ResponseEntity;


public class InvestorBuysSharesController implements StockTrader {
    @Override
    public ResponseEntity buyStock(Object requestBody) {
        return null;
    }

    @Override
    public ResponseEntity sellStock(Object requestBody) {
        return null;
    }
}
