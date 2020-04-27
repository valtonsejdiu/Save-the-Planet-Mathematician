import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Time extends JLabel{
	
	
	public Time() {
				
		setIcon(new ImageIcon("timer.png"));
		setBounds(0, 5, 1015, 10);
		
	}
	public int getX() {
		return (int)getLocation().getX();
	}
	public void t() {
		setBounds(getX()+16,5,1015,10);
	}
	public void f() {
		setBounds(getX()-32,5,1015,10);
	}
		
	public void move() {
		setBounds(getX()-32,5,1015,10);
	}
}