package desafio;

import java.util.ArrayList;;


public class Executora {
    public static void main(String[] args){
        ArrayList <Pessoa> listaDePessoas = new ArrayList<>();
        Pessoa pessoa1 = new Pessoa("Akemi", 18);
        Pessoa pessoa2 = new Pessoa( "Davizeira",  18);
        Pessoa pessoa3 = new Pessoa("Aline", 36);

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("Nome da primeira pessoa: " + listaDePessoas.get(0));

        System.out.println("Lista de pessoas: ");
        for(Pessoa pessoa : listaDePessoas){
            System.out.println(pessoa);
        }
    }
}
