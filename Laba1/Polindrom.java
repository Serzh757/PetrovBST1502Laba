import java.util.Scanner;

public class Polindrom{

	public Polindrom(){

	}
	public void Palindrom(){
		String str = getWord();
		System.out.println(Testword(str));
	}

	public boolean Testword(String str) {
		for(int i = 0; i < str.length()/2; i++) {
			if(str.charAt(i) != str.charAt(str.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}

	public String getWord() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}
}
