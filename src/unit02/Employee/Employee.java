package unit02.Employee;

public abstract class Employee {
	String no;
	String name;
	int career;
	int salary;
	
	public Employee(){}
	public Employee(String no,String name,int career){
		this.no = no;
		this.name = name;
		this.career = career;
	}
	
	abstract void paySalary();
	
	void printInfo() {
		System.out.println("번호:" + this.no + " 이름:" + this.name + " 월급:" + salary);
	}
}
