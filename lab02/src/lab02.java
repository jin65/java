import java.util.Scanner;

public class lab02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System.in);
		
		String sentence= keyboard.nextLine();
		int position=sentence.indexOf("hate");
		String ending=sentence.substring(position+"hate".length());
		
		sentence=sentence.substring(0,position)+"love"+ending;
		System.out.println(sentence);
		keyboard.close();
	}
}
