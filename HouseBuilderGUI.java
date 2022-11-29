import java.awt.EventQueue;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;

public class HouseBuilderGUI {

	private JFrame frame;
	private JTextField lengthTextField;
	private JTextField widthTextField;
	private JTextField heightTextField;

	private int floorLength = 0;
	private int floorWidth = 0;
	private ArrayList<Integer> wallWidth = new ArrayList<Integer>();
	private int wallHeight = 0;
	private int totalBuildCost = 0;
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
		
		
		
		//====================If the Exit button is pressed at any time, the program is closed====================
		JButton exitButton = new JButton("Exit");
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		exitButton.setBounds(296, 160, 109, 21);
		frame.getContentPane().add(exitButton);
		//========================================================================================================
		
		// newBuildButton used to begin a brand new house build
		//=====================================================
		JButton newBuildButton = new JButton("New Build");
		newBuildButton.setBounds(58, 160, 109, 21);
		frame.getContentPane().add(newBuildButton);
		//=====================================================
		
		// nextButton used to proceed through the program
		//=====================================================
		JButton nextButton = new JButton("Next");
		nextButton.setBounds(58, 160, 109, 21);
		frame.getContentPane().add(nextButton);
		nextButton.setVisible(false);
		//=====================================================
		
		JButton setWallsButton = new JButton("Next");
		setWallsButton.setBounds(58, 160, 109, 21);
		frame.getContentPane().add(setWallsButton);
		setWallsButton.setVisible(false);
		
		JButton nextWallButton = new JButton("Next Wall");
		nextWallButton.setBounds(58, 160, 109, 21);
		frame.getContentPane().add(nextWallButton);
		nextWallButton.setVisible(false);
		
		JLabel welcomeLabel = new JLabel("Welcome to the \r\nHouse Builder UI");
		welcomeLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		welcomeLabel.setBounds(58, 50, 314, 28);
		frame.getContentPane().add(welcomeLabel);
		
		lengthTextField = new JTextField();
		lengthTextField.setBounds(58, 107, 109, 19);
		frame.getContentPane().add(lengthTextField);
		lengthTextField.setColumns(10);
		
		widthTextField = new JTextField();
		widthTextField.setBounds(177, 107, 109, 19);
		frame.getContentPane().add(widthTextField);
		widthTextField.setColumns(10);
		widthTextField.setVisible(false);
		
		heightTextField = new JTextField();
		heightTextField.setColumns(10);
		heightTextField.setBounds(296, 107, 109, 19);
		frame.getContentPane().add(heightTextField);
		heightTextField.setVisible(false);
		
		JLabel lengthLabel = new JLabel("Place Text Here");
		lengthLabel.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		lengthLabel.setBounds(58, 129, 110, 19);
		frame.getContentPane().add(lengthLabel);
		lengthLabel.setVisible(false);
		
		JLabel widthLabel = new JLabel("Place Text Here");
		widthLabel.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		widthLabel.setBounds(177, 131, 110, 19);
		frame.getContentPane().add(widthLabel);
		widthLabel.setVisible(false);
		
		JLabel heightLabel = new JLabel("Place Text Here");
		heightLabel.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		heightLabel.setBounds(296, 131, 110, 19);
		frame.getContentPane().add(heightLabel);
		lengthTextField.setVisible(false);
		heightLabel.setVisible(false);
		
		JLabel numOfWallsLabel = new JLabel("Please enter the number of walls that the floor will have");
		numOfWallsLabel.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		numOfWallsLabel.setBounds(58, 84, 400, 21);
		frame.getContentPane().add(numOfWallsLabel);
		numOfWallsLabel.setVisible(false);
		
		JLabel wallsLabel = new JLabel("Place Text Here");
		wallsLabel.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		wallsLabel.setBounds(58, 129, 110, 19);
		frame.getContentPane().add(wallsLabel);
		wallsLabel.setVisible(false);
		
		JLabel roomMeasurementLabel = new JLabel("Please enter the length, width, and height of the current floor");
		roomMeasurementLabel.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		roomMeasurementLabel.setBounds(58, 84, 400, 21);
		frame.getContentPane().add(roomMeasurementLabel);
		roomMeasurementLabel.setVisible(false);
		

		newBuildButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				welcomeLabel.setText("New Build Started");
				roomMeasurementLabel.setVisible(true);
				
				lengthTextField.setVisible(true);
				lengthLabel.setText("Length");
				lengthLabel.setVisible(true);
				
				widthTextField.setVisible(true);
				widthLabel.setText("Width");
				widthLabel.setVisible(true);
				
				heightTextField.setVisible(true);
				heightLabel.setText("Height");
				heightLabel.setVisible(true);
				
				newBuildButton.setVisible(false);
				nextButton.setVisible(true);
				
			}
		});
		
		JTextField numOfWallsTextField = new JTextField();
		numOfWallsTextField.setBounds(58, 107, 109, 19);
		frame.getContentPane().add(numOfWallsTextField);
		numOfWallsTextField.setColumns(10);
		numOfWallsTextField.setVisible(false);
		
		Floor floor = new Floor();

		nextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				welcomeLabel.setText("Building in Progress");
				roomMeasurementLabel.setVisible(false);
				floor.clearDimensions();
				floor.setLength(Integer.parseInt(lengthTextField.getText()));
//				floorLength = (int) floor.getDimensions().get(0);
				lengthTextField.setVisible(false);
				
				floor.setWidth(Integer.parseInt(widthTextField.getText()));
//				floorWidth = (int) floor.getDimensions().get(1);
				widthTextField.setVisible(false);
				
				floor.setHeight(Integer.parseInt(heightTextField.getText()));
//				floorHeight = (int) floor.getDimensions().get(2);
				heightTextField.setVisible(false);
				
				lengthLabel.setVisible(false);
				widthLabel.setVisible(false);
				heightLabel.setVisible(false);
				
				
				numOfWallsLabel.setVisible(true);
				numOfWallsTextField.setVisible(true);
				wallsLabel.setText("Walls");
				wallsLabel.setVisible(true);
				
				nextButton.setVisible(false);
				setWallsButton.setVisible(true);
				
				System.out.println(floor.getDimensions());
			}
			});
		
		setWallsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				floor.setWalls(Integer.parseInt(numOfWallsTextField.getText()));
				setWallsButton.setVisible(false);
				nextWallButton.setVisible(true);
				wallsLabel.setVisible(false);
				widthLabel.setBounds(58, 129, 110, 19);
				widthLabel.setVisible(true);
				System.out.println(floor.getWalls());
			}
		});
		
		nextWallButton.addActionListener(new ActionListener() {
			int i = floor.getWalls();
			public void actionPerformed(ActionEvent e) {
					i--;
					wallWidth.add(floor.setWidth(Integer.parseInt(numOfWallsTextField.getText())));
					System.out.println(i);
					actionPerformed(e);
			}	
		});
		
		
		nextWallButton.setVisible(false);
		
		
	}
}
