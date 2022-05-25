package customAnnotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class CustomAnnotations {

	public static void main(String[] args) {
		
		Vivo v=new Vivo("VivoY81",6);
		Class c=v.getClass();
		Annotation a=c.getAnnotation(SmartPhone.class);
		SmartPhone s=(SmartPhone)a;
		System.out.println(s.os());

	}

}




@SmartPhone(os="Android",version=6)
class Vivo
{
	String model;
	int size;
	public Vivo(String model,int size)
	{
		this.model=model;
		this.size=size;
	}
}


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone
{
	 String os() default "Android";
	int version() default 1;
}