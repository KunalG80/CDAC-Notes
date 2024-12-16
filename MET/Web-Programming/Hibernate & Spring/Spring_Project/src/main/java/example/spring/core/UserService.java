package example.spring.core;

public class UserService implements GreetingService{
	private String name;
	private int age;
	private float weight;
	
	public UserService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserService(String name, int age, float weight) {
		System.out.println("Inside UserService(String, int, float)");
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	public UserService (int age, float weight, String name) {
		System.out.println("Inside UserService(int, float, String)");
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setting name");
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("Setting age");
		this.age = age;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		System.out.println("Setting weight");
		this.weight = weight;
	}

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		String reply = 
				"Hey " + name + ", your age is " + age + 
				" years and your weight is " + weight + " Kg.";
		return reply;
	}

}
