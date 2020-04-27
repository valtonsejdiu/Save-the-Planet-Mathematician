import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gui obj =new Gui();
		Shooter s= new Shooter(450,obj);
		MovingUfo m = new MovingUfo(obj,s);
		Keys k = new Keys(s,m);
		JOptionPane.showMessageDialog(null, "Game Controls :\nLeft : A or <=\nRight : D or =>\nShoot : SpaceBar", "Instructions", JOptionPane.INFORMATION_MESSAGE);
		obj.f.addKeyListener(k);
		k.generate();
		m.moveUfo();
	}

}
