import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Game extends Createword{
		private int failedcount;
		private int chance;
		private StringBuffer hiddenWord;
		private String Hint;
		public Game() {
			super();
			failedcount=0;
			chance=0;
		}
		public Game(Game other) {
			super(other);
			this.failedcount=other.failedcount;
			this.chance=other.chance;
			this.hiddenWord=other.hiddenWord;
		}
		public void check(char key) {
			int count=0;
			for(int i=0; i<getword().length();i++) {
				if((hiddenWord.charAt(i)=='_')&&(getword().charAt(i)==key)) {
					hiddenWord.setCharAt(i, key);
					count=1;//성공
				}
			}
			if(count==0)//실패
				failedcount++;
			chance--;
		}
		public int chanceCheck() {
			if(failedcount==chance)
				return -1;
			else
				return 0;
		}
		public StringBuffer makeHidden() {
			String word=getword();
			int hiddennum=word.length();
			chance=hiddennum+4;
			hiddenWord=new StringBuffer(word);
			Random rand=new Random();
			for(int i=0; i<hiddennum; i++) {
				int index=rand.nextInt(word.length());
				char c=word.charAt(index);
				for(int j=0; j<word.length();j++) {
					if(hiddenWord.charAt(j)==c)
						hiddenWord.setCharAt(j, '_');
				}
			}
			return hiddenWord;
		}
		public void setfailedcount(int failedcount) {
			this.failedcount=failedcount;
		}
		public void setHiddenword(StringBuffer hiddenWord) {
			this.hiddenWord=hiddenWord;
		}
		public StringBuffer getHidden() {
			return hiddenWord;
		}
		public int getchance() {
			return chance;
		}
		public int getfailedcount() {
			return failedcount;
		}
		public boolean equals() {
			String hiddenString=hiddenWord.toString();
			if(hiddenString.equals(getword()))
				return true;
			else
				return false;
		}
		public String showWord() {
			String show="";
			for(int i=0; i<hiddenWord.length();i++) {
				show=show+hiddenWord.charAt(i)+" ";
			}
			return show;
		}
		public String showHint() {
			int index=getindex();
			BufferedReader inputStream=null;
			try{
				inputStream=new BufferedReader(new FileReader("./src/"+getFilename()+"hint.txt"));
				for(int i=0; i<index;i++)
					Hint=inputStream.readLine();
			}
			catch(FileNotFoundException e){
				System.out.println("hintfile not found or could not open.");
				System.exit(0);
			}
			catch(IOException e) {
				System.out.println("error:reading txtfile.");
				System.exit(0);
			}
			
			return Hint;
		}
}
