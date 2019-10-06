import java.awt.Color;
import java.util.Random;

import apcslib.DrawingTool;
import apcslib.SketchPad;


public class BenzeneDrawer { //Uses java.awt drawing tool to draw patterns
	DrawingTool pen = new DrawingTool(new SketchPad(500,500));
	
	Random ra= new Random();
	
	int A=ra.nextInt(160);
	int B=ra.nextInt(160);
	int C=ra.nextInt(160);
	
	int red=ra.nextInt(255);
	int blue=ra.nextInt(1);
	int green=ra.nextInt(190);
	int re=ra.nextInt(190);
	
	Color Rainbow= new Color(255,255,51); 
	Color Color=new Color(125,125,125);
	
	/*
	 * What information does it make sense to pass into the drawBenzene
	 * method?  This info is whatever is needed to create an image of one benzene
	 * Then, to make the cool drawing, you can call the drawBenzene method lots
	 * of times!
	 */
	public void drawBenzene(int x, int y, int l, int r){
		int rotation=0;
		int move=0;
		int radius=r;
		int distradius= ((radius/2)+radius);
		int benzides=l;
		pen.down();
		pen.up();
		pen.setColor(Color);
		pen.setWidth(2);
		pen.move(x,y);
		pen.down();
		radius+=6;
		pen.drawCircle(radius);
		pen.setColor(Rainbow);
		pen.up();
		pen.move(x,y);
		pen.setDirection(90);
		pen.turnRight(60);
//		rotation+=20;
//		pen.turnRight(rotation);
		distradius+=15;
		pen.move(distradius);
		pen.turnRight(120);
		pen.down();
		move+=3;
		pen.move(move);
		benzides+=10;
		for(int ThisGuy=0; ThisGuy<6; ThisGuy++){
			pen.move(benzides);
			pen.turnRight(60);
		}
		pen.setDirection(90);
		
		pen.up();
		pen.move(radius);
		
	}
}
