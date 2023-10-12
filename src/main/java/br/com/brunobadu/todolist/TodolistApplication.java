package br.com.brunobadu.todolist;
// Todo classe em Java, começa com package. O package é o pacote aonde a classe está inserida
// A estrutura do package é o caminho das pastas, a cada "." no package, é uma pasta.

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodolistApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodolistApplication.class, args);
	}

}
