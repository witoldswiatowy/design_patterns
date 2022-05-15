package pl.sda.java.designPatterns.creational.factoryMethod;

public class PlanFactory {

    public static AbstractPlan getPlan(PlanType planType) {

        AbstractPlan plan = switch (planType) {
            case INSTITUTIONAL -> new InstitutionalPlan();
            case COMMERCIAL -> new CommercialPlan();
            case DOMESTIC -> new DomesticPlan();
            default -> null;
        };

        return plan;
    }
}