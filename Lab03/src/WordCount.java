import java.util.Scanner;
import java.util.StringTokenizer;

public class WordCount {
	private int count;
	public WordCount() {
		//객체의 인스턴스변수를 초기화하는데 사용한다.
	}
	public void resetCounter() {
		//카운트필드 0으로 초기화
		count=0;
	}
	void increaseCounter() {
		count+=1;
	}
	void decreaseCounter() {
		count-=1;
	}
	public int getCount() {
		return count;
	}
	public String toString() {
		return ("A or a로 시작하는 단어의 개수:"+count);
	}
	
	public boolean equals(WordCount word) {
		
		return true;
	}
}
