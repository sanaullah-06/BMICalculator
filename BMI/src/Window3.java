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
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class Window3 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private static double bmi ;
	private double hf ;
	private double hi ;
	private double w ;
	private double sum = 0 ;
	private String c ;
	private static String kg = "0" ;
	private static String feet = "0" ;
	private static String in = "0" ;
	private static int ch  ;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window3 window = new Window3();
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
	public Window3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 803);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		String s[] = new String[10];
		switch(ch)
		{
		case 0:
		String str[] = {"Meter","Kilometer","Centimter","Milimeter","Micrometer","Mile"} ;
		s = str;
		
		break;
		case 1:
		String str1[] = {"Celsius","Kelvin","Fahrenheit"} ;
		s = str1;
		break;
		case 2:
		String str2[] = {"Square Meter","Square Kilometer","Square Centimter","Square Milimeter","Square Micrometer"} ;
		s = str2;
		break;
		case 3:
		String str3[] = {"Cubic Meter","Cubic Kilometer","Cubic Centimter","Cubic Milimeter","Cubic Micrometer"} ;
		s = str3;
		break;
		case 4:
		String str4[] = {"KiloGram","Gram","miliGram","metric Ton","Long Ton"} ;
		s = str4 ;
		break;
		}
		
		
			
		JLabel lblBmiCalculator = new JLabel("BMI Calculator");
		lblBmiCalculator.setBounds(24, 334, 223, 52);
		lblBmiCalculator.setForeground(new Color(0, 0, 128));
		lblBmiCalculator.setFont(new Font("Arial", Font.BOLD, 30));
		frame.getContentPane().add(lblBmiCalculator);
		
		JButton btnUsUnits = new JButton("US Units");
		btnUsUnits.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Window.main();
			}
		});
		btnUsUnits.setBounds(24, 414, 119, 35);
		btnUsUnits.setBorder(null);
		btnUsUnits.setBackground(new Color(0, 51, 204));
		btnUsUnits.setForeground(new Color(255, 255, 255));
		btnUsUnits.setFont(new Font("Arial", Font.BOLD, 20));
		frame.getContentPane().add(btnUsUnits);
		
		JButton btnOtherUnits = new JButton("Other Units");
		btnOtherUnits.setBounds(288, 414, 119, 35);
		btnOtherUnits.setForeground(Color.WHITE);
		btnOtherUnits.setFont(new Font("Arial", Font.BOLD, 20));
		btnOtherUnits.setBorder(null);
		btnOtherUnits.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(btnOtherUnits);
		
		JButton btnMetricUnits = new JButton("Metric Units");
		btnMetricUnits.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Window2.main();
			}
		});
		btnMetricUnits.setBounds(153, 414, 125, 35);
		btnMetricUnits.setForeground(Color.WHITE);
		btnMetricUnits.setFont(new Font("Arial", Font.BOLD, 20));
		btnMetricUnits.setBorder(null);
		btnMetricUnits.setBackground(new Color(0, 51, 204));
		frame.getContentPane().add(btnMetricUnits);
		
		JLabel lblNewLabel = new JLabel("Age");
		lblNewLabel.setBounds(65, 487, 42, 29);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 22));
		frame.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(142, 473, 136, 43);
		textArea.setFont(new Font("Arial", Font.PLAIN, 22));
		frame.getContentPane().add(textArea);
		
		JLabel lblAges = new JLabel("ages: 2-120");
		lblAges.setBounds(283, 487, 125, 29);
		lblAges.setFont(new Font("Arial", Font.PLAIN, 22));
		frame.getContentPane().add(lblAges);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(51, 543, 92, 29);
		lblGender.setFont(new Font("Arial", Font.PLAIN, 22));
		frame.getContentPane().add(lblGender);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(153, 545, 92, 25);
		rdbtnMale.setFont(new Font("Arial", Font.PLAIN, 22));
		frame.getContentPane().add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(259, 545, 102, 25);
		rdbtnFemale.setFont(new Font("Arial", Font.PLAIN, 22));
		frame.getContentPane().add(rdbtnFemale);
		
		JLabel lblHeight = new JLabel("Height");
		lblHeight.setBounds(51, 600, 92, 29);
		lblHeight.setFont(new Font("Arial", Font.PLAIN, 22));
		frame.getContentPane().add(lblHeight);
		
		JLabel lblWeight = new JLabel("Weight");
		lblWeight.setBounds(51, 655, 92, 29);
		lblWeight.setFont(new Font("Arial", Font.PLAIN, 22));
		frame.getContentPane().add(lblWeight);
		
		JTextArea txtrInches = new JTextArea(in);
		txtrInches.setBounds(259, 599, 125, 32);
		//txtrInches.setText("inches");
		txtrInches.setFont(new Font("Arial", Font.PLAIN, 22));
		frame.getContentPane().add(txtrInches);
		
		JTextArea txtrCm = new JTextArea(feet);
		txtrCm.setBounds(144, 599, 105, 32);
		//txtrCm.setText("feet");
		txtrCm.setFont(new Font("Arial", Font.PLAIN, 22));
		frame.getContentPane().add(txtrCm);
		
		JTextArea txtrKg = new JTextArea(kg);
		txtrKg.setBounds(142, 649, 260, 35);
		//txtrKg.setText("pounds");
		txtrKg.setFont(new Font("Arial", Font.PLAIN, 22));
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
				Window3.main();
			}
		});
		btnCalculate.setBounds(178, 702, 167, 43);
		btnCalculate.setForeground(Color.WHITE);
		btnCalculate.setFont(new Font("Arial", Font.BOLD, 25));
		btnCalculate.setBorder(null);
		btnCalculate.setBackground(new Color(0, 153, 51));
		frame.getContentPane().add(btnCalculate);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Window3.main();
				
			}
		});
		btnClear.setBounds(354, 703, 92, 43);
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("Arial", Font.PLAIN, 20));
		btnClear.setBorder(null);
		btnClear.setBackground(UIManager.getColor("Button.shadow"));
		frame.getContentPane().add(btnClear);
		
	
		
		JLabel lblResults = new JLabel("Results");
		lblResults.setBounds(470, 403, 427, 51);
		lblResults.setOpaque(true);
		lblResults.setBorder(null);
		lblResults.setBackground(new Color(0, 153, 0));
		lblResults.setForeground(Color.WHITE);
		lblResults.setFont(new Font("Arial", Font.BOLD, 30));
		frame.getContentPane().add(lblResults);
		
		JLabel lblBmi = new JLabel("BMI = ?? kg/m^2");
		lblBmi.setBounds(485, 484, 167, 35);
		lblBmi.setFont(new Font("Arial", Font.BOLD, 20));
		frame.getContentPane().add(lblBmi);
		
		JLabel label = new JLabel("()");
		label.setBounds(680, 484, 196, 35);
		label.setFont(new Font("Arial", Font.BOLD, 20));
		//frame.getContentPane().add(label);
		
		JLabel lblNewLabel_1 = new JLabel("- Healthy BMI range: 18.5 kg/m2 - 25 kg/m2");
		lblNewLabel_1.setBounds(485, 547, 442, 43);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 20));
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblHealthyWeight_1 = new JLabel("- Healthy weight for the height: 68.4 lbs - 92.5 lbs");
		lblHealthyWeight_1.setBounds(485, 586, 442, 43);
		lblHealthyWeight_1.setFont(new Font("Arial", Font.PLAIN, 20));
		frame.getContentPane().add(lblHealthyWeight_1);
		
		JLabel lblLose = new JLabel("- Lose 7.5 lbs to reach a BMI of 25 kg/m2.");
		lblLose.setBounds(485, 641, 442, 43);
		lblLose.setFont(new Font("Arial", Font.PLAIN, 20));
		frame.getContentPane().add(lblLose);
		
		JLabel lblHealthyWeight = new JLabel("- Ponderal Index: 20.9 kg/m3");
		lblHealthyWeight.setBounds(485, 684, 442, 43);
		lblHealthyWeight.setFont(new Font("Arial", Font.PLAIN, 20));
		frame.getContentPane().add(lblHealthyWeight);
		
		JButton btnLength = new JButton("Length");
		btnLength.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ch = 0;
				frame.setVisible(false);
				Window3.main();
			}
		});
		btnLength.setBounds(24, 21, 97, 35);
		btnLength.setBorder(null);
		btnLength.setFont(new Font("Arial", Font.PLAIN, 20));
		if(ch == 0)
			btnLength.setBackground(Color.LIGHT_GRAY);
		else
			btnLength.setBackground(Color.BLACK);
		btnLength.setForeground(Color.WHITE);
		frame.getContentPane().add(btnLength);
		
		JButton btnTemperature = new JButton("Temperature");
		btnTemperature.setBounds(131, 21, 116, 35);
		btnTemperature.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnTemperature.setBackground(Color.LIGHT_GRAY);
				btnLength.setBackground(Color.BLACK);
				ch = 1 ;
				frame.setVisible(false);
				Window3.main();
			}
		});
		btnTemperature.setForeground(Color.WHITE);
		btnTemperature.setFont(new Font("Arial", Font.PLAIN, 20));
		btnTemperature.setBorder(null);
		if(ch == 1)
			btnTemperature.setBackground(Color.LIGHT_GRAY);
		else
			btnTemperature.setBackground(Color.BLACK);
		frame.getContentPane().add(btnTemperature);
		
		JButton btnArea = new JButton("Area");
		btnArea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnArea.setBackground(Color.LIGHT_GRAY);
				btnLength.setBackground(Color.BLACK);
				btnTemperature.setBackground(Color.black);
				ch = 2 ;
				frame.setVisible(false);
				Window3.main();
				
			}
		});
		btnArea.setBounds(259, 21, 97, 35);
		btnArea.setForeground(Color.WHITE);
		btnArea.setFont(new Font("Arial", Font.PLAIN, 20));
		btnArea.setBorder(null);
		if(ch == 2)
			btnArea.setBackground(Color.LIGHT_GRAY);
		else
			btnArea.setBackground(Color.BLACK);
		frame.getContentPane().add(btnArea);
		
		JButton btnVolume = new JButton("Volume");
		btnVolume.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnVolume.setBackground(Color.LIGHT_GRAY);
				btnLength.setBackground(Color.BLACK);
				btnTemperature.setBackground(Color.black);
				btnArea.setBackground(Color.black);
				ch = 3 ;
				frame.setVisible(false);
				Window3.main();
			}
		});
		btnVolume.setBounds(368, 21, 97, 35);
		btnVolume.setForeground(Color.WHITE);
		btnVolume.setFont(new Font("Arial", Font.PLAIN, 20));
		btnVolume.setBorder(null);
		if(ch == 3)
			btnVolume.setBackground(Color.LIGHT_GRAY);
		else
			btnVolume.setBackground(Color.BLACK);
		frame.getContentPane().add(btnVolume);
		
		JButton btnWeight = new JButton("Weight");
		btnWeight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnWeight.setBackground(Color.LIGHT_GRAY);
				btnLength.setBackground(Color.BLACK);
				btnTemperature.setBackground(Color.black);
				btnArea.setBackground(Color.black);
				btnVolume.setBackground(Color.BLACK);
				ch = 4 ;
				frame.setVisible(false);
				Window3.main();
			}
		});
		btnWeight.setBounds(470, 21, 97, 35);
		btnWeight.setForeground(Color.WHITE);
		btnWeight.setFont(new Font("Arial", Font.PLAIN, 20));
		btnWeight.setBorder(null);
		if(ch == 4)
			btnWeight.setBackground(Color.LIGHT_GRAY);
		else
			btnWeight.setBackground(Color.BLACK);
		frame.getContentPane().add(btnWeight);
		
		JLabel lblFrom = new JLabel("From:");
		lblFrom.setBounds(24, 89, 83, 35);
		lblFrom.setFont(new Font("Arial", Font.BOLD, 25));
		frame.getContentPane().add(lblFrom);
		
		JLabel lblTo = new JLabel("To:");
		lblTo.setBounds(319, 89, 83, 35);
		lblTo.setFont(new Font("Arial", Font.BOLD, 25));
		frame.getContentPane().add(lblTo);
		
		textField = new JTextField();
		textField.setBounds(25, 134, 220, 32);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		textField_1 = new JTextField();
		textField_1.setBounds(316, 134, 223, 32);
		textField_1.setColumns(10);
		frame.getContentPane().add(textField_1);
		
		JComboBox comboBox = new JComboBox(s);
		comboBox.setBounds(24, 189, 223, 25);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox(s);
		comboBox_1.setBounds(316, 191, 223, 25);
		frame.getContentPane().add(comboBox_1);
	}
}
