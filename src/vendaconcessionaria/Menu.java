/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendaconcessionaria;

import javax.swing.JOptionPane;

/**
 *
 * @author g. l.
 */
public class Menu {

    Concessionaria con = new Concessionaria();

    public static void Open() {
        int opcao = 0;
        while (opcao != 4) {

            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "\n1- Menu Cliente"
                    + "\n2- Menu Vendedor"
                    + "\n3- Menu Veículo"
                    + "\n4- Sair"
            ));

            switch (opcao) {
                case 1:
                    MenuCliente();
                    break;
                case 2:
                    MenuVendedor();
                    break;
                case 3:
                    MenuVeiculo();
                    break;
                default:

            }
        }

    }

    public static void MenuCliente() {
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(
                "\n1- Listar Clientes"
                + "\n2- Cadastrar Cliente"
                + "\n3- Login"
                + "\n4- Sair"
                + "\n\n"
                + "Digite a opção desejada:"
        ));

        switch (opcao) {
            case 1:
                Concessionaria.ListaClientes();
                break;

            case 2:
                Concessionaria.CadastraCliente();
                break;
            case 3:
                MenuClienteLogado();
                break;
            case 4:
                Open();
            default:

        }
    }

    public static void MenuClienteLogado() {
        Concessionaria con = new Concessionaria();
        con.LoginCliente();

        if (!con.clienteLogou == false) {

            int opcao = 0;

            while (opcao != 5) {
                opcao = Integer.parseInt(JOptionPane.showInputDialog(
                        "\n1- Editar Cliente"
                        + "\n2- Excluir Cliente"
                        + "\n3- Comprar Carro"
                        + "\n4- Dados Perfil"
                        + "\n5- Sair"
                        + "\n\n"
                        + "Digite a opção desejada:"
                ));

                switch (opcao) {
                    case 1:
                        con.EditarCliente();
                        break;
                    case 2:
                        con.ExcluirCliente();
                        Open();
                        break;
                    case 3:
                        con.ComprarCarro();
                        break;
                    case 4:
                        con.DadosCliente();
                        break;
                    default:
                }
            }
        }

    }

    public static void MenuVendedor() {
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(
                "\n1- Listar Vendedor"
                + "\n2- Cadastrar Vendedor"
                + "\n3- Login"
                + "\n4- Sair"
                + "\n\n"
                + "Digite a opção desejada:"
        ));

        switch (opcao) {
            case 1:
                Concessionaria.ListaVendedores();
                break;

            case 2:
                Concessionaria.CadastraVendedor();
                break;

            case 3:
                MenuVendedorLogado();
                break;
            case 4:
                break;
            default:

        }
    }

    public static void MenuVendedorLogado() {
        Concessionaria con = new Concessionaria();
        con.LoginVendedor();

        if (!con.vendedorLogou == false) {

            int opcao = 0;
            while (opcao != 6) {
                opcao = Integer.parseInt(JOptionPane.showInputDialog(
                        "\n1- Editar Vendedor"
                        + "\n2- Excluir Vendedor"
                        + "\n3- Dados Perfil"
                        + "\n4- Menu Adm de Veiculos"
                        + "\n5- Saldo Comissão"
                        + "\n6- Sair"
                        + "\n\n"
                        + "Digite a opção desejada:"
                ));

                switch (opcao) {
                    case 1:
                        con.EditarVendedor();
                        break;
                    case 2:
                        con.ExcluirVendedor();
                        Open();
                        break;
                    case 3:
                        con.DadosVendedor();
                        break;
                    case 4:
                        MenuVendedorVeiculo();
                        break;
                    case 5:
                        con.DadosComissao();
                        break;
                    default:
                }
            }
        }

    }

    public static void MenuVeiculo() {
        Concessionaria con = new Concessionaria();
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(
                "\n1- Listar Veiculos"
                + "\n2- Filtrar por Id"
                + "\n3- Sair"
                + "\n\n"
                + "Digite a opção desejada:"
        ));

        switch (opcao) {
            case 1:
                Concessionaria.ListaVeiculos();
                break;
            case 2:
                con.FiltrarVeiculo();
                break;
            case 3:
                break;
            default:

        }
    }

    public static void MenuVendedorVeiculo() {
        Concessionaria con = new Concessionaria();
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(
                "\n1- Listar Veiculos"
                + "\n2- Cadastrar Veiculo"
                + "\n3- Filtrar por Id"
                + "\n4- Editar"
                + "\n5- Excluir"
                + "\n6- Sair"
                + "\n\n"
                + "Digite a opção desejada:"
        ));

        switch (opcao) {
            case 1:
                Concessionaria.ListaVeiculos();
                break;

            case 2:
                Concessionaria.CadastraVeiculo();
                break;

            case 3:
                con.FiltrarVeiculo();
                break;
            case 4:
                con.EditarVeiculo();
                break;
            case 5:
                con.ExcluirVeiculo();
                break;
            case 6:
                Open();
                break;

            default:

        }
    }

}
