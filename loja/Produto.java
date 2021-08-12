package loja;


public class Produto{
    private int cod_Produto;
    private String nomeProduto; 
    private double preçoProduto;
    private String categoria;

    public void adicionaProduto(String nome, int cod, double preço, String setor){
        nomeProduto = nome;
        cod_Produto = cod;
        preçoProduto = preço;
        categoria = setor;
    }
    public void consultaEstoque(String nome, int cod){
        //consultar banco de dados SQL//
        //retonar quantidades antes e depois da venda//
    }
}