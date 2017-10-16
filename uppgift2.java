import javax.swing.*;

public class uppgift2{
	public static void main(String[] args){

		String rs;

		rs = JOptionPane.showInputDialog(null, "What is the cirkles radius");
		int r = Integer.parseInt(rs);
		double area = Cirkel.areas(r);
		double omkr = Cirkel.omkrs(r);
		JOptionPane.showMessageDialog(null, "The area is: " + area + "\n" + "The circumference is: " + omkr);

	}
}
class Cirkel{

	public static double areas(int r){

		return r * r * Math.PI;
		

	}
	public static double omkrs(int r){
		return r * 2 * Math.PI;
	}


}


	
