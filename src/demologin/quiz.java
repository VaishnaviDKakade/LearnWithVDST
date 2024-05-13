package demologin;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;

import javax.swing.*;
public class quiz extends JFrame{
	JRadioButton opt1,opt2,opt3 ,opt4;
	JLabel question;
	String questions[][]=new String[10][5];
	String answer[][]=new String[10][2];
	quiz(){
		
		
		
		setLayout(null);
		setSize(1600,1000);
		setLocation(140,30);
		setResizable(false);
		setVisible(true);
		JLabel label=new JLabel();
		Image back=new ImageIcon(getClass().getResource("/quizimg.jpg")).getImage();
		label.setIcon(new ImageIcon(back));
		label.setBounds(0,0,1900,500);
		getContentPane().add(label);
		
		question=new JLabel();
		question.setBounds(120,550,590,50);
		question.setFont(new Font("OSWARD",Font.BOLD,20));
		add(question);
		ButtonGroup groupbutton=new ButtonGroup();
		opt1=new JRadioButton();
		add(opt1);
		opt2=new JRadioButton();
		add(opt2);
		opt3=new JRadioButton();
		add(opt3);
		opt4=new JRadioButton();
		add(opt4);
		groupbutton.add(opt1);
		groupbutton.add(opt2);
		groupbutton.add(opt3);
		groupbutton.add(opt4);
		add(groupbutton);
		opt1.setBounds(120,590,340,50);
		opt2.setBounds(120,630,340,50);
		opt3.setBounds(120,670,340,50);
		opt4.setBounds(120,710,340,50);
		
		
		questions[0][0]="Which keyword is used for accessing features of package";
		questions[0][1]="package";
		questions[0][2]="package";
		questions[0][3]="package";
		questions[0][4]="package";
		
		questions[1][0]="Which keyword is used for accessing features of package";
		questions[1][1]="package";
		questions[1][2]="package";
		questions[1][3]="package";
		questions[1][4]="package";
		
		questions[2][0]="Which keyword is used for accessing features of package";
		questions[2][1]="package";
		questions[2][2]="package";
		questions[2][3]="package";
		questions[2][4]="package";
		
		questions[3][0]="Which keyword is used for accessing features of package";
		questions[3][1]="package";
		questions[3][2]="package";
		questions[3][3]="package";
		questions[3][4]="package";
		
		questions[4][0]="Which keyword is used for accessing features of package";
		questions[4][1]="package";
		questions[4][2]="package";
		questions[4][3]="package";
		questions[4][4]="package";
		
		questions[5][0]="Which keyword is used for accessing features of package";
		questions[5][1]="package";
		questions[5][2]="package";
		questions[5][3]="package";
		questions[5][4]="package";
		
		questions[6][0]="Which keyword is used for accessing features of package";
		questions[6][1]="package";
		questions[6][2]="package";
		questions[6][3]="package";
		questions[6][4]="package";
		
		questions[7][0]="Which keyword is used for accessing features of package";
		questions[7][1]="package";
		questions[7][2]="package";
		questions[7][3]="package";
		questions[7][4]="package";
		
		questions[8][0]="Which keyword is used for accessing features of package";
		questions[8][1]="package";
		questions[8][2]="package";
		questions[8][3]="package";
		questions[8][4]="package";
		
		questions[9][0]="Which keyword is used for accessing features of package";
		questions[9][1]="package";
		questions[9][2]="package";
		questions[9][3]="package";
		questions[9][4]="package";
		
		
		
		JButton next=new JButton("Next");
		next.setBounds(1100,630,200,40);
		next.setFont(new Font("TAHOMA",Font.PLAIN,22));
		next.setBackground(Color.BLUE);
		next.setForeground(Color.WHITE);
		add(next);
		
		
		JButton lifeline=new JButton("50-50 Lifeline");
	    lifeline.setBounds(1100,710,200,40);
		lifeline.setFont(new Font("TAHOMA",Font.PLAIN,22));
		lifeline.setBackground(Color.BLUE);
		lifeline.setForeground(Color.WHITE);
		add(lifeline);
		
		JButton submit=new JButton("Submit");
	    submit.setBounds(1100,790,200,40);
		submit.setFont(new Font("TAHOMA",Font.PLAIN,22));
		submit.setBackground(Color.BLUE);
		submit.setForeground(Color.WHITE);
		submit.setEnabled(false);
		add(submit);
		
		
		start(0);

		}
	private Object JoptionPane() {
		// TODO Auto-generated method stub
		return null;
	}
	public void start(int count) {
		question.setText(questions[count][0]);
		opt1.setText(questions[count][1]);
		opt2.setText(questions[count][2]);
		opt3.setText(questions[count][3]);
		opt4.setText(questions[count][4]);
	}
	private void add(ButtonGroup groupbutton) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String args[]) {
		new quiz();
	}
	
}
