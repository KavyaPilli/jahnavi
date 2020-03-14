package springexamples;

public class Identity {
	private String id;
	private String name;
	@Override
	public String toString() {
		return "Identity [id=" + id + ", name=" + name + "]";
	}
	public Identity(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	

}
