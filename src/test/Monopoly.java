package test;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class Monopoly {

	private JFrame frame;
	private JPanel topLeft;
	private JPanel bottomLeft;
	private JPanel left_1;
	private JPanel left_2;
	private JPanel left_3;
	private JPanel left_4;
	private JPanel left_5;
	private JPanel left_6;
	private JPanel left_7;
	private JPanel left_8;
	private JPanel left_9;
	//private int frameWidth;
	private int frameHeight;
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
	    frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
	    frame.setSize(screenSize);
	    frame.setResizable(false);
	    frame.setVisible(true);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.getContentPane().setLayout(null);
	    //frameWidth = frame.getWidth();
	    frameHeight = frame.getHeight()-40;
	    topLeft = new JPanel();
	    topLeft.setBackground(Color.YELLOW);
	    topLeft.setBounds(0, 0, (int) (frameHeight/6.5), (int) (frameHeight/6.5));
		bottomLeft = new JPanel();
		left_1 = new JPanel();
		left_1.setBackground(Color.GREEN);
		left_1.setBounds(0, (int) (frameHeight/6.5), (int) (frameHeight/6.5), (int) (frameHeight/13));
		left_2 = new JPanel();
		left_2.setBackground(Color.YELLOW);
		left_2.setBounds(0, (int) (frameHeight/6.5 * 1.5), (int) (frameHeight/6.5), (int) (frameHeight/13));
		left_3 = new JPanel();
		left_3.setBackground(Color.RED);
		left_3.setBounds(0, (int) (frameHeight/6.5 * 2), (int) (frameHeight/6.5), (int) (frameHeight/13));
		left_4 = new JPanel();
		left_4.setBackground(Color.GREEN);
		left_4.setBounds(0, (int) (frameHeight/6.5 * 2.5), (int) (frameHeight/6.5), (int) (frameHeight/13));
		left_5 = new JPanel();
		left_5.setBackground(Color.YELLOW);
		left_5.setBounds(0, (int) (frameHeight/6.5 * 3), (int) (frameHeight/6.5), (int) (frameHeight/13));
		left_6 = new JPanel();
		left_6.setBackground(Color.GREEN);
		left_6.setBounds(0, (int) (frameHeight/6.5 * 3.5), (int) (frameHeight/6.5), (int) (frameHeight/13));
		left_7 = new JPanel();
		left_7.setBackground(Color.YELLOW);
		left_7.setBounds(0, (int) (frameHeight/6.5 * 4), (int) (frameHeight/6.5), (int) (frameHeight/13));
		left_8 = new JPanel();
		left_8.setBackground(Color.GREEN);
		left_8.setBounds(0, (int) (frameHeight/6.5 * 4.5), (int) (frameHeight/6.5), (int) (frameHeight/13));
		left_9 = new JPanel();
		left_9.setBackground(Color.YELLOW);
		left_9.setBounds(0, (int) (frameHeight/6.5 * 5), (int) (frameHeight/6.5), (int) (frameHeight/13));
		bottomLeft.setBackground(Color.GREEN);
		bottomLeft.setBounds(0, (int) (frameHeight/6.5 * 5.5), (int) (frameHeight/6.5), (int) (frameHeight/6.5));
		topLeft.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseEntered(MouseEvent arg0) {
	    		topLeft.setBounds(0, 0, (int) (frameHeight/3.25), (int) (frameHeight/3.25));
	    	}
	    	@Override
	    	public void mouseExited(MouseEvent arg0) {
	    		topLeft.setBounds(0, 0, (int) (frameHeight/6.5), (int) (frameHeight/6.5));
	    	}
	    });
		left_1.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseEntered(MouseEvent arg0) {
	    		left_1.setBounds(0, (int) (frameHeight/6.5 * 0.75), (int) (frameHeight/3.25), (int) (frameHeight/6.5));
	    	}
	    	@Override
	    	public void mouseExited(MouseEvent arg0) {
	    		left_1.setBounds(0, (int) (frameHeight/6.5), (int) (frameHeight/6.5), (int) (frameHeight/13));
	    	}
	    });
		left_2.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseEntered(MouseEvent arg0) {
	    		left_2.setBounds(0, (int) (frameHeight/6.5 * 1.25), (int) (frameHeight/3.25), (int) (frameHeight/6.5));
	    	}
	    	@Override
	    	public void mouseExited(MouseEvent arg0) {
	    		left_2.setBounds(0, (int) (frameHeight/6.5 * 1.5), (int) (frameHeight/6.5), (int) (frameHeight/13));
	    	}
	    });
		left_3.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseEntered(MouseEvent arg0) {
	    		left_3.setBounds(0, (int) (frameHeight/6.5 * 1.75), (int) (frameHeight/3.25), (int) (frameHeight/6.5));
	    	}
	    	@Override
	    	public void mouseExited(MouseEvent arg0) {
	    		left_3.setBounds(0, (int) (frameHeight/6.5 * 2), (int) (frameHeight/6.5), (int) (frameHeight/13));
	    	}
	    });
		left_4.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseEntered(MouseEvent arg0) {
	    		left_4.setBounds(0, (int) (frameHeight/6.5 * 2.25), (int) (frameHeight/3.25), (int) (frameHeight/6.5));
	    	}
	    	@Override
	    	public void mouseExited(MouseEvent arg0) {
	    		left_4.setBounds(0, (int) (frameHeight/6.5 * 2.5), (int) (frameHeight/6.5), (int) (frameHeight/13));
	    	}
	    });
		left_5.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseEntered(MouseEvent arg0) {
	    		left_5.setBounds(0, (int) (frameHeight/6.5 * 2.75), (int) (frameHeight/3.25), (int) (frameHeight/6.5));
	    	}
	    	@Override
	    	public void mouseExited(MouseEvent arg0) {
	    		left_5.setBounds(0, (int) (frameHeight/6.5 * 3), (int) (frameHeight/6.5), (int) (frameHeight/13));
	    	}
	    });
		left_6.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseEntered(MouseEvent arg0) {
	    		left_6.setBounds(0, (int) (frameHeight/6.5 * 3.25), (int) (frameHeight/3.25), (int) (frameHeight/6.5));
	    	}
	    	@Override
	    	public void mouseExited(MouseEvent arg0) {
	    		left_6.setBounds(0, (int) (frameHeight/6.5 * 3.5), (int) (frameHeight/6.5), (int) (frameHeight/13));
	    	}
	    });
		left_7.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseEntered(MouseEvent arg0) {
	    		left_7.setBounds(0, (int) (frameHeight/6.5 * 3.75), (int) (frameHeight/3.25), (int) (frameHeight/6.5));
	    	}
	    	@Override
	    	public void mouseExited(MouseEvent arg0) {
	    		left_7.setBounds(0, (int) (frameHeight/6.5 * 4), (int) (frameHeight/6.5), (int) (frameHeight/13));
	    	}
	    });
		left_8.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseEntered(MouseEvent arg0) {
	    		left_8.setBounds(0, (int) (frameHeight/6.5 * 4.25), (int) (frameHeight/3.25), (int) (frameHeight/6.5));
	    	}
	    	@Override
	    	public void mouseExited(MouseEvent arg0) {
	    		left_8.setBounds(0, (int) (frameHeight/6.5 * 4.5), (int) (frameHeight/6.5), (int) (frameHeight/13));
	    	}
	    });
		left_9.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseEntered(MouseEvent arg0) {
	    		left_9.setBounds(0, (int) (frameHeight/6.5 * 4.75), (int) (frameHeight/3.25), (int) (frameHeight/6.5));
	    	}
	    	@Override
	    	public void mouseExited(MouseEvent arg0) {
	    		left_9.setBounds(0, (int) (frameHeight/6.5 * 5), (int) (frameHeight/6.5), (int) (frameHeight/13));
	    	}
	    });
		bottomLeft.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseEntered(MouseEvent arg0) {
	    		bottomLeft.setBounds(0, (int) (frameHeight/6.5 * 4.5), (int) (frameHeight/3.25), (int) (frameHeight/3.25));
	    	}
	    	@Override
	    	public void mouseExited(MouseEvent arg0) {
	    		bottomLeft.setBounds(0, (int) (frameHeight/6.5 * 5.5), (int) (frameHeight/6.5), (int) (frameHeight/6.5));
	    	}
	    });
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
	    frame.getContentPane().add(bottomLeft);
	    
	}
}
