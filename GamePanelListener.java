package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;



public class GamePanelListener implements KeyListener, ActionListener{
		private GamePanel gamePanel;


		public GamePanelListener(GamePanel gamePanel) {
			this.gamePanel = gamePanel;
			gamePanel.addKeyListener(this);

		}
		
			
		
			
			
			
		
		

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			int key = e.getKeyCode();
			//System.out.println(key);
			if (key ==  KeyEvent.VK_RIGHT) {
				
				//System.out.println("Key was pressed");
				//Scanner temp_row = new Scanner(System.in);
				//System.out.println("Enter row and column");
				//String r = temp_row.nextLine();
				//int row = Integer.parseInt(r.substring(0,1));
				//int col = Integer.parseInt(r.substring(1));
				////Helper.moveCell(row, col, 0);
				//System.out.println("Right Key Pressed");
				Helper.shiftRight();
				Helper.generate();
			}
			if (key == KeyEvent.VK_DOWN) {
				Helper.shiftDown();
				Helper.generate();
			}
			if (key == KeyEvent.VK_UP) {
				Helper.shiftUp();
				Helper.generate();
			}
			if (key == KeyEvent.VK_LEFT) {
				Helper.shiftLeft();
				Helper.generate();
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}


}
