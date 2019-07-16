package threads.singleton.canessa;


/*
 * 
 */
public class ChildThread extends Thread {

	@Override
	public void run() {
		
		// **** instantiate our Singleton class ****
		Singleton s = Singleton.getInstance();
		
		// **** increment the variable in the class ****
		s.val += 1;
		
		// **** display the updated value ****
		System.out.println("val: " + s.val);
	}
}
