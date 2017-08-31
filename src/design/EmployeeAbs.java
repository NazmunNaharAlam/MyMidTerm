package design;

import design.Employee;

public abstract class EmployeeAbs implements Employee{
    public abstract int employeeId();

    //employeeName() will return employee name
    public abstract String employeeName();

    //assignDepartment() will assign employee to departments
    public abstract void assignDepartment();

    //calculate employee salary
    public abstract int calculateSalary();

    //employee benefit
    public abstract void benefitLayout();

}