/*3-	Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
	•	10-14 infantil
	•	15-17 juvenil
	•	18-25 adulto*/


package LacoCondicional;

import java.util.Scanner;

public class exercicio3 {
	
	public static void main (String args[])
	{
		Scanner entrada = new Scanner (System.in);
		
		int idade;
		
		System.out.printf("Qual a idade do fulaninho? ");
		idade = entrada.nextInt();
		
		if(idade>=10 && idade<=14)
		{
			System.out.println("A pessoa se enquadra na categoria Infantil.");
		}
		else if(idade >=15 && idade <=17)
		{
			System.out.println("A pessoa se enquadra na categoria Juvenil.");
		}
		else if(idade >=18 && idade <=25)
		{
			System.out.println("A pessoa se enquadra na categoria Adulto.");
		}
		else
		{
			System.out.println("A pessoa não está apta para qualquer categoria");
		}
		
	}

}
