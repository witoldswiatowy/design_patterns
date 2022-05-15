package pl.sda.java.designPatterns.structural.composite;

public class FinancialDepartment implements Department {
    @Override
    public String getDepartmentNames() {
        return getClass().getSimpleName();
    }
}
