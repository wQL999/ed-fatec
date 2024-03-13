package controller;

import java.lang.reflect.Array;

public class OrdenacaoController {
	
	
	public OrdenacaoController() {}
	
	public void printArray(int v[]) {
		for(int i : v) {
			System.out.print(i + " ");
		}
	}
	
	public void bubbleSort(int v[]) {
		for(int i = 0, len = v.length; i < len; ++i) {
			for(int j = 0; j < len-1; ++j) {
				if(v[j] > v[j+1]) {
					int temp = v[j];
					v[j] = v[j+1];
					v[j+1] = temp;
				}
			}
		}
	}
	
	public void mergeSort(int v[]) {
		msort(v, 0, v.length-1);
	}
	
	private void msort(int v[], int l, int r) {
		if(l < r) {
			int m = (l + r) / 2;
			msort(v, l, m);
			msort(v, m+1, r);
			mmerge(v, l, m, r);
		}
	}
	
	private void mmerge(int v[], int l, int m, int r) {
		int[] aux = new int[v.length];
		
		for(int i = l; i <= r; i++) {
			aux[i] = v[i];
		}
		
		int i = l;
		int j = m+1;
		int k = l;
		
		while(i <= m && j <= r) {
			if(aux[i] < aux[j]) {
				v[k++] = aux[i++];
			} else {
				v[k++] = aux[j++];
			}
		}
		
		while(i <= m) {
			v[k++] = aux[i++];
		}	
		
	}
	
	public void quickSort(int v[]) {
		qSort(v, 0, v.length-1);
	}
	
	private void qSort(int v[], int l, int r) {
		if(l < r) {
			int piv = partition(v, l, r);
			qSort(v, l, piv-1);
			qSort(v, piv+1, r);
		}
	}
	
	private int partition(int v[], int l, int r) {
		int piv = v[l];
		int i = l;
		
		for(int j = l; j <= r; j++) {
			if(v[j] <= piv) {
				int swap = v[i];
				v[i] = v[j];
				v[j] = swap;
				i++;
			}
		}
		i--;
		int swap = v[i];
		v[i] = v[l];
		v[l] = swap;
		
		return i;
	}
	
	public void medirTempo(int[] v) {
		double tempoInitial;
		double tempoFinal;
		double tempo;
		/*
		double tempoInitial = System.nanoTime();
		bubbleSort(v);
		double tempoFinal = System.nanoTime();
		double tempo = tempoFinal - tempoInitial;
		tempo /= Math.pow(10, 9);
		System.out.println("BubbleSort: " + tempo + "s." );
		*/
		tempoInitial = System.nanoTime();
		mergeSort(v);
		tempoFinal = System.nanoTime();
		tempo = tempoFinal - tempoInitial;
		tempo /= Math.pow(10, 9);
		System.out.println("MergeSort: " + tempo + "s." );
		
		tempoInitial = System.nanoTime();
		quickSort(v);
		tempoFinal = System.nanoTime();
		tempo = tempoFinal - tempoInitial;
		tempo /= Math.pow(10, 9);
		System.out.println("QuickSort: " + tempo + "s." );
		
	}
	
	
	
	

}
