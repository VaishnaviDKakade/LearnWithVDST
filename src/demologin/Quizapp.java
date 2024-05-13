package demologin;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.*;

public class Quizapp extends JFrame implements ActionListener{
	String questions[][]=new String[10][5];
	String answer[][]=new String[10][2];
	JLabel qno,question;
	String useranswer[][]=new String[10][1];
	public static int ans_given=0;
	public static int timer=15;
	JRadioButton opt1,opt2,opt3,opt4;
	public static int count=0;
	JButton next,submit,lifeline,backbtn;
	ButtonGroup btn;
    public Quizapp(){
	
		setBounds(380,40,980,850);
		getContentPane().setBackground(Color.white);
		setVisible(true);
		setLayout(null);
		JLabel label=new JLabel();
		Image back=new ImageIcon(getClass().getResource("/quiz.gif")).getImage();
		label.setIcon(new ImageIcon(back));
		label.setBounds(0,0,1540,391);
		getContentPane().add(label);
		
        qno=new JLabel();
		qno.setBounds(100,450,50,30);
		add(qno);
		
	    question=new JLabel();
		question.setBounds(150,450,900,30);
		add(question);
		questions[0][0]="Which of these events is generated when the window is closed?";
		questions[0][1]="TextEvent";
		questions[0][2]="MouseEvent";
		questions[0][3]="FocusEvent";
		questions[0][4]="WindowsEvent";
		
		questions[1][0]="Who invented Java Programming?";
		questions[1][1]="Guido van Rossum";
		questions[1][2]="James Gosling";
		questions[1][3]="Dennis Ritchie";
		questions[1][4]="Bjarne Stroustrup";
		
		questions[2][0]="Which component is used to compile, debug and execute the java programs?";
		questions[2][1]="JRE";
		questions[2][2]="JDK";
		questions[2][3]="JIT";
		questions[2][4]="JVM";
		
		questions[3][0]="Which of these cannot be used for a variable name in Java?";
		questions[3][1]="identifier & keyword";
		questions[3][2]="identifier";
		questions[3][3]="Keyword";
		questions[3][4]="none";
		
		questions[4][0]="Which of the following is not a Java features?";
		questions[4][1]="Dynamic";
		questions[4][2]="Architecture Neutral";
		questions[4][3]="Use of pointers";
		questions[4][4]="Object-oriented";
		
		questions[5][0]="Which of the following tool is used to generate API documentation in HTML format from doc comments in source code? ";
		questions[5][1]="javap tool";
		questions[5][2]="javaw command";
		questions[5][3]="Javadoc tool";
		questions[5][4]="javah command";
		
		questions[6][0]="Which package contains the Random class?";
		questions[6][1]="Java.util package";
		questions[6][2]="java.lang package";
		questions[6][3]="java.awt package";
		questions[6][4]="java.io package";
		
		questions[7][0]=" An interface with no fields or methods is known as a ______.";
		questions[7][1]="Runnable Interface";
		questions[7][2]="Marker Interface";
		questions[7][3]="Abstract Interface";
		questions[7][4]="CharSequence Interface";
		
		questions[8][0]="What is meant by the classes and objects that dependents on each other?";
		questions[8][1]="Tight Coupling";
		questions[8][2]="Cohesion";
		questions[8][3]="Loose Coupling";
		questions[8][4]="None";
		
		questions[9][0]="What is meant by the classes and objects that dependents on each other?";
		questions[9][1]="Tight Coupling";
		questions[9][2]="Cohesion";
		questions[9][3]="Loose Coupling";
		questions[9][4]="None";
//		
//		questions[10][0]="What is meant by the classes and objects that dependents on each other?";
//		questions[10][1]="Tight Coupling";
//		questions[10][2]="Cohesion";
//		questions[10][3]="Loose Coupling";
//		questions[10][4]="None";
//		
		
		answer[0][1]="WindowEvent";
		answer[1][1]="James Gosling";
		answer[2][1]="Keyword";
		answer[4][1]="Use of Pointer";
		answer[5][1]="Javadoc tool";
		answer[6][1]="Java.util package";
		answer[7][1]="Marker Interface";
		answer[8][1]="Tight Coupling";
	
		
		opt1=new JRadioButton();
		opt1.setBounds(170,520,700,30);
		opt1.setBackground(Color.white);
		add(opt1);
		opt2=new JRadioButton();
		opt2.setBounds(170,560,700,30);
		opt2.setBackground(Color.white);
		add(opt2);
		
	    opt3=new JRadioButton();
		opt3.setBounds(170,600,700,30);
		opt3.setBackground(Color.white);
		add(opt3);
		
		opt4=new JRadioButton();
		opt4.setBounds(170,640,700,30);
		opt4.setBackground(Color.white);
		add(opt4);
		
	    btn=new ButtonGroup();
		btn.add(opt1);
		btn.add(opt2);
		btn.add(opt3);
		btn.add(opt4);
		
		lifeline=new JButton("50-50 Lifeline");
		lifeline.setBounds(80,710,200,70);
		lifeline.setBackground(Color.pink);
		add(lifeline);
		lifeline.addActionListener(this);
		
		
		next=new JButton("Next");
		next.setBounds(300,710,200,70);
		next.setBackground(Color.pink);
		add(next);
		next.addActionListener(this);

		backbtn=new JButton("Back");
		backbtn.setBounds(740,710,200,70);
		backbtn.setBackground(Color.pink);
		add(backbtn);
		backbtn.addActionListener(this);
		
		submit=new JButton("submit");
		submit.setBounds(520,710,200,70);
		submit.setBackground(Color.pink);
		submit.setEnabled(false);
		add(submit);
		submit.addActionListener(this);
		
		
		start(count);
		
	}
    public void paint(Graphics g) {
    	super.paint(g);
    	String time="Time Left - "+timer +" Seconds";
    	g.setColor(Color.red);
    	g.setFont(new Font("tohoma",Font.BOLD,16));
    	if(timer>0) {
    		g.drawString(time,760,500);
    	}
    	else {
    		g.drawString("Times-up!",760,500);
    	}
    	if(ans_given==1) {
    		ans_given=0;
    		timer=15;
    		
    	}
    	else if(timer<0) {
    		timer=15;
    		
    		if(btn.getSelection()==null) {
    			useranswer[count][0]="";
    		}else {
    			useranswer[count][0]=btn.getSelection().getActionCommand();
    		}
    		count++;
    		start(count);
    	}
    	timer--;
    	try {
    		Thread.sleep(1000);
    		repaint();
    		
    	}catch(Exception e) {
    		
    		
    	}
    
    }
	public void start(int count) {
		qno.setText(""+(count+1)+".");
		question.setText(questions[count][0]);
		
		opt1.setText(questions[count][1]);
		opt1.setActionCommand(questions[count][1]);
		
		opt2.setText(questions[count][2]);
		opt2.setActionCommand(questions[count][2]);
		
		opt3.setText(questions[count][3]);
		opt3.setActionCommand(questions[count][3]);
		
		opt4.setText(questions[count][4]);
		opt4.setActionCommand(questions[count][4]);
		
		btn.clearSelection();
		
	}
	public static void main(String[]args) {
		new Quizapp();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	      if(e.getSource()==next) {
	    	  repaint();
	    	  ans_given=1;
	    	  if(btn.getSelection()==null) {
	    			useranswer[count][0]="";
	    		}else {
	    			useranswer[count][0]=btn.getSelection().getActionCommand();
	    		}
	    	  if(count==9) {
	    		  next.setEnabled(false);
	    		  submit.setEnabled(true);
	    	  }
	    	  count++;
	    	  start(count);
	      }
          if(e.getSource()==submit) {
	    	  
	      }
          if(e.getSource()==lifeline) {
	  
          }
          if(e.getSource()==backbtn) {
        	  setVisible(false);
        	  new select().setVisible(true);
        	  
          }
	}

}
