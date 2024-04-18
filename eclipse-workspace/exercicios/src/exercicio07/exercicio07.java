package exercicio07;

public class exercicio07 {
	
	public int retornaConta1 (int x) {
		while (x>1) {
			if (x%2==0) {
				x=x/2;
				System.out.println(x);
			}
			else {
				x=3*x+1;
				System.out.println(x);
			}
		}
		return x;
	}
	
	public int retornaConta2 (int y) {
		while (y>1) {
			if (y%2==0) {
				y=y/2;
				System.out.println(y);
			}
			else {
				y=3*y+1;
				System.out.println(y);
			}
		}
		return y;
}
}