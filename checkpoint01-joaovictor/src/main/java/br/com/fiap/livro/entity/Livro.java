package br.com.fiap.livro.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_livro")
@SequenceGenerator(name = "livro", sequenceName = "SQ_TB_LIVRO", allocationSize = 1)
public class Livro implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "livro")
	private long id;
	
	@Column( name = "ds_titulo", length = 80, nullable = false, unique = true)
	private String titulo;
	
	@Column( name = "ds_autor", length = 80, nullable = false)
	private String autor;
	
	@Column( name = "nr_isbn", length = 13,nullable = false, unique = true)
	private String isbn;
	
	@Column( name = "ds_edicao", nullable = false)
	private String edicao;
	
	@Column( name = "dt_publicacao", nullable = false)
	private LocalDate dataPublicacao;
	
	@Column( name = "dt_cadastro")
	private LocalDateTime dataCadastro;
	
	public Livro() {
		super();
		this.ativo = true; 
		this.dataAtualizacao = LocalDateTime.now();
		this.dataCadastro = LocalDateTime.now();
	}
	
	public Livro(String titulo, String autor, String edicao ,String isbn, LocalDate dataPublicacao) {
		this();
		this.titulo = titulo;
		this.autor = autor;
		this.edicao = edicao; 	
		this.isbn = isbn;
		this.dataPublicacao = dataPublicacao;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDate getDataPublicacao() {
		return dataPublicacao;
	}
	
	
	public void setDataPublicacao(LocalDate dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}

	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDateTime dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public LocalDateTime getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	@Column( name = "dt_atualizacao")
	private LocalDateTime dataAtualizacao;
	
	@Column( name = "st_ativo")
	private Boolean ativo;
	

	@Override
	public String toString() {
		return "Titulo" + titulo + "Autor" + autor + "Edicao" + edicao + "Isbn" + isbn + "Data Atualizacao" + dataAtualizacao;
	}
}
