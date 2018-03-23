

public class Employee {

	private String no;
	private String name;
	private int salary;
	private double ratio;
	public Employee(String no, String name, int salary, double r)
	{
		this.name = name;
		this.no = no;
		this.salary = salary;
		this.ratio = r;
		
	}
	
	public void salary_add()
	{
		System.out.println("salary will add " + salary*ratio + "k$");
	}
	public void salary_change()
	{
		salary *= (1+ratio);
		System.out.println("new salary is " + salary + "k$");
	}
	public void ratio_change(double r)
	{
		ratio = r;
	}
	public void print_salary()
	{
		System.out.println("salary is " + salary + "k$");
	}
	
	public static void main(String[] args)
	{
		Employee e1 = new Employee("123", "Alan", 20, 0.25);
		e1.print_salary();
		e1.salary_add();
		e1.salary_change();
		e1.ratio_change(0.3);
		e1.print_salary();
		e1.salary_change();
		
		Employee e2 = new Employee("456", "Bob", 19, 0.2);
		e2.print_salary();
		e2.salary_add();
		e2.salary_change();
		e2.ratio_change(0.25);
		e2.print_salary();
		e2.salary_change();
	}
}
