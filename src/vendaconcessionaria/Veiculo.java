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
public class Veiculo {

    static ArrayList<Veiculo> veiculos = new ArrayList<>();

    private static int idVeiculo = 0;

    private int Id;
    private String modelo;
    private String marca;
    private int ano;
    private String cor;
    private String motor;
    private int tipo;
    private float valor;

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMotor() {
        return motor;
    }

    public String getTipo() {
        switch (this.tipo) {
            case 1:
                return "Carro";
            case 2:
                return "Moto";
            case 3:
                return "Caminhão";
            default:
                return "Tipo Inválido";
        }
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public static void ToString(Veiculo veiculo) {
        JOptionPane.showMessageDialog(null,
                "Veículos:"
                + "\nId: " + veiculo.getId()
                + "\nModelo: " + veiculo.getModelo()
                + "\nMarca: " + veiculo.getMarca()
                + "\nAno: " + veiculo.getAno()
                + "\nCor: " + veiculo.getCor()
                + "\nMotor: " + veiculo.getMotor()
                + "\nTipo: " + veiculo.getTipo()
                + "\nValor: " + veiculo.getValor()
        );
    }

}
