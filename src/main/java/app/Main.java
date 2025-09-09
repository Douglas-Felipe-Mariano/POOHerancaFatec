package app;

import java.time.LocalDate;

public class Main{
    public static void main(String[] args){
        PessoaFisica pessoaFisica = new PessoaFisica("Douglas",
                                                     "Aimorés",
                                                     LocalDate.of(2004,07,11),
                                                     "54285301890");

        PessoaJuridica pessoaJuridica = new PessoaJuridica("SOS Cartuchos",
                                                           "Caetés",
                                                           "SOS Recargas",
                                                           "123");

        System.out.println(pessoaFisica.exibirInformacoes()); 
        System.out.println(pessoaJuridica.exibirInformacoes()); 
    }
}