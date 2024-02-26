package controller;

public class Recursiva2Controller {
	
	
	public Recursiva2Controller() {
		
		super();// TODO Auto-generated constructor stub
	}
	
	
	public int ex01(int a, int b) {
		if(b == 0)
			return 0;
		
		return a + ex01(a, --b);
	}
	
	public int ex02(int a, int b) {
		if(b > a) {
			return a;
		}
		
		return ex02(a - b, b);
	}
	
	public int ex03(int vet[], int len) {
		if(len == 0)
			return 0;
		return vet[len-1] %2 == 0 ? 1 + ex03(vet, len-1) : ex03(vet, len-1);
	}
	
	public int ex04(int num) {
		if(num == 1)
			return 1;
		return num * ex04(num-2);
	}
	
	public int mdc(int x, int y) {
		if(y == 0)
			return x;
		else 
			return mdc(y, (x % y));
	}
	
}
