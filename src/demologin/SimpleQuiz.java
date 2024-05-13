package demologin;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleQuiz extends JFrame implements ActionListener {
    private JLabel questionLabel;
    private JRadioButton[] optionButtons;
    private JButton nextButton;
    private ButtonGroup buttonGroup;
    private int currentQuestionIndex = 0;
    private int score = 0;
    

    private String[][] questions = {
            {"What is the capital of France?", "Paris", "London", "Berlin", "Madrid", "Paris"},
            {"What is the largest mammal?", "Elephant", "Blue Whale", "Giraffe", "Hippo", "Blue Whale"}
    };

    public SimpleQuiz() {
    	setLayout(null);
		setSize(1600,1000);
		setLocation(140,30);
		setVisible(true);
		JLabel label=new JLabel();
		Image back=new ImageIcon(getClass().getResource("/quizimg.jpg")).getImage();
		label.setIcon(new ImageIcon(back));
		label.setBounds(0,0,1900,500);
		getContentPane().add(label);
		
        setTitle("Simple Quiz");
//        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 3));

        questionLabel = new JLabel(questions[currentQuestionIndex][0]);
        add(questionLabel);

        optionButtons = new JRadioButton[4];
        buttonGroup = new ButtonGroup();
        for (int i = 0; i < optionButtons.length; i++) {
            optionButtons[i] = new JRadioButton(questions[currentQuestionIndex][i + 1]);
            buttonGroup.add(optionButtons[i]);
            add(optionButtons[i]);
        }

        nextButton = new JButton("Next");
        nextButton.addActionListener(this);
        add(nextButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == nextButton) {
            checkAnswer();
            currentQuestionIndex++;
            if (currentQuestionIndex < questions.length) {
                displayQuestion();
            } else {
                JOptionPane.showMessageDialog(this, "Quiz completed!\nScore: " + score);
                System.exit(0);
            }
        }
    }

    private void displayQuestion() {
        questionLabel.setText(questions[currentQuestionIndex][0]);
        for (int i = 0; i < optionButtons.length; i++) {
            optionButtons[i].setText(questions[currentQuestionIndex][i + 1]);
            optionButtons[i].setSelected(false);
        }
    }

    private void checkAnswer() {
        for (int i = 0; i < optionButtons.length; i++) {
            if (optionButtons[i].isSelected()) {
                if (optionButtons[i].getText().equals(questions[currentQuestionIndex][5])) {
                    score++;
                    JOptionPane.showMessageDialog(this, "Correct!");
                } else {
                    JOptionPane.showMessageDialog(this, "Incorrect!");
                }
                return;
            }
        }
        JOptionPane.showMessageDialog(this, "Please select an option!");
    }

    public static void main(String[] args) {
        new SimpleQuiz();
    }
}
