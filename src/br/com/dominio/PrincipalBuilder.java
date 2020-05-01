package br.com.dominio;

import br.com.dominio.builder.Pessoa;

public class PrincipalBuilder {

	public static void main(String[] args) {
       Pessoa pessoa = new Pessoa.PessoaBuilder()
    		   .nome("Bruno")
    		   .nomeDoMeio("Carvalho")
    		   .apelido("GG")
    		   .nomeDoPai("Janilson")
    		   .ultimoNome("De Sá")
    		   .build();
       
       System.out.println(pessoa);
	}

}
