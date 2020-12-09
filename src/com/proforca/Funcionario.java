package com.proforca;

import java.util.Scanner;

public class Funcionario extends Pessoa {
    private final int T = 10;
    private Funcionario[] func = new Funcionario[T];
    private int indice = 0;

    private String departamento;
    private double salario;
    private String rg;
    private boolean estaNaEmpresa;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public boolean isEstaNaEmpresa() {
        return estaNaEmpresa;
    }

    public void setEstaNaEmpresa(boolean estaNaEmpresa) {
        this.estaNaEmpresa = estaNaEmpresa;
    }

    public void bonificar(double aumento){
        salario+= aumento;
    }

    public void execCadastro(){
        Scanner sc = new Scanner(System.in);
        if(indice < T){
            func[indice] = new Funcionario();
            System.out.println("Digite o nome: ");
            func[indice].setNome(sc.nextLine());
            System.out.println("Digite o RG: ");
            func[indice].setRg(sc.nextLine());
            System.out.println("Digite o departamento: ");
            func[indice].setDepartamento(sc.nextLine());
            System.out.println("Digite o Salário: ");
            func[indice].setSalario(Double.parseDouble(sc.nextLine()));
            int i = 0;
            System.out.println("Digite 1 para funcionário Ativo: ");
            i = Integer.parseInt(sc.nextLine());
            if(i==1) func[indice].setEstaNaEmpresa(true);
            indice++;
            System.out.println("Cadastro efetuado com sucesso");
        }else{
            System.out.println("Sem espaço na memória");
        }
    }
    public void execBonificacao(){
        //Trocar o requisito para verificar por RG
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o RG do funcionário a ser Bonificado");
        String rgproc = sc.nextLine();
        for (Funcionario item : func) {
            if(item!=null){
                if(item.getRg().equals(rgproc)){
                    System.out.println("Digite o valor do aumento");
                    double aumento = Double.parseDouble(sc.nextLine());
                    item.bonificar(aumento);
                    System.out.println("Bonificado com sucesso");
                    return;
                }
            }
        }
        System.out.println("Funcionário não encontrado");

    }
    public void execConsulta(){
        for (Funcionario item : func) {
            if(item!=null){
                item.imprimir();
            }
            System.out.println("");
        }
    }

    public void imprimir(){

            System.out.println("Dados do Funcionario" + super.toString());
            System.out.println("Departamento: " + departamento);
            System.out.println("Salario: " + salario);
            System.out.println("RG. " + rg);

            if(estaNaEmpresa){
                System.out.println("Funcionario Ativo");
            }else{
                System.out.println("Funcionario Inativo");
            }
    }

}
