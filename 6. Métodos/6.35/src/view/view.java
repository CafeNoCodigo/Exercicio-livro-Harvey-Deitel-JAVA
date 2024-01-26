package view;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.security.SecureRandom;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import answerAndQuestion.AnswerAndQuestion;

public class view {
	
	private JLabel txtQuestion;
	private JFrame framePrincipal;
	private JTextField txtUser;
	private JButton btnAnswer;
	private AnswerAndQuestion text = new AnswerAndQuestion();
	private JLabel countCorrectLabel;
	private JLabel countWrongLabel;
	private int countCorrect = 0;
	private int countWrong = 0;
	private SecureRandom random = new SecureRandom();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view window = new view();
					window.framePrincipal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public view() {
		initialize();
	}
	
	public view(String txt) {
		
	}

	private void initialize() {
		framePrincipal = new JFrame();
		framePrincipal.setTitle("LEARN WITH TECH");
		framePrincipal.setResizable(false);
		framePrincipal.setBounds(100, 100, 450, 300);
		framePrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		txtQuestion = new JLabel(text.question());
		txtQuestion.setBounds(0, 1, 436, 87);
		txtQuestion.setHorizontalAlignment(SwingConstants.CENTER);
		
		txtUser = new JTextField();
		txtUser.setBounds(0, 88, 436, 87);
		txtUser.setHorizontalAlignment(SwingConstants.CENTER);
		txtUser.setColumns(10);
		framePrincipal.getContentPane().setLayout(null);
		framePrincipal.getContentPane().add(txtQuestion);
		framePrincipal.getContentPane().add(txtUser);
		
		btnAnswer = new JButton("RESPONDER");
		txtUser.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(java.awt.event.KeyEvent e) {
				int codigo = e.getKeyCode();
				int tecla = KeyEvent.VK_ENTER;
				int randomNumber = random.nextInt(5) + 1;
				
				if(codigo == tecla) {
					if(text.answer() == getUserTxt()) {
						JOptionPane.showMessageDialog(null, text.whenCorrect(randomNumber));
						countAnswer();
						setTxtQuestion("");
						txtUser.setText("");
						setTxtQuestion(text.question());
					}else {
						JOptionPane.showMessageDialog(null, text.whenWrong(randomNumber));
						countAnswer();
						setTxtQuestion("");
						txtUser.setText("");
						setTxtQuestion(text.question());
					}
				}
			}
		});
		btnAnswer.setBounds(100, 175, 239, 87);
		btnAnswer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int randomNumber = random.nextInt(5) + 1;
				
				if(text.answer() == getUserTxt()) {
					JOptionPane.showMessageDialog(null, text.whenCorrect(randomNumber));
					countAnswer();
					setTxtQuestion("");
					txtUser.setText("");
					setTxtQuestion(text.question());
				}else {
					JOptionPane.showMessageDialog(null, text.whenWrong(randomNumber));
					countAnswer();
					setTxtQuestion("");
					txtUser.setText("");
					setTxtQuestion(text.question());
				}
			}
		});
		
		framePrincipal.getContentPane().add(btnAnswer);
		
		countCorrectLabel = new JLabel("0");
		countCorrectLabel.setFont(new Font("Verdana", Font.BOLD, 18));
		countCorrectLabel.setForeground(new Color(0, 255, 0));
		countCorrectLabel.setBackground(new Color(0, 255, 0));
		countCorrectLabel.setHorizontalAlignment(SwingConstants.CENTER);
		countCorrectLabel.setBounds(0, 175, 102, 87);
		framePrincipal.getContentPane().add(countCorrectLabel);
		
		countWrongLabel= new JLabel("0");
		countWrongLabel.setForeground(new Color(255, 0, 0));
		countWrongLabel.setFont(new Font("Verdana", Font.BOLD, 18));
		countWrongLabel.setHorizontalAlignment(SwingConstants.CENTER);
		countWrongLabel.setBounds(334, 175, 102, 87);
		framePrincipal.getContentPane().add(countWrongLabel);
	}
	
	public void setUserTxt() {
		this.txtUser.setText(String.valueOf(text.answer()));
	}
	
	public int getUserTxt() {
		int answer = Integer.parseInt(this.txtUser.getText());
		return answer;
	}
	
	public void setTxtQuestion(String txt) {
		txtQuestion.setText(txt);
	}
	
	public String getTxtQuestion() {
		return txtQuestion.getText();
	}
	
	public void setCountCorrect(String txt) {
		this.countCorrectLabel.setText(txt);
	}
	
	public void setCountWrong(String txt) {
		this.countWrongLabel.setText(txt);
	}
	
	public int getCountCorrrect() {
		int count =Integer.parseInt(this.countCorrectLabel.getText());
		return count;
	}
	
	public void countAnswer() {
		if(text.answer() == getUserTxt()) {
			countCorrect++;
			setCountCorrect(String.valueOf(countCorrect));
		}else {
			countWrong++;
			setCountWrong(String.valueOf(countWrong));
		}
	}
}
