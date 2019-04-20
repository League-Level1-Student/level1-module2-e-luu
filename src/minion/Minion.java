package minion;

public class Minion {
	private String name;
	private int eyes;
	private String color;
	private String master;

	public Minion(String name, int eyes, String color, String master) {
		this.name = name;
		this.eyes = eyes;
		this.color = color;
		this.master = master;
	}

	private void setName(String name) {
		this.name = name;
	}

	private void setEyes(int eyes) {
		this.eyes = eyes;
	}

	private void setColor(String color) {
		this.color = color;
	}

	public void setMaster(String master) {
		this.master = master;
	}

	String getName() {
		return name;
	}

	int getEyes() {
		return eyes;
	}

	String getColor() {
		return color;
	}

	public String getMaster() {
		return master;
	}
}
