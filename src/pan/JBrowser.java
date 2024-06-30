package pan;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.ScrollPane;
import javax.swing.JLabel;
import java.util.Vector;


public class JBrowser {

	private JFrame frame;
	static int current = 1;
	static int x = 10;
	static int y = 60;
	static int currentpage = 1;
	static int talkrecord = 0;
	static int numrecord = 0;
	
	private JTextField InputBox;
	private JTextField pagerecord;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JBrowser window = new JBrowser();
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
	public JBrowser() {
		initialize();
	}
	
	String []conversation = new String[1000];
	int []data = new int[1000];
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 794, 565);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, "panel");
		panel.setLayout(null);
		
		JTextPane Ask_1 = new JTextPane();
		Ask_1.setBackground(Color.ORANGE);
		Ask_1.setEditable(false);
		Ask_1.setVisible(false);
		Ask_1.setBounds(20, 188, 740, 35);
		panel.add(Ask_1);
		
		
		JTextPane Ask2 = new JTextPane();
		Ask2.setBounds(392, 77, 358, 57);
		Ask2.setEditable(false);
		Ask2.setVisible(false);
		panel.add(Ask2);
		
		JTextPane Ask3 = new JTextPane();
		Ask3.setBounds(392, 144, 358, 57);
		Ask3.setEditable(false);
		Ask3.setVisible(false);
		panel.add(Ask3);
		
		JTextPane Ask4 = new JTextPane();
		Ask4.setBounds(396, 211, 354, 57);
		Ask4.setEditable(false);
		Ask4.setVisible(false);
		panel.add(Ask4);
		
		JTextPane Ask5 = new JTextPane();
		Ask5.setBounds(392, 278, 358, 57);
		Ask5.setEditable(false);
		Ask5.setVisible(false);
		panel.add(Ask5);
		
		JTextPane Ans1 = new JTextPane();
		Ans1.setBounds(203, 278, 330, 57);
		Ans1.setEditable(false);
		Ans1.setVisible(false);
		panel.add(Ans1);
		
		JTextPane Ans2 = new JTextPane();
		Ans2.setBounds(10, 144, 330, 57);
		Ans2.setEditable(false);
		Ans2.setVisible(false);
		panel.add(Ans2);
		
		JTextPane Ans3 = new JTextPane();
		Ans3.setBounds(10, 77, 330, 57);
		Ans3.setEditable(false);
		Ans3.setVisible(false);
		panel.add(Ans3);
		
		JTextPane Ans4 = new JTextPane();
		Ans4.setBounds(10, 211, 330, 57);
		Ans4.setEditable(false);
		Ans4.setVisible(false);
		panel.add(Ans4);
		
		JTextPane Ans5 = new JTextPane();
		Ans5.setBounds(10, 278, 330, 57);
		Ans5.setEditable(false);
		Ans5.setVisible(false);
		panel.add(Ans5);

		JButton btnNewButton = new JButton("Chat");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StringBuffer m = new StringBuffer(InputBox.getText());
				if(!InputBox.getText().equals(""))
				{
					int length = m.length();
					if(length > 50) {
						 for(int i = 1; i <= length / 50; i++) {
							m.insert(i * 50, "\n");
						}
					}
				if(y + 20 + length / 50 * 20 < 380)
				{
					 conversation[talkrecord]= m.toString();
					 talkrecord++;
					 data[numrecord] = currentpage;
					 numrecord++;
					if(750 - length * 8.5 > 200)
					{
						if(current % 5 == 1)
							Ask_1.setBounds((int)(750-length*8.5), y, (int)(length*8.5), 20 + length/50 * 20);
						if(current % 5 == 2)
							Ask2.setBounds((int)(750-length*8.5), y, (int)(length*8.5), 20 + length/50 * 20);
						if(current % 5 == 3)
							Ask3.setBounds((int)(750-length*8.5), y, (int)(length*8.5), 20 + length/50 * 20);
						if(current % 5 == 4)
							Ask4.setBounds((int)(750-length*8.5), y, (int)(length*8.5), 20 + length/50 * 20);
						if(current % 5 == 0)
							Ask5.setBounds((int)(750-length*8.5), y, (int)(length*8.5), 20 + length/50 * 20);
						
						int ms = y;
						
						data[numrecord] = (int)(750 - length * 8.5);
						numrecord++;
						data[numrecord] = ms;
						numrecord++;
						data[numrecord] = (int)(length * 8.5);
						numrecord++;
						data[numrecord] = 20 + (int)(length/50 * 20);
						numrecord++;
					//	JOptionPane.showMessageDialog(null, totalrecord);
					}
					else {
						if(current % 5 == 1)
							Ask_1.setBounds(200, y, 550, 20 + length/50 * 20);
						if(current % 5 == 2)	
							Ask2.setBounds(200, y, 550, 20 + length/50 * 20);
						if(current % 5 == 3)
							Ask3.setBounds(200, y, 550, 20 + length/50 * 20);
						if(current % 5 == 4)
							Ask4.setBounds(200, y, 550, 20 + length/50 * 20);
						if(current % 5 == 0)
							Ask5.setBounds(200, y, 550, 20 + length/50 * 20);
						
						int ms = y;
						
						data[numrecord] = currentpage;
						numrecord++;
						data[numrecord] = 200;
						numrecord++;
						data[numrecord] = ms;
						numrecord++;
						data[numrecord] = 550;
						numrecord++;
						data[numrecord] = 20 + (int)(length/50 * 20);
						numrecord++;
				//		JOptionPane.showMessageDialog(null, totalrecord);
					}
					y = y + (20 + length / 50 * 20) + 10;
					
				if(current % 5 == 1)
				{
					Ask_1.setVisible(true);
					Ask_1.setText(m.toString());
				}
				if(current % 5 == 2)
				{
					Ask2.setVisible(true);
					Ask2.setText(m.toString());
				}
				if(current % 5 == 3)
				{
					Ask3.setVisible(true);
					Ask3.setText(m.toString());
				}
				if(current % 5 == 4)
				{
					Ask4.setVisible(true);
					Ask4.setText(m.toString());
				}
				if(current % 5 == 0)
				{
					Ask3.setVisible(true);
					Ask3.setText(m.toString());
				}
				InputBox.setText("");
				
				StringBuffer response = new StringBuffer("I am sorry, but something seems to be wrong with your internet 😓");
				int len = response.length();				
				if(len > 50) {
					 for(int i = 1; i <= len / 50; i++) {
						response.insert(i * 50, "\n");
					}
				}
				conversation[talkrecord] = response.toString();
				talkrecord++;
				data[numrecord] = currentpage;
				numrecord++;

				if(len * 8.5 < 440){
					if(current % 5 == 1)
						Ans1.setBounds(10, y, (int)(len*8.5), 20 + len/50 * 20);
					if(current % 5 == 2)
						Ans2.setBounds(10, y, (int)(len*8.5), 20 + len/50 * 20);
					if(current % 5 == 3)
						Ans3.setBounds(10, y, (int)(len*8.5), 20 + len/50 * 20);
					if(current % 5 == 4)
						Ans4.setBounds(10, y, (int)(len*8.5), 20 + len/50 * 20);
					if(current % 5 == 0)
						Ans5.setBounds(10, y, (int)(len*8.5), 20 + len/50 * 20);
					
					int ms = y;
					data[numrecord]  = 10;
					numrecord++;
					data[numrecord] = ms;
					numrecord++;
					data[numrecord] = (int)(len * 8.5);
					numrecord++;
					data[numrecord] = 20 + (int)(len/50 * 20);
					numrecord++;
					//JOptionPane.showMessageDialog(null, totalrecord);
				}
				else {
					if(current % 5 == 1)
						Ans1.setBounds(10, y, 440, 20 + len/50 * 20);
					if(current % 5 == 2)
						Ans2.setBounds(10, y, 440, 20 + len/50 * 20);
					if(current % 5 == 3)
						Ans3.setBounds(10, y, 440, 20 + len/50 * 20);
					if(current % 5 == 4)
						Ans4.setBounds(10, y, 440, 20 + len/50 * 20);
					if(current % 5 == 0)
						Ans5.setBounds(10, y, 440, 20 + len/50 * 20);
					
					int ms = y;
					
					data[numrecord] = 10;
					numrecord++;
					data[numrecord] = ms;
					numrecord++;
					data[numrecord] = 440;
					numrecord++;
					data[numrecord] =  20 + (int)(len/50 * 20);
					numrecord++;
					//JOptionPane.showMessageDialog(null, totalrecord);
				}
			
				y = y + (20 + len / 50 * 20) + 10;
				
				if(current % 5 == 1)
				{
					Ans1.setVisible(true);
					Ans1.setText(response.toString());
				}
				if(current % 5 == 2)
				{
					Ans2.setVisible(true);
					Ans2.setText(response.toString());
				}
				if(current % 5 == 3)
				{
					Ans3.setVisible(true);
					Ans3.setText(response.toString());
				}
				if(current % 5 == 4)
				{
					Ans4.setVisible(true);
					Ans4.setText(response.toString());
				}
				if(current % 5 == 0)
				{
					Ans5.setVisible(true);
					Ans5.setText(response.toString());
				}
				current++;
				
			}
			else {
				JOptionPane.showMessageDialog(null, "Area full! Generate into a new page!");
				current = 1;
				currentpage++;
				y = 60;
				Ask_1.setVisible(false);
				Ask2.setVisible(false);
				Ask3.setVisible(false);
				Ask4.setVisible(false);
				Ask5.setVisible(false);
				Ans1.setVisible(false);
				Ans2.setVisible(false);
				Ans3.setVisible(false);
				Ans4.setVisible(false);
				Ans5.setVisible(false);
			}
			
			}
			}
		});
		btnNewButton.setBounds(589, 456, 161, 57);
		panel.add(btnNewButton);
		
		InputBox = new JTextField();
		InputBox.setBounds(0, 467, 579, 35);
		panel.add(InputBox);
		InputBox.setColumns(10);
		
		JButton Clear = new JButton("Clear");
		Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				y = 60;
				current = 1;
				currentpage = 1;
				pagerecord.setText(Integer.toString(currentpage));
				for(int j = 0; j <= talkrecord; j++) {
					conversation[talkrecord] = "";
				}
				for(int k = 0; k <= numrecord; k++) {
					data[numrecord] = -1;
					
				}
				talkrecord = 0;
				numrecord = 0;
				
				Ask_1.setVisible(false);
				Ask2.setVisible(false);
				Ask3.setVisible(false);
				Ask4.setVisible(false);
				Ask5.setVisible(false);
				Ans1.setVisible(false);
				Ans2.setVisible(false);
				Ans3.setVisible(false);
				Ans4.setVisible(false);
				Ans5.setVisible(false);
			}
		});
		Clear.setBounds(589, 10, 171, 35);
		panel.add(Clear);
		
		pagerecord = new JTextField();
		pagerecord.setEditable(false);
		pagerecord.setText("1");
		pagerecord.setBounds(97, 14, 191, 27);
		panel.add(pagerecord);
		pagerecord.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Previous Page");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				Ask_1.setVisible(false);
				Ask2.setVisible(false);
				Ask3.setVisible(false);
				Ask4.setVisible(false);
				Ask5.setVisible(false);
				Ans1.setVisible(false);
				Ans2.setVisible(false);
				Ans3.setVisible(false);
				Ans4.setVisible(false);
				Ans5.setVisible(false);
				
				if(currentpage >= 2) {
					currentpage--;
					pagerecord.setText(String.valueOf(currentpage));
				}
				int count = 0;
				for(int i = 0; i+5 <= numrecord; i+=5) {
					if(data[i] == currentpage) {
						count++;
						if(count == 1) {
							Ask_1.setVisible(true);
							Ask_1.setBounds(data[i+1], data[i+2], data[i+3], data[i+4]);
							Ask_1.setText(conversation[i/5]);
						}
						else if(count == 2) {
							Ans1.setVisible(true);
							Ans1.setBounds(data[i+1], data[i+2], data[i+3], data[i+4]);
							Ans1.setText(conversation[i/5]);
						}
						else if(count == 3) {
							Ask2.setVisible(true);
							Ask2.setBounds(data[i+1], data[i+2], data[i+3], data[i+4]);
							Ask2.setText(conversation[i/5]);
						}
						else if(count == 4) {
							Ans2.setVisible(true);
							Ans2.setBounds(data[i+1], data[i+2], data[i+3], data[i+4]);
							Ans2.setText(conversation[i/5]);
						}
						else if(count == 5) {
							Ask3.setVisible(true);
							Ask3.setBounds(data[i+1], data[i+2], data[i+3], data[i+4]);
							Ask3.setText(conversation[i/5]);
						}
						else if(count == 6) {
							Ans3.setVisible(true);
							Ans3.setBounds(data[i+1], data[i+2], data[i+3], data[i+4]);
							Ans3.setText(conversation[i/5]);
						}
						else if(count == 7) {
							Ask4.setVisible(true);
							Ask4.setBounds(data[i+1], data[i+2], data[i+3], data[i+4]);
							Ask4.setText(conversation[i/5]);
						}
						else if(count == 8) {
							Ans4.setVisible(true);
							Ans4.setBounds(data[i+1], data[i+2], data[i+3], data[i+4]);
							Ans4.setText(conversation[i/5]);
						}
						else if(count == 9) {
							Ask5.setVisible(true);
							Ask5.setBounds(data[i+1], data[i+2], data[i+3], data[i+4]);
							Ask5.setText(conversation[i/5]);
						}
						else if(count == 10) {
					//		Ans5.setBounds(myRec[i].boundx, myRec[i].boundy, myRec[i].width, myRec[i].height);
						}

					}
				}
			}
		});
		btnNewButton_1.setBounds(298, 10, 106, 40);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Next Page");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currentpage++;
				pagerecord.setText(String.valueOf(currentpage));
				
				Ask_1.setVisible(false);
				Ask2.setVisible(false);
				Ask3.setVisible(false);
				Ask4.setVisible(false);
				Ask5.setVisible(false);
				Ans1.setVisible(false);
				Ans2.setVisible(false);
				Ans3.setVisible(false);
				Ans4.setVisible(false);
				Ans5.setVisible(false);
				
				int count = 0;
				for(int i = 0; i+5 <= numrecord; i+=5) {
					if(data[i] == currentpage) {
						count++;
						if(count == 1) {
							Ask_1.setVisible(true);
							Ask_1.setBounds(data[i+1], data[i+2], data[i+3], data[i+4]);
							Ask_1.setText(conversation[i/5]);
						}
						else if(count == 2) {
							Ans1.setVisible(true);
							Ans1.setBounds(data[i+1], data[i+2], data[i+3], data[i+4]);
							Ans1.setText(conversation[i/5]);
						}
						else if(count == 3) {
							Ask2.setVisible(true);
							Ask2.setBounds(data[i+1], data[i+2], data[i+3], data[i+4]);
							Ask2.setText(conversation[i/5]);
						}
						else if(count == 4) {
							Ans2.setVisible(true);
							Ans2.setBounds(data[i+1], data[i+2], data[i+3], data[i+4]);
							Ans2.setText(conversation[i/5]);
						}
						else if(count == 5) {
							Ask3.setVisible(true);
							Ask3.setBounds(data[i+1], data[i+2], data[i+3], data[i+4]);
							Ask3.setText(conversation[i/5]);
						}
						else if(count == 6) {
							Ans3.setVisible(true);
							Ans3.setBounds(data[i+1], data[i+2], data[i+3], data[i+4]);
							Ans3.setText(conversation[i/5]);
						}
						else if(count == 7) {
							Ask4.setVisible(true);
							Ask4.setBounds(data[i+1], data[i+2], data[i+3], data[i+4]);
							Ask4.setText(conversation[i/5]);
						}
						else if(count == 8) {
							Ans4.setVisible(true);
							Ans4.setBounds(data[i+1], data[i+2], data[i+3], data[i+4]);
							Ans4.setText(conversation[i/5]);
						}
						else if(count == 9) {
							Ask5.setVisible(true);
							Ask5.setBounds(data[i+1], data[i+2], data[i+3], data[i+4]);
							Ask5.setText(conversation[i/5]);
						}
						else if(count == 10) {
					//		Ans5.setBounds(myRec[i].boundx, myRec[i].boundy, myRec[i].width, myRec[i].height);
						}

					}
				}
				
				
			}
		});
		btnNewButton_1_1.setBounds(428, 13, 135, 35);
		panel.add(btnNewButton_1_1);
		
		JLabel pagerec = new JLabel("Currently at: ");
		pagerec.setBounds(33, 4, 127, 46);
		panel.add(pagerec);
		

			
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, "panel_1");
		panel_1.setLayout(null);
	}
}
