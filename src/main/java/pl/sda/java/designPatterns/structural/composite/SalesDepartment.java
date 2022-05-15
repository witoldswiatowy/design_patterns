package pl.sda.java.designPatterns.structural.composite;

public class SalesDepartment implements Department {
    @Override
    public String getDepartmentNames() {
        return getClass().getSimpleName();
    }
}
