import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioSystem;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.awt.*;

public class Frame extends JFrame{
	public final static int WIDTH=500;
	public final static int HEIGHT=500;
	JTextField tf=new JTextField(10);//input 1~3
	private char key;//사용자 입력 버튼 키
	private char[] alphabet= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	JButton[] keybnt=new JButton[27];//알파벳 버튼
	JButton hintbnt;
	JPanel wordpanel, hintpanel, popup, txtpanel;
	JPanel alphabetPanel;//알파벳 패널
	JLabel selectfile, word, status, answer, hint;//파일 입력문구, 현재 단어 상태문구, 기회 몇번남고 실패 몇번인지, 답, 힌트
	Game hangman= new Game();

	public Frame() {
		super("Hangman game!");
		setSize(WIDTH, HEIGHT);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(247, 230, 219));
		txtpanel=new JPanel();
		hintpanel=new JPanel(new FlowLayout());
		wordpanel=new JPanel(new GridLayout(4,1,3,3));
		alphabetPanel=new JPanel(new GridLayout(3,9,3,3));
		selectfile=new JLabel("주제를 선택해 입력해주세요: animal,color,food,fruit");//입력을 받을때 보여줄 텍스트 띄우기
		status=new JLabel();
		status.setHorizontalAlignment(JLabel.CENTER);
		word=new JLabel();
		word.setHorizontalAlignment(JLabel.CENTER);
		wordSetting();
		hint=new JLabel();
		
		tf.addActionListener(new ActionListener(){//이거는 텍스트파일이름 사용자로부터 입력받을 공간-텍스트파일 주제 선택
			public void actionPerformed(ActionEvent e) {
				hangman.setFilename(tf.getText());
				hangman.wordFromFile();
				hangman.makeHidden();
				word.setText(hangman.showWord());
			}
		});
		hintbnt=new JButton("HINT");
		hintbntSetting();
		hintbnt.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				hint.setText(hangman.showHint());
			}
		});
		for(int i=0; i<27; i++) {
			keybnt[i]=new JButton();
			keybntSetting(keybnt[i]);
			if(i!=26) {
				String s=String.valueOf(alphabet[i]);
				keybnt[i].setText(s);
			}
			if(i==26)
				keybnt[i].setText(" ");
			keybnt[i].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					soundplay("./src/bnteffect.wav");
					JButton b=(JButton)e.getSource();
					key=b.getText().charAt(0);
					hangman.check(key);
					b.setBackground(new Color(0,86,102));
					b.setText("CHECKED");
					
					word.setText(hangman.showWord());
					status.setText("남은 기회수: "+hangman.getchance());
					
					if(hangman.equals()==true) {
						new Result(true);
					}
					else if(hangman.equals()==false){
						if(hangman.getchance()==0) {
							new Result(false);
						}
					}
				}
			});
			alphabetPanel.add(keybnt[i]);
		}//알파벳 이름 버튼에 할당하기
		txtpanel.add(selectfile, BorderLayout.CENTER);
		txtpanel.add(tf, BorderLayout.NORTH);
		hintpanel.add(hintbnt);
		hintpanel.add(hint);
		wordpanel.add(txtpanel);
		wordpanel.add(hintpanel);
		wordpanel.add(status);
		wordpanel.add(word);
		wordpanel.setOpaque(false);
		hintpanel.setOpaque(false);
		txtpanel.setOpaque(false);
		add(wordpanel, BorderLayout.CENTER);
		add(alphabetPanel, BorderLayout.SOUTH);//알파벳 패널은 맨 밑에넣어야됨
		setVisible(true);
	}
	public void hintbntSetting() {
		hintbnt.setBackground(new Color(80,188,223));
		hintbnt.setFont(new Font("Serif", Font.ITALIC, 15));
		hintbnt.setForeground(Color.white);
		hintbnt.setBorderPainted(false);
	}
	public void wordSetting() {
		word.setBackground(Color.DARK_GRAY);
		word.setFont(new Font("", Font.BOLD, 30));
	}
	public void keybntSetting(JButton keybnt) {
		keybnt.setBackground(new Color(80,188,223));
		keybnt.setFont(new Font("Serif", Font.BOLD, 15));
		keybnt.setForeground(Color.white);
		keybnt.setBorderPainted(false);
	}
	public void soundplay(String file) {
		try {
			AudioInputStream ais=AudioSystem.getAudioInputStream(new File(file));
			Clip clip=AudioSystem.getClip();
			clip.stop();
			clip.open(ais);
			clip.start();
		}
		catch(Exception ex) {
			System.out.println("sound not found");
			System.exit(0);
		}
	}
}
class Result extends JDialog{

	Result(boolean a){
		JPanel popup=new JPanel(new BorderLayout());
		setContentPane(popup);
		getContentPane().setBackground(new Color(146, 207, 191));
		JLabel string=new JLabel();
		JButton exit=new JButton ("EXIT GAME");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		string.setHorizontalAlignment(JLabel.CENTER);
		string.setFont(string.getFont().deriveFont(20.0f));
		if(a) {
			setTitle("Congratulation!");
			string.setForeground(Color.BLUE);
			string.setText("YOU WIN!!");
			soundplay("./src/successSound.wav");
		}
		else {
			setTitle("Try again");
			string.setForeground(Color.RED);
			string.setText("YOU LOSE...");
			soundplay("./src/failedSound.wav");
		}
		popup.add(string,BorderLayout.CENTER);
		popup.add(exit, BorderLayout.SOUTH);
		setSize(200,200);
		setResizable(false);
		setVisible(true);
		}
	public void soundplay(String file) {
		try {
			AudioInputStream ais=AudioSystem.getAudioInputStream(new File(file));
			Clip clip=AudioSystem.getClip();
			clip.stop();
			clip.open(ais);
			clip.start();
		}
		catch(Exception ex) {
			System.out.println("sound not found");
			System.exit(0);
		}
	}
	
}