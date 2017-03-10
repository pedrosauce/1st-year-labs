public class Employee
{
	//declare attributes
	private String name;
	private String jobTitle;
	private float salary;
	private int employeeID;
	private static final float MINWAGE = 19000f;
	private static int counter = 1000;

	public Employee()//default constructor
	{
		name = null;
		jobTitle = null;
		salary = MINWAGE;
		counter++;
		employeeID = counter;
	}

	public Employee(String name, String jobTitle, float salary)//general constructor
	{
		this.name = name;
		this.jobTitle = jobTitle;
		this.salary = salary;
		employeeID = counter++;
	}

	//Getter methods for attributes
	public String getName()
	{
		return name;
	}

	public String getJobTitle()
	{
		return jobTitle;
	}

	public float getSalary()
	{
		return salary;
	}

	//Setter methods for attributes
	public void setName(String name)
	{
		this.name = name;
	}

	public void setJobTitle(String jobTitle)
	{
		this.jobTitle = jobTitle;
	}

	public void setSalary(float salary)
	{
		if(salary > MINWAGE)
		{
			this.salary = salary;
		}
		else
		{
			this.salary = MINWAGE;
			System.out.println("Entered salary of " + salary + " is too low. Salary set at minimum wage of " + MINWAGE);
		}

	}

	//Getter method for employeeID
	public int getEmployeeID()
	{
		return employeeID;
	}

	//Show employee method
	public void showEmp()
	{
		System.out.println("Employee Record");
		System.out.println("Name: " + name);
		System.out.println("Job Title: " + jobTitle);
		System.out.println("Current Salary: " + salary);
		System.out.println("Employee ID: " + employeeID);
	}

	public String toString()
	{
		String details = new String();
		details = "Name: " + name + "/nJobTitle: " + jobTitle + "/nSalary: " + salary;
		details = details + "/nEmployee ID: " +employeeID:

		return details;
	}


}