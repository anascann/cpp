import javax.swing.*;
import java.awt.*;

public class SimpleAnimation{
	int x=70;
	int y=70;
	public static void main(String[] args) {
		SimpleAnimation gui=new SimpleAnimation();
		gui.go();
	}

	public void go(){
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		MyDrawPanel drawpanel=new MyDrawPanel();

		frame.getContentPane().add(drawpanel);
		frame.setSize(600,600);
		frame.setVisible(true);

		for(int i=0; i<630; i++){
			x++;
			y++;
			drawpanel.repaint();
			try{
				Thread.sleep(20);

			}catch(Exception ex){}
		}
	}

	class MyDrawPanel extends JPanel{
		public void paintComponent(Graphics g){
			g.setColor(Color.white);
			g.fillRect(0,0,this.getWidth(), this.getHeight());
			g.setColor(Color.green);
			g.fillOval(x,y,40,40);
		}
	}
}