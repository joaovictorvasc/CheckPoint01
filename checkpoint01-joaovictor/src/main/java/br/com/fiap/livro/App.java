package br.com.fiap.livro;

import java.time.LocalDate;

import br.com.fiap.livro.entity.Livro;
import br.com.fiap.livro.service.impl.LivroServiceImpl;

public class App {

	public static void main(String[] args) {
		
		LivroServiceImpl livroService = LivroServiceImpl.getInstance();
		
		Livro livro1 = new Livro("Livro 1 ", "João", "1 edição","175926", LocalDate.of(2022, 7, 12));
		Livro livro2 = new Livro("Livro 2 ", "Vasconcellos", "1 edição","572106", LocalDate.of(2022, 5, 12));
		Livro livro3 = new Livro("Livro 3 ", "Douglas Adams", "1 edição","752619", LocalDate.of(2022, 6, 12));
		
		livroService.cadastrar(livro1);
		livroService.cadastrar(livro2);
		livroService.cadastrar(livro3);
		
		
		livroService.listar();

		livroService.remover(3L);
		
		livroService.atualizar((new Livro("Livro 2 ", "Vasconcellos", "3 edição","572106", LocalDate.of(2022, 5, 12))));		
		
	}
	
}
