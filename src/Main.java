import processing.core.PApplet;

public class Main extends PApplet {
	
	private boolean gameOver;

	public static void main(String[] args) {
        PApplet.main("Main");
	}
	
    public void settings(){
        size(600,400);
    }

    public void setup(){
    	gameOver = true;
        fill(120,50,240);
    }

    public void draw(){
    	if (gameOver) {
    		drawNewGameScreen();
    	}
    }
    
    public void drawNewGameScreen() {
    	background(0, 128, 0);
    	fill(0, 0, 128);
    	rectMode(RADIUS);
    	rect(width / 2, height / 3, 200, 50, 20);
    	fill(255);
    	rect(width / 2, height / 3, 190, 40, 10);
    	fill(255, 64, 0);
    	textSize(48);
    	text("Pokemon", width / 2 - 160, height / 3 + 16);
    }

}
