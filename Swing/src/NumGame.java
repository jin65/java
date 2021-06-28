import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.util.Random;

public class NumGame extends JFrame implements ActionListener{
	public static final int WIDTH=300;
	public static final int HEIGHT=300;
	private int bntCount=0;
	private int oddCount=0;
	JButton[][] btn=new JButton[3][3];
	JPanel panel;
	JLabel result;
	public static void main(String args[]) {
		NumGame aGame=new NumGame();
		
	}
	public NumGame() {
		super("3*3Number Game");
		setSize(WIDTH, HEIGHT);
		setLayout(new BorderLayout());
		
		panel=new JPanel();
		result=new JLabel();
		panel.setLayout(new GridLayout(3,3,3,3));
		result.setText("YOU WON:"+"0$");
		add(result,BorderLayout.NORTH);
		for(int i=0; i<3;i++)
			for(int j=0; j<3; j++) {
				btn[i][j]=new JButton();
				btn[i][j].addActionListener(this);
				panel.add(btn[i][j]);	
			}	
		add(panel,BorderLayout.CENTER);
		add(result,BorderLayout.NORTH);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		bntCount++;
		int text=0;
		JButton b=(JButton)e.getSource();
		Random random=new Random();
		int rnd=random.nextInt(50);
		if(rnd%2==1) {oddCount++;}
		b.setText(Integer.toString(rnd));
		if(bntCount==3) {
			switch(oddCount) {
				case 0:text=0;break;
				case 1:text=20;break;
				case 2:text=50;break;
				case 3:text=100;break;
			}
		}
		else if (bntCount==4) {
			bntCount=0;
			oddCount=0;
			for(int i=0; i<3;i++)
				for(int j=0; j<3; j++) {
					btn[i][j].setText("");
					}
		}
		result.setText("YOU WON:"+text+"$");
	}
}