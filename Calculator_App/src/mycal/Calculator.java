package mycal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Component;

public class Calculator {

	private JFrame frame;
	private JTextField txtDisplay;

	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;
	
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 51));
		frame.getContentPane().setForeground(new Color(0, 0, 102));
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.setBounds(100, 100, 1034, 626);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		 // Create and initialize the txtDisplay JTextField
	    txtDisplay = new JTextField();
	    txtDisplay.setBackground(Color.LIGHT_GRAY);
	    txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
	    txtDisplay.setFont(new Font("Tahoma", Font.PLAIN, 29));
	    txtDisplay.setBounds(59, 69, 401, 54);
	    frame.getContentPane().add(txtDisplay);

	    //
		
		/*btnCE*/
		JButton btnCE = new JButton("CE\r\n");
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if(txtDisplay.getText().length()>0) {
					
					StringBuilder strB= new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length()-1);
					backSpace =strB.toString();
					txtDisplay.setText(backSpace);
					
					
				}
				
			}
		});
		btnCE.setForeground(new Color(255, 153, 0));
		btnCE.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnCE.setBackground(Color.WHITE);
		btnCE.setBounds(59, 152, 69, 33);
		frame.getContentPane().add(btnCE);
		
		
		/*btn8*/
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn8.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btn8.setBackground(Color.WHITE);
		btn8.setBounds(168, 209, 69, 33);
		frame.getContentPane().add(btn8);
		
		
		/*btn4*/
		JButton btn4 = new JButton("4\r\n");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn4.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btn4.setBackground(Color.WHITE);
		btn4.setBounds(59, 271, 69, 33);
		frame.getContentPane().add(btn4);
		
		
		/*btn7*/
		JButton btn7 = new JButton("7\r\n");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn7.getText();
				txtDisplay.setText(EnterNumber);
				
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btn7.setBackground(Color.WHITE);
		btn7.setBounds(59, 209, 69, 33);
		frame.getContentPane().add(btn7);
		
		
		/**btnC**/
		
		JButton btnC = new JButton("C\r\n");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText("");
			}
		});
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnC.setBackground(Color.WHITE);
		btnC.setBounds(168, 152, 69, 33);
		frame.getContentPane().add(btnC);
		
		
		/*btn5*/
		JButton btn5 = new JButton("5\r\n");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn5.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btn5.setBackground(Color.WHITE);
		btn5.setBounds(168, 271, 69, 33);
		frame.getContentPane().add(btn5);
		
		
		/*btn6*/
		JButton btn6 = new JButton("6\r\n");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn6.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btn6.setBackground(Color.WHITE);
		btn6.setBounds(275, 271, 69, 33);
		frame.getContentPane().add(btn6);
		
		
		/*btn9*/
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn9.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btn9.setBackground(Color.WHITE);
		btn9.setBounds(275, 209, 69, 33);
		frame.getContentPane().add(btn9);
		
		
		/**/
		JButton btnNewButton_8 = new JButton("\r\n*");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum= Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "*";
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 29));
		btnNewButton_8.setBackground(Color.WHITE);
		btnNewButton_8.setBounds(275, 152, 69, 33);
		frame.getContentPane().add(btnNewButton_8);
		
		
		/*btn1*/
		JButton btn1 = new JButton("1\r\n");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn1.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btn1.setBackground(Color.WHITE);
		btn1.setBounds(59, 330, 69, 33);
		frame.getContentPane().add(btn1);
		
		
		/*btn2*/
		JButton btn2 = new JButton("2\r\n");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn2.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btn2.setBackground(Color.WHITE);
		btn2.setBounds(168, 330, 69, 33);
		frame.getContentPane().add(btn2);
		
		
		/*btn3*/
		JButton btn3 = new JButton("3\r\n");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn3.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btn3.setBackground(Color.WHITE);
		btn3.setBounds(275, 330, 69, 33);
		frame.getContentPane().add(btn3);
		
		
		/*btnAddM*/
		JButton btnAddM = new JButton(" +/-");
		btnAddM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops= Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops =ops *(-1);
				txtDisplay.setText(String.valueOf(ops));
				operations = "+";
				
			}
		});
		btnAddM.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnAddM.setBackground(Color.WHITE);
		btnAddM.setBounds(59, 391, 69, 33);
		frame.getContentPane().add(btnAddM);
		
		
		/*btn0*/
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn0.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btn0.setBackground(Color.WHITE);
		btn0.setBounds(168, 391, 69, 33);
		frame.getContentPane().add(btn0);
		
		
		/*btnPoint*/
		JButton btnPoint = new JButton(".");
		btnPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum= Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = ".";
				
			}
		});
		btnPoint.setFont(new Font("Tahoma", Font.BOLD, 29));
		btnPoint.setBackground(Color.WHITE);
		btnPoint.setBounds(275, 391, 69, 33);
		frame.getContentPane().add(btnPoint);
		
		
		/**/
		JButton btnResult = new JButton("=\r\n");
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondnum=Double.parseDouble(txtDisplay.getText());
				if(operations == "+")
				{
					result = firstnum + secondnum;
					answer = String.format("%.2f",result);
					txtDisplay.setText(answer);
				}
				else if(operations == "-")
				{
					result = firstnum - secondnum;
					answer = String.format("%.2f",result);
					txtDisplay.setText(answer);
				}
				else if(operations == "*")
				{
					result = firstnum * secondnum;
					answer = String.format("%.2f",result);
					txtDisplay.setText(answer);
				}
				else if(operations == "/")
				{
					result = firstnum / secondnum;
					answer = String.format("%.2f",result);
					txtDisplay.setText(answer);
				}
				else if(operations == "%")
				{
					result = firstnum % secondnum;
					answer = String.format("%.2f",result);
					txtDisplay.setText(answer);
				}
			}
		});
		btnResult.setFont(new Font("Tahoma", Font.BOLD, 29));
		btnResult.setBackground(Color.WHITE);
		btnResult.setBounds(376, 391, 84, 33);
		frame.getContentPane().add(btnResult);
		
		
		/*btnAdd*/
		JButton btnAdd = new JButton("+\r\n");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum= Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "+";
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 29));
		btnAdd.setBackground(Color.WHITE);
		btnAdd.setBounds(376, 330, 84, 33);
		frame.getContentPane().add(btnAdd);
		
		
		/*btnMinus*/
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum= Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "-";
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 29));
		btnMinus.setBackground(Color.WHITE);
		btnMinus.setBounds(376, 271, 84, 33);
		frame.getContentPane().add(btnMinus);
		
		
		/**/
		JButton btnNewButton_15_3 = new JButton("%");
		btnNewButton_15_3.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        /**try {**/
		            firstnum = Double.parseDouble(txtDisplay.getText());
		            txtDisplay.setText("");
		            operations = "%";
		        /**} catch (NumberFormatException ex) {
		            // Gérer l'erreur de conversion en double
		            txtDisplay.setText("Erreur de saisie");
		        }**/
		    }
		});
		btnNewButton_15_3.setFont(new Font("Tahoma", Font.BOLD, 29));
		btnNewButton_15_3.setBackground(Color.WHITE);
		btnNewButton_15_3.setBounds(376, 209, 84, 33);
		frame.getContentPane().add(btnNewButton_15_3);
		
		
		/*btnDiv*/
		JButton btnDiv= new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum= Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 29));
		btnDiv.setBackground(Color.WHITE);
		btnDiv.setBounds(376, 152, 84, 33);
		frame.getContentPane().add(btnDiv);
	}
}
