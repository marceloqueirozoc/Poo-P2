package com.proforca;

import java.time.LocalDate;
import java.util.Scanner;

public class Compra {
    private final int T = 10;
    private Compra[] cmp = new Compra[T];
    private int indice = 0;
    Produto prd = new Produto();

    private LocalDate dataCompra;
    private float totalCompra;
    private Produto produto;
    private String codCompra;

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    public float getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(float totalCompra) {
        this.totalCompra = totalCompra;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public String getCodCompra() {
        return codCompra;
    }

    public void setCodCompra(String codCompra) {
        this.codCompra = codCompra;
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

    public void realizarCompra(){
        Scanner sc = new Scanner(System.in);
        try{
            if(indice < T){
                cmp[indice] = new Compra();
                System.out.println("Adicionar Produto: ");
                cmp[indice].adcProduto();
                cmp[indice].setProduto(this.prd);
                System.out.println("Código da venda: ");
                cmp[indice].setCodCompra(sc.nextLine());
                cmp[indice].setDataCompra(java.time.LocalDate.now());
                indice++;
                System.out.println("Compra Realizada com Sucesso");
            }
        }catch (Exception e){
            System.out.println("Algum dado não está correto!");
        }
    }

    public void execConsulta(){
        for (Compra item : cmp) {
            if(item!=null){
                item.imprimir();
            }
            System.out.println("");
        }
    }

    public void imprimir(){
        System.out.println("Código: " + this.getCodCompra());
        System.out.println("Data: " + this.getDataCompra());
        System.out.println("Nome: " + prd.getNomeProduto());
        System.out.println("Quantidade: " + prd.getQuantidade());
        System.out.println("Valor: " + (prd.getQuantidade()*prd.getValor()));
    }


}

