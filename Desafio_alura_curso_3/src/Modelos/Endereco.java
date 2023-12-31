package Modelos;



public class Endereco {

	//atributos
	private String logradouro;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	
	public Endereco(String logradouro, String bairro, String cidade, String estado, String cep) {
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}

	public Endereco(EnderecoOmdb enderecoOmdb) {
		this.logradouro = enderecoOmdb.logradouro();
		this.bairro = enderecoOmdb.bairro();
		this.cidade = enderecoOmdb.localidade();
		this.estado = enderecoOmdb.uf();
		this.cep = enderecoOmdb.cep();
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	@Override
	public String toString() {
		return "endereço [logradouro: " + logradouro + ", bairro: " + bairro + ", cidade: " + cidade + ", estado: " + estado
				+ ", cep: " + cep + "]";
	}
	
}
