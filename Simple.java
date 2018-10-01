import java.util.Scanner;

public class Main{

	public Main(){

	}

	public void Simple(){
		int n = Scanner();
		for (int i = 2; i < n+1; i++) {
			if (Booleanproverka(i)) {
				System.out.println(i);
			}
		}
	}

	private boolean Booleanproverka(int n) {
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				return false;
			} 
		} 
		return true;
	}

	private int Scanner() {
        Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
    }
}
