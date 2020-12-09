package com.proforca;

import java.util.Scanner;

public class ProForca {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opc=0;
        do{

            System.out.println("Pró Força - v1.0");
            System.out.println("1 - Cliente");
            System.out.println("2 - Funcionário");
            System.out.println("3 - Produtos");
            System.out.println("4 - Matéria Prima");
            System.out.println("5 - Vendas");
            System.out.println("6 - Compras");
            System.out.println("9 - Sair");
            System.out.println("Digite a opcao: ");

            opc = Integer.parseInt(sc.nextLine());

            switch(opc){
                case 1:
                    Cliente cl = new Cliente();
                    int opcc=0;
                    do{
                        System.out.println("Clientes");
                        System.out.println("1 - Cadastrar");
                        System.out.println("2 - Consultar");
                        System.out.println("9 - Sair");
                        System.out.println("Digite a opcao: ");
                        opcc = Integer.parseInt(sc.nextLine());
                        switch(opcc){
                            case 1:
                                cl.execCadastro();
                                break;
                            case 2:
                                cl.execConsulta();
                                break;
                            case 9:
                                System.out.println("Fim");
                        }
                    }while(opcc!=9);
                    break;

                case 2:
                    Funcionario pf = new Funcionario();
                    int opcf=0;
                    do{
                        System.out.println("Funcionários");
                        System.out.println("1 - Cadastrar");
                        System.out.println("2 - Consultar");
                        System.out.println("3 - Bonificar");
                        System.out.println("9 - Sair");
                        System.out.println("Digite a opcao: ");
                        opcf = Integer.parseInt(sc.nextLine());
                        switch(opcf){
                            case 1:
                                pf.execCadastro();
                                break;
                            case 2:
                                pf.execConsulta();
                                break;
                            case 3:
                                pf.execBonificacao();
                                break;
                            case 9:
                                System.out.println("Fim");
                        }
                    }while(opcf!=9);
                    break;

                case 3:
                    Produto pd = new Produto();
                    int opcp=0;
                    do{
                        System.out.println("Produtos");
                        System.out.println("1 - Cadastrar");
                        System.out.println("2 - Consultar");
                        System.out.println("3 - Consultar Preço");
                        System.out.println("9 - Sair");
                        System.out.println("Digite a opcao: ");
                        opcp = Integer.parseInt(sc.nextLine());
                        switch(opcp){
                            case 1:
                                pd.execCadastro();
                                break;
                            case 2:
                                pd.execConsulta();
                                break;
                            case 3:
                                System.out.println("Digite o nome do Produto");
                                String nome;
                                nome = sc.nextLine();
                                pd.precoProduto(nome);
                                break;
                            case 9:
                                System.out.println("Fim");
                        }
                    }while(opcp!=9);
                    break;

                case 4:
                    MateriaPrima mp = new MateriaPrima();
                    int opcmp=0;
                    do{
                        System.out.println("Matéria Prima");
                        System.out.println("1 - Cadastrar");
                        System.out.println("2 - Consultar");
                        System.out.println("9 - Sair");
                        System.out.println("Digite a opcao: ");
                        opcmp = Integer.parseInt(sc.nextLine());
                        switch(opcmp){
                            case 1:
                                mp.execCadastro();
                                break;
                            case 2:
                                mp.execConsulta();
                                break;
                            case 9:
                                System.out.println("Fim");
                        }
                    }while(opcmp!=9);
                    break;

                case 5:
                    Venda vd = new Venda();
                    int opcvd=0;
                    do{
                        System.out.println("Vendas");
                        System.out.println("1 - Realizar Venda");
                        System.out.println("2 - Consultar");
                        System.out.println("9 - Sair");
                        System.out.println("Digite a opcao: ");
                        opcvd = Integer.parseInt(sc.nextLine());
                        switch(opcvd){
                            case 1:
                                vd.realizarVenda();
                                break;
                            case 2:
                                vd.execConsulta();
                                break;
                            case 9:
                                System.out.println("Fim");
                        }
                    }while(opcvd!=9);
                    break;

                case 6:
                    Compra cm = new Compra();
                    int opccm=0;
                    do{
                        System.out.println("Compras");
                        System.out.println("1 - Realizar Compra");
                        System.out.println("2 - Consultar");
                        System.out.println("9 - Sair");
                        System.out.println("Digite a opcao: ");
                        opccm = Integer.parseInt(sc.nextLine());
                        switch(opccm){
                            case 1:
                                cm.realizarCompra();
                                break;
                            case 2:
                                cm.execConsulta();
                                break;
                            case 9:
                                System.out.println("Fim");
                        }
                    }while(opccm!=9);
                    break;

                case 9:
                    System.out.println("Fim");
            }
        }while(opc!=9);
    }

}
