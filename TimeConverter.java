package javaPractice;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JComboBox;


public class TimeConverter implements ActionListener{
	static JFrame frame;
	static JLabel Title, Label1, Label2, output1, output2, output3, name, result1, result2, result3;
	static JPanel panel, outputpanel1, outputpanel2, outputpanel3;
	static JComboBox<Object> combobox;
	static JTextField input; 
	static JButton enterButton;
	
	public static void main(String[] args) {
		Color fontcol = new Color(97, 61, 193);
		frame = new JFrame();
		panel = new JPanel();
		
		frame.setTitle("Time Converter");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(370, 560);
		frame.setLocation(500, 150);
		frame.setResizable(false);
		frame.setUndecorated(false);
		
		
		panel.setBackground(new Color(254, 250, 224));
		panel.setLayout(null);
		frame.add(panel);
		
		
		Title = new JLabel("Time Converter!");
		Title.setBounds(20, 5, 250, 40);
		Title.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
		Title.setForeground(fontcol);
		panel.add(Title);
		
		
		Label1 = new JLabel("Unit of Time:");
		Label1.setBounds(20, 50, 150, 50);
		Label1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		Label1.setForeground(fontcol);
		panel.add(Label1);
		
		Label2 = new JLabel("Value:");
		Label2.setBounds(20, 130, 150, 50);
		Label2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		Label2.setForeground(fontcol);
		panel.add(Label2);
		
		
		output1 = new JLabel("Hours     :");
		output1.setBounds(20, 200, 190, 50);
		output1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));	
		output1.setForeground(fontcol);
		panel.add(output1);
		
		output2 = new JLabel("Minutes  :");
		output2.setBounds(20, 260, 190, 50);
		output2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		output2.setForeground(fontcol);
		panel.add(output2);
		
		output3 = new JLabel("Seconds:");
		output3.setBounds(20, 320, 190, 50);
		output3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		output3.setForeground(fontcol);
		panel.add(output3);
		
		
		String dropdown[] = {"Days", "Hours", "Minutes", "Seconds"};
		combobox = new JComboBox<Object>(dropdown);
		combobox.setBounds(160, 55, 180, 40);
		combobox.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		combobox.setBackground(new Color(177, 255, 154));
		panel.add(combobox);
		
		
		input = new JTextField();
		input.setBounds(100, 135, 220, 40);
		input.setBackground(new Color(177, 255, 154));
		input.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		input.setForeground(fontcol);
		input.addKeyListener(new KeyAdapter() {
	         public void keyTyped(KeyEvent e) {
	           char c = e.getKeyChar();
	           if (!(Character.isDigit(c) ||
	              (c == KeyEvent.VK_BACK_SPACE) ||
	              (c == KeyEvent.VK_DELETE))) {
	                e.consume();
	              }
	         }
	       });
		panel.add(input);
		
		
		result1 = new JLabel("");
		result1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		result1.setBounds(125, 205, 205, 40);
		result1.setForeground(fontcol);
		panel.add(result1);
		
		result2 = new JLabel("");
		result2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		result2.setBounds(125, 265, 205, 40);
		result2.setForeground(fontcol);
		panel.add(result2);
		
		result3 = new JLabel("");
		result3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		result3.setBounds(125, 320, 205, 40);
		result3.setForeground(fontcol);
		panel.add(result3);
		
		outputpanel1 = new JPanel();
		outputpanel1.setBounds(120, 205, 200, 40);
		outputpanel1.setBackground(new Color(177, 255, 154));
		panel.add(outputpanel1);
		
		outputpanel2 = new JPanel();
		outputpanel2.setBounds(120, 265, 200, 40);
		outputpanel2.setBackground(new Color(177, 255, 154));
		panel.add(outputpanel2);
		
		outputpanel3 = new JPanel();
		outputpanel3.setBounds(120, 325, 200, 40);
		outputpanel3.setBackground(new Color(177, 255, 154));
		panel.add(outputpanel3);
		
		
		enterButton = new JButton("Convert");
		enterButton.setBounds(105, 400, 140, 50);
		enterButton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		enterButton.setBackground(new Color(237, 242, 78));
		enterButton.setFocusable(false);
		enterButton.setForeground(fontcol);
		enterButton.addActionListener(new TimeConverter());
		panel.add(enterButton);
		
		
		name = new JLabel("@loniantech");
		name.setBounds(125, 490, 100, 40);
		name.setForeground(new Color(89, 210, 254));
		name.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		panel.add(name);
		
		
		
		
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String unit = String.valueOf(combobox.getSelectedItem());
		int value =  Integer.parseInt(input.getText());
		
		if(unit.equalsIgnoreCase("Days"))  {
			output1.setText("Hours     :");
    		output2.setText("Minutes  :");
    		output3.setText("Seconds:");
    		result1.setText(String.valueOf(24 * value));
    		result2.setText(String.valueOf((value * 24)*60));
    		result3.setText(String.valueOf(((value * 24)*60)*60));
    	}else if(unit.equalsIgnoreCase("Hours")){
    		output1.setText("Days       :");
    		output2.setText("Minutes  :");
    		output3.setText("Seconds:");
    		result1.setText(String.valueOf((value /24)));
    		result2.setText(String.valueOf((value *60)));
    		result3.setText(String.valueOf((value *60)*60));
    	}else if(unit.equalsIgnoreCase("Minutes")) {
    		output1.setText("Days       :");
    		output2.setText("Hours     :");
    		output3.setText("Seconds:");
    		result1.setText(String.valueOf((value /60)/60));
    		result2.setText(String.valueOf((value /60)));
    		result3.setText(String.valueOf((value *60)));
    	}else if(unit.equalsIgnoreCase("Seconds")) {
    		output1.setText("Days       :");
    		output2.setText("Hours     :");
    		output3.setText("Minutes  :");
    		result1.setText(String.valueOf(((value /60)/60)/24));
    		result2.setText(String.valueOf((value /60)/60));
    		result3.setText(String.valueOf((value /60)));
    	}
	}

}
