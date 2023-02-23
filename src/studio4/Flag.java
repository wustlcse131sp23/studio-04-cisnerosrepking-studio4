package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.clear();
		StdDraw.rectangle(.5,.5,.4,.3);
		StdDraw.setPenColor(0,0,150);
		StdDraw.filledCircle(.5,.5,.15);
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledCircle(.5,.5,.1);
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledCircle(.5,.5,.075);
		StdDraw.setPenColor(0,100,100);
		double [] x = {.15,.2,.25};
		double [] y = {.23,.3,.23};
		StdDraw.filledPolygon(x,y);
		double [] p = {.15,.2,.25};
	double [] l = {.77,.7,.77};
	StdDraw.filledPolygon(p,l);
	double [] k = {.75,.8,.85};
	double [] j = {.23,.3,.23};
	StdDraw.filledPolygon(k,j);
	double [] o = {.75,.8,.85};
	double [] m = {.77,.7,.77};
	StdDraw.filledPolygon(o,m);
}
}