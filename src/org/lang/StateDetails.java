package org.lang;

public class StateDetails {

	private void southIndia() {
		System.out.println("State = Tamilnadu");

	}
	
	private void northIndia() {
		System.out.println("State = Maharastra");

	}
	
	public static void main(String[] args) {
		StateDetails a = new StateDetails();
		a.southIndia();
		a.northIndia();
		LanguageInfo b = new LanguageInfo();
		b.tamilLanguage();
		b.englishLanguage();
		b.hindiLanguage();
	}
}
