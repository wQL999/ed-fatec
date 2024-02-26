package controller;

public class RecursivaController {
	
	public RecursivaController() {
		super();
	}
	
	/*
	 * 1. Criar uma aplicação em Java que tenha uma função recursiva que calcule o somatório do N primeiros
	número NATURAIS (a função deve retornar zero para números nega�vos)
	 */
	public int ex01(int num) {
		return num < 0 ? 0 : num + ex01(num-1);
	}
	
	
	
	/*
	 * 2. Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um vetor de inteiros, o
	tamanho do vetor e o valor da úl�ma posição do vetor como o primeiro menor valor, retorne o menor
	valor con�do neste vetor.
	 */
	public int ex02(int[] vet, int len, int lastPos) {
		if(len == 0) {
			return lastPos;
		}
		
		if(lastPos > vet[len-1]) {
			lastPos = vet[len-1];
		}
		
		return ex02(vet, len-1, lastPos);
	}
	
	/*
	 * 3. Crie uma função recursiva que exiba o resultado do fatorial de um número (Pela limitação da
	recursividade, o número de entrada deverá ser baixo para não dar estouro(limite de entrada = 12)):
	 */
	public int ex03(int num) {
		return num == 0 ? 1 : num * ex03(num-1);
	}
	
	/*
	 * 4. Crie uma função recursiva que exiba o total de elementos nega�vos de um vetor de inteiros, de N
	posições, passado como parâmetro:
	 */
	
	public int ex04(int[] vet, int len) {
		if(len == 0)
			return 0;
		
		if(vet[len-1] < 0)
			return 1 + ex04(vet, len-1);
		
		return ex04(vet, len-1);
	}
	
	/*
	 * 5. Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um número
	inteiro (N), apresente a saída da somatória
	S = 1 +1/2 +1/3 +1/4 + ... +1/N*/
	
	public double ex05(int num, int i) {
		if(i == num)
			return 1/ (double) i;
		
		return 1/ (double) i + ex05(num, i+1);
	}

}
