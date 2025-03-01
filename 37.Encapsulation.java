class Human{
	private int age = 11;
	private String name = "pranit";

	public int getAge()
	{
		return age;
	}

	public void setAge(int a)
	{
		age = a;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String n)
	{
		name = n;
	}

}

public class Demo {
	public static void main(String[] args) throws ClassNotFoundException
	{
		Human obj=new Human();
		obj.setAge(30);
		obj.setName("pranit");
//		obj.age=11;
//		obj.name="Navin";
		
		System.out.println(obj.getName()+" : "+obj.getAge());
	
	}
}
	



    

