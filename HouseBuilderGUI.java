import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HouseBuilderGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HouseBuilderGUI window = new HouseBuilderGUI();
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
	public HouseBuilderGUI() {
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
		
		JButton exitButton = new JButton("Exit");
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exitButton.setBounds(263, 130, 109, 21);
		frame.getContentPane().add(exitButton);
		
		JButton newBuildButton = new JButton("New Build");
		newBuildButton.setBounds(68, 130, 109, 21);
		frame.getContentPane().add(newBuildButton);
		
		JLabel welcomeLabel = new JLabel("Welcome to the \r\nHouse Builder UI");
		welcomeLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		welcomeLabel.setBounds(58, 50, 314, 28);
		frame.getContentPane().add(welcomeLabel);
		
		newBuildButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				welcomeLabel.setText("New Build Started");
				JLabel roomMeasurementLabel = new JLabel("Please enter the length, width, and height of current room");
				roomMeasurementLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
				roomMeasurementLabel.setBounds(58, 84, 400, 21);
				frame.getContentPane().add(roomMeasurementLabel);
			}
		});
		
	}
}
