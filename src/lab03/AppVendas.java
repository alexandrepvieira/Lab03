package lab03;

import java.util.Scanner;

public class AppVendas {

	public static void main(String[] args) {
		
		Produto p1, p2, p3; 
		p1 = new Produto("Abacaxi", 3, 10);
		p2 = new Produto("Melancia");
		p3 = new Produto("Uva Passa");
		Scanner dado = new Scanner(System.in);
		System.out.println("Digite o preço de custo e venda do Produto " + p2.getNome());
		p2.setPrecoCusto(dado.nextFloat());
		while (!p2.setPrecoVenda(dado.nextFloat())) {
			System.out.println("O preço de venda náo pode ser menor que o preço de custo. Favor digitar novamente.");;
		
		}
		System.out.println("Digite o preço de custo e venda do Produto " + p3.getNome());
		p3.setPrecoCusto(dado.nextFloat());
		while (!p3.setPrecoVenda(dado.nextFloat())) {
			System.out.println("O preço de venda náo pode ser menor que o preço de custo. Favor digitar novamente.");
			
		}
		System.out.println("O preço de venda do Produto " + p2.getNome() + " é " + p2.getPrecoVenda());
		System.out.println("O preço de custo do Produto " + p2.getNome() + " é " + p2.getPrecoCusto());
		System.out.println("Margem de lucro do Produto " + p2.getNome() + "é de R$ " + p2.calcularMargemLucro() + " uma margem de " + p2.getMargemLucroPorcentagem(p2.precoVenda) + "%");
		System.out.println("O preço de venda do Produto " + p3.getNome() + " é " + p3.getPrecoVenda());
		System.out.println("O preço de custo do Produto " + p3.getNome() + " é " + p3.getPrecoCusto());
	}

}
