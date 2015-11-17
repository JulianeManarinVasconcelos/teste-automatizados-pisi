package br.com.galgo.testes.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import br.com.galgo.testes.recursos_comuns.suite.StopOnFirstFailureSuite;
import br.com.galgo.testes.recursos_comuns.teste.TesteCadastroPisi;
import br.com.galgo.testes.recursos_comuns.teste.TesteEdicaoPerfil;
import br.com.galgo.testes.recursos_comuns.teste.TesteLoginPisi;

@RunWith(StopOnFirstFailureSuite.class)
@Suite.SuiteClasses({ TesteLoginPisi.class, TesteCadastroPisi.class, TesteEdicaoPerfil.class })
public class SuitePisi {

}
