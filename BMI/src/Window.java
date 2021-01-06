import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Window {

	private JFrame frame;
	private static double bmi ;
	private double hf ;
	private double hi ;
	private double w ;
	private double sum = 0 ;
	private String c ;
	private static String kg = "0" ;
	private static String feet = "0" ;
	private static String in = "0" ;
	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
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
	public Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblBmiCalculator = new JLabel("BMI Calculator");
		lblBmiCalculator.setForeground(new Color(0, 0, 128));
		lblBmiCalculator.setFont(new Font("Arial", Font.BOLD, 30));
		lblBmiCalculator.setBounds(24, 23, 223, 52);
		frame.getContentPane().add(lblBmiCalculator);
		
		JButton btnUsUnits = new JButton("US Units");
		
		btnUsUnits.setBorder(null);
		btnUsUnits.setBackground(Color.LIGHT_GRAY);
		btnUsUnits.setForeground(new Color(255, 255, 255));
		btnUsUnits.setFont(new Font("Arial", Font.BOLD, 20));
		btnUsUnits.setBounds(24, 100, 119, 35);
		frame.getContentPane().add(btnUsUnits);
		
		JButton btnOtherUnits = new JButton("Other Units");
		btnOtherUnits.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Window3.main();
			}
		});
		btnOtherUnits.setForeground(Color.WHITE);
		btnOtherUnits.setFont(new Font("Arial", Font.BOLD, 20));
		btnOtherUnits.setBorder(null);
		btnOtherUnits.setBackground(new Color(0, 0, 139));
		btnOtherUnits.setBounds(283, 100, 119, 35);
		frame.getContentPane().add(btnOtherUnits);
		
		JButton btnMetricUnits = new JButton("Metric Units");
		btnMetricUnits.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Window2.main();
			}
		});
		btnMetricUnits.setForeground(Color.WHITE);
		btnMetricUnits.setFont(new Font("Arial", Font.BOLD, 20));
		btnMetricUnits.setBorder(null);
		btnMetricUnits.setBackground(new Color(0, 0, 139));
		btnMetricUnits.setBounds(153, 100, 125, 35);
		frame.getContentPane().add(btnMetricUnits);
		
		JLabel lblNewLabel = new JLabel("Age");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 22));
		lblNewLabel.setBounds(51, 179, 42, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Arial", Font.PLAIN, 22));
		textArea.setBounds(142, 171, 136, 43);
		frame.getContentPane().add(textArea);
		
		JLabel lblAges = new JLabel("ages: 2-120");
		lblAges.setFont(new Font("Arial", Font.PLAIN, 22));
		lblAges.setBounds(288, 179, 125, 29);
		frame.getContentPane().add(lblAges);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Arial", Font.PLAIN, 22));
		lblGender.setBounds(51, 273, 92, 29);
		frame.getContentPane().add(lblGender);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setFont(new Font("Arial", Font.PLAIN, 22));
		rdbtnMale.setBounds(153, 273, 92, 25);
		frame.getContentPane().add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setFont(new Font("Arial", Font.PLAIN, 22));
		rdbtnFemale.setBounds(271, 273, 102, 25);
		frame.getContentPane().add(rdbtnFemale);
		
		JLabel lblHeight = new JLabel("Height");
		lblHeight.setFont(new Font("Arial", Font.PLAIN, 22));
		lblHeight.setBounds(51, 342, 92, 29);
		frame.getContentPane().add(lblHeight);
		
		JLabel lblWeight = new JLabel("Weight");
		lblWeight.setFont(new Font("Arial", Font.PLAIN, 22));
		lblWeight.setBounds(51, 423, 92, 29);
		frame.getContentPane().add(lblWeight);
		JTextArea txtrInches = new JTextArea(in);
		
		txtrInches.setFont(new Font("Arial", Font.PLAIN, 22));
		txtrInches.setBounds(257, 341, 125, 32);
		frame.getContentPane().add(txtrInches);
		
		
		JTextArea txtrCm = new JTextArea(feet);
		
		txtrCm.setFont(new Font("Arial", Font.PLAIN, 22));
		txtrCm.setBounds(142, 341, 105, 32);
	
		frame.getContentPane().add(txtrCm);
		
		JTextArea txtrKg = new JTextArea(kg);
		
		txtrKg.setFont(new Font("Arial", Font.PLAIN, 22));
		txtrKg.setBounds(142, 417, 260, 35);
		
		frame.getContentPane().add(txtrKg);
		
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				w = Double.parseDouble(txtrKg.getText());
				
				hf = Double.parseDouble(txtrCm.getText());
				hi = Double.parseDouble(txtrInches.getText());
				hf = (hf * 12) + hi ;
				System.out.println(hf+" " +hi+" " + w);
				
				sum = (703 * (w/(hf*hf)));
				bmi =(double) (Math.floor(sum*100)/100) ;
				frame.setVisible(false);
				Window.main();
			}
		});
		btnCalculate.setForeground(Color.WHITE);
		btnCalculate.setFont(new Font("Arial", Font.BOLD, 25));
		btnCalculate.setBorder(null);
		btnCalculate.setBackground(new Color(0, 153, 51));
		btnCalculate.setBounds(180, 489, 167, 43);
		frame.getContentPane().add(btnCalculate);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Window.main();
			}
		});
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("Arial", Font.PLAIN, 20));
		btnClear.setBorder(null);
		btnClear.setBackground(UIManager.getColor("Button.shadow"));
		btnClear.setBounds(351, 489, 92, 43);
		frame.getContentPane().add(btnClear);
		
	
		
		JLabel lblResults = new JLabel("Results");
		lblResults.setOpaque(true);
		lblResults.setBorder(null);
		lblResults.setBackground(new Color(0, 153, 0));
		lblResults.setForeground(Color.WHITE);
		lblResults.setFont(new Font("Arial", Font.BOLD, 30));
		lblResults.setBounds(502, 84, 427, 51);
		frame.getContentPane().add(lblResults);
		
		JLabel lblBmi = new JLabel("BMI = "+ bmi +" kg/m^2");
		lblBmi.setFont(new Font("Arial", Font.BOLD, 20));
		lblBmi.setBounds(502, 161, 196, 35);
		frame.getContentPane().add(lblBmi);
		
		JLabel label = new JLabel("()");
		label.setFont(new Font("Arial", Font.BOLD, 20));
		label.setBounds(733, 161, 196, 35);
		//sframe.getContentPane().add(label);
		
		JLabel lblNewLabel_1 = new JLabel("- Healthy BMI range: 18.5 kg/m2 - 25 kg/m2");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(502, 219, 442, 43);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblHealthyWeight_1 = new JLabel("- Healthy weight for the height: 68.4 lbs - 92.5 lbs");
		lblHealthyWeight_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblHealthyWeight_1.setBounds(502, 284, 442, 43);
		frame.getContentPane().add(lblHealthyWeight_1);
		
		JLabel lblLose = new JLabel("- Lose 7.5 lbs to reach a BMI of 25 kg/m2.");
		lblLose.setFont(new Font("Arial", Font.PLAIN, 20));
		lblLose.setBounds(502, 342, 442, 43);
		frame.getContentPane().add(lblLose);
		
		JLabel lblHealthyWeight = new JLabel("- Ponderal Index: 20.9 kg/m3");
		lblHealthyWeight.setFont(new Font("Arial", Font.PLAIN, 20));
		lblHealthyWeight.setBounds(502, 395, 442, 43);
		frame.getContentPane().add(lblHealthyWeight);
	}
}
