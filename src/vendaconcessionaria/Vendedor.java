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
public class Vendedor extends Pessoa {

    private float comissao;

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    public static void ToString(Vendedor vendedor) {
        JOptionPane.showMessageDialog(null,
                "Vendedores:"
                + "\nCodigo: " + vendedor.getCodigo()
                + "\nNome: " + vendedor.getNome()
                + "\nCPF: " + vendedor.getCPF()
                + "\nEndereço: " + vendedor.getEndereco()
                + "\nTelefone: " + vendedor.getTelefone()
                + "\nEmail: " + vendedor.getEmail()
        );
    }

    public static void ToStringComissao(Vendedor vendedor) {
        JOptionPane.showMessageDialog(null, "Comissão R$:" + vendedor.getComissao());
    }

}
