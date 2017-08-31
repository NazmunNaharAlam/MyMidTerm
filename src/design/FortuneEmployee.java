package design;

public class FortuneEmployee {

	/**
	 * CnnEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 **/
	public static void main(String[] args) {

		// Create an array of 500 Employee and initialize the array
		EmployeeInfo[] employee = new EmployeeInfo[500];

		// Initialize all 500 employee objects with default value
		for(int i=0; i<employee.length; i++)
			employee[i] = new EmployeeInfo();

		// Reinitialize the first object with all information
		employee[0] = new EmployeeInfo("Asif Mahmood", 001, 75000, 3, 5, "Development");

		// Calculating the bonus of the above object
		int calBonus = EmployeeInfo.calculateEmployeBonus(employee[0].salary, employee[0].performance);
		employee[0].setBonus(calBonus);

		//calculateEmployePension(int initYear, int initSalary)
		int calPension = EmployeeInfo.calculateEmployePension(employee[0].years, employee[0].salary);
		employee[0].setBonus(calPension);

		// Print the complete object that just have been created.
		System.out.println(employee[0].toString());
	}
}
