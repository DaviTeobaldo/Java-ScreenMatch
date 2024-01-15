package desafio2;

import java.util.ArrayList;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.setNome(nome);
        this.setPreco(preco);
        this.setQuantidade(quantidade);

    }
    public String getNome(){
        return this.nome;
    }public double getPreco(){
        return this.preco;
    }public int getQuantidade(){
        return this.quantidade;
    }public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
    }

    public static void main(String[] args) {
        ArrayList<Produto> listaProdutos = new ArrayList<>();

        Produto produto1 = new Produto("Sabão", 15.99, 5);
        Produto produto2 = new Produto("Detergente", 10.49, 8);

        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
 
        for (Produto produto : listaProdutos) {
            System.out.println(produto);
        }
    }

}
