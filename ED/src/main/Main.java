package main;

import java.util.Scanner;

import controller.OrdenacaoController;
import controller.Recursiva2Controller;
import controller.RecursivaController;

public class Main {

	public static void main(String[] args) {
		// RECURSIVA
		/*
		RecursivaController rCt = new RecursivaController();

		int[] test = { -1, -5, 5, 65, 47, 98, -3, 45, 10 };

		System.out.println("ex01 " + rCt.ex01(10));
		System.out.println("ex02 " + rCt.ex02(test, test.length, test[test.length - 1]));
		System.out.println("ex03 " + rCt.ex03(3));
		System.out.println("ex04 " + rCt.ex04(test, test.length));
		System.out.println("ex05 " + rCt.ex05(3, 1));

		// RECURSIVA - LISTA 2
		Recursiva2Controller rec = new Recursiva2Controller();
		Scanner in = new Scanner(System.in);

		System.out.println(rec.ex01(4, 3));
		System.out.println(rec.ex02(12, 5));
		System.out.println(rec.mdc(20, 24));
		
		try {
			int n = in.nextInt();
			if (n % 2 == 0)
				throw new Exception();

			int[] vet = new int[n];
			for (int i = 0; i < n; i++)
				vet[i] = in.nextInt();

			System.out.println(rec.ex03(vet, vet.length));

			System.out.println(rec.ex04(n));
		} catch (Exception e) {
			System.out.println("Invalido!");
		}
		*/
		// ORDENAÇÃO
		OrdenacaoController ordCont = new OrdenacaoController();
		
		//int v[] = {74,20,74,87,81,16,25,99,44,58};
		
		int v[] = new int[150000];
		for(int i = 0; i < 150000; i++) {
			v[i] = (int)(Math.random()*100);
		}
		
		//ordCont.bubbleSort(v);
		//ordCont.mergeSort(v);
		//ordCont.quickSort(v);
		//ordCont.printArray(v);
		ordCont.medirTempo(v);
		
		
	}

}
