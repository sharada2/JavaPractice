package Controller;

import Model.Cir_Mod;
import concept1.Circle;
import concept1.shapes;

public class CirCotroller implements shapes{
	@Override
	public double Area(float r) {
		Cir_Mod cmod = new Cir_Mod();
		cmod.setRadius((int) r);
		int radius = cmod.getRadius();
		//System.out.print(radius);
		return PI * radius * radius;
		}

	@Override
	public double Area(int l) {
		return 0.0;
		// TODO Auto-generated method stub
		
	}

	@Override
	public double Area(double l, double b) {
		return 00.000;
		// TODO Auto-generated method stub
		
	}
}