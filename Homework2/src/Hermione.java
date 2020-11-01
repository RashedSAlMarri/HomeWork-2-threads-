
public class Hermione extends Character implements Runnable {
	
	public Hermione(Location l) {
		super(l);
		Thread t = new Thread();
		t.start();
	}
	
	public void run() {
		while(true) {
			if (this.getLocation().checkLocation("Harry")) {
				System.out.println("Harry I am here!");
				break;
			}
		}
	}
}
