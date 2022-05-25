package bulitInAnnotations;

public class OverrideDemo {

	public static void main(String[] args) {
		
		Child p=new Child();
		p.show();
		
	}

}
class Parent
{
	public void show()
	{
		System.out.println("Show Parent");
	}
}

class Child extends Parent
{
	@Override
	public void show()
	{
		System.out.println("Show child ");
	}
}
