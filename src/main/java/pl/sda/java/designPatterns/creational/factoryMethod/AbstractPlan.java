package pl.sda.java.designPatterns.creational.factoryMethod;

public abstract class AbstractPlan {

    abstract double getRate();

    public String calculateBill(int unit) {
        double bill = (double) unit * getRate();
        return "" + bill;
    }
}
