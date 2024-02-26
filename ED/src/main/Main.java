package main;

import controller.RecursivaController;

public class Main {

	public static void main(String[] args) {
		//RECURSIVA
		RecursivaController rCt = new RecursivaController();
		
		int[] test = {-1, -5, 5, 65, 47, 98, -3, 45, 10};
		
		System.out.println("ex01 " + rCt.ex01(10));
		System.out.println("ex02 " + rCt.ex02(test, test.length, test[test.length-1]));
		System.out.println("ex03 " + rCt.ex03(3));
		System.out.println("ex04 " + rCt.ex04(test, test.length));
		System.out.println("ex05 " + rCt.ex05(3, 1));
	}

}
