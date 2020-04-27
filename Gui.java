
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gui extends JPanel{
	Random r = new Random();
	JFrame f = new JFrame();
		
	public Gui(){
				
		setLayout(null);
		f.getContentPane().add(this);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("Save The Planet Mathematician!");
		f.setResizable(false);
		f.setBounds(200, 20, 1015, 700);
		f.add(this);
		
	}

	public void paintComponent(Graphics g) {
		repaint();		
	}
}
