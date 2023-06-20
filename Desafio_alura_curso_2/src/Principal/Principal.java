package Principal;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

import Operacoes.Cartao;
import Operacoes.Compras;

public class Principal {
public static void main(String[] args) {
	int op = 1;
	
	System.out.println("Digite o limite do cartão: ");
	Scanner s = new Scanner(System.in);
	double valorCartao = s.nextDouble();
	Cartao card = new Cartao(valorCartao);
	ArrayList<Compras>Carrinho =  new ArrayList<>();
	
	while(op == 1) {
	System.out.println("Digite o nome do Produto: ");
	String descricaoCompra = s.next();
	
	System.out.println("Digite o valor do Produto: ");
	double valorProduto = s.nextDouble();
	
	Compras buy = new Compras(descricaoCompra,valorProduto);
	System.out.println("Compra: "+buy.getDescricao()+" "+ buy.getValor());
	double limite = card.getLimite();
	double valorCompra = buy.getValor();
	if(limite > valorCompra) {
		limite -= valorCompra;
		card.setLimite(limite);
		System.out.println("Compra realizada!");
		System.out.println("Novo saldo: "+card.getLimite());
		System.out.println("========================================");
		Carrinho.add(buy);
	}
	else {
		System.out.println("Você não tem limite necessario");
		System.out.println("Limite do cartão: "+card.getLimite());
		System.out.println("========================================");
	}
	System.out.println("Deseja comprar outro Produto?");
	System.out.println("Digite 1 para sim e 0 para não");
	int opcao = s.nextInt(); 
	op = opcao;
	if(op == 0) {
		Collections.sort(Carrinho);
		System.out.println("Compras: "+Carrinho.toString());
		}
	}
	
	
	
	}
}

