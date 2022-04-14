import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField result;
	private double answer, number;
	int operation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void addInput(String str) {
		result.setText(result.getText() + str);
	}
	
	public void calculate() {
		switch (operation) {
		case 1: {
			answer = number + Double.parseDouble(result.getText());
			result.setText(Double.toString(answer));
			break;
		}
		case 2: {
			answer = number - Double.parseDouble(result.getText());
			result.setText(Double.toString(answer));
			break;
		}
		case 3: {
			answer = number * Double.parseDouble(result.getText());
			result.setText(Double.toString(answer));
			break;
		}
		case 4: {
			answer = number / Double.parseDouble(result.getText());
			result.setText(Double.toString(answer));
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + operation);
		}
	}
	/**
	 * Create the frame.
	 */
	public Calculator() {
		setType(Type.UTILITY);
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel screen = new JPanel();
		screen.setBounds(10, 24, 566, 104);
		contentPane.add(screen);
		screen.setLayout(null);
		
		result = new JTextField();
		result.setBackground(Color.CYAN);
		result.setEditable(false);
		result.setFont(new Font("Arial Black", Font.PLAIN, 40));
		result.setHorizontalAlignment(SwingConstants.RIGHT);
		result.setBounds(10, 26, 546, 78);
		screen.add(result);
		result.setColumns(10);
		
		JLabel symbol = new JLabel("");
		symbol.setFont(new Font("Tahoma", Font.BOLD, 15));
		symbol.setHorizontalAlignment(SwingConstants.RIGHT);
		symbol.setBounds(10, 0, 546, 22);
		screen.add(symbol);
		
		JPanel keys = new JPanel();
		keys.setBounds(10, 153, 566, 488);
		contentPane.add(keys);
		keys.setLayout(new GridLayout(4, 4));
		
		
		JButton btnNewButton_1 = new JButton("7");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		keys.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("8");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 40));
		keys.add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("9");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 40));
		keys.add(btnNewButton_4);
		
		JButton btnNewButton_3 = new JButton("+");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(result.getText());
				operation = 1;
				result.setText("");
				symbol.setText(number + " " + e.getActionCommand());
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 40));
		keys.add(btnNewButton_3);
		
		JButton btnNewButton_6 = new JButton("4");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 40));
		keys.add(btnNewButton_6);
		
		JButton btnNewButton = new JButton("5");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 40));
		keys.add(btnNewButton);
		
		JButton btnNewButton_9 = new JButton("6");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 40));
		keys.add(btnNewButton_9);
		
		JButton btnNewButton_5 = new JButton("-");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(result.getText());
				operation = 2;
				result.setText("");
				symbol.setText(number + " " +  e.getActionCommand());
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 40));
		keys.add(btnNewButton_5);
		
		JButton btnNewButton_8 = new JButton("1");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 40));
		keys.add(btnNewButton_8);
		
		JButton btnNewButton_7 = new JButton("2");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 40));
		keys.add(btnNewButton_7);
		
		JButton btnNewButton_12 = new JButton("3");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 40));
		keys.add(btnNewButton_12);
		
		JButton btnNewButton_14 = new JButton("x");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(result.getText());
				operation = 3;
				result.setText("");
				symbol.setText(number + " " +  e.getActionCommand());
			}
		});
		btnNewButton_14.setFont(new Font("Tahoma", Font.BOLD, 40));
		keys.add(btnNewButton_14);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText("");
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 40));
		keys.add(btnC);
		
		JButton btnNewButton_13 = new JButton("0");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_13.setFont(new Font("Tahoma", Font.BOLD, 40));
		keys.add(btnNewButton_13);
		
		JButton btnX = new JButton("=");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
				symbol.setText("");
			}
		});
		btnX.setFont(new Font("Tahoma", Font.BOLD, 40));
		keys.add(btnX);
		
		JButton btnNewButton_15 = new JButton("%");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(result.getText());
				operation = 4;
				result.setText("");
				symbol.setText(number + " " +  e.getActionCommand());
			}
		});
		btnNewButton_15.setFont(new Font("Tahoma", Font.BOLD, 40));
		keys.add(btnNewButton_15);
	}
}
