package Project7;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {

	private JFrame frame;
	private JTextField numF;
	private JTextField denoF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		numF = new JTextField();
		numF.setBounds(100, 52, 86, 20);
		frame.getContentPane().add(numF);
		numF.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Numerator");
		lblNewLabel.setBounds(10, 52, 80, 14);
		frame.getContentPane().add(lblNewLabel);
		
		denoF = new JTextField();
		denoF.setBounds(99, 98, 86, 20);
		frame.getContentPane().add(denoF);
		denoF.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Denominator");
		lblNewLabel_1.setBounds(10, 101, 90, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel result = new JLabel("Result: ");
		result.setBounds(113, 152, 81, 14);
		frame.getContentPane().add(result);
		
		JButton calc = new JButton("Calculate");

		calc.setBounds(214, 75, 89, 23);
		frame.getContentPane().add(calc);
		
		calc.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				double num = Double.parseDouble(numF.getText());
				double deno = Double.parseDouble(denoF.getText());
				double res;
				SimpleMath m = new SimpleMath();
				
				try {
					res = m.divide(num,deno);
					result.setText("Result: " + res);
				}
				catch(ArithmeticException e1) {
					result.setText("Cannot divide by 0");
				}
				
			}
		});
	}
}
