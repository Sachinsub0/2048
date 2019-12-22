package main;

import java.awt.*;

import javax.swing.*;

public class Game extends JFrame {
	static JFrame frame;
	public static GamePanel gamePanel;
	
	private static int width = 400;
	public static int height = 400;
	
	JLabel label;

	public static int[][] board = new int[4][4];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			
			
				prepBoard();
				frame = new JFrame("2048");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				gamePanel = new GamePanel();
				new GamePanelListener(gamePanel);
				frame.getContentPane().add(BorderLayout.CENTER, gamePanel);
				frame.setResizable(false);
				gamePanel.setFocusable(true);
				gamePanel.requestFocusInWindow();
				frame.setSize(width, height);
				frame.setLocationByPlatform(true);
				frame.setVisible(true);
				//init();
				update();

				
			
	}
	
	public static void update() {
		while (true) {
			try {
				Thread.sleep(16);
			} catch (Exception e) {
				e.printStackTrace();
			}
			frame.repaint();
		}
	}
	static void prepBoard() {
		int row = (int)(Math.random() * 4);
		int col = (int)(Math.random() * 4);
		
		
		board[row][col] = 2;
		
		boolean safe = false;
		
		System.out.println("The first PIECE row is: " + row);
		System.out.println("The first PIECE col is: " + col);
		
		while (!safe) {
			int row2 = (int)(Math.random() * 4);
			int col2 = (int)(Math.random() * 4);
			
			System.out.println("The value at the row of : " + row2 + " and the col of : " + col2 + " is: " + board[row2][col2]);
			
			if (board[row2][col2] == 0) {
				board[row2][col2] = 2;
				safe = true;
			}
		}
	}

}
