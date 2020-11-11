package ge.edu.btu.currency.service.impl;

import ge.edu.btu.currency.service.CurrencyService;

public class CurrencyServiceImpl implements CurrencyService {
    private double FloatNumberExchangeRate;
    private int RealNumberExchangeRate;
    @Override
    public double convert(double amount) {
        return amount*FloatNumberExchangeRate;
    }

    @Override
    public int convert(int amount) {
        return amount*RealNumberExchangeRate;
    }

    @Override
    public void setExchangeRate(int exchangeRate) {
        RealNumberExchangeRate = exchangeRate;
    }

    @Override
    public void setExchangeRate(double exchangeRate) {
        FloatNumberExchangeRate = exchangeRate;
    }
}
