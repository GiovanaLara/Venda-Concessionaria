/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendaconcessionaria;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author g. l.
 */
public class Cliente extends Pessoa {

    ArrayList<Veiculo> listaVeiculosComprados = new ArrayList<>();

    public static void ToString(Cliente cliente) {
        JOptionPane.showMessageDialog(null,
                "Clientes:"
                + "\nId: " + cliente.getCodigo()
                + "\nNome: " + cliente.getNome()
                + "\nCPF: " + cliente.getCPF()
                + "\nEndereço: " + cliente.getEndereco()
                + "\nTelefone: " + cliente.getTelefone()
                + "\nEmail: " + cliente.getEmail()
        );

        CarrosComprados(cliente);

        System.out.println("\n");
    }

    public static void CarrosComprados(Cliente cliente) {
        if (!cliente.listaVeiculosComprados.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Carros Comprados:");
            cliente.listaVeiculosComprados.forEach((veiculo) -> {
                Veiculo.ToString(veiculo);
            });
        }
    }
}
