package br.ce.wcaquino.servicos;

import static br.ce.wcaquino.utils.DataUtils.adicionarDias;

import java.util.Date;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.Locacao;
import br.ce.wcaquino.entidades.Usuario;
import br.ce.wcaquino.utils.DataUtils;
import junit.framework.Assert;

public class LocacaoService {
	
	
	
	private double ;

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

	@Test
	public void teste() {
		// cenario
		LocacaoService service = new LocacaoService();
		Usuario usuario = new Usuario("Usuario 1 ");
		Filme filme = new Filme("Filme 1",2,5.0);
		
		// acao 
		Locacao locacao = service.alugarFilme(usuario, filme);
		
		
		//verificacao
  	    AssertThat(locacao.getValor(), is (equalTo(5.0)));
  	    AssertThat(locacao.getValor(), is(not(6.0)));
		AssertThat(DataUtils.isMesmaData(locacao.getDataLocacao(), new Date()), is(true));
		AssertThat(DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(1)),is(true));

        
		
		
		
		
	}

	private void AssertThat(boolean mesmaData, Object object) {
		// TODO Auto-generated method stub
		
	}

	private void AssertThat(boolean mesmaData, Object object) {
		// TODO Auto-generated method stub
		
	}

	private Object is(boolean b) {
		// TODO Auto-generated method stub
		return null;
	}

	private double not(double d) {
		// TODO Auto-generated method stub
		return 0;
	}

	private double equalTo(double d) {
		// TODO Auto-generated method stub
		return 0;
	}

	private void AssertTrue(boolean mesmaData) {
		// TODO Auto-generated method stub
		
	}

	private void AassertTrue(boolean mesmaData) {
		// TODO Auto-generated method stub
		
	}

	private void AssertThat(Double valor, Object object) {
		// TODO Auto-generated method stub
		
	}

	private Object is(double d) {
		// TODO Auto-generated method stub
		return null;
	}
}