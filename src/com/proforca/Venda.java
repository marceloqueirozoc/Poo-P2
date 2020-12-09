package com.proforca;

import java.time.LocalDate;
import java.util.Scanner;

public class Venda {
    private final int T = 10;
    private Venda[] vnd = new Venda[T];
    private int indice = 0;
    Produto prd = new Produto();

    private LocalDate dataVenda;
    private double totalVenda;
    private Produto produto;
    private String codVenda;

    public String getCodVenda() {
        return codVenda;
    }

    public void setCodVenda(String codVenda) {
        this.codVenda = codVenda;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    public double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(double totalVenda) {
        this.totalVenda = totalVenda;
    }

    public void adcProduto(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o Código: ");
        prd.setIdProduto(sc.nextLine());
        System.out.println("Digite o Nome: ");
        prd.setNomeProduto(sc.nextLine());
        System.out.println("Digite a Quantidade: ");
        prd.setQuantidade(sc.nextInt());
        System.out.println("Digite o Valor: ");
        prd.setValor(sc.nextInt());
    }

    public void realizarVenda(){
        Scanner sc = new Scanner(System.in);
        try{
            if(indice < T){
                vnd[indice] = new Venda();
                System.out.println("Adicionar Produto: ");
                vnd[indice].adcProduto();
                vnd[indice].setProduto(this.prd);
                System.out.println("Código da venda: ");
                vnd[indice].setCodVenda(sc.nextLine());
                vnd[indice].setDataVenda(java.time.LocalDate.now());
                indice++;
                System.out.println("Venda Realizada com Sucesso");
            }
        }catch (Exception e){
            System.out.println("Algum dado não está correto!");
        }
    }

    public void execConsulta(){
        for (Venda item : vnd) {
            if(item!=null){
                item.imprimir();
            }
            System.out.println("");
        }
    }

    public void imprimir(){
        System.out.println("Código: " + this.getCodVenda());
        System.out.println("Data: " + this.getDataVenda());
        System.out.println("Nome: " + prd.getNomeProduto());
        System.out.println("Quantidade: " + prd.getQuantidade());
        System.out.println("Valor: " + (prd.getQuantidade()*prd.getValor()));
    }

}
