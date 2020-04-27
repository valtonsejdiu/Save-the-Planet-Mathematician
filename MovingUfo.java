import java.awt.Color;
import java.awt.Font;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MovingUfo{

	private JPanel p;
	private	Ufo [] ufo= new Ufo[5];
	Shooter s;
	Random r = new Random();
	JLabel background = new JLabel();
	JLabel score = new JLabel();
	Time t = new Time();

	public MovingUfo(JPanel p,  Shooter s) {

		this.p=p;
		this.s=s;
		p.setLayout(null);
		background.setIcon(new ImageIcon("bckgr.png"));
		background.setBounds(-120, 0, 1135, 700);
		score.setBounds(10, 0, 150, 100);
		score.setForeground(Color.WHITE);
		Font f= new Font("f",2,30);
		score.setFont(f);
		p.add(t);
		p.add(score);
		for(int i =0;i<5;i++) {

			ufo[i]=new Ufo(30+(190*i),5);

			p.add(ufo[i]);
		}		

		p.add(background);


	}
	public void moveUfo() {
		int counter=1;
		while(true) {
score.setText("Score : "+s.score);
			if(counter%16==0) {
				t.move();
			}
			if(counter%4==0) {
				s.shot.setVisible(false);
			}
			counter++;
			for(int i =0;i<5;i++) {

				ufo[i].move(r.nextInt(5));
				p.repaint();

				if(ufo[i].getY()>375&&ufo[i].getX()<s.getX()&&ufo[i].getX()+200>s.getX()){

					JOptionPane.showMessageDialog(null, "Aliens destroyed spacecraft and occupied Earth, You Lose!"+"\nYour score was: "+s.score+".","Game Over", 2);
					System.exit(0);	
				}
				else if(ufo[i].getY()>500) {

					JOptionPane.showMessageDialog(null, "Aliens occupied Earth, You Lose!"+"\nYour score was: "+s.score+".","Game Over", 2);
					System.exit(0);										
				}
				else if(t.getX()+1015<=0) {

					JOptionPane.showMessageDialog(null, "Time is Up, You Lose!"+"\nYour score was: "+s.score+".","Game Over", 2);
					System.exit(0);
				}
			}		

			try {
				Thread.sleep(70);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public Ufo[] getU() {
		return ufo;
	}

}
