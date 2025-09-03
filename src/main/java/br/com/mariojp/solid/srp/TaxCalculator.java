package br.com.mariojp.solid.srp;

public class TaxCalculator{
    private double taxRate;

    public TaxCalculator(){
        String rate = System.getProperty("tax.rate", "0.10");
        this.taxRate = Double.parseDouble(rate);
    }

    public double calculateTax(double subtotal){
        return subtotal * taxRate;
    }
}
