import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Ufo extends JLabel{

	private ImageIcon pic = new ImageIcon("ufo.png");
	private int x,y;
	private int w=180;
	private int h=116;
	private int a,b,sgn;
	private String rez;
	Random r = new Random();

	public Ufo(int x, int y) {
		this.x=x;
		this.y=y;

		setIcon(pic);
		setBounds(x, y, w, h);
		Font f= new Font("f",1,25);
		setFont(f);
		setForeground(Color.BLACK);
		setHorizontalTextPosition(CENTER);
		setVerticalTextPosition(CENTER);

	}

	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x=x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y=y;
	}

	public void move(int a){	  
		this.setY(this.getY()+a);
	}
	
	public int a() {
		return a;
	}

	public int b() {
		return b;
	}
	
	public int sgn() {
		return sgn;
	}
	
	public void equation() {
		a=r.nextInt(20);
		b=r.nextInt(20);
		
		sgn=r.nextInt(2);
		
		switch(sgn) {
		case 0 : 
			setText(a+"+"+b);
			rez=a+b+"";
			break;
		case 1 : 
			if(a<b) {
				a=a+b;
				b=a-b;
				a=a-b;					
			}
			setText(a+"-"+b);
			rez=a-b+"";
			break;
		}
		
	}public String rez() {
		return rez;
	}
}
