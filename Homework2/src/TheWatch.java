
public class TheWatch implements Runnable {
	
	boolean end;
	public TheWatch() {
		end = false;
		Thread t=new Thread(this);
		t.start();
	}
	
	public void run() {
			for (int i = 1; i<=180; i++) { 
				if (end==true) {
					break;
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(i==60) {
					System.out.println("1 minute passed...");
				}
				else if(i==120) {
					System.out.println("2 minutes passed...");
				}
				else if(i==180) {
					System.out.println("3 minutes passed...Hide map contents before someone sees you!");
					try {
						Thread.sleep(10000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("You have been caught... and the Marauder’s map has been confiscated.");
					end = true;
				}
			}
		}
}
