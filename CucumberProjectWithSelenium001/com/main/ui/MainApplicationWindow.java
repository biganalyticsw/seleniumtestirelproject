package com.main.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.JProgressBar;

public class MainApplicationWindow {

	private JFrame frame;
	private JTextField txtEnterPathHere_1;
	private JTextField txtEnterPathHere;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainApplicationWindow window = new MainApplicationWindow();
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
	public MainApplicationWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().setBackground(UIManager.getColor("Button.shadow"));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmNew = new JMenuItem("New");
		mnFile.add(mntmNew);
		
		JMenuItem mntmOpen = new JMenuItem("Open");
		mnFile.add(mntmOpen);
		
		JMenuItem mntmSave = new JMenuItem("Save");
		mnFile.add(mntmSave);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnFile.add(mntmExit);
		
		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		
		JMenu mnView = new JMenu("View");
		menuBar.add(mnView);
		
		JMenu mnHelp = new JMenu("help");
		menuBar.add(mnHelp);
		frame.getContentPane().setLayout(new GridLayout(4, 1, 0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.activeCaption);
		FlowLayout flowLayout = (FlowLayout) panel_3.getLayout();
		flowLayout.setHgap(50);
		flowLayout.setVgap(50);
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Heading Section", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		frame.getContentPane().add(panel_3);
		
		JLabel lblHomePage = new JLabel("");
		lblHomePage.setHorizontalAlignment(SwingConstants.CENTER);
		lblHomePage.setIcon(new ImageIcon("E:\\CMS PoCs\\selenium_testing\\logos_images\\cmpnylgo.png"));
		panel_3.add(lblHomePage);
//	 	lblHomePage.setIcon(new ImageIcon("E:\\CMS PoCs\\selenium_testing\\logos_images\\cmpyimg.PNG"));
		lblHomePage.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblHomePage.setForeground(Color.BLUE);
		lblHomePage.setBackground(new Color(0, 255, 0));
		
		JPanel panel_4 = new JPanel();
		panel_3.add(panel_4);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(new Color(240, 248, 255));
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(0, 4, 0, 0));
		
		JLabel lblPressConfigurationMode = new JLabel("<html> <p>    Press Configuration mode </p>\r\n    button to set up testing :   </html>                              ");
		lblPressConfigurationMode.setHorizontalAlignment(SwingConstants.CENTER);
		lblPressConfigurationMode.setBackground(new Color(127, 255, 212));
		lblPressConfigurationMode.setForeground(Color.BLUE);
		lblPressConfigurationMode.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel.add(lblPressConfigurationMode);
		
		JButton btnConfigurationMode = new JButton("Configuration Mode Button");
		btnConfigurationMode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConfigurationMode.setBackground(new Color(192, 192, 192));
		btnConfigurationMode.setForeground(new Color(128, 0, 0));
		btnConfigurationMode.setFont(new Font("Dialog", Font.PLAIN, 18));
		panel.add(btnConfigurationMode);
		
		JLabel lblPressRunMode = new JLabel("<html><p>    Press Run mode to start testing runs after \r\n    configuration  for each web page :</p></html>");
		lblPressRunMode.setHorizontalAlignment(SwingConstants.CENTER);
		lblPressRunMode.setBackground(new Color(255, 255, 0));
		lblPressRunMode.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPressRunMode.setForeground(Color.BLUE);
		panel.add(lblPressRunMode);
		
		JButton btnRunTestsMode = new JButton("Run Tests Mode Button");
		btnRunTestsMode.setBackground(new Color(192, 192, 192));
		btnRunTestsMode.setForeground(new Color(128, 0, 0));
		btnRunTestsMode.setFont(new Font("Dialog", Font.PLAIN, 18));
		panel.add(btnRunTestsMode);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Set Filepath", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Configurations File Path :");
		panel_1.add(lblNewLabel);
		lblNewLabel.setBackground(new Color(255, 255, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setForeground(Color.BLUE);
		
		txtEnterPathHere = new JTextField();
		txtEnterPathHere.setForeground(new Color(139, 69, 19));
		txtEnterPathHere.setText("E:\\\\CMS PoCs\\\\selenium_testing\\\\workspace01\\\\config\\\\");
		txtEnterPathHere.setBackground(Color.WHITE);
		panel.add(txtEnterPathHere);
		txtEnterPathHere.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Set Filepath", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.add(panel_2);
		
		JLabel lblReportsAndScreenshots = new JLabel("Reports and screenshots File Path :");
		panel_2.add(lblReportsAndScreenshots);
		lblReportsAndScreenshots.setBackground(new Color(255, 255, 0));
		lblReportsAndScreenshots.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblReportsAndScreenshots.setForeground(Color.BLUE);
		
		txtEnterPathHere_1 = new JTextField();
		txtEnterPathHere_1.setForeground(new Color(139, 0, 0));
		txtEnterPathHere_1.setText("\\\\workspace01\\\\tests log\\\\screenscapture");
		txtEnterPathHere_1.setBackground(Color.WHITE);
		panel.add(txtEnterPathHere_1);
		txtEnterPathHere_1.setColumns(10);
		
		JLabel lblPlaceholder = new JLabel("Placeholder Label");
		lblPlaceholder.setBackground(new Color(50, 205, 50));
		panel.add(lblPlaceholder);
		
		JLabel lblPlaceholderLabel = new JLabel("Placeholder label");
		lblPlaceholderLabel.setBackground(new Color(50, 205, 50));
		panel.add(lblPlaceholderLabel);
		
		JLabel lblPlaceholderLabel_1 = new JLabel("Placeholder Label");
		lblPlaceholderLabel_1.setBackground(new Color(50, 205, 50));
		panel.add(lblPlaceholderLabel_1);
		
		JLabel lblPlaceholderLabel_2 = new JLabel("Placeholder label");
		lblPlaceholderLabel_2.setBackground(new Color(50, 205, 50));
		panel.add(lblPlaceholderLabel_2);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(128, 128, 0));
		frame.getContentPane().add(panel_6);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		panel_6.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		panel_6.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		panel_6.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		panel_6.add(lblNewLabel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(0, 255, 0));
		frame.getContentPane().add(panel_5);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setIndeterminate(true);
		progressBar.setBackground(new Color(65, 105, 225));
		panel_5.add(progressBar);
		
		JLabel lblNewLabel_5 = new JLabel("text label for");
		panel_5.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("using later");
		panel_5.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("sample text");
		panel_5.add(lblNewLabel_7);
		
		JButton btnPlaceholderButton = new JButton("");
		btnPlaceholderButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPlaceholderButton.setIcon(new ImageIcon("E:\\CMS PoCs\\selenium_testing\\logos_images\\cmpyimg.PNG"));
		panel_5.add(btnPlaceholderButton);
	}

}
