
public class person {
	String name;
	String superpower;

	String getname() {
		return name;

	}

	public static void main(String[] args) {
		person per = new person();
		person pers = new person();
		person perso = new person();
		per.setSuper("super strength");
		pers.setSuper("super speed");
		perso.setSuper("flying");
		per.getsuperpower();
		System.out.println(per.getsuperpower());

		pers.getsuperpower();
		perso.getsuperpower();
		per.setName("Billy");
		pers.setName("Milly");
		perso.setName("Lilly");
		per.getname();
		pers.getname();
		perso.getname();
		
		String s = per.toString();
		System.out.println(s);
		String y = pers.toString();
		System.out.println(y);;
		String v = perso.toString();
		System.out.println(v);
		per.toString();
		pers.toString();
		perso.toString();
	}

	public String toString() {
return name + " has mad "+ superpower +" skills.";
	}

	String getsuperpower() {
		return superpower;
	}

	void setName(String name) {
		this.name = name;
	}

	void setSuper(String superpower) {
		this.superpower = superpower;
	}
}
