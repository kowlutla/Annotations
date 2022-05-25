package bulitInAnnotations;

public class FunctionalInter 
{

	public static void main(String[] args) {
		
		Func f=()->
		{
			System.out.println("Fucntional Interface");
		};
		f.run();
		
	}

}
@FunctionalInterface
interface Func
{
	void run();
}
