package dependencyinjectionconst;

public class Company {

	private int id;
	private String name;
	public Company(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + "]";
	}
	
}
