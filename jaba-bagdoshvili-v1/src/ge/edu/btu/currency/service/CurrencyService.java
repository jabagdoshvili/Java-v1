package ge.edu.btu.currency.service;

public interface CurrencyService {
    public int convert(int amount);
    public double convert(double amount);

    public void setExchangeRate(int value);
    public void setExchangeRate(double value);
}
