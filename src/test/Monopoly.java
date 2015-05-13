package test;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Monopoly {

	private JFrame frame;
	private JPanel topLeft;
	private JPanel bottomLeft;
	private JPanel topRight;
	private JPanel bottomRight;
	private JPanel left_1;
	private JPanel left_2;
	private JPanel left_3;
	private JPanel left_4;
	private JPanel left_5;
	private JPanel left_6;
	private JPanel left_7;
	private JPanel left_8;
	private JPanel left_9;
	private JPanel top_1;
	private JPanel top_2;
	private JPanel top_3;
	private JPanel top_4;
	private JPanel top_5;
	private JPanel top_6;
	private JPanel top_7;
	private JPanel top_8;
	private JPanel top_9;
	private JPanel right_1;
	private JPanel right_2;
	private JPanel right_3;
	private JPanel right_4;
	private JPanel right_5;
	private JPanel right_6;
	private JPanel right_7;
	private JPanel right_8;
	private JPanel right_9;
	private JPanel bottom_1;
	private JPanel bottom_2;
	private JPanel bottom_3;
	private JPanel bottom_4;
	private JPanel bottom_5;
	private JPanel bottom_6;
	private JPanel bottom_7;
	private JPanel bottom_8;
	private JPanel bottom_9;
	private JPanel zoomIn;
	private int frameHeight;
	private JButton communityChest;
	private JButton chanceButton;

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
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

		frame = new JFrame("Monopoly");
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
		topLeft = new JPanel();
		topLeft.setBackground(Color.YELLOW);
		topLeft.setBounds(0, 0, (int) (frameHeight / 6.5),
				(int) (frameHeight / 6.5));
		left_1 = new JPanel();
		left_1.setBackground(Color.GREEN);
		left_1.setBounds(0, (int) (frameHeight / 6.5),
				(int) (frameHeight / 6.5), (int) (frameHeight / 13));
		left_2 = new JPanel();
		left_2.setBackground(Color.YELLOW);
		left_2.setBounds(0, (int) (frameHeight / 6.5 * 1.5),
				(int) (frameHeight / 6.5), (int) (frameHeight / 13));
		left_3 = new JPanel();
		left_3.setBackground(Color.RED);
		left_3.setBounds(0, (int) (frameHeight / 6.5 * 2),
				(int) (frameHeight / 6.5), (int) (frameHeight / 13));
		left_4 = new JPanel();
		left_4.setBackground(Color.GREEN);
		left_4.setBounds(0, (int) (frameHeight / 6.5 * 2.5),
				(int) (frameHeight / 6.5), (int) (frameHeight / 13));
		left_5 = new JPanel();
		left_5.setBackground(Color.YELLOW);
		left_5.setBounds(0, (int) (frameHeight / 6.5 * 3),
				(int) (frameHeight / 6.5), (int) (frameHeight / 13));
		left_6 = new JPanel();
		left_6.setBackground(Color.GREEN);
		left_6.setBounds(0, (int) (frameHeight / 6.5 * 3.5),
				(int) (frameHeight / 6.5), (int) (frameHeight / 13));
		left_7 = new JPanel();
		left_7.setBackground(Color.YELLOW);
		left_7.setBounds(0, (int) (frameHeight / 6.5 * 4),
				(int) (frameHeight / 6.5), (int) (frameHeight / 13));
		left_8 = new JPanel();
		left_8.setBackground(Color.GREEN);
		left_8.setBounds(0, (int) (frameHeight / 6.5 * 4.5),
				(int) (frameHeight / 6.5), (int) (frameHeight / 13));
		left_9 = new JPanel();
		left_9.setBackground(Color.YELLOW);
		left_9.setBounds(0, (int) (frameHeight / 6.5 * 5),
				(int) (frameHeight / 6.5), (int) (frameHeight / 13));
		bottomLeft = new JPanel();
		bottomLeft.setBackground(Color.GREEN);
		bottomLeft.setBounds(0, (int) (frameHeight / 6.5 * 5.5),
				(int) (frameHeight / 6.5), (int) (frameHeight / 6.5));
		top_1 = new JPanel();
		top_1.setBackground(Color.GREEN);
		top_1.setBounds((int) (frameHeight / 6.5), 0, (int) (frameHeight / 13),
				(int) (frameHeight / 6.5));
		top_2 = new JPanel();
		top_2.setBackground(Color.YELLOW);
		top_2.setBounds((int) (frameHeight / 6.5 * 1.5), 0,
				(int) (frameHeight / 13), (int) (frameHeight / 6.5));
		top_3 = new JPanel();
		top_3.setBackground(Color.RED);
		top_3.setBounds((int) (frameHeight / 6.5 * 2), 0,
				(int) (frameHeight / 13), (int) (frameHeight / 6.5));
		top_4 = new JPanel();
		top_4.setBackground(Color.GREEN);
		top_4.setBounds((int) (frameHeight / 6.5 * 2.5), 0,
				(int) (frameHeight / 13), (int) (frameHeight / 6.5));
		top_5 = new JPanel();
		top_5.setBackground(Color.YELLOW);
		top_5.setBounds((int) (frameHeight / 6.5 * 3), 0,
				(int) (frameHeight / 13), (int) (frameHeight / 6.5));
		top_6 = new JPanel();
		top_6.setBackground(Color.RED);
		top_6.setBounds((int) (frameHeight / 6.5 * 3.5), 0,
				(int) (frameHeight / 13), (int) (frameHeight / 6.5));
		top_7 = new JPanel();
		top_7.setBackground(Color.GREEN);
		top_7.setBounds((int) (frameHeight / 6.5 * 4), 0,
				(int) (frameHeight / 13), (int) (frameHeight / 6.5));
		top_8 = new JPanel();
		top_8.setBackground(Color.YELLOW);
		top_8.setBounds((int) (frameHeight / 6.5 * 4.5), 0,
				(int) (frameHeight / 13), (int) (frameHeight / 6.5));
		top_9 = new JPanel();
		top_9.setBackground(Color.RED);
		top_9.setBounds((int) (frameHeight / 6.5 * 5), 0,
				(int) (frameHeight / 13), (int) (frameHeight / 6.5));
		topRight = new JPanel();
		topRight.setBackground(Color.YELLOW);
		topRight.setBounds((int) (frameHeight / 6.5 * 5.5), 0,
				(int) (frameHeight / 6.5), (int) (frameHeight / 6.5));
		right_1 = new JPanel();
		right_1.setBackground(Color.GREEN);
		right_1.setBounds((int) (frameHeight / 6.5 * 5.5),
				(int) (frameHeight / 6.5), (int) (frameHeight / 6.5),
				(int) (frameHeight / 13));
		right_2 = new JPanel();
		right_2.setBackground(Color.YELLOW);
		right_2.setBounds((int) (frameHeight / 6.5 * 5.5),
				(int) (frameHeight / 6.5 * 1.5), (int) (frameHeight / 6.5),
				(int) (frameHeight / 13));
		right_3 = new JPanel();
		right_3.setBackground(Color.RED);
		right_3.setBounds((int) (frameHeight / 6.5 * 5.5),
				(int) (frameHeight / 6.5 * 2), (int) (frameHeight / 6.5),
				(int) (frameHeight / 13));
		right_4 = new JPanel();
		right_4.setBackground(Color.GREEN);
		right_4.setBounds((int) (frameHeight / 6.5 * 5.5),
				(int) (frameHeight / 6.5 * 2.5), (int) (frameHeight / 6.5),
				(int) (frameHeight / 13));
		right_5 = new JPanel();
		right_5.setBackground(Color.YELLOW);
		right_5.setBounds((int) (frameHeight / 6.5 * 5.5),
				(int) (frameHeight / 6.5 * 3), (int) (frameHeight / 6.5),
				(int) (frameHeight / 13));
		right_6 = new JPanel();
		right_6.setBackground(Color.GREEN);
		right_6.setBounds((int) (frameHeight / 6.5 * 5.5),
				(int) (frameHeight / 6.5 * 3.5), (int) (frameHeight / 6.5),
				(int) (frameHeight / 13));
		right_7 = new JPanel();
		right_7.setBackground(Color.YELLOW);
		right_7.setBounds((int) (frameHeight / 6.5 * 5.5),
				(int) (frameHeight / 6.5 * 4), (int) (frameHeight / 6.5),
				(int) (frameHeight / 13));
		right_8 = new JPanel();
		right_8.setBackground(Color.GREEN);
		right_8.setBounds((int) (frameHeight / 6.5 * 5.5),
				(int) (frameHeight / 6.5 * 4.5), (int) (frameHeight / 6.5),
				(int) (frameHeight / 13));
		right_9 = new JPanel();
		right_9.setBackground(Color.YELLOW);
		right_9.setBounds((int) (frameHeight / 6.5 * 5.5),
				(int) (frameHeight / 6.5 * 5), (int) (frameHeight / 6.5),
				(int) (frameHeight / 13));
		bottom_1 = new JPanel();
		bottom_1.setBackground(Color.RED);
		bottom_1.setBounds((int) (frameHeight / 6.5),
				(int) (frameHeight / 6.5 * 5.5), (int) (frameHeight / 13),
				(int) (frameHeight / 6.5));
		bottom_2 = new JPanel();
		bottom_2.setBackground(Color.YELLOW);
		bottom_2.setBounds((int) (frameHeight / 6.5 * 1.5),
				(int) (frameHeight / 6.5 * 5.5), (int) (frameHeight / 13),
				(int) (frameHeight / 6.5));
		bottom_3 = new JPanel();
		bottom_3.setBackground(Color.RED);
		bottom_3.setBounds((int) (frameHeight / 6.5 * 2),
				(int) (frameHeight / 6.5 * 5.5), (int) (frameHeight / 13),
				(int) (frameHeight / 6.5));
		bottom_4 = new JPanel();
		bottom_4.setBackground(Color.GREEN);
		bottom_4.setBounds((int) (frameHeight / 6.5 * 2.5),
				(int) (frameHeight / 6.5 * 5.5), (int) (frameHeight / 13),
				(int) (frameHeight / 6.5));
		bottom_5 = new JPanel();
		bottom_5.setBackground(Color.YELLOW);
		bottom_5.setBounds((int) (frameHeight / 6.5 * 3),
				(int) (frameHeight / 6.5 * 5.5), (int) (frameHeight / 13),
				(int) (frameHeight / 6.5));
		bottom_6 = new JPanel();
		bottom_6.setBackground(Color.RED);
		bottom_6.setBounds((int) (frameHeight / 6.5 * 3.5),
				(int) (frameHeight / 6.5 * 5.5), (int) (frameHeight / 13),
				(int) (frameHeight / 6.5));
		bottom_7 = new JPanel();
		bottom_7.setBackground(Color.GREEN);
		bottom_7.setBounds((int) (frameHeight / 6.5 * 4),
				(int) (frameHeight / 6.5 * 5.5), (int) (frameHeight / 13),
				(int) (frameHeight / 6.5));
		bottom_8 = new JPanel();
		bottom_8.setBackground(Color.YELLOW);
		bottom_8.setBounds((int) (frameHeight / 6.5 * 4.5),
				(int) (frameHeight / 6.5 * 5.5), (int) (frameHeight / 13),
				(int) (frameHeight / 6.5));
		bottom_9 = new JPanel();
		bottom_9.setBackground(Color.RED);
		bottom_9.setBounds((int) (frameHeight / 6.5 * 5),
				(int) (frameHeight / 6.5 * 5.5), (int) (frameHeight / 13),
				(int) (frameHeight / 6.5));
		bottomRight = new JPanel();
		bottomRight.setBackground(Color.GREEN);
		bottomRight.setBounds((int) (frameHeight / 6.5 * 5.5),
				(int) (frameHeight / 6.5 * 5.5), (int) (frameHeight / 6.5),
				(int) (frameHeight / 6.5));
		communityChest = new JButton();

		zoomIn = new JPanel();
		zoomIn.setBounds((int) (frameHeight / 6.5 * 2.25),
				(int) (frameHeight / 6.5 * 2.25),
				(int) (frameHeight / 6.5 * 2), (int) (frameHeight / 6.5 * 2));
		zoomIn.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		topLeft.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				topLeft.setBounds(0, 0, (int) (frameHeight / 3.25),
						(int) (frameHeight / 3.25));
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				topLeft.setBounds(0, 0, (int) (frameHeight / 6.5),
						(int) (frameHeight / 6.5));
			}
		});
		left_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				left_1.setBounds(0, (int) (frameHeight / 6.5),
						(int) (frameHeight / 3.25), (int) (frameHeight / 6.5));
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				left_1.setBounds(0, (int) (frameHeight / 6.5),
						(int) (frameHeight / 6.5), (int) (frameHeight / 13));
			}
		});
		left_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				left_2.setBounds(0, (int) (frameHeight / 6.5 * 1.5),
						(int) (frameHeight / 3.25), (int) (frameHeight / 6.5));
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				left_2.setBounds(0, (int) (frameHeight / 6.5 * 1.5),
						(int) (frameHeight / 6.5), (int) (frameHeight / 13));
			}
		});
		left_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				left_3.setBounds(0, (int) (frameHeight / 6.5 * 2),
						(int) (frameHeight / 3.25), (int) (frameHeight / 6.5));
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				left_3.setBounds(0, (int) (frameHeight / 6.5 * 2),
						(int) (frameHeight / 6.5), (int) (frameHeight / 13));
			}
		});
		left_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				left_4.setBounds(0, (int) (frameHeight / 6.5 * 2.5),
						(int) (frameHeight / 3.25), (int) (frameHeight / 6.5));
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				left_4.setBounds(0, (int) (frameHeight / 6.5 * 2.5),
						(int) (frameHeight / 6.5), (int) (frameHeight / 13));
			}
		});
		left_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				left_5.setBounds(0, (int) (frameHeight / 6.5 * 3),
						(int) (frameHeight / 3.25), (int) (frameHeight / 6.5));
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				left_5.setBounds(0, (int) (frameHeight / 6.5 * 3),
						(int) (frameHeight / 6.5), (int) (frameHeight / 13));
			}
		});
		left_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				left_6.setBounds(0, (int) (frameHeight / 6.5 * 3.5),
						(int) (frameHeight / 3.25), (int) (frameHeight / 6.5));
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				left_6.setBounds(0, (int) (frameHeight / 6.5 * 3.5),
						(int) (frameHeight / 6.5), (int) (frameHeight / 13));
			}
		});
		left_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				left_7.setBounds(0, (int) (frameHeight / 6.5 * 4),
						(int) (frameHeight / 3.25), (int) (frameHeight / 6.5));
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				left_7.setBounds(0, (int) (frameHeight / 6.5 * 4),
						(int) (frameHeight / 6.5), (int) (frameHeight / 13));
			}
		});
		left_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				left_8.setBounds(0, (int) (frameHeight / 6.5 * 4.5),
						(int) (frameHeight / 3.25), (int) (frameHeight / 6.5));
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				left_8.setBounds(0, (int) (frameHeight / 6.5 * 4.5),
						(int) (frameHeight / 6.5), (int) (frameHeight / 13));
			}
		});
		left_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				left_9.setBounds(0, (int) (frameHeight / 6.5 * 4.5),
						(int) (frameHeight / 3.25), (int) (frameHeight / 6.5));
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				left_9.setBounds(0, (int) (frameHeight / 6.5 * 5),
						(int) (frameHeight / 6.5), (int) (frameHeight / 13));
			}
		});
		bottomLeft.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				bottomLeft.setBounds(0, (int) (frameHeight / 6.5 * 4.5),
						(int) (frameHeight / 3.25), (int) (frameHeight / 3.25));

			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				bottomLeft.setBounds(0, (int) (frameHeight / 6.5 * 5.5),
						(int) (frameHeight / 6.5), (int) (frameHeight / 6.5));

			}
		});

		communityChest = new JButton("?");
		frame.getContentPane().add(bottomLeft);
		frame.getContentPane().add(topLeft);
		frame.getContentPane().add(left_1);
		frame.getContentPane().add(left_2);
		frame.getContentPane().add(left_3);
		frame.getContentPane().add(left_4);
		frame.getContentPane().add(left_5);
		frame.getContentPane().add(left_6);
		frame.getContentPane().add(left_7);
		frame.getContentPane().add(left_8);
		frame.getContentPane().add(left_9);
		frame.getContentPane().add(top_1);
		frame.getContentPane().add(top_2);
		frame.getContentPane().add(top_3);
		frame.getContentPane().add(top_4);
		frame.getContentPane().add(top_5);
		frame.getContentPane().add(top_6);
		frame.getContentPane().add(top_7);
		frame.getContentPane().add(top_8);
		frame.getContentPane().add(top_9);
		frame.getContentPane().add(topRight);
		frame.getContentPane().add(right_1);
		frame.getContentPane().add(right_2);
		frame.getContentPane().add(right_3);
		frame.getContentPane().add(right_4);
		frame.getContentPane().add(right_5);
		frame.getContentPane().add(right_6);
		frame.getContentPane().add(right_7);
		frame.getContentPane().add(right_8);
		frame.getContentPane().add(right_9);
		frame.getContentPane().add(bottom_1);
		frame.getContentPane().add(bottom_2);
		frame.getContentPane().add(bottom_3);
		frame.getContentPane().add(bottom_4);
		frame.getContentPane().add(bottom_5);
		frame.getContentPane().add(bottom_6);
		frame.getContentPane().add(bottom_7);
		frame.getContentPane().add(bottom_8);
		frame.getContentPane().add(bottom_9);
		frame.getContentPane().add(bottomRight);
		frame.getContentPane().add(zoomIn);

		communityChest = new JButton();
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/chest.jpg"));
			communityChest.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		communityChest.setBounds((int) (frameHeight / 6.5 * 1.125),
				(int) (frameHeight / 6.5 * 1.125), (int) (frameHeight / 6.4),
				(int) (frameHeight / 6.4));
		communityChest.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		communityChest.setBorderPainted(false);
		communityChest.setContentAreaFilled(false);
		communityChest.setEnabled(false);
		chanceButton = new JButton();
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/chance.jpg"));
			chanceButton.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		chanceButton.setBounds((int) (frameHeight / 6.5 * 4.375),
				(int) (frameHeight / 6.5 * 4.375), (int) (frameHeight / 6.4),
				(int) (frameHeight / 6.4));
		chanceButton.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		chanceButton.setBorderPainted(false);
		chanceButton.setContentAreaFilled(false);
		chanceButton.setEnabled(false);
		frame.getContentPane().add(communityChest);
		frame.getContentPane().add(chanceButton);

	}
}
