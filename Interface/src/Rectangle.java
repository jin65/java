
public class Rectangle implements Comparable<Rectangle>{
	private int width;
	private int height;
	public Rectangle(int width, int height) {
		this.width=width;
		this.height=height;
	}
	public int area() {
		return width*height;
	}
	public int compareTo(Rectangle r2) {
		if(this.area()>r2.area())
			return 1;
		else if(r2.area()==this.area())
			return 0;
		else
			return -1;
	}
}
