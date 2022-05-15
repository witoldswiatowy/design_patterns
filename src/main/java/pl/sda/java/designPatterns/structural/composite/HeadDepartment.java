package pl.sda.java.designPatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HeadDepartment implements Department {

    private List<Department> childDepartments = new ArrayList<>();

    public void addDepartment(Department department) {
        childDepartments.add(department);
    }

    @Override
    public String getDepartmentNames() {
        List<String> childDepartmentNames = this.childDepartments.stream()
                .flatMap(d -> Stream.of(d.getDepartmentNames()))
                .collect(Collectors.toList());

        String joinedDepartmentNames = String.join(",", childDepartmentNames);
        return joinedDepartmentNames;
    }
}