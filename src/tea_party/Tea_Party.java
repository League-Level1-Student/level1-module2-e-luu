package tea_party;

public class Tea_Party {
	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		if (isKnighted == true && isWoman == false) {
			return ("Hello Sir " + name);
		}else if(isWoman == false){
			return("Hello Mr. " + name);
		}else if(isWoman == true && isKnighted == true) {
			return("Hello Lady " + name);
		}else if(isWoman == true) {
			return("Hello Ms. " + name);
		}else {
			return name;
		}

	}

}
