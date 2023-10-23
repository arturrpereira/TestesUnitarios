package br.arturfernando.servicos;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import br.arturfernando.entidades.Filme;
import br.arturfernando.entidades.Locacao;
import br.arturfernando.entidades.Usuario;
import br.arturfernando.utils.DataUtils;

public class LocacaoServiceTest {

    @Test
    public void teste() {
        // cenario
        LocacaoService service = new LocacaoService();
        Usuario usuario = new Usuario("Usuario1");
        Filme filme = new Filme("Filme 1", 2, 5.0);

        // acao
        Locacao locacao = service.alugarFilme(usuario, filme);

        // verificacao
        Assert.assertEquals(5.0, locacao.getValor(), 0.01);
        Assert.assertTrue(DataUtils.isMesmaData(locacao.getDataLocacao(), new Date()));
        Assert.assertTrue(DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(1)));
    }
}