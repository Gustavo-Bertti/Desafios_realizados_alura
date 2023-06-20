package Operacoes;


public class Compras implements Comparable<Compras> {

	//Atributos
	private String descricao;
	private double valor;
	
	//metodo construtor
	public Compras(String descricao, double valor) {
		this.descricao = descricao;
		this.valor = valor;
	}
   //Getter and Setter
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	@Override
	public int compareTo(Compras outraCompra) {
		// TODO Auto-generated method stub
		return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
	}
	public String toString() {
		return " "+ descricao + " "+ valor + " Reais";
		
	}
	
}
