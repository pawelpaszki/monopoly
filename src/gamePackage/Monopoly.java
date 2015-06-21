package gamePackage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class Monopoly {

	private JFrame frame;
	private JLayeredPane topLeft;
	private JLayeredPane bottomLeft;
	private JLayeredPane topRight;
	private JLayeredPane bottomRight;
	private JLayeredPane left_1;
	private JLayeredPane left_2;
	private JLayeredPane left_3;
	private JLayeredPane left_4;
	private JLayeredPane left_5;
	private JLayeredPane left_6;
	private JLayeredPane left_7;
	private JLayeredPane left_8;
	private JLayeredPane left_9;
	private JLayeredPane top_1;
	private JLayeredPane top_2;
	private JLayeredPane top_3;
	private JLayeredPane top_4;
	private JLayeredPane top_5;
	private JLayeredPane top_6;
	private JLayeredPane top_7;
	private JLayeredPane top_8;
	private JLayeredPane top_9;
	private JLayeredPane right_1;
	private JLayeredPane right_2;
	private JLayeredPane right_3;
	private JLayeredPane right_4;
	private JLayeredPane right_5;
	private JLayeredPane right_6;
	private JLayeredPane right_7;
	private JLayeredPane right_8;
	private JLayeredPane right_9;
	private JLayeredPane bottom_1;
	private JLayeredPane bottom_2;
	private JLayeredPane bottom_3;
	private JLayeredPane bottom_4;
	private JLayeredPane bottom_5;
	private JLayeredPane bottom_6;
	private JLayeredPane bottom_7;
	private JLayeredPane bottom_8;
	private JLayeredPane bottom_9;
	private JLayeredPane player_1;
	private JLayeredPane player_2;
	private JLayeredPane player_3;
	private JLayeredPane player_4;
	private JLayeredPane player_5;
	private JLayeredPane player_6;
	private JScrollPane gameLog;
	private JTextArea logText;
	private String log;
	private JLayeredPane gameConsole;
	private int frameHeight;
	private JButton communityChest;
	private JButton chanceButton;
	private JLabel bottomRightLabel;
	private JLabel bottom1Label;
	private JLabel bottom2Label;
	private JLabel bottom3Label;
	private JLabel bottom4Label;
	private JLabel bottom5Label;
	private JLabel bottom6Label;
	private JLabel bottom7Label;
	private JLabel bottom8Label;
	private JLabel bottom9Label;
	private JLabel bottomLeftLabel;
	private JLabel left1Label;
	private JLabel left2Label;
	private JLabel left3Label;
	private JLabel left4Label;
	private JLabel left5Label;
	private JLabel left6Label;
	private JLabel left7Label;
	private JLabel left8Label;
	private JLabel left9Label;
	private JLabel topLeftLabel;
	private JLabel top1Label;
	private JLabel top2Label;
	private JLabel top3Label;
	private JLabel top4Label;
	private JLabel top5Label;
	private JLabel top6Label;
	private JLabel top7Label;
	private JLabel top8Label;
	private JLabel top9Label;
	private JLabel topRightLabel;
	private JLabel right1Label;
	private JLabel right2Label;
	private JLabel right3Label;
	private JLabel right4Label;
	private JLabel right5Label;
	private JLabel right6Label;
	private JLabel right7Label;
	private JLabel right8Label;
	private JLabel right9Label;
	private JButton addPlayer1;
	private JButton addPlayer2;
	private JButton addPlayer3;
	private JButton addPlayer4;
	private JButton addPlayer5;
	private JButton addPlayer6;
	private JButton startGame;
	private JButton finishTurn;
	private JTextField player1name;
	private JTextField player2name;
	private JTextField player3name;
	private JTextField player4name;
	private JTextField player5name;
	private JTextField player6name;
	private JButton addPlayer1Name;
	private JButton addPlayer2Name;
	private JButton addPlayer3Name;
	private JButton addPlayer4Name;
	private JButton addPlayer5Name;
	private JButton addPlayer6Name;
	private JLabel player1nameLabel;
	private JLabel player2nameLabel;
	private JLabel player3nameLabel;
	private JLabel player4nameLabel;
	private JLabel player5nameLabel;
	private JLabel player6nameLabel;
	private JLabel player1balance;
	private JLabel player2balance;
	private JLabel player3balance;
	private JLabel player4balance;
	private JLabel player5balance;
	private JLabel player6balance;
	private JButton rollTheDice;
	private JLabel dice1;
	private JLabel dice2;
	private int randomDice1;
	private int randomDice2;
	private Random random;
	private int doubleCounter;
	private Entities entities;
	private ArrayList<Player> players;
	private ArrayList<JLayeredPane> boardPanels;
	private int playerIndex;
	private JLayeredPane player1;
	private JPanel p1;
	private JLayeredPane player2;
	private JPanel p2;
	private JLayeredPane player3;
	private JPanel p3;
	private JLayeredPane player4;
	private JPanel p4;
	private JLayeredPane player5;
	private JPanel p5;
	private JLayeredPane player6;
	private JPanel p6;
	private ArrayList<JLayeredPane> playerIndicators;
	private ArrayList<JLabel> balanceLabels;
	private JLabel gamePrompt;
	private JButton useGetOutOfJailCard;
	private JButton dontUseGetOutOfJailCard;
	private JButton pay50toGetOutOfJail;
	private boolean extraRollNeeded;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Monopoly window = new Monopoly();
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
	public Monopoly() {
		players = new ArrayList<Player>();
		entities = new Entities();
		random = new Random();
		boardPanels = new ArrayList<JLayeredPane>();
		playerIndicators = new ArrayList<JLayeredPane>();
		balanceLabels = new ArrayList<JLabel>();
		playerIndex = 0;
		initialize();
		doubleCounter = 0;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		FlowLayout flow = new FlowLayout();
		flow.setHgap(0);
		flow.setVgap(0);
		frame = new JFrame("Monopoly");
		frame.setLayout(flow);
		frame.getContentPane().setBackground(new Color(173, 216, 230));
		frame.setForeground(new Color(173, 216, 230));
		frame.setBackground(new Color(173, 216, 230));
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setSize(screenSize);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		// frameWidth = frame.getWidth();
		frameHeight = frame.getHeight() - 40;
		topLeft = new JLayeredPane();
		topLeft.setBounds(0, 0, (int) (frameHeight / 6.5),
				(int) (frameHeight / 6.5));
		left_1 = new JLayeredPane();
		left_1.setBounds(0, (int) (frameHeight / 6.5),
				(int) (frameHeight / 6.5), (int) (frameHeight / 13));
		left_2 = new JLayeredPane();
		left_2.setBounds(0, (int) (frameHeight / 6.5 * 1.5),
				(int) (frameHeight / 6.5), (int) (frameHeight / 13));
		left_3 = new JLayeredPane();
		left_3.setBounds(0, (int) (frameHeight / 6.5 * 2),
				(int) (frameHeight / 6.5), (int) (frameHeight / 13));
		left_4 = new JLayeredPane();
		left_4.setBounds(0, (int) (frameHeight / 6.5 * 2.5),
				(int) (frameHeight / 6.5), (int) (frameHeight / 13));
		left_5 = new JLayeredPane();
		left_5.setBounds(0, (int) (frameHeight / 6.5 * 3),
				(int) (frameHeight / 6.5), (int) (frameHeight / 13));
		left_6 = new JLayeredPane();
		left_6.setBounds(0, (int) (frameHeight / 6.5 * 3.5),
				(int) (frameHeight / 6.5), (int) (frameHeight / 13));
		left_7 = new JLayeredPane();
		left_7.setBounds(0, (int) (frameHeight / 6.5 * 4),
				(int) (frameHeight / 6.5), (int) (frameHeight / 13));
		left_8 = new JLayeredPane();
		left_8.setBounds(0, (int) (frameHeight / 6.5 * 4.5),
				(int) (frameHeight / 6.5), (int) (frameHeight / 13));
		left_9 = new JLayeredPane();
		left_9.setBounds(0, (int) (frameHeight / 6.5 * 5),
				(int) (frameHeight / 6.5), (int) (frameHeight / 13));
		bottomLeft = new JLayeredPane();
		bottomLeft.setBounds(0, (int) (frameHeight / 6.5 * 5.5),
				(int) (frameHeight / 6.5), (int) (frameHeight / 6.5));
		top_1 = new JLayeredPane();
		top_1.setBounds((int) (frameHeight / 6.5), 0, (int) (frameHeight / 13),
				(int) (frameHeight / 6.5));
		top_2 = new JLayeredPane();
		top_2.setBounds((int) (frameHeight / 6.5 * 1.5), 0,
				(int) (frameHeight / 13), (int) (frameHeight / 6.5));
		top_3 = new JLayeredPane();
		top_3.setBounds((int) (frameHeight / 6.5 * 2), 0,
				(int) (frameHeight / 13), (int) (frameHeight / 6.5));
		top_4 = new JLayeredPane();
		top_4.setBounds((int) (frameHeight / 6.5 * 2.5), 0,
				(int) (frameHeight / 13), (int) (frameHeight / 6.5));
		top_5 = new JLayeredPane();
		top_5.setBounds((int) (frameHeight / 6.5 * 3), 0,
				(int) (frameHeight / 13), (int) (frameHeight / 6.5));
		top_6 = new JLayeredPane();
		top_6.setBounds((int) (frameHeight / 6.5 * 3.5), 0,
				(int) (frameHeight / 13), (int) (frameHeight / 6.5));
		top_7 = new JLayeredPane();
		top_7.setBounds((int) (frameHeight / 6.5 * 4), 0,
				(int) (frameHeight / 13), (int) (frameHeight / 6.5));
		top_8 = new JLayeredPane();
		top_8.setBounds((int) (frameHeight / 6.5 * 4.5), 0,
				(int) (frameHeight / 13), (int) (frameHeight / 6.5));
		top_9 = new JLayeredPane();
		top_9.setBounds((int) (frameHeight / 6.5 * 5), 0,
				(int) (frameHeight / 13), (int) (frameHeight / 6.5));
		topRight = new JLayeredPane();
		topRight.setBounds((int) (frameHeight / 6.5 * 5.5), 0,
				(int) (frameHeight / 6.5), (int) (frameHeight / 6.5));
		right_1 = new JLayeredPane();
		right_1.setBounds((int) (frameHeight / 6.5 * 5.5),
				(int) (frameHeight / 6.5), (int) (frameHeight / 6.5),
				(int) (frameHeight / 13));
		right_2 = new JLayeredPane();
		right_2.setBounds((int) (frameHeight / 6.5 * 5.5),
				(int) (frameHeight / 6.5 * 1.5), (int) (frameHeight / 6.5),
				(int) (frameHeight / 13));
		right_3 = new JLayeredPane();
		right_3.setBounds((int) (frameHeight / 6.5 * 5.5),
				(int) (frameHeight / 6.5 * 2), (int) (frameHeight / 6.5),
				(int) (frameHeight / 13));
		right_4 = new JLayeredPane();
		right_4.setBounds((int) (frameHeight / 6.5 * 5.5),
				(int) (frameHeight / 6.5 * 2.5), (int) (frameHeight / 6.5),
				(int) (frameHeight / 13));
		right_5 = new JLayeredPane();
		right_5.setBounds((int) (frameHeight / 6.5 * 5.5),
				(int) (frameHeight / 6.5 * 3), (int) (frameHeight / 6.5),
				(int) (frameHeight / 13));
		right_6 = new JLayeredPane();
		right_6.setBounds((int) (frameHeight / 6.5 * 5.5),
				(int) (frameHeight / 6.5 * 3.5), (int) (frameHeight / 6.5),
				(int) (frameHeight / 13));
		right_7 = new JLayeredPane();
		right_7.setBounds((int) (frameHeight / 6.5 * 5.5),
				(int) (frameHeight / 6.5 * 4), (int) (frameHeight / 6.5),
				(int) (frameHeight / 13));
		right_8 = new JLayeredPane();
		right_8.setBounds((int) (frameHeight / 6.5 * 5.5),
				(int) (frameHeight / 6.5 * 4.5), (int) (frameHeight / 6.5),
				(int) (frameHeight / 13));
		right_9 = new JLayeredPane();
		right_9.setBounds((int) (frameHeight / 6.5 * 5.5),
				(int) (frameHeight / 6.5 * 5), (int) (frameHeight / 6.5),
				(int) (frameHeight / 13));
		bottom_1 = new JLayeredPane();
		bottom_1.setBounds((int) (frameHeight / 6.5),
				(int) (frameHeight / 6.5 * 5.5), (int) (frameHeight / 13),
				(int) (frameHeight / 6.5));
		bottom_2 = new JLayeredPane();
		bottom_2.setBounds((int) (frameHeight / 6.5 * 1.5),
				(int) (frameHeight / 6.5 * 5.5), (int) (frameHeight / 13),
				(int) (frameHeight / 6.5));
		bottom_3 = new JLayeredPane();
		bottom_3.setBounds((int) (frameHeight / 6.5 * 2),
				(int) (frameHeight / 6.5 * 5.5), (int) (frameHeight / 13),
				(int) (frameHeight / 6.5));
		bottom_4 = new JLayeredPane();
		bottom_4.setBounds((int) (frameHeight / 6.5 * 2.5),
				(int) (frameHeight / 6.5 * 5.5), (int) (frameHeight / 13),
				(int) (frameHeight / 6.5));
		bottom_5 = new JLayeredPane();
		bottom_5.setBounds((int) (frameHeight / 6.5 * 3),
				(int) (frameHeight / 6.5 * 5.5), (int) (frameHeight / 13),
				(int) (frameHeight / 6.5));
		bottom_6 = new JLayeredPane();
		bottom_6.setBounds((int) (frameHeight / 6.5 * 3.5),
				(int) (frameHeight / 6.5 * 5.5), (int) (frameHeight / 13),
				(int) (frameHeight / 6.5));
		bottom_7 = new JLayeredPane();
		bottom_7.setBounds((int) (frameHeight / 6.5 * 4),
				(int) (frameHeight / 6.5 * 5.5), (int) (frameHeight / 13),
				(int) (frameHeight / 6.5));
		bottom_8 = new JLayeredPane();
		bottom_8.setBounds((int) (frameHeight / 6.5 * 4.5),
				(int) (frameHeight / 6.5 * 5.5), (int) (frameHeight / 13),
				(int) (frameHeight / 6.5));
		bottom_9 = new JLayeredPane();
		bottom_9.setBounds((int) (frameHeight / 6.5 * 5),
				(int) (frameHeight / 6.5 * 5.5), (int) (frameHeight / 13),
				(int) (frameHeight / 6.5));
		bottomRight = new JLayeredPane();
		bottomRight.setBounds((int) (frameHeight / 6.5 * 5.5),
				(int) (frameHeight / 6.5 * 5.5), (int) (frameHeight / 6.5),
				(int) (frameHeight / 6.5));
		communityChest = new JButton();
		communityChest = new JButton("?");

		boardPanels.add(bottomRight);
		boardPanels.add(bottom_9);
		boardPanels.add(bottom_8);
		boardPanels.add(bottom_7);
		boardPanels.add(bottom_6);
		boardPanels.add(bottom_5);
		boardPanels.add(bottom_4);
		boardPanels.add(bottom_3);
		boardPanels.add(bottom_2);
		boardPanels.add(bottom_1);
		boardPanels.add(bottomLeft);
		boardPanels.add(left_9);
		boardPanels.add(left_8);
		boardPanels.add(left_7);
		boardPanels.add(left_6);
		boardPanels.add(left_5);
		boardPanels.add(left_4);
		boardPanels.add(left_3);
		boardPanels.add(left_2);
		boardPanels.add(left_1);
		boardPanels.add(topLeft);
		boardPanels.add(top_1);
		boardPanels.add(top_2);
		boardPanels.add(top_3);
		boardPanels.add(top_4);
		boardPanels.add(top_5);
		boardPanels.add(top_6);
		boardPanels.add(top_7);
		boardPanels.add(top_8);
		boardPanels.add(top_9);
		boardPanels.add(topRight);
		boardPanels.add(right_1);
		boardPanels.add(right_2);
		boardPanels.add(right_3);
		boardPanels.add(right_4);
		boardPanels.add(right_5);
		boardPanels.add(right_6);
		boardPanels.add(right_7);
		boardPanels.add(right_8);
		boardPanels.add(right_9);

		bottomRightLabel = new JLabel();
		bottomLeftLabel = new JLabel();
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/start.jpg"));
			bottomRightLabel.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/bottomLeft.jpg"));
			bottomLeftLabel.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		bottom1Label = new JLabel();
		bottom2Label = new JLabel();
		bottom3Label = new JLabel();
		bottom4Label = new JLabel();
		bottom5Label = new JLabel();
		bottom6Label = new JLabel();
		bottom7Label = new JLabel();
		bottom8Label = new JLabel();
		bottom9Label = new JLabel();
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/bottom1.jpg"));
			bottom1Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/bottom2.jpg"));
			bottom2Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/bottom3.jpg"));
			bottom3Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/bottom4.jpg"));
			bottom4Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/bottom5.jpg"));
			bottom5Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/bottom6.jpg"));
			bottom6Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/bottom7.jpg"));
			bottom7Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/bottom8.jpg"));
			bottom8Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/bottom9.jpg"));
			bottom9Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		bottom_1.setLayout(flow);
		bottom_2.setLayout(flow);
		bottom_3.setLayout(flow);
		bottom_4.setLayout(flow);
		bottom_5.setLayout(flow);
		bottom_6.setLayout(flow);
		bottom_7.setLayout(flow);
		bottom_8.setLayout(flow);
		bottom_9.setLayout(flow);
		bottomRight.setLayout(flow);
		bottomLeft.setLayout(flow);
		bottomRight.add(bottomRightLabel);
		bottomLeft.add(bottomLeftLabel);

		bottom_1.add(bottom1Label);
		bottom_2.add(bottom2Label);
		bottom_3.add(bottom3Label);
		bottom_4.add(bottom4Label);
		bottom_5.add(bottom5Label);
		bottom_6.add(bottom6Label);
		bottom_7.add(bottom7Label);
		bottom_8.add(bottom8Label);
		bottom_9.add(bottom9Label);

		left1Label = new JLabel();
		left2Label = new JLabel();
		left3Label = new JLabel();
		left4Label = new JLabel();
		left5Label = new JLabel();
		left6Label = new JLabel();
		left7Label = new JLabel();
		left8Label = new JLabel();
		left9Label = new JLabel();

		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/left1.jpg"));
			left1Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/left2.jpg"));
			left2Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/left3.jpg"));
			left3Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/left4.jpg"));
			left4Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/left5.jpg"));
			left5Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/left6.jpg"));
			left6Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/left7.jpg"));
			left7Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/left8.jpg"));
			left8Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/left9.jpg"));
			left9Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}

		left_1.setLayout(flow);
		left_2.setLayout(flow);
		left_3.setLayout(flow);
		left_4.setLayout(flow);
		left_5.setLayout(flow);
		left_6.setLayout(flow);
		left_7.setLayout(flow);
		left_8.setLayout(flow);
		left_9.setLayout(flow);
		left_1.add(left1Label);
		left_2.add(left2Label);
		left_3.add(left3Label);
		left_4.add(left4Label);
		left_5.add(left5Label);
		left_6.add(left6Label);
		left_7.add(left7Label);
		left_8.add(left8Label);
		left_9.add(left9Label);

		topLeftLabel = new JLabel();
		top1Label = new JLabel();
		top2Label = new JLabel();
		top3Label = new JLabel();
		top4Label = new JLabel();
		top5Label = new JLabel();
		top6Label = new JLabel();
		top7Label = new JLabel();
		top8Label = new JLabel();
		top9Label = new JLabel();

		topLeft.setLayout(flow);
		top_1.setLayout(flow);
		top_2.setLayout(flow);
		top_3.setLayout(flow);
		top_4.setLayout(flow);
		top_5.setLayout(flow);
		top_6.setLayout(flow);
		top_7.setLayout(flow);
		top_8.setLayout(flow);
		top_9.setLayout(flow);
		topLeft.add(topLeftLabel);
		top_1.add(top1Label);
		top_2.add(top2Label);
		top_3.add(top3Label);
		top_4.add(top4Label);
		top_5.add(top5Label);
		top_6.add(top6Label);
		top_7.add(top7Label);
		top_8.add(top8Label);
		top_9.add(top9Label);

		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/top1.jpg"));
			top1Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/top2.jpg"));
			top2Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/top3.jpg"));
			top3Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/top4.jpg"));
			top4Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/top5.jpg"));
			top5Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/top6.jpg"));
			top6Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/top7.jpg"));
			top7Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/top8.jpg"));
			top8Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/top9.jpg"));
			top9Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/topLeft.jpg"));
			topLeftLabel.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}

		topRightLabel = new JLabel();
		right1Label = new JLabel();
		right2Label = new JLabel();
		right3Label = new JLabel();
		right4Label = new JLabel();
		right5Label = new JLabel();
		right6Label = new JLabel();
		right7Label = new JLabel();
		right8Label = new JLabel();
		right9Label = new JLabel();

		topRight.setLayout(flow);
		right_1.setLayout(flow);
		right_2.setLayout(flow);
		right_3.setLayout(flow);
		right_4.setLayout(flow);
		right_5.setLayout(flow);
		right_6.setLayout(flow);
		right_7.setLayout(flow);
		right_8.setLayout(flow);
		right_9.setLayout(flow);
		topRight.add(topRightLabel);
		right_1.add(right1Label);
		right_2.add(right2Label);
		right_3.add(right3Label);
		right_4.add(right4Label);
		right_5.add(right5Label);
		right_6.add(right6Label);
		right_7.add(right7Label);
		right_8.add(right8Label);
		right_9.add(right9Label);

		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/right1.jpg"));
			right1Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/right2.jpg"));
			right2Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/right3.jpg"));
			right3Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/right4.jpg"));
			right4Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/right5.jpg"));
			right5Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/right6.jpg"));
			right6Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/right7.jpg"));
			right7Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/right8.jpg"));
			right8Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/right9.jpg"));
			right9Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/topRight.jpg"));
			topRightLabel.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		communityChest = new JButton();
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/chest.jpg"));
			communityChest.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		communityChest.setBounds((int) (frameHeight / 6.5 * 1.125),
				(int) (frameHeight / 6.5 * 1.125), (int) (frameHeight / 3.33),
				(int) (frameHeight / 5));
		communityChest.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		communityChest.setBorderPainted(false);
		communityChest.setContentAreaFilled(false);
		// communityChest.setEnabled(false);
		chanceButton = new JButton();
		chanceButton.setBounds((int) (frameHeight / 6.5 * 3.5),
				(int) (frameHeight / 6.5 * 4), (int) (frameHeight / 3.33),
				(int) (frameHeight / 5));
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/chance.jpg"));
			chanceButton.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}

		chanceButton.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		chanceButton.setBorderPainted(false);
		chanceButton.setContentAreaFilled(false);
		// chanceButton.setEnabled(false);
		player_1 = new JLayeredPane();
		player_1.setBounds(frameHeight + 40, 0, (int) (frameHeight / 4),
				(int) (frameHeight / 6.5));
		player_1.setBorder(BorderFactory.createLineBorder(Color.black));
		player1name = new JTextField();
		player1name.setBounds(20, 10, 140, 30);
		player1name.setFont(new Font("Arial", Font.ITALIC, 14));
		player1name.setHorizontalAlignment(SwingConstants.CENTER);
		player1name.setVisible(false);
		player_1.add(player1name);

		player_2 = new JLayeredPane();
		player_2.setBounds(frameHeight + 40 + (int) (frameHeight / 4), 0,
				(int) (frameHeight / 4), (int) (frameHeight / 6.5));
		player_2.setBorder(BorderFactory.createLineBorder(Color.black));
		player2name = new JTextField();
		player2name.setBounds(20, 10, 140, 30);
		player2name.setFont(new Font("Arial", Font.ITALIC, 14));
		player2name.setHorizontalAlignment(SwingConstants.CENTER);
		player2name.setVisible(false);
		player_2.add(player2name);

		player_3 = new JLayeredPane();
		player_3.setBounds(frameHeight + 40 + (int) (frameHeight / 2), 0,
				(int) (frameHeight / 4), (int) (frameHeight / 6.5));
		player_3.setBorder(BorderFactory.createLineBorder(Color.black));
		player3name = new JTextField();
		player3name.setBounds(20, 10, 140, 30);
		player3name.setFont(new Font("Arial", Font.ITALIC, 14));
		player3name.setHorizontalAlignment(SwingConstants.CENTER);
		player3name.setVisible(false);
		player_3.add(player3name);

		player_4 = new JLayeredPane();
		player_4.setBounds(frameHeight + 40, (int) (frameHeight / 6.5),
				(int) (frameHeight / 4), (int) (frameHeight / 6.5));
		player_4.setBorder(BorderFactory.createLineBorder(Color.black));
		player4name = new JTextField();
		player4name.setBounds(20, 10, 140, 30);
		player4name.setFont(new Font("Arial", Font.ITALIC, 14));
		player4name.setHorizontalAlignment(SwingConstants.CENTER);
		player4name.setVisible(false);
		player_4.add(player4name);

		player_5 = new JLayeredPane();
		player_5.setBounds(frameHeight + 40 + (int) (frameHeight / 4),
				(int) (frameHeight / 6.5), (int) (frameHeight / 4),
				(int) (frameHeight / 6.5));
		player_5.setBorder(BorderFactory.createLineBorder(Color.black));
		player5name = new JTextField();
		player5name.setBounds(20, 10, 140, 30);
		player5name.setFont(new Font("Arial", Font.ITALIC, 14));
		player5name.setHorizontalAlignment(SwingConstants.CENTER);
		player5name.setVisible(false);
		player_5.add(player5name);

		player_6 = new JLayeredPane();
		player_6.setBounds(frameHeight + 40 + (int) (frameHeight / 2),
				(int) (frameHeight / 6.5), (int) (frameHeight / 4),
				(int) (frameHeight / 6.5));
		player_6.setBorder(BorderFactory.createLineBorder(Color.black));
		player6name = new JTextField();
		player6name.setBounds(20, 10, 140, 30);
		player6name.setFont(new Font("Arial", Font.ITALIC, 14));
		player6name.setHorizontalAlignment(SwingConstants.CENTER);
		player6name.setVisible(false);
		player_6.add(player6name);
		gameConsole = new JLayeredPane();
		gamePrompt = new JLabel();
		gamePrompt.setBounds(frameHeight + 50, (int) (frameHeight / 2 + 15),
				(int) (frameHeight / 4) * 3 - 20, 15);
		// ////////////////////
		// ////////////////////
		pay50toGetOutOfJail = new JButton("pay M50 to get out of Jail");
		pay50toGetOutOfJail.setBounds(frameHeight + 200,
				(int) (frameHeight / 2 + 60), 230, 20);
		pay50toGetOutOfJail.setVisible(false);
		gamePrompt.setHorizontalAlignment(SwingConstants.CENTER);
		gamePrompt.setForeground(Color.RED);
		useGetOutOfJailCard = new JButton("use the card");
		dontUseGetOutOfJailCard = new JButton("don't use the card");
		useGetOutOfJailCard.setBounds(frameHeight + 150,
				(int) (frameHeight / 2 + 35), 160, 20);
		dontUseGetOutOfJailCard.setBounds(frameHeight + 320,
				(int) (frameHeight / 2 + 35), 160, 20);
		useGetOutOfJailCard.setVisible(false);
		dontUseGetOutOfJailCard.setVisible(false);
		logText = new JTextArea();
		logText.setFont(new Font("Arial", Font.BOLD, 12));
		log = "  /> the Game has started\n";
		logText.append(log);
		gameLog = new JScrollPane(logText);
		gameConsole.setBounds(frameHeight + 40, (int) (frameHeight / 2),
				(int) (frameHeight / 4) * 3, (int) (frameHeight / 2.8));
		gameLog.setBounds(frameHeight + 40, (int) (frameHeight / 3.25 + 20),
				(int) (frameHeight / 4) * 3, (int) (frameHeight / 6.5));
		gameLog.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		Border lined = BorderFactory.createLineBorder(Color.black, 1);
		Border innerGameLog1 = BorderFactory.createTitledBorder(lined,
				"Game info:", 2, 2, new Font("Arial", Font.ITALIC, 12),
				Color.black);
		Border innerGameConsole1 = BorderFactory.createTitledBorder(lined,
				"Game console:", 2, 2, new Font("Arial", Font.ITALIC, 12),
				Color.black);
		Border outerBorder = BorderFactory.createEmptyBorder(2, 0, 2, 0);
		gameLog.setBorder(BorderFactory.createCompoundBorder(outerBorder,
				innerGameLog1));
		gameConsole.setBorder(BorderFactory.createCompoundBorder(outerBorder,
				innerGameConsole1));

		gameLog.setVisible(false);
		addPlayer1Name = new JButton("Add player's name");
		addPlayer2Name = new JButton("Add player's name");
		addPlayer3Name = new JButton("Add player's name");
		addPlayer4Name = new JButton("Add player's name");
		addPlayer5Name = new JButton("Add player's name");
		addPlayer6Name = new JButton("Add player's name");
		addPlayer1Name.setBounds(frameHeight + 60, 45, 140, 40);
		addPlayer2Name.setBounds(frameHeight + 60 + (int) (frameHeight / 4),
				45, 140, 40);
		addPlayer3Name.setBounds(frameHeight + 60 + (int) (frameHeight / 2),
				45, 140, 40);
		addPlayer4Name.setBounds(frameHeight + 60,
				(int) (frameHeight / 6.5) + 45, 140, 40);
		addPlayer5Name.setBounds(frameHeight + 60 + (int) (frameHeight / 4),
				(int) (frameHeight / 6.5) + 45, 140, 40);
		addPlayer6Name.setBounds(frameHeight + 60 + (int) (frameHeight / 2),
				(int) (frameHeight / 6.5) + 45, 140, 40);
		addPlayer1Name.setVisible(false);
		addPlayer2Name.setVisible(false);
		addPlayer3Name.setVisible(false);
		addPlayer4Name.setVisible(false);
		addPlayer5Name.setVisible(false);
		addPlayer6Name.setVisible(false);

		addPlayer1 = new JButton();
		player1nameLabel = new JLabel();
		player1balance = new JLabel();
		balanceLabels.add(player1balance);
		player1nameLabel.setBounds(frameHeight + 60, 5, 140, 40);
		player1balance.setBounds(frameHeight + 60, 20, 140, 40);
		addPlayer1.setBounds(frameHeight + 60, 35, 140, 40);
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/addplayer.jpg"));
			addPlayer1.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		addPlayer1.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		addPlayer1.setBorderPainted(false);
		addPlayer1.setContentAreaFilled(false);
		addPlayer1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				addPlayer1.setVisible(false);
				player1name.setVisible(true);
				addPlayer1Name.setVisible(true);
				addPlayer1Name.setEnabled(false);
			}
		});
		// length of the player1' name is to be between 3-10 characters
		player1name.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void changedUpdate(DocumentEvent e) {
				checkName();
			}

			@Override
			public void insertUpdate(DocumentEvent e) {
				checkName();
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				checkName();
			}

			public void checkName() {
				String name = player1name.getText();
				if (name.length() > 2 && name.length() <= 10) {
					addPlayer1Name.setEnabled(true);
				} else {
					addPlayer1Name.setEnabled(false);
				}
			}
		});
		addPlayer1Name.addActionListener(new ActionListener() {
			// adds first player to the ArrayList of players
			@Override
			public void actionPerformed(ActionEvent arg0) {
				players.add(new Player(player1name.getText()));
				player1nameLabel.setText(player1name.getText());
				player1nameLabel.setForeground(Color.RED);
				player1nameLabel.setFont(new Font("Arial", Font.ITALIC, 14));
				player1balance.setText("E"
						+ String.valueOf(players.get(0).getMoneyHeld()));
				player1balance.setFont(new Font("Arial", Font.ITALIC, 14));
				frame.getContentPane().add(player1nameLabel);
				frame.getContentPane().add(player1balance);
				System.out.println(players.get(0).getName());
				player1name.setVisible(false);
				addPlayer1Name.setVisible(false);
				addPlayer2.setEnabled(true);
				// test //
				for (int i = 0; i < entities.getEntities().size(); i++) {
					players.get(0).getOwnedProperties()
							.add(entities.getEntities().get(i));
				}

				// highlights panels representing owned properties
				player_1.addMouseListener(new MouseListener() {

					@Override
					public void mouseClicked(MouseEvent arg0) {

					}

					@Override
					public void mouseEntered(MouseEvent arg0) {

						for (Entity property : players.get(0)
								.getOwnedProperties()) {
							if (property.getPosition() < 10) {
								boardPanels.get(property.getPosition())
										.setBorder(
												BorderFactory
														.createMatteBorder(4,
																0, 0, 0,
																Color.red));
							} else if (property.getPosition() < 20) {
								boardPanels.get(property.getPosition())
										.setBorder(
												BorderFactory
														.createMatteBorder(0,
																0, 0, 6,
																Color.red));
							} else if (property.getPosition() < 30) {
								boardPanels.get(property.getPosition())
										.setBorder(
												BorderFactory
														.createMatteBorder(4,
																0, 0, 0,
																Color.red));
							} else {
								boardPanels.get(property.getPosition())
										.setBorder(
												BorderFactory
														.createMatteBorder(0,
																5, 0, 0,
																Color.red));
							}

						}
					}

					@Override
					public void mouseExited(MouseEvent arg0) {
						for (Entity property : players.get(0)
								.getOwnedProperties()) {
							boardPanels.get(property.getPosition()).setBorder(
									BorderFactory.createEmptyBorder());
						}
					}

					@Override
					public void mousePressed(MouseEvent arg0) {

					}

					@Override
					public void mouseReleased(MouseEvent arg0) {

					}

				});
				p1 = new JPanel();
				player1 = new JLayeredPane();
				player1.setBounds(frameHeight - 80, frameHeight - 80, 20, 20);

				p1.setSize(15, 15);
				p1.setBackground(Color.red);
				player1.add(p1);
				frame.getContentPane().add(player1, 1);
				playerIndicators.add(player1);
			}

		});
		addPlayer2 = new JButton();
		addPlayer2.setBounds(frameHeight + 60 + (int) (frameHeight / 4), 35,
				140, 40);
		player2nameLabel = new JLabel();
		player2balance = new JLabel();
		balanceLabels.add(player2balance);
		player2balance.setBounds(frameHeight + 60 + (int) (frameHeight / 4),
				20, 140, 40);
		player2nameLabel.setBounds(frameHeight + 60 + (int) (frameHeight / 4),
				5, 140, 40);
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/addplayer.jpg"));
			addPlayer2.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		addPlayer2.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		addPlayer2.setBorderPainted(false);
		addPlayer2.setContentAreaFilled(false);
		addPlayer2.setEnabled(false);
		addPlayer2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				addPlayer2.setVisible(false);
				player2name.setVisible(true);
				addPlayer2Name.setVisible(true);
				addPlayer2Name.setEnabled(false);
			}
		});

		player2name.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void changedUpdate(DocumentEvent e) {
				checkName();
			}

			@Override
			public void insertUpdate(DocumentEvent e) {
				checkName();
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				checkName();
			}

			// names are to be unique
			public void checkName() {
				String name = player2name.getText();
				if (name.length() > 2 && name.length() <= 10
						&& !name.equals(players.get(0).getName())) {
					addPlayer2Name.setEnabled(true);
				} else {
					addPlayer2Name.setEnabled(false);
				}
			}
		});
		addPlayer2Name.addActionListener(new ActionListener() {
			// adds second player to the ArrayList of players
			@Override
			public void actionPerformed(ActionEvent arg0) {
				players.add(new Player(player2name.getText()));
				player2nameLabel.setText(player2name.getText());
				player2nameLabel.setForeground(Color.BLUE);
				player2nameLabel.setFont(new Font("Arial", Font.ITALIC, 14));
				player2balance.setText("E"
						+ String.valueOf(players.get(1).getMoneyHeld()));
				player2balance.setFont(new Font("Arial", Font.ITALIC, 14));
				frame.getContentPane().add(player2nameLabel);
				frame.getContentPane().add(player2balance);
				System.out.println(players.get(1).getName());
				player2name.setVisible(false);
				addPlayer2Name.setVisible(false);
				addPlayer3.setEnabled(true);
				startGame.setEnabled(true); // after creating two players, the
											// game can be started

				// test //
				for (int i = 0; i < entities.getEntities().size(); i++) {
					players.get(1).getOwnedProperties()
							.add(entities.getEntities().get(i));
				}

				// highlights panels representing owned properties
				player_2.addMouseListener(new MouseListener() {

					@Override
					public void mouseClicked(MouseEvent arg0) {

					}

					@Override
					public void mouseEntered(MouseEvent arg0) {

						for (Entity property : players.get(1)
								.getOwnedProperties()) {
							if (property.getPosition() < 10) {
								boardPanels.get(property.getPosition())
										.setBorder(
												BorderFactory
														.createMatteBorder(4,
																0, 0, 0,
																Color.blue));
							} else if (property.getPosition() < 20) {
								boardPanels.get(property.getPosition())
										.setBorder(
												BorderFactory
														.createMatteBorder(0,
																0, 0, 6,
																Color.blue));
							} else if (property.getPosition() < 30) {
								boardPanels.get(property.getPosition())
										.setBorder(
												BorderFactory
														.createMatteBorder(4,
																0, 0, 0,
																Color.blue));
							} else {
								boardPanels.get(property.getPosition())
										.setBorder(
												BorderFactory
														.createMatteBorder(0,
																5, 0, 0,
																Color.blue));
							}
						}
					}

					@Override
					public void mouseExited(MouseEvent arg0) {
						for (Entity property : players.get(1)
								.getOwnedProperties()) {
							boardPanels.get(property.getPosition()).setBorder(
									BorderFactory.createEmptyBorder());
						}
					}

					@Override
					public void mousePressed(MouseEvent arg0) {

					}

					@Override
					public void mouseReleased(MouseEvent arg0) {

					}

				});

				p2 = new JPanel();
				player2 = new JLayeredPane();
				player2.setBounds(frameHeight - 60, frameHeight - 80, 20, 20);

				p2.setSize(15, 15);
				p2.setBackground(Color.blue);
				player2.add(p2);
				frame.getContentPane().add(player2, 2);
				playerIndicators.add(player2);
			}

		});

		addPlayer3 = new JButton();
		player3nameLabel = new JLabel();
		player3balance = new JLabel();
		balanceLabels.add(player3balance);
		player3balance.setBounds(frameHeight + 60 + (int) (frameHeight / 2),
				20, 140, 40);
		player3nameLabel.setBounds(frameHeight + 60 + (int) (frameHeight / 2),
				5, 140, 40);
		addPlayer3.setBounds(frameHeight + 60 + (int) (frameHeight / 2), 35,
				140, 40);
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/addplayer.jpg"));
			addPlayer3.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		addPlayer3.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		addPlayer3.setBorderPainted(false);
		addPlayer3.setContentAreaFilled(false);
		addPlayer3.setEnabled(false);
		addPlayer3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				addPlayer3.setVisible(false);
				player3name.setVisible(true);
				addPlayer3Name.setVisible(true);
				addPlayer3Name.setEnabled(false);
			}
		});

		player3name.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void changedUpdate(DocumentEvent e) {
				checkName();
			}

			@Override
			public void insertUpdate(DocumentEvent e) {
				checkName();
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				checkName();
			}

			// names are to be unique
			public void checkName() {
				String name = player3name.getText();
				if (name.length() > 2 && name.length() <= 10
						&& !name.equals(players.get(0).getName())
						&& !name.equals(players.get(1).getName())) {
					addPlayer3Name.setEnabled(true);
				} else {
					addPlayer3Name.setEnabled(false);
				}
			}
		});

		addPlayer3Name.addActionListener(new ActionListener() {
			// adds third player to the ArrayList of players
			@Override
			public void actionPerformed(ActionEvent arg0) {
				players.add(new Player(player3name.getText()));
				player3nameLabel.setText(player3name.getText());
				player3nameLabel.setForeground(Color.BLACK);
				player3nameLabel.setFont(new Font("Arial", Font.ITALIC, 14));
				player3balance.setText("E"
						+ String.valueOf(players.get(2).getMoneyHeld()));
				player3balance.setFont(new Font("Arial", Font.ITALIC, 14));
				frame.getContentPane().add(player3nameLabel);
				frame.getContentPane().add(player3balance);
				System.out.println(players.get(2).getName());
				player3name.setVisible(false);
				addPlayer3Name.setVisible(false);
				addPlayer4.setEnabled(true);

				// test //
				for (int i = 0; i < entities.getEntities().size(); i++) {
					players.get(2).getOwnedProperties()
							.add(entities.getEntities().get(i));
				}

				// highlights panels representing owned properties
				player_3.addMouseListener(new MouseListener() {

					@Override
					public void mouseClicked(MouseEvent arg0) {

					}

					@Override
					public void mouseEntered(MouseEvent arg0) {

						for (Entity property : players.get(2)
								.getOwnedProperties()) {
							if (property.getPosition() < 10) {
								boardPanels.get(property.getPosition())
										.setBorder(
												BorderFactory
														.createMatteBorder(4,
																0, 0, 0,
																Color.black));
							} else if (property.getPosition() < 20) {
								boardPanels.get(property.getPosition())
										.setBorder(
												BorderFactory
														.createMatteBorder(0,
																0, 0, 6,
																Color.black));
							} else if (property.getPosition() < 30) {
								boardPanels.get(property.getPosition())
										.setBorder(
												BorderFactory
														.createMatteBorder(4,
																0, 0, 0,
																Color.black));
							} else {
								boardPanels.get(property.getPosition())
										.setBorder(
												BorderFactory
														.createMatteBorder(0,
																5, 0, 0,
																Color.black));
							}
						}
					}

					@Override
					public void mouseExited(MouseEvent arg0) {
						for (Entity property : players.get(2)
								.getOwnedProperties()) {
							boardPanels.get(property.getPosition()).setBorder(
									BorderFactory.createEmptyBorder());
						}
					}

					@Override
					public void mousePressed(MouseEvent arg0) {

					}

					@Override
					public void mouseReleased(MouseEvent arg0) {

					}

				});

				p3 = new JPanel();
				player3 = new JLayeredPane();
				player3.setBounds(frameHeight - 80, frameHeight - 60, 20, 20);

				p3.setSize(15, 15);
				p3.setBackground(Color.black);
				player3.add(p3);
				frame.getContentPane().add(player3, 2);
				playerIndicators.add(player3);
			}

		});

		addPlayer4 = new JButton();
		player4nameLabel = new JLabel();
		player4balance = new JLabel();
		balanceLabels.add(player4balance);
		player4balance.setBounds(frameHeight + 60,
				(int) (frameHeight / 6.5) + 20, 140, 40);
		player4nameLabel.setBounds(frameHeight + 60,
				(int) (frameHeight / 6.5) + 5, 140, 40);
		addPlayer4.setBounds(frameHeight + 60, (int) (frameHeight / 6.5) + 35,
				140, 40);
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/addplayer.jpg"));
			addPlayer4.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		addPlayer4.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		addPlayer4.setBorderPainted(false);
		addPlayer4.setContentAreaFilled(false);
		addPlayer4.setEnabled(false);
		addPlayer4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				addPlayer4.setVisible(false);
				player4name.setVisible(true);
				addPlayer4Name.setVisible(true);
				addPlayer4Name.setEnabled(false);
			}
		});

		player4name.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void changedUpdate(DocumentEvent e) {
				checkName();
			}

			@Override
			public void insertUpdate(DocumentEvent e) {
				checkName();
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				checkName();
			}

			// names are to be unique
			public void checkName() {
				String name = player4name.getText();
				if (name.length() > 2 && name.length() <= 10
						&& !name.equals(players.get(0).getName())
						&& !name.equals(players.get(1).getName())
						&& !name.equals(players.get(2).getName())) {
					addPlayer4Name.setEnabled(true);
				} else {
					addPlayer4Name.setEnabled(false);
				}
			}
		});

		addPlayer4Name.addActionListener(new ActionListener() {
			// adds fourth player to the ArrayList of players
			@Override
			public void actionPerformed(ActionEvent arg0) {
				players.add(new Player(player4name.getText()));
				player4nameLabel.setText(player4name.getText());
				player4nameLabel.setForeground(Color.GREEN);
				player4nameLabel.setFont(new Font("Arial", Font.ITALIC, 14));
				player4balance.setText("E"
						+ String.valueOf(players.get(3).getMoneyHeld()));
				player4balance.setFont(new Font("Arial", Font.ITALIC, 14));
				frame.getContentPane().add(player4nameLabel);
				frame.getContentPane().add(player4balance);
				System.out.println(players.get(3).getName());
				player4name.setVisible(false);
				addPlayer4Name.setVisible(false);
				addPlayer5.setEnabled(true);

				// test //
				for (int i = 0; i < entities.getEntities().size(); i++) {
					players.get(3).getOwnedProperties()
							.add(entities.getEntities().get(i));
				}

				// highlights panels representing owned properties
				player_4.addMouseListener(new MouseListener() {

					@Override
					public void mouseClicked(MouseEvent arg0) {

					}

					@Override
					public void mouseEntered(MouseEvent arg0) {

						for (Entity property : players.get(3)
								.getOwnedProperties()) {
							if (property.getPosition() < 10) {
								boardPanels.get(property.getPosition())
										.setBorder(
												BorderFactory
														.createMatteBorder(4,
																0, 0, 0,
																Color.green));
							} else if (property.getPosition() < 20) {
								boardPanels.get(property.getPosition())
										.setBorder(
												BorderFactory
														.createMatteBorder(0,
																0, 0, 6,
																Color.green));
							} else if (property.getPosition() < 30) {
								boardPanels.get(property.getPosition())
										.setBorder(
												BorderFactory
														.createMatteBorder(4,
																0, 0, 0,
																Color.green));
							} else {
								boardPanels.get(property.getPosition())
										.setBorder(
												BorderFactory
														.createMatteBorder(0,
																5, 0, 0,
																Color.green));
							}
						}
					}

					@Override
					public void mouseExited(MouseEvent arg0) {
						for (Entity property : players.get(3)
								.getOwnedProperties()) {
							boardPanels.get(property.getPosition()).setBorder(
									BorderFactory.createEmptyBorder());
						}
					}

					@Override
					public void mousePressed(MouseEvent arg0) {

					}

					@Override
					public void mouseReleased(MouseEvent arg0) {

					}

				});

				p4 = new JPanel();
				player4 = new JLayeredPane();
				player4.setBounds(frameHeight - 60, frameHeight - 60, 20, 20);

				p4.setSize(15, 15);
				p4.setBackground(Color.green);
				player4.add(p4);
				frame.getContentPane().add(player4, 2);
				playerIndicators.add(player4);
			}

		});

		addPlayer5 = new JButton();
		player5nameLabel = new JLabel();
		player5balance = new JLabel();
		balanceLabels.add(player5balance);
		player5balance.setBounds(frameHeight + 60 + (int) (frameHeight / 4),
				(int) (frameHeight / 6.5) + 20, 140, 40);
		player5nameLabel.setBounds(frameHeight + 60 + (int) (frameHeight / 4),
				(int) (frameHeight / 6.5) + 5, 140, 40);
		addPlayer5.setBounds(frameHeight + 60 + (int) (frameHeight / 4),
				(int) (frameHeight / 6.5) + 35, 140, 40);
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/addplayer.jpg"));
			addPlayer5.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		addPlayer5.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		addPlayer5.setBorderPainted(false);
		addPlayer5.setContentAreaFilled(false);
		addPlayer5.setEnabled(false);
		addPlayer5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				addPlayer5.setVisible(false);
				player5name.setVisible(true);
				addPlayer5Name.setVisible(true);
				addPlayer5Name.setEnabled(false);
			}
		});

		player5name.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void changedUpdate(DocumentEvent e) {
				checkName();
			}

			@Override
			public void insertUpdate(DocumentEvent e) {
				checkName();
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				checkName();
			}

			// names are to be unique
			public void checkName() {
				String name = player5name.getText();
				if (name.length() > 2 && name.length() <= 10
						&& !name.equals(players.get(0).getName())
						&& !name.equals(players.get(1).getName())
						&& !name.equals(players.get(2).getName())
						&& !name.equals(players.get(3).getName())) {
					addPlayer5Name.setEnabled(true);
				} else {
					addPlayer5Name.setEnabled(false);
				}
			}
		});

		addPlayer5Name.addActionListener(new ActionListener() {
			// adds fifth player to the ArrayList of players
			@Override
			public void actionPerformed(ActionEvent arg0) {
				players.add(new Player(player5name.getText()));
				player5nameLabel.setText(player5name.getText());
				player5nameLabel.setForeground(Color.ORANGE);
				player5nameLabel.setFont(new Font("Arial", Font.ITALIC, 14));
				player5balance.setText("E"
						+ String.valueOf(players.get(4).getMoneyHeld()));
				player5balance.setFont(new Font("Arial", Font.ITALIC, 14));
				frame.getContentPane().add(player5nameLabel);
				frame.getContentPane().add(player5balance);
				System.out.println(players.get(4).getName());
				player5name.setVisible(false);
				addPlayer5Name.setVisible(false);
				addPlayer6.setEnabled(true);

				// test //
				for (int i = 0; i < entities.getEntities().size(); i++) {
					players.get(4).getOwnedProperties()
							.add(entities.getEntities().get(i));
				}

				// highlights panels representing owned properties
				player_5.addMouseListener(new MouseListener() {

					@Override
					public void mouseClicked(MouseEvent arg0) {

					}

					@Override
					public void mouseEntered(MouseEvent arg0) {

						for (Entity property : players.get(4)
								.getOwnedProperties()) {
							if (property.getPosition() < 10) {
								boardPanels.get(property.getPosition())
										.setBorder(
												BorderFactory
														.createMatteBorder(4,
																0, 0, 0,
																Color.orange));
							} else if (property.getPosition() < 20) {
								boardPanels.get(property.getPosition())
										.setBorder(
												BorderFactory
														.createMatteBorder(0,
																0, 0, 6,
																Color.orange));
							} else if (property.getPosition() < 30) {
								boardPanels.get(property.getPosition())
										.setBorder(
												BorderFactory
														.createMatteBorder(4,
																0, 0, 0,
																Color.orange));
							} else {
								boardPanels.get(property.getPosition())
										.setBorder(
												BorderFactory
														.createMatteBorder(0,
																5, 0, 0,
																Color.orange));
							}
						}
					}

					@Override
					public void mouseExited(MouseEvent arg0) {
						for (Entity property : players.get(4)
								.getOwnedProperties()) {
							boardPanels.get(property.getPosition()).setBorder(
									BorderFactory.createEmptyBorder());
						}
					}

					@Override
					public void mousePressed(MouseEvent arg0) {

					}

					@Override
					public void mouseReleased(MouseEvent arg0) {

					}

				});

				p5 = new JPanel();
				player5 = new JLayeredPane();
				player5.setBounds(frameHeight - 80, frameHeight - 40, 20, 20);

				p5.setSize(15, 15);
				p5.setBackground(Color.orange);
				player5.add(p5);
				frame.getContentPane().add(player5, 2);
				playerIndicators.add(player5);
			}

		});

		addPlayer6 = new JButton();
		player6nameLabel = new JLabel();
		player6balance = new JLabel();
		balanceLabels.add(player6balance);
		player6balance.setBounds(frameHeight + 60 + (int) (frameHeight / 2),
				(int) (frameHeight / 6.5) + 20, 140, 40);
		player6nameLabel.setBounds(frameHeight + 60 + (int) (frameHeight / 2),
				(int) (frameHeight / 6.5) + 5, 140, 40);
		addPlayer6.setBounds(frameHeight + 60 + (int) (frameHeight / 2),
				(int) (frameHeight / 6.5) + 35, 140, 40);
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/addplayer.jpg"));
			addPlayer6.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		addPlayer6.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		addPlayer6.setBorderPainted(false);
		addPlayer6.setContentAreaFilled(false);
		addPlayer6.setEnabled(false);
		addPlayer6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				addPlayer6.setVisible(false);
				player6name.setVisible(true);
				addPlayer6Name.setVisible(true);
				addPlayer6Name.setEnabled(false);
			}
		});

		player6name.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void changedUpdate(DocumentEvent e) {
				checkName();
			}

			@Override
			public void insertUpdate(DocumentEvent e) {
				checkName();
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				checkName();
			}

			// names are to be unique
			public void checkName() {
				String name = player6name.getText();
				if (name.length() > 2 && name.length() <= 10
						&& !name.equals(players.get(0).getName())
						&& !name.equals(players.get(1).getName())
						&& !name.equals(players.get(2).getName())
						&& !name.equals(players.get(3).getName())
						&& !name.equals(players.get(4).getName())) {
					addPlayer6Name.setEnabled(true);
				} else {
					addPlayer6Name.setEnabled(false);
				}
			}
		});

		addPlayer6Name.addActionListener(new ActionListener() {
			// adds sixth player to the ArrayList of players
			@Override
			public void actionPerformed(ActionEvent arg0) {
				players.add(new Player(player6name.getText()));
				player6nameLabel.setText(player6name.getText());
				player6nameLabel.setForeground(Color.magenta);
				player6nameLabel.setFont(new Font("Arial", Font.ITALIC, 14));
				player6balance.setText("E"
						+ String.valueOf(players.get(5).getMoneyHeld()));
				player6balance.setFont(new Font("Arial", Font.ITALIC, 14));
				frame.getContentPane().add(player6nameLabel);
				frame.getContentPane().add(player6balance);
				System.out.println(players.get(5).getName());
				player6name.setVisible(false);
				addPlayer6Name.setVisible(false);

				// test //
				for (int i = 0; i < entities.getEntities().size(); i++) {
					players.get(5).getOwnedProperties()
							.add(entities.getEntities().get(i));
				}

				// highlights panels representing owned properties
				player_6.addMouseListener(new MouseListener() {

					@Override
					public void mouseClicked(MouseEvent arg0) {

					}

					@Override
					public void mouseEntered(MouseEvent arg0) {

						for (Entity property : players.get(5)
								.getOwnedProperties()) {
							if (property.getPosition() < 10) {
								boardPanels.get(property.getPosition())
										.setBorder(
												BorderFactory
														.createMatteBorder(4,
																0, 0, 0,
																Color.magenta));
							} else if (property.getPosition() < 20) {
								boardPanels.get(property.getPosition())
										.setBorder(
												BorderFactory
														.createMatteBorder(0,
																0, 0, 6,
																Color.magenta));
							} else if (property.getPosition() < 30) {
								boardPanels.get(property.getPosition())
										.setBorder(
												BorderFactory
														.createMatteBorder(4,
																0, 0, 0,
																Color.magenta));
							} else {
								boardPanels.get(property.getPosition())
										.setBorder(
												BorderFactory
														.createMatteBorder(0,
																5, 0, 0,
																Color.magenta));
							}

						}
					}

					@Override
					public void mouseExited(MouseEvent arg0) {
						for (Entity property : players.get(5)
								.getOwnedProperties()) {
							boardPanels.get(property.getPosition()).setBorder(
									BorderFactory.createEmptyBorder());
						}
					}

					@Override
					public void mousePressed(MouseEvent arg0) {

					}

					@Override
					public void mouseReleased(MouseEvent arg0) {

					}

				});

				p6 = new JPanel();
				player6 = new JLayeredPane();
				player6.setBounds(frameHeight - 60, frameHeight - 40, 20, 20);

				p6.setSize(15, 15);
				p6.setBackground(Color.magenta);
				player6.add(p6);
				frame.getContentPane().add(player6, 2);
				playerIndicators.add(player6);
			}

		});

		startGame = new JButton();
		finishTurn = new JButton();
		startGame.setBounds(frameHeight + 60 + (int) (frameHeight / 4),
				(int) (frameHeight / 3), 140, 40);
		finishTurn.setBounds(frameHeight + 60 + (int) (frameHeight / 4),
				frameHeight - 80, 140, 40);
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/startthegame.jpg"));
			startGame.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/finishturn.jpg"));
			finishTurn.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		startGame.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		startGame.setBorderPainted(false);
		startGame.setContentAreaFilled(false);
		startGame.setEnabled(false);
		finishTurn.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		finishTurn.setBorderPainted(false);
		finishTurn.setContentAreaFilled(false);
		finishTurn.setEnabled(false);
		finishTurn.setVisible(false);
		startGame.addActionListener(new ActionListener() {
			// to make sure that no player can be added after the startGame
			// button is pressed
			// all relevant components are set to be invisible
			@Override
			public void actionPerformed(ActionEvent arg0) {
				addPlayer3.setVisible(false);
				addPlayer3Name.setVisible(false);
				player3name.setVisible(false);
				addPlayer4.setVisible(false);
				player4name.setVisible(false);
				addPlayer4Name.setVisible(false);
				addPlayer5.setVisible(false);
				player5name.setVisible(false);
				addPlayer5Name.setVisible(false);
				addPlayer6.setVisible(false);
				player6name.setVisible(false);
				addPlayer6Name.setVisible(false);
				startNewGame();
			}
		});
		frame.getContentPane().add(player_1);
		frame.getContentPane().add(player_2);
		frame.getContentPane().add(player_3);
		frame.getContentPane().add(player_4);
		frame.getContentPane().add(player_5);
		frame.getContentPane().add(player_6);
		frame.getContentPane().add(bottomLeft, -1);
		frame.getContentPane().add(topLeft, -1);
		frame.getContentPane().add(left_1, -1);
		frame.getContentPane().add(left_2, -1);
		frame.getContentPane().add(left_3, -1);
		frame.getContentPane().add(left_4, -1);
		frame.getContentPane().add(left_5, -1);
		frame.getContentPane().add(left_6, -1);
		frame.getContentPane().add(left_7, -1);
		frame.getContentPane().add(left_8, -1);
		frame.getContentPane().add(left_9, -1);
		frame.getContentPane().add(top_1, -1);
		frame.getContentPane().add(top_2, -1);
		frame.getContentPane().add(top_3, -1);
		frame.getContentPane().add(top_4, -1);
		frame.getContentPane().add(top_5, -1);
		frame.getContentPane().add(top_6, -1);
		frame.getContentPane().add(top_7, -1);
		frame.getContentPane().add(top_8, -1);
		frame.getContentPane().add(top_9, -1);
		frame.getContentPane().add(topRight, -1);
		frame.getContentPane().add(right_1, -1);
		frame.getContentPane().add(right_2, -1);
		frame.getContentPane().add(right_3, -1);
		frame.getContentPane().add(right_4, -1);
		frame.getContentPane().add(right_5, -1);
		frame.getContentPane().add(right_6, -1);
		frame.getContentPane().add(right_7, -1);
		frame.getContentPane().add(right_8, -1);
		frame.getContentPane().add(right_9, -1);
		frame.getContentPane().add(bottom_1, -1);
		frame.getContentPane().add(bottom_2, -1);
		frame.getContentPane().add(bottom_3, -1);
		frame.getContentPane().add(bottom_4, -1);
		frame.getContentPane().add(bottom_5, -1);
		frame.getContentPane().add(bottom_6, -1);
		frame.getContentPane().add(bottom_7, -1);
		frame.getContentPane().add(bottom_8, -1);
		frame.getContentPane().add(bottom_9, -1);
		frame.getContentPane().add(bottomRight, -1);
		frame.getContentPane().add(communityChest, -1);
		frame.getContentPane().add(chanceButton, -1);
		frame.getContentPane().add(addPlayer1);
		frame.getContentPane().add(addPlayer2);
		frame.getContentPane().add(addPlayer3);
		frame.getContentPane().add(addPlayer4);
		frame.getContentPane().add(addPlayer5);
		frame.getContentPane().add(addPlayer6);
		frame.getContentPane().add(addPlayer1Name);
		frame.getContentPane().add(addPlayer2Name);
		frame.getContentPane().add(addPlayer3Name);
		frame.getContentPane().add(addPlayer4Name);
		frame.getContentPane().add(addPlayer5Name);
		frame.getContentPane().add(addPlayer6Name);
		frame.getContentPane().add(startGame);
		frame.getContentPane().add(gameLog);
		frame.getContentPane().add(gameConsole);
		frame.getContentPane().add(useGetOutOfJailCard);
		frame.getContentPane().add(dontUseGetOutOfJailCard);

		rollTheDice = new JButton();
		rollTheDice.setBounds(frameHeight / 2 - 70, frameHeight / 2 + 40, 140,
				40);
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/rollthedice.jpg"));
			rollTheDice.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		rollTheDice.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		rollTheDice.setBorderPainted(false);
		rollTheDice.setContentAreaFilled(false);
		rollTheDice.setVisible(false);
		dice1 = new JLabel();
		dice1.setBounds(frameHeight / 2 - 110, frameHeight / 2 - 70, 100, 100);
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/dice6.jpg"));
			dice1.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		dice2 = new JLabel();
		dice2.setBounds(frameHeight / 2, frameHeight / 2 - 70, 100, 100);
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/dice6.jpg"));
			dice2.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		dice1.setVisible(false);
		dice2.setVisible(false);
		frame.getContentPane().add(rollTheDice);
		frame.getContentPane().add(dice1);
		frame.getContentPane().add(dice2);
		frame.getContentPane().add(finishTurn);
		frame.getContentPane().add(gamePrompt);
		frame.getContentPane().add(pay50toGetOutOfJail);

	}

	private void startNewGame() {
		startGame.setVisible(false);
		gameLog.setVisible(true);
		finishTurn.setVisible(true);
		rollTheDice.setVisible(true);
		dice1.setVisible(true);
		dice2.setVisible(true);
		rollTheDice.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				randomDice1 = random.nextInt(6) + 1;
				randomDice2 = random.nextInt(6) + 1;
				System.out.println(randomDice1);
				System.out.println(randomDice2);
				switch (randomDice1) {
				case 1:
					try {
						Image img = ImageIO.read(getClass().getResource(
								"../resources/dice1.jpg"));
						dice1.setIcon(new ImageIcon(img));
					} catch (IOException ex) {
					}
					break;
				case 2:
					try {
						Image img = ImageIO.read(getClass().getResource(
								"../resources/dice2.jpg"));
						dice1.setIcon(new ImageIcon(img));
					} catch (IOException ex) {
					}
					break;
				case 3:
					try {
						Image img = ImageIO.read(getClass().getResource(
								"../resources/dice3.jpg"));
						dice1.setIcon(new ImageIcon(img));
					} catch (IOException ex) {
					}
					break;
				case 4:
					try {
						Image img = ImageIO.read(getClass().getResource(
								"../resources/dice4.jpg"));
						dice1.setIcon(new ImageIcon(img));
					} catch (IOException ex) {
					}
					break;
				case 5:
					try {
						Image img = ImageIO.read(getClass().getResource(
								"../resources/dice5.jpg"));
						dice1.setIcon(new ImageIcon(img));
					} catch (IOException ex) {
					}
					break;
				case 6:
					try {
						Image img = ImageIO.read(getClass().getResource(
								"../resources/dice6.jpg"));
						dice1.setIcon(new ImageIcon(img));
					} catch (IOException ex) {
					}
					break;
				}
				switch (randomDice2) {
				case 1:
					try {
						Image img = ImageIO.read(getClass().getResource(
								"../resources/dice1.jpg"));
						dice2.setIcon(new ImageIcon(img));
					} catch (IOException ex) {
					}
					break;
				case 2:
					try {
						Image img = ImageIO.read(getClass().getResource(
								"../resources/dice2.jpg"));
						dice2.setIcon(new ImageIcon(img));
					} catch (IOException ex) {
					}
					break;
				case 3:
					try {
						Image img = ImageIO.read(getClass().getResource(
								"../resources/dice3.jpg"));
						dice2.setIcon(new ImageIcon(img));
					} catch (IOException ex) {
					}
					break;
				case 4:
					try {
						Image img = ImageIO.read(getClass().getResource(
								"../resources/dice4.jpg"));
						dice2.setIcon(new ImageIcon(img));
					} catch (IOException ex) {
					}
					break;
				case 5:
					try {
						Image img = ImageIO.read(getClass().getResource(
								"../resources/dice5.jpg"));
						dice2.setIcon(new ImageIcon(img));
					} catch (IOException ex) {
					}
					break;
				case 6:
					try {
						Image img = ImageIO.read(getClass().getResource(
								"../resources/dice6.jpg"));
						dice2.setIcon(new ImageIcon(img));
					} catch (IOException ex) {
					}
					break;
				}
				if (!extraRollNeeded) {
					if (!(randomDice1 == randomDice2)) {
						finishTurn.setEnabled(true);
						rollTheDice.setEnabled(false);
						players.get(playerIndex).setPositionOnGameBoard(
								randomDice1 + randomDice2);
					} else {
						doubleCounter++;
						players.get(playerIndex).setPositionOnGameBoard(
								randomDice1 + randomDice2);
					} // three doubles - player goes to the jail
					if (doubleCounter == 3
							|| players.get(playerIndex)
									.getPositionOnGameBoard() == 30) {
						if (players.get(playerIndex)
								.getNumberOfGetOutOfJailCards() == 0) {
							finishTurn.setEnabled(true);
							rollTheDice.setEnabled(false);
							players.get(playerIndex).setInJail(true);
							if (doubleCounter < 3) {
								log = "  /> "
										+ players.get(playerIndex).getName()
										+ " went to Jail" + "\n";
								logText.append(log);
							} else {
								log = "  /> "
										+ players.get(playerIndex).getName()
										+ " went to Jail for rolling 3 doubles "
										+ "\n";
								logText.append(log);
							}
							players.get(playerIndex).setPositionOnGameBoard(
									10 - players.get(playerIndex)
											.getPositionOnGameBoard());
							adjustPlayerPosition();
							System.out.println(players.get(playerIndex)
									.getName()
									+ " "
									+ players.get(playerIndex)
											.getPositionOnGameBoard()
									+ " in Jail: "
									+ players.get(playerIndex).isInJail());
							doubleCounter = 0;
						} else {
							gamePrompt
									.setText("Do you want to use your get out of jail card?");
							useGetOutOfJailCard.setVisible(true);
							dontUseGetOutOfJailCard.setVisible(true);
							rollTheDice.setEnabled(false);
						}
					} else {
						adjustPlayerPosition();
						System.out.println(players.get(playerIndex).getName()
								+ " "
								+ players.get(playerIndex)
										.getPositionOnGameBoard());
					}
				} else {
					if (players.get(playerIndex).isInJail()) {
						if (!(randomDice1 == randomDice2)) {
							if (players.get(playerIndex).getTurnsInJail() == 1) {
								log = "  /> "
										+ players.get(playerIndex).getName()
										+ " has his/her balance deducted by M50 and got out of Jail"
										+ "\n";
								logText.append(log);
							} else {
								players.get(playerIndex).setTurnsInJail(1);
								useGetOutOfJailCard.setVisible(false);
								pay50toGetOutOfJail.setVisible(false);
								gamePrompt.setText("");
							}
							rollTheDice.setEnabled(false);
							finishTurn.setEnabled(true);
						} else {
							players.get(playerIndex).setInJail(false);
							players.get(playerIndex).setTurnsInJail(0);
							useGetOutOfJailCard.setVisible(false);
							pay50toGetOutOfJail.setVisible(false);
							log = "  /> "
									+ players.get(playerIndex).getName()
									+ " rolled double and got out of Jail"
									+ "\n";
							logText.append(log);
							gamePrompt.setText("");
							extraRollNeeded = false;
						}
					}
				}
			}

		});

		pay50toGetOutOfJail.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				players.get(playerIndex).setMoneyHeld(-50);
				pay50toGetOutOfJail.setVisible(false);
				useGetOutOfJailCard.setVisible(false);
				rollTheDice.setEnabled(true);
				players.get(playerIndex).setInJail(false);
				players.get(playerIndex).setTurnsInJail(0);
				pay50toGetOutOfJail.setVisible(false);
				log = "  /> " + players.get(playerIndex).getName()
						+ " paid M50 to get out of Jail" + "\n";
				logText.append(log);
				gamePrompt.setText("");
				extraRollNeeded = false;
			}

		});

		useGetOutOfJailCard.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (!players.get(playerIndex).isInJail()) {
					finishTurn.setEnabled(true);
					log = "  /> "
							+ players.get(playerIndex).getName()
							+ " used his/her get out of Jail card to avoid going to Jail"
							+ "\n";
					logText.append(log);
				} else {
					rollTheDice.setEnabled(true);
					players.get(playerIndex).setInJail(false);
					players.get(playerIndex).setTurnsInJail(0);
					pay50toGetOutOfJail.setVisible(false);
					log = "  /> "
							+ players.get(playerIndex).getName()
							+ " used his/her get out of Jail card to get out of Jail"
							+ "\n";
					logText.append(log);
					extraRollNeeded = false;
				}
				useGetOutOfJailCard.setVisible(false);
				dontUseGetOutOfJailCard.setVisible(false);
				players.get(playerIndex).setNumberOfGetOutOfJailCards(-1);
				gamePrompt.setText("");
			}
		});

		dontUseGetOutOfJailCard.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				players.get(playerIndex).setPositionOnGameBoard(
						10 - players.get(playerIndex).getPositionOnGameBoard());
				players.get(playerIndex).setInJail(true);
				adjustPlayerPosition();
				if (doubleCounter == 3) {
				log = "  /> " + players.get(playerIndex).getName()
						+ " went to Jail for rolling 3 doubles " + "\n";
				logText.append(log);
				} else {
					log = "  /> " + players.get(playerIndex).getName()
							+ " went to Jail" + "\n";
					logText.append(log);
				}
				finishTurn.setEnabled(true);
				gamePrompt.setText("");
				useGetOutOfJailCard.setVisible(false);
				dontUseGetOutOfJailCard.setVisible(false);

			}
		});

		finishTurn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				playerIndex = (playerIndex + 1) % players.size();
				if (players.get(playerIndex).isInJail()
						&& players.get(playerIndex)
								.getNumberOfGetOutOfJailCards() > 0) {
					gamePrompt
							.setText("Use the card, pay M50 or roll the dice to get out of Jail");
					useGetOutOfJailCard.setVisible(true);
					pay50toGetOutOfJail.setVisible(true);
					rollTheDice.setEnabled(true);
					extraRollNeeded = true;
				} else if (players.get(playerIndex).isInJail()) {
					gamePrompt
							.setText("You need to pay M50 or roll double to get out of Jail");
					extraRollNeeded = true;
					rollTheDice.setEnabled(true);
					pay50toGetOutOfJail.setVisible(true);
				} else {
					rollTheDice.setEnabled(true);
					gamePrompt.setText("");
				}
				finishTurn.setEnabled(false);
				doubleCounter = 0;

			}

		});
	}

	private void adjustPlayerPosition() {
		if (!(players.get(playerIndex).isInJail())) {
			log = "  /> "
					+ players.get(playerIndex).getName()
					+ " has landed on "
					+ entities
							.getEntities()
							.get(players.get(playerIndex)
									.getPositionOnGameBoard()).getName() + "\n";
			logText.append(log);
		}

		switch (players.get(playerIndex).getPositionOnGameBoard()) {
		case 0:
			switch (playerIndex) {
			case 0:
				playerIndicators.get(0).setBounds(frameHeight - 80,
						frameHeight - 80, 20, 20);
				break;
			case 1:
				playerIndicators.get(1).setBounds(frameHeight - 60,
						frameHeight - 80, 20, 20);
				break;
			case 2:
				playerIndicators.get(2).setBounds(frameHeight - 80,
						frameHeight - 60, 20, 20);
				break;
			case 3:
				playerIndicators.get(3).setBounds(frameHeight - 60,
						frameHeight - 60, 20, 20);
				break;
			case 4:
				playerIndicators.get(4).setBounds(frameHeight - 80,
						frameHeight - 40, 20, 20);
				break;
			case 5:
				playerIndicators.get(5).setBounds(frameHeight - 60,
						frameHeight - 40, 20, 20);
				break;
			}
			break;
		case 1:
			switch (playerIndex) {
			case 0:
				playerIndicators.get(0).setBounds(
						(int) (frameHeight / 6.5 * 5) + 10,
						(int) (frameHeight / 6.5 * 5.5) + 30, 20, 20);
				break;
			case 1:
				playerIndicators.get(1).setBounds(
						(int) (frameHeight / 6.5 * 5) + 30,
						(int) (frameHeight / 6.5 * 5.5) + 30, 20, 20);
				break;
			case 2:
				playerIndicators.get(2).setBounds(
						(int) (frameHeight / 6.5 * 5) + 10,
						(int) (frameHeight / 6.5 * 5.5) + 50, 20, 20);
				break;
			case 3:
				playerIndicators.get(3).setBounds(
						(int) (frameHeight / 6.5 * 5) + 30,
						(int) (frameHeight / 6.5 * 5.5) + 50, 20, 20);
				break;
			case 4:
				playerIndicators.get(4).setBounds(
						(int) (frameHeight / 6.5 * 5) + 10,
						(int) (frameHeight / 6.5 * 5.5) + 70, 20, 20);
				break;
			case 5:
				playerIndicators.get(5).setBounds(
						(int) (frameHeight / 6.5 * 5) + 30,
						(int) (frameHeight / 6.5 * 5.5) + 70, 20, 20);
				break;
			}
			break;

		case 2:
			switch (playerIndex) {
			case 0:
				playerIndicators.get(0).setBounds(
						(int) (frameHeight / 6.5 * 4.5) + 10,
						(int) (frameHeight / 6.5 * 5.5) + 30, 20, 20);
				break;
			case 1:
				playerIndicators.get(1).setBounds(
						(int) (frameHeight / 6.5 * 4.5) + 30,
						(int) (frameHeight / 6.5 * 5.5) + 30, 20, 20);
				break;
			case 2:
				playerIndicators.get(2).setBounds(
						(int) (frameHeight / 6.5 * 4.5) + 10,
						(int) (frameHeight / 6.5 * 5.5) + 50, 20, 20);
				break;
			case 3:
				playerIndicators.get(3).setBounds(
						(int) (frameHeight / 6.5 * 4.5) + 30,
						(int) (frameHeight / 6.5 * 5.5) + 50, 20, 20);
				break;
			case 4:
				playerIndicators.get(4).setBounds(
						(int) (frameHeight / 6.5 * 4.5) + 10,
						(int) (frameHeight / 6.5 * 5.5) + 70, 20, 20);
				break;
			case 5:
				playerIndicators.get(5).setBounds(
						(int) (frameHeight / 6.5 * 4.5) + 30,
						(int) (frameHeight / 6.5 * 5.5) + 70, 20, 20);
				break;
			}
			break;
		case 3:
			switch (playerIndex) {
			case 0:
				playerIndicators.get(0).setBounds(
						(int) (frameHeight / 6.5 * 4) + 10,
						(int) (frameHeight / 6.5 * 5.5) + 30, 20, 20);
				break;
			case 1:
				playerIndicators.get(1).setBounds(
						(int) (frameHeight / 6.5 * 4) + 30,
						(int) (frameHeight / 6.5 * 5.5) + 30, 20, 20);
				break;
			case 2:
				playerIndicators.get(2).setBounds(
						(int) (frameHeight / 6.5 * 4) + 10,
						(int) (frameHeight / 6.5 * 5.5) + 50, 20, 20);
				break;
			case 3:
				playerIndicators.get(3).setBounds(
						(int) (frameHeight / 6.5 * 4) + 30,
						(int) (frameHeight / 6.5 * 5.5) + 50, 20, 20);
				break;
			case 4:
				playerIndicators.get(4).setBounds(
						(int) (frameHeight / 6.5 * 4) + 10,
						(int) (frameHeight / 6.5 * 5.5) + 70, 20, 20);
				break;
			case 5:
				playerIndicators.get(5).setBounds(
						(int) (frameHeight / 6.5 * 4) + 30,
						(int) (frameHeight / 6.5 * 5.5) + 70, 20, 20);
				break;
			}
			break;
		case 4:
			players.get(playerIndex).setMoneyHeld(-200);
			balanceLabels.get(playerIndex).setText(
					"E" + players.get(playerIndex).getMoneyHeld());
			log = "  /> " + players.get(playerIndex).getName()
					+ " paid income tax (M200) " + "\n";
			logText.append(log);
			switch (playerIndex) {
			case 0:
				playerIndicators.get(0).setBounds(
						(int) (frameHeight / 6.5 * 3.5) + 10,
						(int) (frameHeight / 6.5 * 5.5) + 30, 20, 20);
				break;
			case 1:
				playerIndicators.get(1).setBounds(
						(int) (frameHeight / 6.5 * 3.5) + 30,
						(int) (frameHeight / 6.5 * 5.5) + 30, 20, 20);
				break;
			case 2:
				playerIndicators.get(2).setBounds(
						(int) (frameHeight / 6.5 * 3.5) + 10,
						(int) (frameHeight / 6.5 * 5.5) + 50, 20, 20);
				break;
			case 3:
				playerIndicators.get(3).setBounds(
						(int) (frameHeight / 6.5 * 3.5) + 30,
						(int) (frameHeight / 6.5 * 5.5) + 50, 20, 20);
				break;
			case 4:
				playerIndicators.get(4).setBounds(
						(int) (frameHeight / 6.5 * 3.5) + 10,
						(int) (frameHeight / 6.5 * 5.5) + 70, 20, 20);
				break;
			case 5:
				playerIndicators.get(5).setBounds(
						(int) (frameHeight / 6.5 * 3.5) + 30,
						(int) (frameHeight / 6.5 * 5.5) + 70, 20, 20);
				break;
			}
			break;
		case 5:
			switch (playerIndex) {
			case 0:
				playerIndicators.get(0).setBounds(
						(int) (frameHeight / 6.5 * 3) + 10,
						(int) (frameHeight / 6.5 * 5.5) + 30, 20, 20);
				break;
			case 1:
				playerIndicators.get(1).setBounds(
						(int) (frameHeight / 6.5 * 3) + 30,
						(int) (frameHeight / 6.5 * 5.5) + 30, 20, 20);
				break;
			case 2:
				playerIndicators.get(2).setBounds(
						(int) (frameHeight / 6.5 * 3) + 10,
						(int) (frameHeight / 6.5 * 5.5) + 50, 20, 20);
				break;
			case 3:
				playerIndicators.get(3).setBounds(
						(int) (frameHeight / 6.5 * 3) + 30,
						(int) (frameHeight / 6.5 * 5.5) + 50, 20, 20);
				break;
			case 4:
				playerIndicators.get(4).setBounds(
						(int) (frameHeight / 6.5 * 3) + 10,
						(int) (frameHeight / 6.5 * 5.5) + 70, 20, 20);
				break;
			case 5:
				playerIndicators.get(5).setBounds(
						(int) (frameHeight / 6.5 * 3) + 30,
						(int) (frameHeight / 6.5 * 5.5) + 70, 20, 20);
				break;
			}
			break;
		case 6:
			switch (playerIndex) {
			case 0:
				playerIndicators.get(0).setBounds(
						(int) (frameHeight / 6.5 * 2.5) + 10,
						(int) (frameHeight / 6.5 * 5.5) + 30, 20, 20);
				break;
			case 1:
				playerIndicators.get(1).setBounds(
						(int) (frameHeight / 6.5 * 2.5) + 30,
						(int) (frameHeight / 6.5 * 5.5) + 30, 20, 20);
				break;
			case 2:
				playerIndicators.get(2).setBounds(
						(int) (frameHeight / 6.5 * 2.5) + 10,
						(int) (frameHeight / 6.5 * 5.5) + 50, 20, 20);
				break;
			case 3:
				playerIndicators.get(3).setBounds(
						(int) (frameHeight / 6.5 * 2.5) + 30,
						(int) (frameHeight / 6.5 * 5.5) + 50, 20, 20);
				break;
			case 4:
				playerIndicators.get(4).setBounds(
						(int) (frameHeight / 6.5 * 2.5) + 10,
						(int) (frameHeight / 6.5 * 5.5) + 70, 20, 20);
				break;
			case 5:
				playerIndicators.get(5).setBounds(
						(int) (frameHeight / 6.5 * 2.5) + 30,
						(int) (frameHeight / 6.5 * 5.5) + 70, 20, 20);
				break;
			}
			break;
		case 7:
			switch (playerIndex) {
			case 0:
				playerIndicators.get(0).setBounds(
						(int) (frameHeight / 6.5 * 2) + 10,
						(int) (frameHeight / 6.5 * 5.5) + 30, 20, 20);
				break;
			case 1:
				playerIndicators.get(1).setBounds(
						(int) (frameHeight / 6.5 * 2) + 30,
						(int) (frameHeight / 6.5 * 5.5) + 30, 20, 20);
				break;
			case 2:
				playerIndicators.get(2).setBounds(
						(int) (frameHeight / 6.5 * 2) + 10,
						(int) (frameHeight / 6.5 * 5.5) + 50, 20, 20);
				break;
			case 3:
				playerIndicators.get(3).setBounds(
						(int) (frameHeight / 6.5 * 2) + 30,
						(int) (frameHeight / 6.5 * 5.5) + 50, 20, 20);
				break;
			case 4:
				playerIndicators.get(4).setBounds(
						(int) (frameHeight / 6.5 * 2) + 10,
						(int) (frameHeight / 6.5 * 5.5) + 70, 20, 20);
				break;
			case 5:
				playerIndicators.get(5).setBounds(
						(int) (frameHeight / 6.5 * 2) + 30,
						(int) (frameHeight / 6.5 * 5.5) + 70, 20, 20);
				break;
			}
			break;
		case 8:
			switch (playerIndex) {
			case 0:
				playerIndicators.get(0).setBounds(
						(int) (frameHeight / 6.5 * 1.5) + 10,
						(int) (frameHeight / 6.5 * 5.5) + 30, 20, 20);
				break;
			case 1:
				playerIndicators.get(1).setBounds(
						(int) (frameHeight / 6.5 * 1.5) + 30,
						(int) (frameHeight / 6.5 * 5.5) + 30, 20, 20);
				break;
			case 2:
				playerIndicators.get(2).setBounds(
						(int) (frameHeight / 6.5 * 1.5) + 10,
						(int) (frameHeight / 6.5 * 5.5) + 50, 20, 20);
				break;
			case 3:
				playerIndicators.get(3).setBounds(
						(int) (frameHeight / 6.5 * 1.5) + 30,
						(int) (frameHeight / 6.5 * 5.5) + 50, 20, 20);
				break;
			case 4:
				playerIndicators.get(4).setBounds(
						(int) (frameHeight / 6.5 * 1.5) + 10,
						(int) (frameHeight / 6.5 * 5.5) + 70, 20, 20);
				break;
			case 5:
				playerIndicators.get(5).setBounds(
						(int) (frameHeight / 6.5 * 1.5) + 30,
						(int) (frameHeight / 6.5 * 5.5) + 70, 20, 20);
				break;
			}
			break;
		case 9:
			switch (playerIndex) {
			case 0:
				playerIndicators.get(0).setBounds(
						(int) (frameHeight / 6.5) + 10,
						(int) (frameHeight / 6.5 * 5.5) + 30, 20, 20);
				break;
			case 1:
				playerIndicators.get(1).setBounds(
						(int) (frameHeight / 6.5) + 30,
						(int) (frameHeight / 6.5 * 5.5) + 30, 20, 20);
				break;
			case 2:
				playerIndicators.get(2).setBounds(
						(int) (frameHeight / 6.5) + 10,
						(int) (frameHeight / 6.5 * 5.5) + 50, 20, 20);
				break;
			case 3:
				playerIndicators.get(3).setBounds(
						(int) (frameHeight / 6.5) + 30,
						(int) (frameHeight / 6.5 * 5.5) + 50, 20, 20);
				break;
			case 4:
				playerIndicators.get(4).setBounds(
						(int) (frameHeight / 6.5) + 10,
						(int) (frameHeight / 6.5 * 5.5) + 70, 20, 20);
				break;
			case 5:
				playerIndicators.get(5).setBounds(
						(int) (frameHeight / 6.5) + 30,
						(int) (frameHeight / 6.5 * 5.5) + 70, 20, 20);
				break;
			}
			break;
		case 10:
			switch (playerIndex) {
			case 0:
				playerIndicators.get(0).setBounds(60,
						(int) (frameHeight / 6.5 * 5.5) + 30, 20, 20);
				break;
			case 1:
				playerIndicators.get(1).setBounds(80,
						(int) (frameHeight / 6.5 * 5.5) + 30, 20, 20);
				break;
			case 2:
				playerIndicators.get(2).setBounds(60,
						(int) (frameHeight / 6.5 * 5.5) + 50, 20, 20);
				break;
			case 3:
				playerIndicators.get(3).setBounds(80,
						(int) (frameHeight / 6.5 * 5.5) + 50, 20, 20);
				break;
			case 4:
				playerIndicators.get(4).setBounds(60,
						(int) (frameHeight / 6.5 * 5.5) + 70, 20, 20);
				break;
			case 5:
				playerIndicators.get(5).setBounds(80,
						(int) (frameHeight / 6.5 * 5.5) + 70, 20, 20);
				break;
			}
			break;
		case 11:
			switch (playerIndex) {
			case 0:
				playerIndicators.get(0).setBounds(20,
						(int) (frameHeight / 6.5 * 5) + 10, 20, 20);
				break;
			case 1:
				playerIndicators.get(1).setBounds(20,
						(int) (frameHeight / 6.5 * 5) + 30, 20, 20);
				break;
			case 2:
				playerIndicators.get(2).setBounds(40,
						(int) (frameHeight / 6.5 * 5) + 10, 20, 20);
				break;
			case 3:
				playerIndicators.get(3).setBounds(40,
						(int) (frameHeight / 6.5 * 5) + 30, 20, 20);
				break;
			case 4:
				playerIndicators.get(4).setBounds(60,
						(int) (frameHeight / 6.5 * 5) + 10, 20, 20);
				break;
			case 5:
				playerIndicators.get(5).setBounds(60,
						(int) (frameHeight / 6.5 * 5) + 30, 20, 20);
				break;
			}
			break;
		case 12:
			switch (playerIndex) {
			case 0:
				playerIndicators.get(0).setBounds(20,
						(int) (frameHeight / 6.5 * 4.5) + 10, 20, 20);
				break;
			case 1:
				playerIndicators.get(1).setBounds(20,
						(int) (frameHeight / 6.5 * 4.5) + 30, 20, 20);
				break;
			case 2:
				playerIndicators.get(2).setBounds(40,
						(int) (frameHeight / 6.5 * 4.5) + 10, 20, 20);
				break;
			case 3:
				playerIndicators.get(3).setBounds(40,
						(int) (frameHeight / 6.5 * 4.5) + 30, 20, 20);
				break;
			case 4:
				playerIndicators.get(4).setBounds(60,
						(int) (frameHeight / 6.5 * 4.5) + 10, 20, 20);
				break;
			case 5:
				playerIndicators.get(5).setBounds(60,
						(int) (frameHeight / 6.5 * 4.5) + 30, 20, 20);
				break;
			}
			break;
		case 13:
			switch (playerIndex) {
			case 0:
				playerIndicators.get(0).setBounds(20,
						(int) (frameHeight / 6.5 * 4) + 10, 20, 20);
				break;
			case 1:
				playerIndicators.get(1).setBounds(20,
						(int) (frameHeight / 6.5 * 4) + 30, 20, 20);
				break;
			case 2:
				playerIndicators.get(2).setBounds(40,
						(int) (frameHeight / 6.5 * 4) + 10, 20, 20);
				break;
			case 3:
				playerIndicators.get(3).setBounds(40,
						(int) (frameHeight / 6.5 * 4) + 30, 20, 20);
				break;
			case 4:
				playerIndicators.get(4).setBounds(60,
						(int) (frameHeight / 6.5 * 4) + 10, 20, 20);
				break;
			case 5:
				playerIndicators.get(5).setBounds(60,
						(int) (frameHeight / 6.5 * 4) + 30, 20, 20);
				break;
			}
			break;
		case 14:
			switch (playerIndex) {
			case 0:
				playerIndicators.get(0).setBounds(20,
						(int) (frameHeight / 6.5 * 3.5) + 10, 20, 20);
				break;
			case 1:
				playerIndicators.get(1).setBounds(20,
						(int) (frameHeight / 6.5 * 3.5) + 30, 20, 20);
				break;
			case 2:
				playerIndicators.get(2).setBounds(40,
						(int) (frameHeight / 6.5 * 3.5) + 10, 20, 20);
				break;
			case 3:
				playerIndicators.get(3).setBounds(40,
						(int) (frameHeight / 6.5 * 3.5) + 30, 20, 20);
				break;
			case 4:
				playerIndicators.get(4).setBounds(60,
						(int) (frameHeight / 6.5 * 3.5) + 10, 20, 20);
				break;
			case 5:
				playerIndicators.get(5).setBounds(60,
						(int) (frameHeight / 6.5 * 3.5) + 30, 20, 20);
				break;
			}
			break;
		case 15:
			switch (playerIndex) {
			case 0:
				playerIndicators.get(0).setBounds(20,
						(int) (frameHeight / 6.5 * 3) + 10, 20, 20);
				break;
			case 1:
				playerIndicators.get(1).setBounds(20,
						(int) (frameHeight / 6.5 * 3) + 30, 20, 20);
				break;
			case 2:
				playerIndicators.get(2).setBounds(40,
						(int) (frameHeight / 6.5 * 3) + 10, 20, 20);
				break;
			case 3:
				playerIndicators.get(3).setBounds(40,
						(int) (frameHeight / 6.5 * 3) + 30, 20, 20);
				break;
			case 4:
				playerIndicators.get(4).setBounds(60,
						(int) (frameHeight / 6.5 * 3) + 10, 20, 20);
				break;
			case 5:
				playerIndicators.get(5).setBounds(60,
						(int) (frameHeight / 6.5 * 3) + 30, 20, 20);
				break;
			}
			break;
		case 16:
			switch (playerIndex) {
			case 0:
				playerIndicators.get(0).setBounds(20,
						(int) (frameHeight / 6.5 * 2.5) + 10, 20, 20);
				break;
			case 1:
				playerIndicators.get(1).setBounds(20,
						(int) (frameHeight / 6.5 * 2.5) + 30, 20, 20);
				break;
			case 2:
				playerIndicators.get(2).setBounds(40,
						(int) (frameHeight / 6.5 * 2.5) + 10, 20, 20);
				break;
			case 3:
				playerIndicators.get(3).setBounds(40,
						(int) (frameHeight / 6.5 * 2.5) + 30, 20, 20);
				break;
			case 4:
				playerIndicators.get(4).setBounds(60,
						(int) (frameHeight / 6.5 * 2.5) + 10, 20, 20);
				break;
			case 5:
				playerIndicators.get(5).setBounds(60,
						(int) (frameHeight / 6.5 * 2.5) + 30, 20, 20);
				break;
			}
			break;
		case 17:
			switch (playerIndex) {
			case 0:
				playerIndicators.get(0).setBounds(20,
						(int) (frameHeight / 6.5 * 2) + 10, 20, 20);
				break;
			case 1:
				playerIndicators.get(1).setBounds(20,
						(int) (frameHeight / 6.5 * 2) + 30, 20, 20);
				break;
			case 2:
				playerIndicators.get(2).setBounds(40,
						(int) (frameHeight / 6.5 * 2) + 10, 20, 20);
				break;
			case 3:
				playerIndicators.get(3).setBounds(40,
						(int) (frameHeight / 6.5 * 2) + 30, 20, 20);
				break;
			case 4:
				playerIndicators.get(4).setBounds(60,
						(int) (frameHeight / 6.5 * 2) + 10, 20, 20);
				break;
			case 5:
				playerIndicators.get(5).setBounds(60,
						(int) (frameHeight / 6.5 * 2) + 30, 20, 20);
				break;
			}
			break;
		case 18:
			switch (playerIndex) {
			case 0:
				playerIndicators.get(0).setBounds(20,
						(int) (frameHeight / 6.5 * 1.5) + 10, 20, 20);
				break;
			case 1:
				playerIndicators.get(1).setBounds(20,
						(int) (frameHeight / 6.5 * 1.5) + 30, 20, 20);
				break;
			case 2:
				playerIndicators.get(2).setBounds(40,
						(int) (frameHeight / 6.5 * 1.5) + 10, 20, 20);
				break;
			case 3:
				playerIndicators.get(3).setBounds(40,
						(int) (frameHeight / 6.5 * 1.5) + 30, 20, 20);
				break;
			case 4:
				playerIndicators.get(4).setBounds(60,
						(int) (frameHeight / 6.5 * 1.5) + 10, 20, 20);
				break;
			case 5:
				playerIndicators.get(5).setBounds(60,
						(int) (frameHeight / 6.5 * 1.5) + 30, 20, 20);
				break;
			}
			break;
		case 19:
			switch (playerIndex) {
			case 0:
				playerIndicators.get(0).setBounds(20,
						(int) (frameHeight / 6.5) + 10, 20, 20);
				break;
			case 1:
				playerIndicators.get(1).setBounds(20,
						(int) (frameHeight / 6.5) + 30, 20, 20);
				break;
			case 2:
				playerIndicators.get(2).setBounds(40,
						(int) (frameHeight / 6.5) + 10, 20, 20);
				break;
			case 3:
				playerIndicators.get(3).setBounds(40,
						(int) (frameHeight / 6.5) + 30, 20, 20);
				break;
			case 4:
				playerIndicators.get(4).setBounds(60,
						(int) (frameHeight / 6.5) + 10, 20, 20);
				break;
			case 5:
				playerIndicators.get(5).setBounds(60,
						(int) (frameHeight / 6.5) + 30, 20, 20);
				break;
			}
			break;
		case 20:
			switch (playerIndex) {
			case 0:
				playerIndicators.get(0).setBounds(60, 30, 20, 20);
				break;
			case 1:
				playerIndicators.get(1).setBounds(80, 30, 20, 20);
				break;
			case 2:
				playerIndicators.get(2).setBounds(60, 50, 20, 20);
				break;
			case 3:
				playerIndicators.get(3).setBounds(80, 50, 20, 20);
				break;
			case 4:
				playerIndicators.get(4).setBounds(60, 70, 20, 20);
				break;
			case 5:
				playerIndicators.get(5).setBounds(80, 70, 20, 20);
				break;
			}
			break;
		case 21:
			switch (playerIndex) {
			case 0:
				playerIndicators.get(0).setBounds(
						(int) (frameHeight / 6.5) + 10, 30, 20, 20);
				break;
			case 1:
				playerIndicators.get(1).setBounds(
						(int) (frameHeight / 6.5) + 30, 30, 20, 20);
				break;
			case 2:
				playerIndicators.get(2).setBounds(
						(int) (frameHeight / 6.5) + 10, 50, 20, 20);
				break;
			case 3:
				playerIndicators.get(3).setBounds(
						(int) (frameHeight / 6.5) + 30, 50, 20, 20);
				break;
			case 4:
				playerIndicators.get(4).setBounds(
						(int) (frameHeight / 6.5) + 10, 70, 20, 20);
				break;
			case 5:
				playerIndicators.get(5).setBounds(
						(int) (frameHeight / 6.5) + 30, 70, 20, 20);
				break;
			}
			break;
		case 22:
			switch (playerIndex) {
			case 0:
				playerIndicators.get(0).setBounds(
						(int) (frameHeight / 6.5 * 1.5) + 10, 30, 20, 20);
				break;
			case 1:
				playerIndicators.get(1).setBounds(
						(int) (frameHeight / 6.5 * 1.5) + 30, 30, 20, 20);
				break;
			case 2:
				playerIndicators.get(2).setBounds(
						(int) (frameHeight / 6.5 * 1.5) + 10, 50, 20, 20);
				break;
			case 3:
				playerIndicators.get(3).setBounds(
						(int) (frameHeight / 6.5 * 1.5) + 30, 50, 20, 20);
				break;
			case 4:
				playerIndicators.get(4).setBounds(
						(int) (frameHeight / 6.5 * 1.5) + 10, 70, 20, 20);
				break;
			case 5:
				playerIndicators.get(5).setBounds(
						(int) (frameHeight / 6.5 * 1.5) + 30, 70, 20, 20);
				break;
			}
			break;
		case 23:
			switch (playerIndex) {
			case 0:
				playerIndicators.get(0).setBounds(
						(int) (frameHeight / 6.5 * 2) + 10, 30, 20, 20);
				break;
			case 1:
				playerIndicators.get(1).setBounds(
						(int) (frameHeight / 6.5 * 2) + 30, 30, 20, 20);
				break;
			case 2:
				playerIndicators.get(2).setBounds(
						(int) (frameHeight / 6.5 * 2) + 10, 50, 20, 20);
				break;
			case 3:
				playerIndicators.get(3).setBounds(
						(int) (frameHeight / 6.5 * 2) + 30, 50, 20, 20);
				break;
			case 4:
				playerIndicators.get(4).setBounds(
						(int) (frameHeight / 6.5 * 2) + 10, 70, 20, 20);
				break;
			case 5:
				playerIndicators.get(5).setBounds(
						(int) (frameHeight / 6.5 * 2) + 10, 70, 20, 20);
				break;
			}
			break;
		case 24:
			switch (playerIndex) {
			case 0:
				playerIndicators.get(0).setBounds(
						(int) (frameHeight / 6.5 * 2.5) + 10, 30, 20, 20);
				break;
			case 1:
				playerIndicators.get(1).setBounds(
						(int) (frameHeight / 6.5 * 2.5) + 30, 30, 20, 20);
				break;
			case 2:
				playerIndicators.get(2).setBounds(
						(int) (frameHeight / 6.5 * 2.5) + 10, 50, 20, 20);
				break;
			case 3:
				playerIndicators.get(3).setBounds(
						(int) (frameHeight / 6.5 * 2.5) + 30, 50, 20, 20);
				break;
			case 4:
				playerIndicators.get(4).setBounds(
						(int) (frameHeight / 6.5 * 2.5) + 10, 70, 20, 20);
				break;
			case 5:
				playerIndicators.get(5).setBounds(
						(int) (frameHeight / 6.5 * 2.5) + 10, 70, 20, 20);
				break;
			}
			break;
		case 25:
			switch (playerIndex) {
			case 0:
				playerIndicators.get(0).setBounds(
						(int) (frameHeight / 6.5 * 3) + 10, 30, 20, 20);
				break;
			case 1:
				playerIndicators.get(1).setBounds(
						(int) (frameHeight / 6.5 * 3) + 30, 30, 20, 20);
				break;
			case 2:
				playerIndicators.get(2).setBounds(
						(int) (frameHeight / 6.5 * 3) + 10, 50, 20, 20);
				break;
			case 3:
				playerIndicators.get(3).setBounds(
						(int) (frameHeight / 6.5 * 3) + 30, 50, 20, 20);
				break;
			case 4:
				playerIndicators.get(4).setBounds(
						(int) (frameHeight / 6.5 * 3) + 10, 70, 20, 20);
				break;
			case 5:
				playerIndicators.get(5).setBounds(
						(int) (frameHeight / 6.5 * 3) + 10, 70, 20, 20);
				break;
			}
			break;
		case 26:
			switch (playerIndex) {
			case 0:
				playerIndicators.get(0).setBounds(
						(int) (frameHeight / 6.5 * 3.5) + 10, 30, 20, 20);
				break;
			case 1:
				playerIndicators.get(1).setBounds(
						(int) (frameHeight / 6.5 * 3.5) + 30, 30, 20, 20);
				break;
			case 2:
				playerIndicators.get(2).setBounds(
						(int) (frameHeight / 6.5 * 3.5) + 10, 50, 20, 20);
				break;
			case 3:
				playerIndicators.get(3).setBounds(
						(int) (frameHeight / 6.5 * 3.5) + 30, 50, 20, 20);
				break;
			case 4:
				playerIndicators.get(4).setBounds(
						(int) (frameHeight / 6.5 * 3.5) + 10, 70, 20, 20);
				break;
			case 5:
				playerIndicators.get(5).setBounds(
						(int) (frameHeight / 6.5 * 3.5) + 10, 70, 20, 20);
				break;
			}
			break;
		case 27:
			switch (playerIndex) {
			case 0:
				playerIndicators.get(0).setBounds(
						(int) (frameHeight / 6.5 * 4) + 10, 30, 20, 20);
				break;
			case 1:
				playerIndicators.get(1).setBounds(
						(int) (frameHeight / 6.5 * 4) + 30, 30, 20, 20);
				break;
			case 2:
				playerIndicators.get(2).setBounds(
						(int) (frameHeight / 6.5 * 4) + 10, 50, 20, 20);
				break;
			case 3:
				playerIndicators.get(3).setBounds(
						(int) (frameHeight / 6.5 * 4) + 30, 50, 20, 20);
				break;
			case 4:
				playerIndicators.get(4).setBounds(
						(int) (frameHeight / 6.5 * 4) + 10, 70, 20, 20);
				break;
			case 5:
				playerIndicators.get(5).setBounds(
						(int) (frameHeight / 6.5 * 4) + 10, 70, 20, 20);
				break;
			}
			break;
		case 28:
			switch (playerIndex) {
			case 0:
				playerIndicators.get(0).setBounds(
						(int) (frameHeight / 6.5 * 4.5) + 10, 30, 20, 20);
				break;
			case 1:
				playerIndicators.get(1).setBounds(
						(int) (frameHeight / 6.5 * 4.5) + 30, 30, 20, 20);
				break;
			case 2:
				playerIndicators.get(2).setBounds(
						(int) (frameHeight / 6.5 * 4.5) + 10, 50, 20, 20);
				break;
			case 3:
				playerIndicators.get(3).setBounds(
						(int) (frameHeight / 6.5 * 4.5) + 30, 50, 20, 20);
				break;
			case 4:
				playerIndicators.get(4).setBounds(
						(int) (frameHeight / 6.5 * 4.5) + 10, 70, 20, 20);
				break;
			case 5:
				playerIndicators.get(5).setBounds(
						(int) (frameHeight / 6.5 * 4.5) + 10, 70, 20, 20);
				break;
			}
			break;
		case 29:
			switch (playerIndex) {
			case 0:
				playerIndicators.get(0).setBounds(
						(int) (frameHeight / 6.5 * 5) + 10, 30, 20, 20);
				break;
			case 1:
				playerIndicators.get(1).setBounds(
						(int) (frameHeight / 6.5 * 5) + 30, 30, 20, 20);
				break;
			case 2:
				playerIndicators.get(2).setBounds(
						(int) (frameHeight / 6.5 * 5) + 10, 50, 20, 20);
				break;
			case 3:
				playerIndicators.get(3).setBounds(
						(int) (frameHeight / 6.5 * 5) + 30, 50, 20, 20);
				break;
			case 4:
				playerIndicators.get(4).setBounds(
						(int) (frameHeight / 6.5 * 5) + 10, 70, 20, 20);
				break;
			case 5:
				playerIndicators.get(5).setBounds(
						(int) (frameHeight / 6.5 * 5) + 10, 70, 20, 20);
				break;
			}
			break;
		case 30:
			switch (playerIndex) {
			case 0:
				playerIndicators.get(0).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 10, 30, 20, 20);
				break;
			case 1:
				playerIndicators.get(1).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 30, 30, 20, 20);
				break;
			case 2:
				playerIndicators.get(2).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 10, 50, 20, 20);
				break;
			case 3:
				playerIndicators.get(3).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 30, 50, 20, 20);
				break;
			case 4:
				playerIndicators.get(4).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 10, 70, 20, 20);
				break;
			case 5:
				playerIndicators.get(5).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 10, 70, 20, 20);
				break;
			}
			break;
		case 31:
			switch (playerIndex) {
			case 0:
				playerIndicators.get(0).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 40,
						(int) (frameHeight / 6.5) + 10, 20, 20);
				break;
			case 1:
				playerIndicators.get(1).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 40,
						(int) (frameHeight / 6.5) + 30, 20, 20);
				break;
			case 2:
				playerIndicators.get(2).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 60,
						(int) (frameHeight / 6.5) + 10, 20, 20);
				break;
			case 3:
				playerIndicators.get(3).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 60,
						(int) (frameHeight / 6.5) + 30, 20, 20);
				break;
			case 4:
				playerIndicators.get(4).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 80,
						(int) (frameHeight / 6.5) + 10, 20, 20);
				break;
			case 5:
				playerIndicators.get(5).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 80,
						(int) (frameHeight / 6.5) + 30, 20, 20);
				break;
			}
			break;
		case 32:
			switch (playerIndex) {
			case 0:
				playerIndicators.get(0).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 40,
						(int) (frameHeight / 6.5 * 1.5) + 10, 20, 20);
				break;
			case 1:
				playerIndicators.get(1).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 40,
						(int) (frameHeight / 6.5 * 1.5) + 30, 20, 20);
				break;
			case 2:
				playerIndicators.get(2).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 60,
						(int) (frameHeight / 6.5 * 1.5) + 10, 20, 20);
				break;
			case 3:
				playerIndicators.get(3).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 60,
						(int) (frameHeight / 6.5 * 1.5) + 30, 20, 20);
				break;
			case 4:
				playerIndicators.get(4).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 80,
						(int) (frameHeight / 6.5 * 1.5) + 10, 20, 20);
				break;
			case 5:
				playerIndicators.get(5).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 80,
						(int) (frameHeight / 6.5 * 1.5) + 30, 20, 20);
				break;
			}
			break;
		case 33:
			switch (playerIndex) {
			case 0:
				playerIndicators.get(0).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 40,
						(int) (frameHeight / 6.5 * 2) + 10, 20, 20);
				break;
			case 1:
				playerIndicators.get(1).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 40,
						(int) (frameHeight / 6.5 * 2) + 30, 20, 20);
				break;
			case 2:
				playerIndicators.get(2).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 60,
						(int) (frameHeight / 6.5 * 2) + 10, 20, 20);
				break;
			case 3:
				playerIndicators.get(3).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 60,
						(int) (frameHeight / 6.5 * 2) + 30, 20, 20);
				break;
			case 4:
				playerIndicators.get(4).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 80,
						(int) (frameHeight / 6.5 * 2) + 10, 20, 20);
				break;
			case 5:
				playerIndicators.get(5).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 80,
						(int) (frameHeight / 6.5 * 2) + 30, 20, 20);
				break;
			}
			break;
		case 34:
			switch (playerIndex) {
			case 0:
				playerIndicators.get(0).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 40,
						(int) (frameHeight / 6.5 * 2.5) + 10, 20, 20);
				break;
			case 1:
				playerIndicators.get(1).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 40,
						(int) (frameHeight / 6.5 * 2.5) + 30, 20, 20);
				break;
			case 2:
				playerIndicators.get(2).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 60,
						(int) (frameHeight / 6.5 * 2.5) + 10, 20, 20);
				break;
			case 3:
				playerIndicators.get(3).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 60,
						(int) (frameHeight / 6.5 * 2.5) + 30, 20, 20);
				break;
			case 4:
				playerIndicators.get(4).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 80,
						(int) (frameHeight / 6.5 * 2.5) + 10, 20, 20);
				break;
			case 5:
				playerIndicators.get(5).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 80,
						(int) (frameHeight / 6.5 * 2.5) + 30, 20, 20);
				break;
			}
			break;
		case 35:
			switch (playerIndex) {
			case 0:
				playerIndicators.get(0).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 40,
						(int) (frameHeight / 6.5 * 3) + 10, 20, 20);
				break;
			case 1:
				playerIndicators.get(1).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 40,
						(int) (frameHeight / 6.5 * 3) + 30, 20, 20);
				break;
			case 2:
				playerIndicators.get(2).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 60,
						(int) (frameHeight / 6.5 * 3) + 10, 20, 20);
				break;
			case 3:
				playerIndicators.get(3).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 60,
						(int) (frameHeight / 6.5 * 3) + 30, 20, 20);
				break;
			case 4:
				playerIndicators.get(4).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 80,
						(int) (frameHeight / 6.5 * 3) + 10, 20, 20);
				break;
			case 5:
				playerIndicators.get(5).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 80,
						(int) (frameHeight / 6.5 * 3) + 30, 20, 20);
				break;
			}
			break;
		case 36:
			switch (playerIndex) {
			case 0:
				playerIndicators.get(0).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 40,
						(int) (frameHeight / 6.5 * 3.5) + 10, 20, 20);
				break;
			case 1:
				playerIndicators.get(1).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 40,
						(int) (frameHeight / 6.5 * 3.5) + 30, 20, 20);
				break;
			case 2:
				playerIndicators.get(2).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 60,
						(int) (frameHeight / 6.5 * 3.5) + 10, 20, 20);
				break;
			case 3:
				playerIndicators.get(3).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 60,
						(int) (frameHeight / 6.5 * 3.5) + 30, 20, 20);
				break;
			case 4:
				playerIndicators.get(4).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 80,
						(int) (frameHeight / 6.5 * 3.5) + 10, 20, 20);
				break;
			case 5:
				playerIndicators.get(5).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 80,
						(int) (frameHeight / 6.5 * 3.5) + 30, 20, 20);
				break;
			}
			break;
		case 37:
			switch (playerIndex) {
			case 0:
				playerIndicators.get(0).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 40,
						(int) (frameHeight / 6.5 * 4) + 10, 20, 20);
				break;
			case 1:
				playerIndicators.get(1).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 40,
						(int) (frameHeight / 6.5 * 4) + 30, 20, 20);
				break;
			case 2:
				playerIndicators.get(2).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 60,
						(int) (frameHeight / 6.5 * 4) + 10, 20, 20);
				break;
			case 3:
				playerIndicators.get(3).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 60,
						(int) (frameHeight / 6.5 * 4) + 30, 20, 20);
				break;
			case 4:
				playerIndicators.get(4).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 80,
						(int) (frameHeight / 6.5 * 4) + 10, 20, 20);
				break;
			case 5:
				playerIndicators.get(5).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 80,
						(int) (frameHeight / 6.5 * 4) + 30, 20, 20);
				break;
			}
			break;
		case 38:
			players.get(playerIndex).setMoneyHeld(-100);
			balanceLabels.get(playerIndex).setText(
					"E" + players.get(playerIndex).getMoneyHeld());
			log = "  /> " + players.get(playerIndex).getName()
					+ " paid luxury tax (M100) " + "\n";
			logText.append(log);
			switch (playerIndex) {
			case 0:
				playerIndicators.get(0).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 40,
						(int) (frameHeight / 6.5 * 4.5) + 10, 20, 20);
				break;
			case 1:
				playerIndicators.get(1).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 40,
						(int) (frameHeight / 6.5 * 4.5) + 30, 20, 20);
				break;
			case 2:
				playerIndicators.get(2).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 60,
						(int) (frameHeight / 6.5 * 4.5) + 10, 20, 20);
				break;
			case 3:
				playerIndicators.get(3).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 60,
						(int) (frameHeight / 6.5 * 4.5) + 30, 20, 20);
				break;
			case 4:
				playerIndicators.get(4).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 80,
						(int) (frameHeight / 6.5 * 4.5) + 10, 20, 20);
				break;
			case 5:
				playerIndicators.get(5).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 80,
						(int) (frameHeight / 6.5 * 4.5) + 30, 20, 20);
				break;
			}
			break;
		case 39:
			switch (playerIndex) {
			case 0:
				playerIndicators.get(0).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 40,
						(int) (frameHeight / 6.5 * 5) + 10, 20, 20);
				break;
			case 1:
				playerIndicators.get(1).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 40,
						(int) (frameHeight / 6.5 * 5) + 30, 20, 20);
				break;
			case 2:
				playerIndicators.get(2).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 60,
						(int) (frameHeight / 6.5 * 5) + 10, 20, 20);
				break;
			case 3:
				playerIndicators.get(3).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 60,
						(int) (frameHeight / 6.5 * 5) + 30, 20, 20);
				break;
			case 4:
				playerIndicators.get(4).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 80,
						(int) (frameHeight / 6.5 * 5) + 10, 20, 20);
				break;
			case 5:
				playerIndicators.get(5).setBounds(
						(int) (frameHeight / 6.5 * 5.5) + 80,
						(int) (frameHeight / 6.5 * 5) + 30, 20, 20);
				break;
			}
			break;
		}
		if (players.get(playerIndex).didPassGo()) {
			balanceLabels.get(playerIndex).setText(
					"E" + players.get(playerIndex).getMoneyHeld());
			log = "  /> " + players.get(playerIndex).getName()
					+ " got M200 for passing \"GO\" " + "\n";
			logText.append(log);
			players.get(playerIndex).setPassedGo(false);
		}
	}
}
