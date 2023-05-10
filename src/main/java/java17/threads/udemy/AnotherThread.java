package java17.threads.udemy;

import static java17.threads.udemy.ThreadColor.ANSI_BLUE;
/**
 * Created by timbuchalka on 25/05/2016.
 */
public class AnotherThread extends Thread {

	@Override
	public void run() {
		System.out.println(ANSI_BLUE + "Hello from " + currentThread().getName());
	}
}
