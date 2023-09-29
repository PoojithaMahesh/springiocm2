package dependencyinjectionconst;

public class Trainer {

	private int id;
	private String name;
	
	private Company company;

	public Trainer(int id, String name, Company company) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
	}

	@Override
	public String toString() {
		return "Trainer [id=" + id + ", name=" + name + ", company=" + company + "]";
	}
	
}
