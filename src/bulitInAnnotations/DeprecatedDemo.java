package bulitInAnnotations;

public class DeprecatedDemo {

	public static void main(String[] args) {
		
		A a=new A();
		a.run();
		a.call();

	}

}

class A
{
	public void call()
	{
		System.out.println("calling....");
	}
	
	@Deprecated
	public void run()
	{
		System.out.println("Running.....");
	}
}
