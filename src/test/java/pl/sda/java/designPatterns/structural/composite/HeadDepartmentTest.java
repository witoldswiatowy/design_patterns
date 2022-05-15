package pl.sda.java.designPatterns.structural.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeadDepartmentTest {

    @Test
    void shouldCreateHeadDepartmentWithFinancialAndSales() {
        Department salesDepartment = new SalesDepartment();
        Department financialDepartment = new FinancialDepartment();

        HeadDepartment headDepartment = new HeadDepartment();
        headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(financialDepartment);

        String departmentNames = headDepartment.getDepartmentNames();
        assertEquals("SalesDepartment,FinancialDepartment", departmentNames);
    }
}