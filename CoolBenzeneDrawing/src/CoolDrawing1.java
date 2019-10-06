import java.util.Random;


public class CoolDrawing1 {
	

	public static void main(String[] args) {
		BenzeneDrawer Bobby = new BenzeneDrawer();
		looping(Bobby);		
	}

	private static void looping(BenzeneDrawer Bobby) {
		// code to have the benzeneDrawer do something cool...
		int x=-350;
		int y=-350;
		int r=60;
		int l=(r*3)/2;
		
		if(Bobby.equals(Bobby)){
			for(int loop = 0; loop<5; loop++){
				Bobby.drawBenzene(x, y, l, r);
				x+=7;
				y+=7;
				r-=5;
				l-=5;
				
			}
		}
		
		r=40;
		l=(r*3)/2;
		if(Bobby.equals(Bobby)){
			for(int pandas= 0; pandas<15; pandas++,x+=9,y+=9){
				Bobby.drawBenzene(x, y, l, r);
			}
		}

		r=50;
		l=(r*3)/2;
		if(Bobby.equals(Bobby)){
			for(int pandas= 0; pandas<5; pandas++,x+=8,y+=8){
				Bobby.drawBenzene(x, y, l, r);
				r+=10;
				l+=11;

			}
		}
		
		r=55;
		l=(r*3)/2;
		
		if(Bobby.equals(Bobby)){
			for(int loop = 0; loop<54; loop++){
				Bobby.drawBenzene(x, y, l, r);
				x+=9;
				y+=10;
				r-=1;
				l-=1;
			}
		}
		
//		if(Bobby.equals(Bobby)){
//			for(int op = 0; op<26; op++){
//				Bobby.drawBenzene(x, y, l, r);
//				x+=6;
//				y+=10;
//				r-=3;
//				l-=3;
//			}
//		}
	}
}
