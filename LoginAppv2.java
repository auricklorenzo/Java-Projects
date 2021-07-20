package javaPractice;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginAppv2 implements ActionListener {
	private static JLabel userLabel, passLabel, output, Title;
	private static JButton enterButton;
	private static JTextField userField;
	private static JPasswordField passField;
	private static Color Forecolor;

	public static void main(String[] args) {
		Font font = new Font("Bahnschrift" , Font.BOLD, 23);

		Color backcolor = new Color(212, 224, 155);
		Forecolor= new Color(56, 56, 56);
		Color buttoncolor = new Color(241, 156, 121);
		Color fieldcolor = new Color(246, 244, 210);

		ImageIcon icon = new ImageIcon("lock_32px.png");
		
		JFrame frame = new JFrame();
		frame.setSize(450, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Login");
		frame.setResizable(false);
		frame.setLocation(500, 225);
		frame.setIconImage(icon.getImage());
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(backcolor);
		frame.add(panel);

		Title = new JLabel("Login!");
		Title.setBounds(20, 5, 200, 80);
		Title.setFont(new Font("Bahnschrift", Font.BOLD, 40));
		panel.add(Title);
		
		userLabel = new JLabel("Username:");
		userLabel.setBounds(20, 80, 130, 40);
		userLabel.setForeground(Forecolor);
		userLabel.setFont(font);
		panel.add(userLabel);
		
		userField = new JTextField();
		userField.setBounds(160, 80, 220, 35);
		userField.setBackground(fieldcolor);
		userField.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
		userField.setForeground(Forecolor);
		panel.add(userField);
		
		passLabel = new JLabel("Password:");
		passLabel.setBounds(20, 140, 130, 40);
		passLabel.setForeground(Forecolor);
		passLabel.setFont(font);
		panel.add(passLabel);
		
		passField = new JPasswordField();
		passField.setBounds(160, 140, 220, 35);
		passField.setBackground(fieldcolor);
		panel.add(passField);
		
		enterButton = new JButton("Submit");
		enterButton.setBounds(20, 190, 110, 50);
		enterButton.setFocusable(false);
		enterButton.setBackground(buttoncolor);
		enterButton.setForeground(Forecolor);
		enterButton.setBorderPainted(false);
		enterButton.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		enterButton.addActionListener(new LoginAppv2());
		panel.add(enterButton);
		
		output = new JLabel("");
		output.setBounds(20, 250, 350, 45);
		output.setFont(new Font("Bahnschrift", Font.BOLD, 20));
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
        	output.setForeground(new Color(56, 56, 56));
        	output.setText("Access Granted, Welcome " + user);
        }else {
        	output.setForeground(Color.RED);
        	output.setText("Error, Invalid input!");
        }
	}	

}

