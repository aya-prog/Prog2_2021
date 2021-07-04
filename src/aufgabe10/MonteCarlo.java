package aufgaben.aufgabe10;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;


		
		
		  
			import java.awt.Color;
			import java.awt.Graphics;
			import java.awt.Graphics2D;
			import java.util.Random;
			import javax.swing.JFrame;
			import javax.swing.JPanel;

			public class MonteCarlo extends JFrame{
			
				private static final long serialVersionUID = 1L;
				int points;
				int red=0;
				int blue=0;
				double pi;
				
				public MonteCarlo() {
					super("Berechne Pi");
					this.setSize(480,500);
					this.setDefaultCloseOperation(EXIT_ON_CLOSE);
				    this.points=50000;
					this.add(new Canvas());

					this.setVisible(true);
				}
				
				private class Canvas extends JPanel {
					final int RADIUS = 400;
				
					@Override
					protected void paintComponent(Graphics g) {
						super.paintComponent(g);
						Graphics2D g2 = (Graphics2D)g;
						g2.drawRect(30, 30, RADIUS, RADIUS);
						g2.drawArc(30,30,RADIUS*2,RADIUS*2 , 90, 90 );
						final int ORIGIN = 430;
						g2.fillOval(ORIGIN, ORIGIN, 3,3);
						Random r = new Random();
						for(int i = 0; i<MonteCarlo.this.points;i++) {
							int x = r.nextInt(401)+30; 
							int y = r.nextInt(401)+30;
							if ((x - ORIGIN) * (x - ORIGIN) + (y - ORIGIN) * (y - ORIGIN) <= RADIUS * RADIUS) 
							{
								g2.setColor(Color.RED);
								MonteCarlo.this.red++;
							}
							else 
							{
								g2.setColor(Color.BLUE);
								MonteCarlo.this.blue++;
							}
							g2.fillOval(x,y,2,2);
						}

						MonteCarlo.this.pi = ((double)MonteCarlo.this.red/(double)MonteCarlo.this.points)*4;
						System.out.println("Gesamt Punkte: " + MonteCarlo.this.points);
						System.out.println("Rote Punkte: " + MonteCarlo.this.red);
						System.out.println("Blaue Punkte: " + MonteCarlo.this.blue);
						System.out.println("PI ist: "+pi);
					}
				}

				public static void main(String[] args) {
					MonteCarlo mc=new MonteCarlo();
				}
			


	
	
	
	
	
	
	
	



}
