package Principal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



import Gerenciadores.GerenciadorAPI;
import Modelos.Endereco;
import Modelos.EnderecoOmdb;

public class Teste {
public static void main(String[] args) throws IOException, InterruptedException {
	Scanner leitura = new Scanner(System.in);
	
	String busca = "";
	while(!busca.equalsIgnoreCase("sair")) {
		
	System.out.println("Digite seu cep ou sair: ");
	busca = leitura.nextLine();
	
	if(busca.equalsIgnoreCase("sair")) {
		System.out.println("O programa foi finalizado...");
		break;
	}
	
	GerenciadorAPI BuscaCep = new GerenciadorAPI();
	EnderecoOmdb enderecoOmdb = BuscaCep.AcionarAPI(busca);
	Endereco endereco = new Endereco(enderecoOmdb);
	System.out.println(endereco);
	GerenciadorAPI CriaArquivo = new GerenciadorAPI();
	CriaArquivo.CriaArquivo(enderecoOmdb);
	}
	
	

	
	
}
}
