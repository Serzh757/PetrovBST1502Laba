import java.util.Scanner;

public class Main{
	public static void main(String[] argv){
		Simple S = new Simple();
		Polindrom P = new Polimdrom();

		System.out.println("Simple- 1");
		System.out.println("Polindrom - 2");

		switch(Choose()){
			case 1:{
				Simple.start();
				break;
			}

			case 2:{
				Polindrom.start();
				break;
			}
		}
	}

	public static int vibor(){
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
}
