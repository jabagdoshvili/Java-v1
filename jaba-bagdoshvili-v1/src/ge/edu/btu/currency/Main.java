package ge.edu.btu.currency;

import ge.edu.btu.currency.service.CurrencyService;
import ge.edu.btu.currency.service.impl.CurrencyServiceImpl;

public class Main {
    public static void main(String[] args) {
        CurrencyService c = new CurrencyServiceImpl();
        c.setExchangeRate(3.44);
        c.setExchangeRate(10);
        System.out.println(c.convert(7));
        System.out.println(c.convert(444.4));
    }
}