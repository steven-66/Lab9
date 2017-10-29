
public class Employee implements Comparable<Employee>  {
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private int id;
	private String name;
	public Employee(String name, int id) {
		this.id=id;
		this.name=name;
	}
	public  Employee() {
		
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Employee arg0) {
		// TODO Auto-generated method stub
		return this.id-arg0.id;
	}


}

