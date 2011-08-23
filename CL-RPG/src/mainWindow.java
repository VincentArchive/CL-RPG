import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class mainWindow extends JFrame {

	private JPanel contentPane;
	private JTextField inputField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainWindow frame = new mainWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public mainWindow() {
		setTitle("CL - RPG");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 443, 217);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JTextArea outputArea = new JTextArea();
		outputArea.setBackground(SystemColor.controlHighlight);
		outputArea.setEditable(false);
		
		inputField = new JTextField();
		
		inputField.setColumns(10);
		
		JButton clearButton = new JButton("Clear");		
		
		JButton sendButton = new JButton("Send");
		
		
		JTextArea statsArea = new JTextArea();
		statsArea.setBackground(SystemColor.controlHighlight);
		
		JLabel lblStats = new JLabel("Stats");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(outputArea, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(inputField)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(sendButton)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(clearButton)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblStats)
						.addComponent(statsArea, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(outputArea, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(inputField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(clearButton)
								.addComponent(sendButton)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblStats)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(statsArea, GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
		
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				inputField.setText("");
				inputField.requestFocus();
				
			}
		});
		
		sendButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sendInput();
			}
		});
		
		inputField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sendInput();
			}
		});
		
		
		
	}
	
	private static void sendInput(){
		// action after send button or enter pressed
	}
}
