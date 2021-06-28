import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Createword {
	private String word;
	private int index;
	private String filename;
	public Createword(){
		word="no word";
		filename="no file";
	}
	public Createword(String word, String filename) {
		this.word=word;
		this.filename=filename;
	}
	public Createword(Createword a) {
		word=a.word;
		filename=a.filename;
	}
	public String wordFromFile() {//file 1~5까지 있음
		Random rand=new Random();
		BufferedReader inputStream=null;
		try{
			inputStream=new BufferedReader(new FileReader("./src/"+filename+".txt"));
			index=rand.nextInt(15)+1;
			for(int i=0; i<index;i++)
				word=inputStream.readLine();
			//String[] words=string.split(" ");
			//string=words[index];
		}
		catch(FileNotFoundException e){
			System.out.println("File not found or could not open.");
			System.exit(0);
		}
		catch(IOException e) {
			System.out.println("error:reading txtfile.");
			System.exit(0);
		}
		return word;
	}
	public String getword() {
		return word;
	}
	public void setword(String string) {
		this.word=string;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename=filename;
	}
	public int getindex() {
		return index;
	}
}