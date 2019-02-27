import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet {
	
	private boolean gameOver;
	private Pokemon player1, player2;
	private PImage jungleBackground;

	public static void main(String[] args) {
        PApplet.main("Main");
	}
	
    public void settings(){
        size(768,432);
    }

    public void setup(){
    	gameOver = false;
    	jungleBackground = loadImage("jungle_background.png");
    	player1 = new Charmander(this);
    }

    public void draw(){
    	if (gameOver) {
    		drawNewGameScreen();
    	}
    	else {
    		drawFightScreen();
    	}
    }
    
    public void drawFightScreen() {
    	// draw background
    	image(jungleBackground, 0, 0);
    	
    	// draw farthest pokemon
    	
    	// draw closest pokemon
    	player1.drawNextFrame();
    	
    	// draw attack menu
    }
    
    public void drawNewGameScreen() {
    	image(jungleBackground, 0, 0);
    	rectMode(RADIUS);
    	rect(width / 2, height / 3, 200, 50, 20);
    	fill(255);
    	rect(width / 2, height / 3, 190, 40, 10);
    	fill(255, 64, 0);
    	textSize(48);
    	text("Pokemon", width / 2 - 160, height / 3 + 16);
    }

}
