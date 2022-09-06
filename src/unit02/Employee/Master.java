package unit02.Employee;

public class Master extends Employee {
	int bonus;
	public Master(String no,String name,int career, int bonus){
		super(no,name,career);
		this.bonus = bonus;
	}
	void paySalary() {
		salary = (career * 30) + bonus;
	}
}
