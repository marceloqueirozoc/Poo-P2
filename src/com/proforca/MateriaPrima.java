package com.proforca;

import java.util.Date;
import java.util.Scanner;

public class MateriaPrima {
    private final int T = 10;
    private MateriaPrima[] matPrima = new MateriaPrima[T];
    private int indice = 0;

    private String idMtPrima;
    private String nomeMtPrima;
    private String tipoMtPrima;
    private Date dtValidadeMtPrima;
    private float qtdEstMtPrima;
    private String fabricante;


    public String getIdMtPrima() {
        return idMtPrima;
    }

    public void setIdMtPrima(String idMtPrima) {
        this.idMtPrima = idMtPrima;
    }

    public String getNomeMtPrima() {
        return nomeMtPrima;
    }

    public void setNomeMtPrima(String nomeMtPrima) {
        this.nomeMtPrima = nomeMtPrima;
    }

    public String getTipoMtPrima() {
        return tipoMtPrima;
    }

    public void setTipoMtPrima(String tipoMtPrima) {
        this.tipoMtPrima = tipoMtPrima;
    }

    public Date getDtValidadeMtPrima() {
        return dtValidadeMtPrima;
    }

    public void setDtValidadeMtPrima(Date dtValidadeMtPrima) {
        this.dtValidadeMtPrima = dtValidadeMtPrima;
    }

    public float getQtdEstMtPrima() {
        return qtdEstMtPrima;
    }

    public void setQtdEstMtPrima(float qtdEstMtPrima) {
        this.qtdEstMtPrima = qtdEstMtPrima;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void retirarMateriaPrima(float qtdM){
        if(this.qtdEstMtPrima <= 0){
            System.out.println("Estoque está negativo!");
        }else {
            this.qtdEstMtPrima = qtdEstMtPrima - qtdM;
        }
    }

    public void execCadastro() {
        Scanner sc = new Scanner(System.in);
        if (indice < T) {
            matPrima[indice] = new MateriaPrima();
            System.out.println("Digite o Código: ");
            matPrima[indice].setIdMtPrima(sc.nextLine());
            System.out.println("Digite o Nome: ");
            matPrima[indice].setNomeMtPrima(sc.nextLine());
            System.out.println("Digite a Quantidade: ");
            matPrima[indice].setQtdEstMtPrima(sc.nextInt());
            System.out.println("Digite o Fabricante: ");
            matPrima[indice].setFabricante(sc.nextLine());
            indice++;
            System.out.println("Cadastro efetuado com sucesso");
        } else {
            System.out.println("Sem espaço na memória");
        }
    }

    public void execConsulta(){
        for (MateriaPrima item : matPrima) {
            if (item != null) {
                item.imprimir();
            }
            System.out.println("");
        }
    }

    public void imprimir(){
        System.out.println("Materiais necessários:");
        System.out.println("Id da materia prima: " + this.idMtPrima);
        System.out.println("Nome da materia prima: " + this.nomeMtPrima);
        System.out.println("Tipo da matria prima: " + this.tipoMtPrima);
        System.out.println("Validade da materia prima: " + this.dtValidadeMtPrima);
        System.out.println("Quantidade em estoque: " + this.qtdEstMtPrima);
        System.out.println("Fabricante: " + this.fabricante);
    }

}

