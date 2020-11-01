
public abstract class Location {

	String description;
	String[] characters;
	public Location(String des, int max) {
		description = des;
		characters = new String[max];
		for (int i=0; i<characters.length; i++) {
			characters[i] = " ";
		}
	}
	public void addCharacter(String name) {
		for (int i = 0; i<characters.length; i++) {
			if (characters[i]==" ") {
				characters[i]=name;
				break;
			}
		}
	}
	public void removeCharacter(String name) {
		for (int i = 0; i<characters.length; i++) {
			if (characters[i]==name) {
				characters[i]=" ";
			}
		}
	}

	public synchronized boolean checkLocation(String name) {
		for (String i: characters) {
			if (i == name) {
				return true;
			}
		}
		return false;
	}
	
	public String toString() {
		return description;
	}
}
