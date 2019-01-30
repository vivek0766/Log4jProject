package udemy.logging.log4j;

import org.apache.logging.log4j.*;
import org.testng.annotations.Test;

public class Demo {
	private static Logger log = LogManager.getLogger(Demo.class.getName());

	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.printName();

	}

	@Test
	public void printName() {
		log.info("To get I Value from forloop");
		int[] a = new int[10];
		a[0] = 1;
		a[1] = 12;
		a[2] = 23;
		a[4] = 34;
		a[3] = 55;

		for (int i = 0; i< a[0]; i++) {
			log.debug("Testing the Demo Value of I ");
			log.fatal("Its Demo Fatal ");
			log.info("The Demo Value is " + a);
		}
		log.error("The Demo I value not printed");
	}
}
