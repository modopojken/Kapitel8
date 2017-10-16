import javax.swing.*;

public class uppgift2{
	public static void main(String[] args){
char a1 = '\u00E5'; //å
char a2 = '\u00E4'; //ä
char o1 = '\u00F6'; // ö
	String Svars;
		Svars = JOptionPane.showInputDialog(null, "Vilket år är det i år?");
		int svar = Integer.parseInt(Svars);
		boolean svarb = Kalender.LeapYear(svar);
		if(svarb == true){
			JOptionPane.showMessageDialog(null, "Det är skottår!");
		}else if(svarb == false){
			JOptionPane.showMessageDialog(null, "Det är inte skottår");
		}


	}
}
class Kalender{

	public static boolean LeapYear(int Year){


		if(Year%4 == 0 && Year%400 != 0){
			return true;
		}else{
			return false;
		}
		

	}


}


	
