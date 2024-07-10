package July_1st;

public class Get_Set {

	private String id;
	
	private String Name;
	
	private double Package;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getPackage() {
		return Package;
	}

	public void setPackage(double package1) {
		Package = package1;
	}

	public Get_Set(String id, String name, double package1) {
		super();
		this.id = id;
		Name = name;
		Package = package1;
	}

	public Get_Set() {
		super();
	}	
}
