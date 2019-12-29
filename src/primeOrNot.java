import javax.swing.JOptionPane;

public class primeOrNot {
public static void main(String[] args) {
	boolean primeOrNot = false;
	String userInt = JOptionPane.showInputDialog("What Number?");
	int userIntNum = Integer.parseInt(userInt);
	if(userIntNum==0) {
isZeroOrOne();
		}
		else if(userIntNum == 1) {
isZeroOrOne();}
		else if(userIntNum < 9 && userIntNum % 2!= 0) {
isAnOddBelowTen();}
		else if(userIntNum == 9) {
		JOptionPane.showMessageDialog(null, "Your number is composite.");
		}
			else {
	for(int i  = 2; i<userIntNum;i++) {
if(userIntNum % i == 0) {
	JOptionPane.showMessageDialog(null, "Your number is composite.");
	i+=userIntNum;

}
else if(userIntNum % i != 0){
	primeOrNot = false;
}

}
if(primeOrNot = false) {
		JOptionPane.showMessageDialog(null, "Your number is prime.");
}

			}	
}
static void isAnOddBelowTen() {
	JOptionPane.showMessageDialog(null, "Your number is prime.");
}
static void isZeroOrOne() {
	JOptionPane.showMessageDialog(null, "Your number is niether prime nor composite.");
}
}
