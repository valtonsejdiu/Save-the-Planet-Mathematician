import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class Keys extends KeyAdapter {

	Shooter s;
	MovingUfo u;
	Random r = new Random();
	String[]a;

	public Keys(Shooter shooter, MovingUfo ufo) {
		this.s=shooter;
		this.u=ufo;
	}

	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_LEFT || e.getKeyCode()==KeyEvent.VK_A) {
			if(s.getX()-100>0) {
				s.moveLeft();
				s.shot.setVisible(false);
			}
		}

		if(e.getKeyCode()==KeyEvent.VK_RIGHT || e.getKeyCode()==KeyEvent.VK_D) {
			if(s.getX()+200<1000) {
				s.shot.setVisible(false);
				s.moveRight();
			}
		}

		if(e.getKeyCode()==KeyEvent.VK_SPACE) {
			s.shoot();
			shooted();
		}

	}
	public void KeyPressed(KeyEvent e) {}
	public void generate() {
		a=new String[5];
		for(int i=0;i<5;i++) {
			u.getU()[i].equation();
			a[i]=u.getU()[i].rez();
		}
		s.setNumber(a[r.nextInt(5)]);
	}
	public void shooted() {
		for(int i = 0;i<5;i++) {
			if(s.getX()>u.getU()[i].getX()&&s.getX()<u.getU()[i].getX()+200) {
				int rock=Integer.parseInt(s.getText());
				int a=u.getU()[i].a();
				int b=u.getU()[i].b();
				int rez=0;
				int operator=u.getU()[i].sgn();

				if(operator==0) {
					rez=a+b;}
				else { rez=a-b;
				}

				if(rock==rez) {
					s.score++;
					u.getU()[i].setY(0-116-r.nextInt(50));
					u.getU()[i].equation();
					nextToShoot();
					u.t.t();
				}else {
					u.t.f();

				}
			}
		}		
	}
	public void nextToShoot() {
		int num = r.nextInt(5);
		for(int i=0;i<5;i++) {
			int max = 0;

			if(u.getU()[i].getY()-116>max) {
				max=u.getU()[i].getY();
				num=i;							
			}											
		}s.setNumber(u.getU()[num].rez());
	}


}