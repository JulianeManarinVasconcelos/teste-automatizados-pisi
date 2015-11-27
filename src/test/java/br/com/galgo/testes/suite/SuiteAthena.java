package br.com.galgo.testes.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import br.com.galgo.testes.recursos_comuns.suite.StopOnFirstFailureSuite;
import br.com.galgo.testes.recursos_comuns.teste.TesteCadastroAthena;
import br.com.galgo.testes.recursos_comuns.teste.TesteInscricaoIC;
import br.com.galgo.testes.recursos_comuns.teste.TesteLoginAthena;

@RunWith(StopOnFirstFailureSuite.class)
@Suite.SuiteClasses({ TesteLoginAthena.class, TesteCadastroAthena.class, TesteInscricaoIC.class })
public class SuiteAthena {

}
