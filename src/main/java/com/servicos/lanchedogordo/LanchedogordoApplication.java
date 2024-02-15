package com.servicos.lanchedogordo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LanchedogordoApplication {

	//Criando uma variável de testes
	private String nomeInicial;

	@GetMapping("/hellow")
	public String iniciandoAplicacao(){
		nomeInicial = "===========================================" +
				"Incializando aplicação Spring Boot." +
				"==========================================";
		return nomeInicial;
	}

	public static void main(String[] args) {
		SpringApplication.run(LanchedogordoApplication.class, args);
	}

}
