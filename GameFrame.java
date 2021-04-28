import java.awt.*;

import javax.swing.*;



public class GameFrame extends JFrame{



	GamePanel panel;

	

	GameFrame(){

		panel = new GamePanel();

		this.add(panel);

		this.setTitle("Galaxy Pong");

		this.setResizable(false);

		this.setBackground(Color.black);

		//Image img = Toolkit.getDefaultToolkit().createImage("GalaxyBackground.jpg");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.pack();

		this.setVisible(true);

		this.setLocationRelativeTo(null);

	}

}
