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
	
	
	
	

}
