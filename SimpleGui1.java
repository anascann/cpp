import javax.swing.*;
import java.awt.event.*;

public class SimpleGui1 implements ActionListener{
	JButton button;

	public static void main(String[] args) {
		SimpleGui1 gui=new SimpleGui1();
		gui.go();
	}

	public void go(){
		JFrame frame=new JFrame();
		button= new JButton("clicke me");

		button.addActionListener(this);

		frame.getContentPane().add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent event){
		button.setText("i have been clicked");
	}
}