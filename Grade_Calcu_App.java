package javaPractice;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Grade_Calcu_App implements ActionListener{
	static JFrame frame;
	static JLabel Title, Title2, Fil, Math, Eng, Tle, Esp, Sci, Mapeh, Ap, name, averages, honor, averageL, honorL;
	static JButton button;
	static JPanel panel;
	static JTextField Fpanel, Mpanel, Epanel, Tpanel, Espanel, Spanel, Mapanel, Apanel;
	public static void main(String[] args) {
		Font font = new Font("Times New Roman", Font.PLAIN, 28);
		Color fore = new Color(255, 243, 176);
		Color back = new Color(158, 42, 43);
		
		ImageIcon icon = new ImageIcon("grade_30px.png");
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setTitle("Grade Calculator");
		frame.setSize(800, 450);
		frame.setIconImage(icon.getImage());
		frame.setLocation(300, 150);
		
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(84, 11, 14));
		frame.add(panel);
		
		Title = new JLabel("Grade");
		Title.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		Title.setForeground(fore);
		Title.setBounds(335, 10, 100, 40);
		panel.add(Title);
		
		Title2 = new JLabel("Calculator");
		Title2.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		Title2.setBounds(300, 50, 180, 40);
		Title2.setForeground(fore);
		panel.add(Title2);
		
		Fil = new JLabel("Filipino  :");
		Fil.setFont(font);
		Fil.setBounds(50, 120, 150, 40);
		Fil.setForeground(fore);
		panel.add(Fil);
		
		Math = new JLabel("Math      :");
		Math.setFont(font);
		Math.setBounds(50, 170, 150, 40);
		Math.setForeground(fore);
		panel.add(Math);
		
		Ap = new JLabel("A.P.       :");
		Ap.setFont(font);
		Ap.setBounds(50, 220, 150, 40);
		Ap.setForeground(fore);
		panel.add(Ap);
		
		Esp = new JLabel("E.S.P.    :");
		Esp.setFont(font);
		Esp.setBounds(50, 270, 150, 40);
		Esp.setForeground(fore);
		panel.add(Esp);
		
		
		Eng = new JLabel("English   :");
		Eng.setFont(font);
		Eng.setBounds(420, 120, 150, 40);
		Eng.setForeground(fore);
		panel.add(Eng);
		
		
		Sci = new JLabel("Science   :");
		Sci.setFont(font);
		Sci.setBounds(420, 170, 150, 40);
		Sci.setForeground(fore);
		panel.add(Sci);
		
		Tle = new JLabel("T.L.E.     :");
		Tle.setFont(font);
		Tle.setBounds(420, 220, 150, 40);
		Tle.setForeground(fore);
		panel.add(Tle);
		
		Mapeh = new JLabel("M.A.P.E.H:");
		Mapeh.setFont(font);
		Mapeh.setBounds(420, 270, 150, 40);
		Mapeh.setForeground(fore);
		panel.add(Mapeh);
		
		Fpanel = new JTextField();
		Fpanel.setBounds(190, 123, 160, 35);
		Fpanel.setBackground(back);
		Fpanel.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		Fpanel.setFont(font);
		Fpanel.setForeground(fore);
		Fpanel.setHorizontalAlignment(JTextField.CENTER);
		Fpanel.addKeyListener(new KeyAdapter() {
	         public void keyTyped(KeyEvent e) {
		           char c = e.getKeyChar();
		           if (!(Character.isDigit(c) ||
		              (c == KeyEvent.VK_BACK_SPACE) ||
		              (c == KeyEvent.VK_DELETE))) {
		                e.consume();
		              }
		         }
		       });
		panel.add(Fpanel);
		
		Mpanel = new JTextField();
		Mpanel.setBounds(190, 173, 160, 35);
		Mpanel.setBackground(back);
		Mpanel.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		Mpanel.setFont(font);
		Mpanel.setForeground(fore);
		Mpanel.setHorizontalAlignment(JTextField.CENTER);
		Mpanel.addKeyListener(new KeyAdapter() {
	         public void keyTyped(KeyEvent e) {
		           char c = e.getKeyChar();
		           if (!(Character.isDigit(c) ||
		              (c == KeyEvent.VK_BACK_SPACE) ||
		              (c == KeyEvent.VK_DELETE))) {
		                e.consume();
		              }
		         }
		       });
		panel.add(Mpanel);
		
		Apanel = new JTextField();
		Apanel.setBounds(190, 223, 160, 35);
		Apanel.setBackground(back);
		Apanel.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		Apanel.setFont(font);
		Apanel.setForeground(fore);
		Apanel.setHorizontalAlignment(JTextField.CENTER);
		Apanel.addKeyListener(new KeyAdapter() {
	         public void keyTyped(KeyEvent e) {
		           char c = e.getKeyChar();
		           if (!(Character.isDigit(c) ||
		              (c == KeyEvent.VK_BACK_SPACE) ||
		              (c == KeyEvent.VK_DELETE))) {
		                e.consume();
		              }
		         }
		       });
		panel.add(Apanel);
		
		Espanel = new JTextField();
		Espanel.setBounds(190, 273, 160, 35);
		Espanel.setBackground(back);
		Espanel.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		Espanel.setFont(font);
		Espanel.setForeground(fore);
		Espanel.setHorizontalAlignment(JTextField.CENTER);
		Espanel.addKeyListener(new KeyAdapter() {
	         public void keyTyped(KeyEvent e) {
		           char c = e.getKeyChar();
		           if (!(Character.isDigit(c) ||
		              (c == KeyEvent.VK_BACK_SPACE) ||
		              (c == KeyEvent.VK_DELETE))) {
		                e.consume();
		              }
		         }
		       });
		panel.add(Espanel);
		
		Epanel = new JTextField();
		Epanel.setBounds(560, 123, 160, 35);
		Epanel.setBackground(back);
		Epanel.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		Epanel.setFont(font);
		Epanel.setForeground(fore);
		Epanel.setHorizontalAlignment(JTextField.CENTER);
		Epanel.addKeyListener(new KeyAdapter() {
	         public void keyTyped(KeyEvent e) {
		           char c = e.getKeyChar();
		           if (!(Character.isDigit(c) ||
		              (c == KeyEvent.VK_BACK_SPACE) ||
		              (c == KeyEvent.VK_DELETE))) {
		                e.consume();
		              }
		         }
		       });
		panel.add(Epanel);
		
		Spanel = new JTextField();
		Spanel.setBounds(560, 173, 160, 35);
		Spanel.setBackground(back);
		Spanel.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		Spanel.setFont(font);
		Spanel.setForeground(fore);
		Spanel.setHorizontalAlignment(JTextField.CENTER);
		Spanel.addKeyListener(new KeyAdapter() {
	         public void keyTyped(KeyEvent e) {
		           char c = e.getKeyChar();
		           if (!(Character.isDigit(c) ||
		              (c == KeyEvent.VK_BACK_SPACE) ||
		              (c == KeyEvent.VK_DELETE))) {
		                e.consume();
		              }
		         }
		       });
		panel.add(Spanel);
		
		Tpanel = new JTextField();
		Tpanel.setBounds(560, 223, 160, 35);
		Tpanel.setBackground(back);
		Tpanel.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		Tpanel.setFont(font);
		Tpanel.setForeground(fore);
		Tpanel.setHorizontalAlignment(JTextField.CENTER);
		Tpanel.addKeyListener(new KeyAdapter() {
	         public void keyTyped(KeyEvent e) {
		           char c = e.getKeyChar();
		           if (!(Character.isDigit(c) ||
		              (c == KeyEvent.VK_BACK_SPACE) ||
		              (c == KeyEvent.VK_DELETE))) {
		                e.consume();
		              }
		         }
		       });
		panel.add(Tpanel);
		
		Mapanel = new JTextField();
		Mapanel.setBounds(560, 273, 160, 35);
		Mapanel.setBackground(back);
		Mapanel.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		Mapanel.setFont(font);
		Mapanel.setForeground(fore);
		Mapanel.setHorizontalAlignment(JTextField.CENTER);
		Mapanel.addKeyListener(new KeyAdapter() {
	         public void keyTyped(KeyEvent e) {
		           char c = e.getKeyChar();
		           if (!(Character.isDigit(c) ||
		              (c == KeyEvent.VK_BACK_SPACE) ||
		              (c == KeyEvent.VK_DELETE))) {
		                e.consume();
		              }
		         }
		       });
		panel.add(Mapanel);
		
		
		button = new JButton("Calculate");
		button.setBounds(310, 330, 150, 55);
		button.setBackground(new Color(51, 92, 103));
		button.setForeground(new Color(224, 159, 62));
		button.setFont(font);
		button.setFocusable(false);
		button.addActionListener(new Grade_Calcu_App());
		panel.add(button);
		
		name = new JLabel("@loniantech");
		name.setBounds(720, 370, 100, 40);
		name.setForeground(back);
		name.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		panel.add(name);
		
		averageL = new JLabel("Average: ");
		averageL.setBounds(275, 310, 150, 40);
		averageL.setFont(font);
		averageL.setForeground(new Color(224, 159, 62));
		averageL.setVisible(false);
		panel.add(averageL);
		
		
		honorL = new JLabel("Honor   : ");
		honorL.setBounds(275, 345, 150, 40);
		honorL.setFont(font);
		honorL.setForeground(new Color(224, 159, 62));
		honorL.setVisible(false);
		panel.add(honorL);
		
		averages = new JLabel("");
        averages.setBounds(380, 310, 150, 40);
        averages.setFont(new Font("Times New Roman", Font.PLAIN, 28));
        averages.setForeground(new Color(224, 159, 62));
        panel.add(averages);
        
        honor = new JLabel("");
        honor.setBounds(385, 345, 150, 40);
        honor.setFont(new Font("Times New Roman", Font.PLAIN, 28));
        honor.setForeground(new Color(224, 159, 62));
        panel.add(honor);
        
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int fil, math, esp, eng, sci, tle, ap, mapeh;
		
		fil = Integer.parseInt(Fpanel.getText());
		math = Integer.parseInt(Mpanel.getText());
		esp = Integer.parseInt(Espanel.getText());
		eng = Integer.parseInt(Epanel.getText());
		sci = Integer.parseInt(Spanel.getText());
		tle = Integer.parseInt(Tpanel.getText());
		ap = Integer.parseInt(Apanel.getText());
		mapeh = Integer.parseInt(Mapanel.getText());
		
		
		int average = fil + eng + math + sci + esp + tle + mapeh + ap;
        double final_average = average / 8;
        
        frame.setSize(800, 500);
        
        averages.setText(String.valueOf(final_average));
        
        button.setBounds(310, 390, 150, 55);
        
        averageL.setVisible(true);
        honorL.setVisible(true);
        
        name.setBounds(720, 400, 100, 40);
        if(final_average > 100) {
        	honor.setText("INVALID GRADE!!!");
        }
        else if (final_average >= 98) {
        	honor.setText("With Highest Honors");
        }
        else if (final_average >= 95) {
        	honor.setText("With High Honors");
        }
        else if (final_average >= 90) {
        	honor.setText("With Honors");
        }
        else honor.setText("No Honors");
        
	}
}
