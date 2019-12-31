
public class forLoopGauntlet {
public static void main(String[] args) {
	//1. Display all numbers from 0 to 100
	//2. Display all numbers from 100 to 0
	//3. Display all even numbers from 2 to 100
	//4. Display all odd numbers from 1 to 99
	//5. Display all numbers from 1 to 500. If the number is odd, print “odd” next to the number. If the number is even, print “even” next to the number.
	     //Eg:	
	          //1 is odd
	         // 3 is odd
	          //4 is even
	          //5 is odd...etc.
for(int i = 0; i<=100;i++) {
	System.out.println(i);
}
for(int j = 100; j>=0; j--) {
	System.out.println(j);
}
for(int k = 2; k<=100; k+=2) {

		System.out.println(k);
	
}
for(int m = 1; m<=99; m+=2) {
	System.out.println(m);
}
for(int n = 1; n<= 500; n++) {
	if(n%2 == 0) {
		System.out.println(n+" is even.");
	}
	else {
		System.out.println(n+" is odd.");
	}
}

for(int o = 0;o<=2; o++) {
	for(int l = 0; l<=2;l++) {
		System.out.println(o+" "+l);
	}
}
for(int p = 1; p<=3; p++) {
for(int a = 3; a > 1; a--) {
	System.out.println(p*a+p +" "+p*a+p +" "+p*a+p +" ");
}
}
for(int x = 0; x<=6; x++) {
	for(int y = 0; y<=x; y++) {

	}
}
}
}
