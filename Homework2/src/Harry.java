
public class Harry extends Character implements Runnable {

	TheWatch w;

	public Harry(Location l) {
		super(l);
		w = new TheWatch();
		Thread t = new Thread(this);
		t.start();
	}

	public void run() {
		while (!w.end) {
			if (this.getLocation().checkLocation("Hermione")) {
				System.out.println("Found Hermione!");
				w.end = true;
			}
		}
	}
}
