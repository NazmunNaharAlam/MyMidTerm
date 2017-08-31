package design;

public class EmployeeInfo extends EmployeeAbs {

 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to CnnEmployee class to apply all the fields and attributes.
 *
 * Important: YOU MUST USE the
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 */

    /*
     * declare few static and final fields and some non-static fields
     */
    static String companyName = "PnT";
    static final String companyAddress = "32-72 Steinway Street, Queens, NY";
    private String name;
    private int employeeId;
    private String department;
    protected int salary;
    protected int performance; 	// 3 is best and 1 is poor
    protected int years;
    private String benefit = "Default";
    private int bonus;
    private double pension;

	/*
	 * You must implement the logic for below 2 methods and
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */

    /*
     * you must have multiple constructor.
     * Must implement below constructor.
     */
    public EmployeeInfo(int employeeId){
        this.employeeId = employeeId;
    }
    public EmployeeInfo(String name, int employeeId){
        this.name = name;
        this.employeeId = employeeId;
    }
    public EmployeeInfo() {
        this.name = "UNKNOWN";
        this.employeeId = 0;
    }
    public EmployeeInfo(String initName, int initEmployeeId, int initSalary, int initPerformance, int initYear, String initDep) {
        this.name = initName;
        this.employeeId = initEmployeeId;
        this.salary = initSalary;
        this.performance = initPerformance;
        this.years = initYear;
        this.department = initDep;
    }
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public String toString() {
        return "Company Name: " + companyName + "\nCompany Address: " + companyAddress +
                "\nEmployee Name: " + name + "\nEmployee Id: " + employeeId + "\nSalary: " + salary +
                "\nPerformance: " + performance + "\nYears: " + years + "\nBonus: " + bonus +
                "\nPension: " + pension + "\nDepartment: " + department + "\nTotal Salary " + calculateSalary();
    }


    /*
     * This methods should calculate Employee bonus based on salary and performance.
     * Then it will return the total yearly bonus. So you need to implement the logic.
     * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on.
     * You can set arbitrary number for performance.
     * So you probably need to send 2 arguments.
     *
     */
    public static int calculateEmployeBonus(int initSalary, int initPerformance){
        int total=0;
        if (initPerformance == 3)
            total = initSalary + (initSalary*10/100);
        else if(initPerformance == 2)
            total = initSalary + (initSalary*8/100);
        else
            total = initSalary + (initSalary*6/100);
        return total;
    }

    /*
     * This methods should calculate Employee Pension based on salary and numbers of years with the company.
     * Then it will return the total pension. So you need to implement the logic.
     * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
     * So you probably need to send 2 arguments.
     *
     */
    public static int calculateEmployePension(int initYear, int initSalary){
        int total=0;
        total = initSalary * (initYear*5)/100;
        return total;
    }

    public int employeeId() {
        return employeeId;
    }

    //employeeName() will return employee name
    public String employeeName() {
        return name;
    }

    //assignDepartment() will assign employee to departments
    public void assignDepartment() {
        this.department = "Main";
    }

    //calculate employee salary
    public int calculateSalary() {
        return salary + bonus;
    }

    //employee benefit
    public void benefitLayout() {
        this.benefit = "Benifit";
    }
}
