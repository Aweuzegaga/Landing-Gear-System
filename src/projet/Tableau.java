package projet;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import javax.swing.ImageIcon;
import java.awt.Canvas;
import java.awt.Color;

public class Tableau {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	static int i=0;
	static int var=0;
	int status = 1;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tableau window = new Tableau();
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
	public Tableau(){
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final JSlider slider = new JSlider();
		slider.setValue(0);
		slider.setBounds(57, 11, 20, 518);
		slider.setAlignmentY(0.2f);
		slider.setAlignmentX(0.2f);
		slider.setOrientation(SwingConstants.VERTICAL);
		frame.getContentPane().add(slider);
		
		
		
		JLabel lblNewLabel = new JLabel("door_closed");
		lblNewLabel.setIcon(new ImageIcon(Tableau.class.getResource("/projet/door2_closed.jpg")));
		lblNewLabel.setBounds(137, 60, 118, 117);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("gear_extracted");
		lblNewLabel_1.setIcon(new ImageIcon(Tableau.class.getResource("/projet/gear2_extracted.jpg")));
		lblNewLabel_1.setBounds(459, 368, 118, 118);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("door_moving");
		lblNewLabel_2.setIcon(new ImageIcon(Tableau.class.getResource("/projet/door2_moving.jpg")));
		lblNewLabel_2.setBounds(137, 208, 118, 117);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("door_opened");
		lblNewLabel_3.setIcon(new ImageIcon(Tableau.class.getResource("/projet/door2_opened.jpg")));
		lblNewLabel_3.setBounds(137, 359, 118, 127);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("gear_moving");
		lblNewLabel_4.setIcon(new ImageIcon(Tableau.class.getResource("/projet/gear2_moving.jpg")));
		lblNewLabel_4.setBounds(459, 208, 118, 117);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("gear_retracted");
		lblNewLabel_5.setIcon(new ImageIcon(Tableau.class.getResource("/projet/gear2_retracted.jpg")));
		lblNewLabel_5.setBounds(459, 60, 118, 117);
		frame.getContentPane().add(lblNewLabel_5);
		
		final Canvas d_closed = new Canvas();
		d_closed.setBackground(Color.YELLOW);
		d_closed.setBounds(261, 60, 118, 117);
		frame.getContentPane().add(d_closed);
		
		final Canvas d_moving = new Canvas();
		d_moving.setBackground(Color.GRAY);
		d_moving.setBounds(261, 208, 118, 117);
		frame.getContentPane().add(d_moving);
		
		final Canvas d_opened = new Canvas();
		d_opened.setBackground(Color.GRAY);
		d_opened.setBounds(261, 359, 118, 117);
		frame.getContentPane().add(d_opened);
		
		final Canvas g_retracted = new Canvas();
		g_retracted.setBackground(Color.GRAY);
		g_retracted.setBounds(583, 60, 118, 117);
		frame.getContentPane().add(g_retracted);
		
		final Canvas g_moving = new Canvas();
		g_moving.setBackground(Color.GRAY);
		g_moving.setBounds(583, 208, 118, 117);
		frame.getContentPane().add(g_moving);
		
		final Canvas g_extracted = new Canvas();
		g_extracted.setBackground(Color.YELLOW);
		g_extracted.setBounds(583, 368, 118, 117);
		frame.getContentPane().add(g_extracted);
		
		final Canvas door_led = new Canvas();
		door_led.setBackground(Color.GREEN);
		door_led.setBounds(170, 10, 50, 44);
		frame.getContentPane().add(door_led);
		
		final Canvas gear_led = new Canvas();
		gear_led.setBackground(Color.GREEN);
		gear_led.setBounds(492, 10, 50, 44);
		frame.getContentPane().add(gear_led);
		
		/*** Gestion de l'évènement sur le levier
		 *** Et affichage sur le tableau de bord
		 ***                                     ***/
		slider.addChangeListener(
				new ChangeListener() {
					public void stateChanged(ChangeEvent e) {
						
						Thread t = new Thread(){
							public void run(){
								
								/*** TEST POUR LE DECOLLAGE ***/
								if(slider.getValue()==100 && i==0){
									
									door_led.setBackground(Color.ORANGE);
						        	
						        	d_closed.setBackground(Color.GRAY);
						        	
						        	d_moving.setBackground(Color.YELLOW);
						        	
						        	try {
										Thread.sleep(2000);
									} catch (InterruptedException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
						        	
						        	d_moving.setBackground(Color.GRAY);
						        	
						        	d_opened.setBackground(Color.YELLOW);
						        	
						        	door_led.setBackground(Color.GREEN);
						        	
						        	gear_led.setBackground(Color.ORANGE);
						        	
						        	g_extracted.setBackground(Color.GRAY);
						        	
						        	g_moving.setBackground(Color.YELLOW);
						        	
						        	try {
										Thread.sleep(2000);
									} catch (InterruptedException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
						        	
						        	g_moving.setBackground(Color.GRAY);
						        	
						        	g_retracted.setBackground(Color.YELLOW);
						        	
						        	gear_led.setBackground(Color.GREEN);
						        	
						        	try {
										Thread.sleep(2000);
									} catch (InterruptedException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
						        	
						        	door_led.setBackground(Color.ORANGE);
						        	
						        	d_opened.setBackground(Color.GRAY);
						        	
						        	d_moving.setBackground(Color.YELLOW);
						        	
						        	try {
										Thread.sleep(2000);
									} catch (InterruptedException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
						        	
						        	d_moving.setBackground(Color.GRAY);
						        	
						        	d_closed.setBackground(Color.YELLOW);
						        	
						        	door_led.setBackground(Color.GREEN);
						        	
						        	i=1;
									
								}
								
								/*** FIN DU DECOLLAGE ***/
								
								/*** TEST POUR L'ATTERRISSAGE ***/
								
								if(slider.getValue()== 0 && i==1){
									
									door_led.setBackground(Color.ORANGE);
						        	
						        	d_closed.setBackground(Color.GRAY);
						        	
						        	d_moving.setBackground(Color.YELLOW);
						        	
						        	try {
										Thread.sleep(2000);
									} catch (InterruptedException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
						        	
						        	d_moving.setBackground(Color.GRAY);
						        	
						        	d_opened.setBackground(Color.YELLOW);
						        	
						        	door_led.setBackground(Color.GREEN);
						        	
						        	gear_led.setBackground(Color.ORANGE);
						        	
						        	g_retracted.setBackground(Color.GRAY);
						        	
						        	g_moving.setBackground(Color.YELLOW);
						        	
						        	try {
										Thread.sleep(2000);
									} catch (InterruptedException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
						        	
						        	g_moving.setBackground(Color.GRAY);
						        	
						        	g_extracted.setBackground(Color.YELLOW);
						        	
						        	gear_led.setBackground(Color.GREEN);
						        	
						        	try {
										Thread.sleep(2000);
									} catch (InterruptedException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
						        	
						        	door_led.setBackground(Color.ORANGE);
						        	
						        	d_opened.setBackground(Color.GRAY);
						        	
						        	d_moving.setBackground(Color.YELLOW);
						        	
						        	try {
										Thread.sleep(2000);
									} catch (InterruptedException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
						        	
						        	d_moving.setBackground(Color.GRAY);
						        	
						        	d_closed.setBackground(Color.YELLOW);
						        	
						        	door_led.setBackground(Color.GREEN);
						        	
						        	i=0;
									
								}
								
								/*** FIN DE L'ATTERRISSAGE ***/
							}
						};
						
					t.start();
		       
		      }
		    }); //FIN DES TESTS SUR LE LEVIER
		
	}
}