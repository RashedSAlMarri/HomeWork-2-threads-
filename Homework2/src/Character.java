
public abstract class Character {
	private Location location;
	public Character(Location l) {
		location = l;
		location.addCharacter(this.getClass().getTypeName());
	}
	public synchronized Location getLocation() {
		return location;
	}
	public synchronized void setLocation(Location l) {
		location.removeCharacter(this.getClass().getName());
		location = l;
		location.addCharacter(this.getClass().getName());
	}
}
