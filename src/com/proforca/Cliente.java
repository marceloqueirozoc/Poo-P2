package com.proforca;

import java.util.Scanner;

public class Cliente extends Pessoa {
    private final int T = 10;
    private Cliente[] clie = new Cliente[T];
    private int indice = 0;

    private  String Codigo;
    private String CPF;

    public Cliente(){
        this.Codigo = "";
        this.CPF = "";
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    public void execCadastro(){
        Scanner sc = new Scanner(System.in);
        if(indice < T){
            clie[indice] = new Cliente();
            System.out.println("Digite o Código: ");
            clie[indice].setCodigo(sc.nextLine());
            System.out.println("Digite o Nome: ");
            clie[indice].setNome(sc.nextLine());
            System.out.println("Digite o CPF: ");
            clie[indice].setCPF(sc.nextLine());
            System.out.println("Digite o Endereço: ");
            clie[indice].setEndereço(sc.nextLine());
            System.out.println("Digite o Telefone: ");
            clie[indice].setTelefone(sc.nextLine());
            System.out.println("Digite o Email: ");
            clie[indice].setEmail(sc.nextLine());
            indice++;
            System.out.println("Cadastro efetuado com sucesso");
        }else{
            System.out.println("Sem espaço na memória");
        }
    }
    public void execConsulta(){
        for (Cliente item : clie) {
            if(item!=null){
                item.imprimir();
            }
            System.out.println("");
        }
    }
    public void imprimir(){
        System.out.println("Código: " + this.getCodigo());
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCPF());
        System.out.println("Telefone: " + this.getTelefone());
        System.out.println("Endereço: " + this.getEndereço());
        System.out.println("Email: " + this.getEmail());
    }
    @Override
    public String toString() {
        String resultado;
        resultado = super.toString();
        return resultado;
    }

}