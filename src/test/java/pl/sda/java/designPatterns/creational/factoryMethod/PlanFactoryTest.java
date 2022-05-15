package pl.sda.java.designPatterns.creational.factoryMethod;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PlanFactoryTest {
    @Test
    void shouldCreateCommercialPlan() {
        AbstractPlan commercial = PlanFactory.getPlan(PlanType.COMMERCIAL);

        String expected = "" + 5.4;
        Assertions.assertEquals(expected,commercial.calculateBill(1));
    }

    @Test
    void shouldCreateDomesticPlan() {
        AbstractPlan commercial = PlanFactory.getPlan(PlanType.DOMESTIC);

        String expected = "" + 3.7;
        Assertions.assertEquals(expected,commercial.calculateBill(1));
    }

    @Test
    void shouldCreateInstitutionalPlan() {
        AbstractPlan commercial = PlanFactory.getPlan(PlanType.INSTITUTIONAL);

        String expected = "" + 6.7;
        Assertions.assertEquals(expected,commercial.calculateBill(1));
    }

}