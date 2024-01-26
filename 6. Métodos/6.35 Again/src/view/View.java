package view;
import java.awt.Color;
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

import answerandquestion.AnswerAndQuestion;

public class View {
	
	private JLabel txtQuestion;
	public JFrame framePrincipal;
	private JTextField txtUser;
	private JButton btnAnswer;
	private AnswerAndQuestion text = new AnswerAndQuestion();
	private JLabel countCorrectLabel;
	private JLabel countWrongLabel;
	private SecureRandom random = new SecureRandom();
	private int countCorrect = 8;
	private int countWrong = 0;

	public View() {
		initialize();
	}

	private void initialize() {
		framePrincipal = new JFrame();
		framePrincipal.setAutoRequestFocus(false);
		framePrincipal.setTitle("LEARN WITH TECH");
		framePrincipal.setResizable(false);
		framePrincipal.setBounds(100, 100, 450, 300);
		framePrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		txtQuestion = new JLabel(text.question(countCorrect));
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
				
				if(countCorrect > 10) {
					btnAnswer.setText("Recomeçar");
					countCorrect = 0;
					countWrong = 0;
					countAnswer();
					setTxtQuestion("");
					txtUser.setText("");
					setTxtQuestion(text.question(countCorrect));
				}else{
					if(codigo == tecla) {
						if(text.answer() == getUserTxt()) {
							JOptionPane.showMessageDialog(null, text.whenCorrect(randomNumber));
							countAnswer();
							setTxtQuestion("");
							txtUser.setText("");
							setTxtQuestion(text.question(countCorrect));
						}else {
							JOptionPane.showMessageDialog(null, text.whenWrong(randomNumber));
							countAnswer();
							setTxtQuestion("");
							txtUser.setText("");
							setTxtQuestion(text.question(countCorrect));
						}
				}
			}
		}});
		btnAnswer.setBounds(100, 175, 239, 87);
		btnAnswer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int randomNumber = random.nextInt(5) + 1;
				
				if(countCorrect > 10) {
					btnAnswer.setText("Recomeçar");
					countCorrect = 0;
					countWrong = 0;
					countAnswer();
					setTxtQuestion("");
					txtUser.setText("");
					setTxtQuestion(text.question(countCorrect));
				}else {
					if(text.answer() == getUserTxt()) {
						JOptionPane.showMessageDialog(null, text.whenCorrect(randomNumber));
						countAnswer();
						setTxtQuestion("");
						txtUser.setText("");
						setTxtQuestion(text.question(countCorrect));
					}else {
						JOptionPane.showMessageDialog(null, text.whenWrong(randomNumber));
						countAnswer();
						setTxtQuestion("");
						txtUser.setText("");
						setTxtQuestion(text.question(countCorrect));
					}
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
	
	public void countAnswer() {
		if(text.answer() == getUserTxt()) {
			countCorrect++;
			setCountCorrect(String.valueOf(countCorrect));
		}else {
			countWrong++;
			setCountWrong(String.valueOf(countWrong));
		}
	}
	
	//private int controlLevel;
	public int getCountCorrect() {
		//controlLevel++;
		int count =Integer.parseInt(this.countCorrectLabel.getText());
		return count;
	}
	
}
