import javax.swing.JOptionPane;

public class taco {
	private String meat;
	private String sauce;

	public static void main(String[] args) {
	taco tacos = new taco();
	tacos.setMeat("beef");
	tacos.setSauce("salsa");
	tacos.getMeat();
	tacos.getSauce();
	}

	void setMeat(String meat) {
		this.meat = meat;

	}

	void setSauce(String sauce) {
		this.sauce = sauce;
	}

	String getMeat() {
		return meat;
	}

	String getSauce() {
		return sauce;

	}
}
