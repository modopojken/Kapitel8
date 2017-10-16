import javax.swing.*;

public class uppgift1{
	public static void main(String[] args){

		String rs;

		rs = JOptionPane.showInputDialog(null, "Vad är Cirkelns radie?");
		int r = Integer.parseInt(rs);
		double area = Cirkel.areas(r);
		double omkr = Cirkel.omkrs(r);
		JOptionPane.showMessageDialog(null, "Arean är: " + area + "\n" + "Omkretsen är: " + omkr);

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


	
