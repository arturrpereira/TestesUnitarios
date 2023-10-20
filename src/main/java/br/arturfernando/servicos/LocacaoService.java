package br.arturfernando.servicos;

import static br.arturfernando.utils.DataUtils.adicionarDias;

import java.io.File;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import br.arturfernando.entidades.Filme;
import br.arturfernando.entidades.Locacao;
import br.arturfernando.entidades.Usuario;
import br.arturfernando.utils.DataUtils;

public class LocacaoService {

	public String vPublica;
	protected String vProtegida;
	private String vPrivada;
	String vDefault;

	public Locacao alugarFilme(Usuario usuario, Filme filme) {
		Locacao locacao = new Locacao();
		locacao.setFilme(filme);
		locacao.setUsuario(usuario);
		locacao.setDataLocacao(new Date());
		locacao.setValor(filme.getPrecoLocacao());

		//Entrega no dia seguinte
		Date dataEntrega = new Date();
		dataEntrega = adicionarDias(dataEntrega, 1);
		locacao.setDataRetorno(dataEntrega);
		
		//Salvando a locacao...	
		//TODO adicionar método para salvar
		
		return locacao;
	}

	
}