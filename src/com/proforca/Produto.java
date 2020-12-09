package com.proforca;

import java.util.Date;
import java.util.Scanner;

public class Produto {
    private final int T = 10;
    private Produto[] prod = new Produto[T];
    private int indice = 0;

    private String idProduto;
    private String nomeProduto;
    private String descricao;
    private String tipo;
    private Date dataValidade;
    private double quantidade;
    private double valor;
    private float peso;
    MateriaPrima materiaPrima;

    public String getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(String idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }


    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void execCadastro(){
        Scanner sc = new Scanner(System.in);
        if(indice < T){
            prod[indice] = new Produto();
            System.out.println("Digite o Código: ");
            prod[indice].setIdProduto(sc.nextLine());
            System.out.println("Digite o Nome: ");
            prod[indice].setNomeProduto(sc.nextLine());
            System.out.println("Digite a Descrição: ");
            prod[indice].setDescricao(sc.nextLine());
            System.out.println("Digite o Peso: ");
            prod[indice].setPeso(sc.nextFloat());
            indice++;
            System.out.println("Cadastro efetuado com sucesso");
        }else{
            System.out.println("Sem espaço na memória");
        }
    }

    public void execConsulta(){
        for (Produto item : prod) {
            if(item!=null){
                item.imprimir();
            }
            System.out.println("");
        }
    }
    public void retirarProduto(long qtd){
        if(this.quantidade <= 0){
            System.out.println("Estoque está negativo!");
        }else {
            this.quantidade = quantidade - qtd;
        }
    }

    public void precoProduto(String nome){
        if(nome.equals("Complemento nutricional")){
            System.out.println("Preço = R$ 200,00");
        }else if (nome.equals("Colágeno hidrolizado") ){
            System.out.println("Preço = R$ 100,00");
        }else if(nome.equals("Arginina") ){
            System.out.println("Preço = R$ 80,00");
        }
    }

    public void imprimir(){
        System.out.println("Código: " + this.getIdProduto());
        System.out.println("Nome: " + this.getNomeProduto());
        System.out.println("Descrição: " + this.getDescricao());
        System.out.println("Peso: " + this.getPeso());

    }

}
