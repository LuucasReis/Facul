package Exercicios02;

import java.util.Scanner;
public class Progam {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Entre com o seu peso: ");
		double peso = input.nextDouble();
		System.out.println("Entre com a sua altura: ");
		double altura = input.nextDouble();
		String msg = "Seu peso esta na categoria: ";
		double imc = peso/(altura * altura);
		
		if (imc <= 18.5)
		{
			System.out.println(msg + "Magreza");
		}
		
		else if (imc > 18.5 && imc <= 24.9)
		{
			System.out.println(msg + "Normal");
		}
		
		else if (imc > 24.9 && imc <= 29.9)
		{
			System.out.println(msg + "Sobre peso I");
		}
		
		else if(imc > 29.9  && imc <= 39.9)
		{
			System.out.println(msg + "Sobre peso II");
		}
		else
		{
			System.out.println(msg + "Obesidade grave");
		}
		
	}
}
