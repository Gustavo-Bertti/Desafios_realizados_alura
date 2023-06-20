package Gerenciadores;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import Modelos.Endereco;
import Modelos.EnderecoOmdb;

public class GerenciadorAPI {

	//construtor
	public GerenciadorAPI() {
		
	}
	
	public EnderecoOmdb AcionarAPI(String busca) throws IOException, InterruptedException {
	 
	Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();
	
	 String EnderecoURL = "https://viacep.com.br/ws/"+busca+"/json/";
	 HttpClient client = HttpClient.newHttpClient();
	 HttpRequest request = HttpRequest.newBuilder().uri(URI.create(EnderecoURL)).build();
	 HttpResponse<String> response = null;
	 
	 try {response = client.send(request, BodyHandlers.ofString());
	 
	}catch (IOException | InterruptedException e) {
		throw new RuntimeException("Não consegui obter o endereço pelo CEP informado.");
	}
	return new Gson().fromJson(response.body(),EnderecoOmdb.class);

	}
	public void CriaArquivo(EnderecoOmdb enderecoOmdb) throws IOException {
		Endereco endereco = new Endereco(enderecoOmdb); 
		Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();
		FileWriter criador = new FileWriter("c:\\" + endereco.getCep()+".json");
		criador.write(gson.toJson(endereco));
		criador.close();
	}


	
}
