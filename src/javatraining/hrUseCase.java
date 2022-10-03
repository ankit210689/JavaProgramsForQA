package javatraining;

public class hrUseCase {
	//String firstName, String lastName, int empID, int yearsInService
	static String firstName;
	static String lastName;
	static int empId;
	static int yearsInService;
	static String departmentName;
	static int departmentNumber;
	
	public static void main (String[] args) {
			
	//Task-The Human Capital Management system needs to be able to assign a new employee to a department
	//Solution:
	//At-least 3 Separate classes are needed:
	//1.Employee with attributes Name,Department assigned to and methods getName. getDepartment
			
		//public void Employee() {
				firstName="Ankit";
				lastName="Pandey";
				empId=370;
				yearsInService=10;
				
			
				//Employee newEmp=new Employee();//newEmp object created referring Employee class
			
	//2.Department with attributes Name, Employees and methods assigEmployees(Employee),getEmployees

			//public void Department(){
				
				departmentName="PRA";
				departmentNumber=1234;	
			
			
			//3.Department finder with method find(DepartmentNumber)
			//public class DepartmentFinder extends hrUseCase{
				//Department aDept=DepartmentFinder.find(departmentnumber);//aDept object reference in Department class
				
			//}
				
			
			if (yearsInService>5) {
				System.out.println("Employee is eligible for promotion");
			}
			else {
				System.out.println("Employee is not eligible for promotion");
			}
			
			//}
			
			/*aDept.assign(newEmp);//aDept assigned to newEmp
			
			print (aDept.getEmployees());//Prints all employees in aDept to validate newEmp additon
		*/
		
		}
}

