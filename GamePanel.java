package main;

import java.awt.*;

import javax.swing.JPanel;



public class GamePanel extends JPanel{
	
	
	

		public void paintComponent(Graphics g) {
			
			g.setColor(Color.BLACK);
			g.fillRect(0, 0, 400, 400);
			drawBoard(g);
		}	
	
		void drawBoard(Graphics g) {
			int r = Game.board.length;
			int c = Game.board[0].length;
			
			for (int row = 0; row < r; row++) {
				for (int col = 0; col < c; col++) {
					int val = Game.board[row][col];
					if (val != 0) {
						g.setColor(Color.WHITE);
						g.setFont(new Font("Arial", Font.PLAIN, 32));
						g.drawString("" + val, (col* 64) + 32, row * 64 + 44);
					}
					g.setColor(Color.white);
					g.drawRect(col*64, row * 64, 64, 64);
				}
			}
		}

}
