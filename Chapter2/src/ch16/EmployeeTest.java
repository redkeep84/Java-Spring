package ch16;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("이순신");
		
		// Employee.serialNum은 static 변수 이기 때문에 class 이름으로 참조해서 써야 함.
//		System.out.println(employeeLee.serialNum);
		// class 이름으로 참조해서 쓴 상태
		System.out.println(Employee.getSerialNum());		
				
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("김유신");
		
		System.out.println(employeeLee.getEmployeeName() + "님의 사번은" + employeeLee.getEmployeeId());
		System.out.println(employeeKim.getEmployeeName() + "님의 사번은" + employeeKim.getEmployeeId());
	}

}
