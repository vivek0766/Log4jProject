package udemy.logging.alphatest;

import org.apache.logging.log4j.*;
import org.testng.annotations.Test;

public class Sample {
	private static Logger log = LogManager.getLogger(Sample.class.getName());

	public static void main(String[] args) {
		Sample demo = new Sample();
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
			log.debug("Testing the Sample Value of I ");
			log.fatal("The Sample I value ");
			log.info("The Sample Value is " + a);
		}
		log.error("The Sample I value not printed! Lets Print Manually");
	}
}
