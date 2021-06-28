
public class PartiallyFilledArray {
	private int maxNumberElements;//same as a.length
	private double a[]=new double[20];
	private int numberUsed;//number of indices currently in use
	PartiallyFilledArray(){
		maxNumberElements=10;
		a=new double[maxNumberElements];
		numberUsed=0;
	}
	PartiallyFilledArray(int arraySize){
		if(arraySize<=0) {
			System.out.println("Error Array size zero or negative.");
		}
		maxNumberElements=arraySize;
		a=new double[maxNumberElements];
		numberUsed=0;
	}
	PartiallyFilledArray(PartiallyFilledArray original){
		if(original==null) {
			System.out.println("Fatal Error: aborting program.");
			System.exit(0);
		}
	}
	public void add(double newElement) {
		if(numberUsed>=a.length) {
			this.resize();
			a[numberUsed]=newElement;
			numberUsed++;
		}
		else {
			a[numberUsed]=newElement;
			numberUsed++;
		}
	}
	public void resize() {
		double new_a[]=new double[a.length*2];
		for(int i=0; i<a.length; i++) {
			new_a[i]=a[i];
		}
		a=new_a;
		maxNumberElements=maxNumberElements*2;
	}
	public double getElement(int index) {
		if(index<0||index>=numberUsed) {
			System.out.println("Error: Illegal or unused index.");
			System.exit(0);
		}
		return a[index];
	}
	public void resetElement(int index, double newValue) {
		if(index<0||index>=maxNumberElements) {
			System.out.println("Error: Illegal index.");
			System.exit(0);
		}
		else if(index>numberUsed) {
			System.out.println("Error: Changing an index that is too large.");
			System.exit(0);
		}
		else
			a[index]=newValue;
	}
	public void deleteLast() {
		if(empty()) {
			System.out.println("Error:Deleting from an empty array.");
			System.exit(0);
		}
		else
			numberUsed--;
	}
	public void delete(int index) {
		if(index<0||index>=numberUsed) {
			System.out.println("Error:Illegal or unused index.");
			System.exit(0);
		}
		for(int i=index;i<numberUsed;i++)
			a[i]=a[i+1];
		numberUsed--;
	}
	public boolean empty() {
		return (numberUsed==0);
	}
	public boolean full() {
		return (numberUsed==maxNumberElements);
	}
	public int getMaxCapacity() {
		return maxNumberElements;
	}
	public int getNumberOfElements() {
		return numberUsed;
	}
}
