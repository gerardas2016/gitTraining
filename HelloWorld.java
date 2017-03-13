
import java.time.LocalDate;



/**
 * @author zwaclaw, edited by Gerardas
 *
 */

public class HelloWorld {
	public static void main(String[] args) {

	LocalDate date = LocalDate.now();


		Input input= new Input();

		System.out.println("Iveskite varda");
		String name=input.betkas();
		System.out.println("Helo "+ name);

		System.out.println(date);
	}
}
