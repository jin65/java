import java.util.Scanner;
import java.util.StringTokenizer;

public class WordCount {
	private int count;
	public WordCount() {
		//��ü�� �ν��Ͻ������� �ʱ�ȭ�ϴµ� ����Ѵ�.
	}
	public void resetCounter() {
		//ī��Ʈ�ʵ� 0���� �ʱ�ȭ
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
		return ("A or a�� �����ϴ� �ܾ��� ����:"+count);
	}
	
	public boolean equals(WordCount word) {
		
		return true;
	}
}
