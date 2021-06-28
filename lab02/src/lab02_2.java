import java.util.Random;

public class lab02_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[3];
		Random r=new Random();
		for(int i=0; i<3; i++) {
			a[i]=r.nextInt(30)+1;
			for(int j=0; j<i; j++) {
				if(a[i]==a[j])
					i--;
			}
		}
		for(int k=0; k<3;k++) {
			System.out.print(a[k]);
			System.out.print(" ");
		}
    }
}
