package javaPractice;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginApp implements ActionListener {
	private static JLabel userLabel, passLabel, output;
	private static JButton enterButton;
	private static JTextField userField;
	private static JPasswordField passField;
	
	public static void main(String[] args) {
		Font font = new Font("SansSerif", Font.BOLD, 16);
		JFrame frame = new JFrame();
		frame.setSize(350, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Login");
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		frame.add(panel);
		
		userLabel = new JLabel("Username");
		userLabel.setBounds(10, 20, 85, 25);
		panel.add(userLabel);
		
		userField = new JTextField();
		userField.setBounds(100, 20, 150, 25);
		panel.add(userField);
		
		passLabel = new JLabel("Password");
		passLabel.setBounds(10, 70, 85, 25);
		panel.add(passLabel);
		
		passField = new JPasswordField();
		passField.setBounds(100, 70, 150, 25);
		panel.add(passField);
		
		enterButton = new JButton("Enter");
		enterButton.setBounds(10, 110, 90, 40);
		enterButton.setFocusable(false);
		enterButton.setBackground(Color.GREEN);
		enterButton.addActionListener(new LoginApp());
		panel.add(enterButton);
		
		output = new JLabel("");
		output.setBounds(10, 170, 300, 25);
		output.setFont(font);
		panel.add(output);
		
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String user = userField.getText();
		String pass = passField.getText();
		
		String[] username = {"Inzhagi", "POGI", "Vincenzo", "Zinu", "Joma"};
        String[] password = {"IBONN", "AKO", "Mafia", "Emma", "Tech"};
        
        boolean userInput = false;

        for (String x:username) {
            if (x.equals(user)){
                userInput = true;
                break;
            }else userInput = false;
        }
        
        boolean passinput = false;
        
        for (String y:password) {
            if(y.equals(pass)){
                passinput = true;
                break;
            }else passinput = false;
        }

        if(userInput && passinput) {
        	output.setForeground(Color.GREEN);
        	output.setText("Access Granted, Welcome " + user);
        }else {
        	output.setForeground(Color.RED);
        	output.setText("Error, Invalid input!");
        }
	}	

}

