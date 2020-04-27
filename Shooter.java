import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Shooter extends JLabel {
		
	JPanel p;
	JLabel shot = new JLabel();
	private ImageIcon pic = new ImageIcon("shooter.png");
	private int x;
	private int y=450;
	private int w=100;
	private int h=200;
	int score=0;
	
	
	public Shooter(int x, JPanel p) {
		
		this.p=p;
		
		shot.setIcon(new ImageIcon("shot.png"));
		shot.setBounds(x+45, 480, 10, 400);
		shot.setVisible(false);
		
		p.add(shot);
				
		p.add(this);
		this.x=x;
		setIcon(pic);
		setBounds(x,y,w,h);
		
		Font f= new Font("f",1,30);
		setFont(f);
		setForeground(Color.BLACK);
		setHorizontalTextPosition(CENTER);
		setVerticalTextPosition(CENTER);
		

	}
	public int getX() {
		return this.x;
	}
			
	public int getY() {
		return this.y;
	}
	
	public void setX(int x) {
		this.x=x;
	}
	
	public void setY(int y) {
		this.y=y;
	}
				
	public void moveLeft(){	  
		
		
		this.setX(this.getX()-190);
		
	}
	public void moveRight(){	  
		
		this.setX(this.getX()+190);
		
	}
	
	public void shoot() {
		
		shot.setVisible(true);
		shot.setBounds(getX()+45,getY()-300, 10, 300);
     				
	}
	public void setNumber(String a) {
		setText(a);
	}
}
