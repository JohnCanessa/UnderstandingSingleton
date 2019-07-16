package threads.singleton.canessa;


/*
 * 
 */
public class Solution {

	/*
	 * Test scaffolding.
	 */
	public static void main(String[] args) {
		
		final int LOOPS = 7;
		
		// **** loop starting threads ****
		for (int i = 0; i < LOOPS; i++) {
			
			// **** create first child thread ****
			ChildThread ct1 = new ChildThread();
			
			// **** create second child thread ****
			ChildThread ct2 = new ChildThread();
			
			// **** create third child thread ****
			ChildThread ct3 = new ChildThread();
			
			// **** start first child thread ****
			ct1.start();
			
			// **** start second child thread ****
			ct2.start();
			
			// **** start third child thread ****
			ct3.start();			
		}
		
		// **** delay for a few ****
		try {
			Thread.sleep(100);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out.println();
		
		// **** create fourth child thread ****
		ChildThread ct4 = new ChildThread();
		
		// **** start fourth child thread ****
		ct4.start();
		
		// **** wait for fourth child thread to exit ****
		while (!ct4.isAlive()) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
