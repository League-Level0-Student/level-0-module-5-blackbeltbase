
public class forLoopGauntlet {
public static void main(String[] args) {

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
for(int a = 2; a >=0; a--) {
	System.out.print(3*p-a+ " ");
}
System.out.println(" ");
}

for(int s = 1; s<=10; s++) {
for(int t = 9; t >=0; t--) {
	System.out.print(10*s-t+ "\t");
}
System.out.println(" ");
}

for(int x = 0; x<=6; x++) {
	for(int y = 0; y<=x; y++) {
System.out.print("* ");
	}
	System.out.println("");
}
}
}
