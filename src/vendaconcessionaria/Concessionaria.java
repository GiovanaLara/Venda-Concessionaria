package vendaconcessionaria;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Concessionaria {

    static ArrayList<Cliente> clientes = new ArrayList<>();
    static ArrayList<Veiculo> veiculos = new ArrayList<>();
    static ArrayList<Vendedor> vendedores = new ArrayList<>();
    static int contador = 0;
    private static int idVeiculo = 0;
    private static int idCliente = 0;

    public static void CadastroTeste() {
        contador++;
        idVeiculo++;
        idCliente++;

        Cliente cliente = new Cliente();

        Veiculo veiculo = new Veiculo();
        Vendedor vendedor = new Vendedor();

        cliente.setNome("Ryan Baptista");
        cliente.setCPF("128.192.369.22");
        cliente.setEndereco("Estrada Desconhecida,21");
        cliente.setTelefone("(11)970522472");
        cliente.setEmail("ryanbfc@mail.com");
        cliente.setSenha("12345");
        cliente.setCodigo(idCliente);

        veiculo.setModelo("Fiesta");
        veiculo.setMarca("Ford");
        veiculo.setAno(2008);
        veiculo.setMotor("1.0");
        veiculo.setTipo(1);
        veiculo.setCor("Prata");
        veiculo.setId(idVeiculo);
        veiculo.setValor(15000f);

        vendedor.setNome("Tiringa");
        vendedor.setCPF("152.158.321.89");
        vendedor.setEndereco("Serra Talhada,556");
        vendedor.setTelefone("(89)98412345");
        vendedor.setCodigo(contador);
        vendedor.setEmail("vendedor@live.com");
        vendedor.setSenha("12345");

        clientes.add(cliente);

        vendedores.add(vendedor);
        veiculos.add(veiculo);
    }

    public static void CadastraCliente() {
        idCliente++;

        Cliente cliente = new Cliente();

        String nome = JOptionPane.showInputDialog("Nome do cliente:");
        String cpf = JOptionPane.showInputDialog("CPF do cliente:");
        String endereco = JOptionPane.showInputDialog("Endereço do cliente:");
        String telefone = JOptionPane.showInputDialog("Telefone do cliente:");
        String email = JOptionPane.showInputDialog("Email do cliente:");
        String senha = JOptionPane.showInputDialog("Senha do cliente:");

        cliente.setNome(nome);
        cliente.setCPF(cpf);
        cliente.setEndereco(endereco);
        cliente.setTelefone(telefone);
        cliente.setEmail(email);
        cliente.setSenha(senha);
        cliente.setCodigo(idCliente);

        clientes.add(cliente);
    }

    public static void ListaClientes() {

        if (clientes.size() > 0) {

            for (int x = 0; x < clientes.size(); x++) {
                Cliente.ToString(clientes.get(x));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não há clientes cadastrados");
        }

    }

    public static void CadastraVendedor() {
        contador++;
        Vendedor vendedor = new Vendedor();

        String nome = JOptionPane.showInputDialog("Nome do vendedor:");
        String cpf = JOptionPane.showInputDialog("CPF do vendedor:");
        String endereco = JOptionPane.showInputDialog("Endereço do vendedor:");
        String telefone = JOptionPane.showInputDialog("Telefone do vendedor:");
        String email = JOptionPane.showInputDialog("Email:");
        String senha = JOptionPane.showInputDialog("Senha:");

        vendedor.setNome(nome);
        vendedor.setCPF(cpf);
        vendedor.setEndereco(endereco);
        vendedor.setTelefone(telefone);
        vendedor.setCodigo(contador);
        vendedor.setEmail(email);
        vendedor.setSenha(senha);

        vendedores.add(vendedor);
    }

    public static void ListaVendedores() {

        if (vendedores.size() > 0) {
            vendedores.forEach((vendedor) -> {
                Vendedor.ToString(vendedor);
            });
        } else {
            JOptionPane.showMessageDialog(null, "Não há vendedores cadastrados");
        }

    }

    public static void CadastraVeiculo() {
        idVeiculo++;

        Veiculo veiculo = new Veiculo();

        String modelo = JOptionPane.showInputDialog("Modelo do veículo:");
        String marca = JOptionPane.showInputDialog("Marca do veículo:");
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano do veículo:"));
        String cor = JOptionPane.showInputDialog("Cor do veículo:");
        String motor = JOptionPane.showInputDialog("Motor do veículo:");
        int tipo = Integer.parseInt(JOptionPane.showInputDialog("Tipo do veículo: (1: Carro, 2: Moto, 3: Caminhão )"));
        float valor = Float.parseFloat(JOptionPane.showInputDialog("Preço do Carro: (R$)"));

        veiculo.setModelo(modelo);
        veiculo.setMarca(marca);
        veiculo.setAno(ano);
        veiculo.setCor(cor);
        veiculo.setMotor(motor);
        veiculo.setTipo(tipo);
        veiculo.setId(idVeiculo);
        veiculo.setValor(valor);
        veiculos.add(veiculo);

    }

    public static void ListaVeiculos() {

        if (veiculos.size() > 0) {

            veiculos.forEach((veiculo) -> {
                Veiculo.ToString(veiculo);
            });
        } else {
            JOptionPane.showMessageDialog(null, "Não há veículos cadastrados");
        }

    }

    Cliente clienteLogado = new Cliente();
    Vendedor vendedorLogado = new Vendedor();

    boolean clienteLogou;
    boolean vendedorLogou;

    public void LoginCliente() {
        String email = JOptionPane.showInputDialog("Email: ");
        String senha = JOptionPane.showInputDialog("Senha: ");
        //String email = "ryanbfc@live.com";
        //String senha = "12345";
        if (clientes.size() > 0) {
            clientes.forEach((cliente) -> {
                if (cliente.getEmail().equals(email) && cliente.getSenha().equals(senha)) {
                    clienteLogado = cliente;
                    JOptionPane.showMessageDialog(null, "Bem-Vindo " + clienteLogado.getNome());
                    clienteLogou = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Usúario ou senha inválidos");
                    clienteLogou = false;
                }
            });
        } else {
            JOptionPane.showMessageDialog(null, "Não há clientes cadastrado");
        }

    }

    public void EditarCliente() {
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equals(clienteLogado.getNome())) {
                String nome = JOptionPane.showInputDialog("Nome do cliente:");
                String cpf = JOptionPane.showInputDialog("CPF do cliente:");
                String endereco = JOptionPane.showInputDialog("Endereço do cliente:");
                String telefone = JOptionPane.showInputDialog("Telefone do cliente:");
                String email = JOptionPane.showInputDialog("Email do cliente:");
                String senha = JOptionPane.showInputDialog("Senha do cliente:");

                cliente.setNome(nome);
                cliente.setCPF(cpf);
                cliente.setEndereco(endereco);
                cliente.setTelefone(telefone);
                cliente.setEmail(email);
                cliente.setSenha(senha);

                clienteLogado = cliente;
                JOptionPane.showMessageDialog(null, "Editado com sucesso");

            }
        }

    }

    public void EditarVendedor() {
        for (Vendedor vendedor : vendedores) {
            if (vendedor.getNome().equals(vendedorLogado.getNome())) {
                String nome = JOptionPane.showInputDialog("Nome do vendedor:");
                String cpf = JOptionPane.showInputDialog("CPF do vendedor:");
                String endereco = JOptionPane.showInputDialog("Endereço do vendedor:");
                String telefone = JOptionPane.showInputDialog("Telefone do vendedor:");
                String email = JOptionPane.showInputDialog("Email:");
                String senha = JOptionPane.showInputDialog("Senha:");

                vendedor.setNome(nome);
                vendedor.setCPF(cpf);
                vendedor.setEndereco(endereco);
                vendedor.setTelefone(telefone);
                vendedor.setEmail(email);
                vendedor.setSenha(senha);

                JOptionPane.showMessageDialog(null, "Editado com sucesso");

            }
        }

    }

    public void EditarVeiculo() {
        ListaVeiculos();
        int opt = Integer.parseInt(JOptionPane.showInputDialog("Digite o Id do veículo que você deseja editar: "));

        for (Veiculo veiculo : veiculos) {
            if (veiculo.getId() == opt) {
                String modelo = JOptionPane.showInputDialog("Modelo do veículo:");
                String marca = JOptionPane.showInputDialog("Marca do veículo:");
                int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano do veículo:"));
                String cor = JOptionPane.showInputDialog("Cor do veículo:");
                String motor = JOptionPane.showInputDialog("Motor do veículo:");
                int tipo = Integer.parseInt(JOptionPane.showInputDialog("Tipo do veículo: (1: Carro, 2: Moto, 3: Caminhão )"));
                float valor = Float.parseFloat(JOptionPane.showInputDialog("Preço do Carro: (R$)"));

                veiculo.setModelo(modelo);
                veiculo.setMarca(marca);
                veiculo.setAno(ano);
                veiculo.setCor(cor);
                veiculo.setMotor(motor);
                veiculo.setTipo(tipo);
                veiculo.setValor(valor);

                JOptionPane.showMessageDialog(null, "Editado com sucesso");

            }
        }

    }

    public void ExcluirCliente() {
        Cliente.ToString(clienteLogado);
        clientes.remove(clientes.indexOf(clienteLogado));
        JOptionPane.showMessageDialog(null, "Deletado");
        clienteLogou = false;
    }

    public void ExcluirVendedor() {
        Vendedor.ToString(vendedorLogado);
        vendedores.remove(vendedores.indexOf(vendedorLogado));
        JOptionPane.showMessageDialog(null, "Deletado");
    }

    public void ExcluirVeiculo() {
        ListaVeiculos();
        int opt = Integer.parseInt(JOptionPane.showInputDialog("Digite o Id do veículo que você deseja excluir: "));
        Veiculo filtrado = new Veiculo();
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getId() == opt) {
                filtrado = veiculo;
            } else {
                JOptionPane.showMessageDialog(null, "Veiculo não encontrado");
            }
        }
        if (filtrado.getModelo() != null) {
            veiculos.remove(veiculos.indexOf(filtrado));
        }
        JOptionPane.showMessageDialog(null, "Deletado");
    }

    public void DadosCliente() {
        Cliente.ToString(clienteLogado);
    }

    public void DadosVendedor() {
        Vendedor.ToString(vendedorLogado);
    }

    public void DadosComissao() {
        Vendedor.ToStringComissao(vendedorLogado);
    }

    public void LoginVendedor() {
        String email = JOptionPane.showInputDialog("Email: ");
        String senha = JOptionPane.showInputDialog("Senha: ");
        //String email = "vendedor@live.com";
        //String senha = "12345";
        vendedores.forEach((vendedor) -> {
            if (vendedor.getEmail().equals(email) && vendedor.getSenha().equals(senha)) {
                vendedorLogado = vendedor;
                JOptionPane.showMessageDialog(null, "Bem-Vindo " + vendedorLogado.getNome());
                vendedorLogou = true;
            } else {
                JOptionPane.showMessageDialog(null, "Usúario ou senha inválidos");
                vendedorLogou = false;
            }
        });
    }


    public void FiltrarVeiculo() {
        int opt = Integer.parseInt(JOptionPane.showInputDialog("Digite o Id do veículo que você deseja filtrar: "));
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getId() == opt) {
                Veiculo.ToString(veiculo);
            } else {
                JOptionPane.showMessageDialog(null, "Veiculo não encontrado");

            }
        }
    }

    public void ComprarCarro() {
        Veiculo comprado = new Veiculo();
        ListaVeiculos();
        int opt = Integer.parseInt(JOptionPane.showInputDialog("Digite o Id do veículo que você deseja comprar: "));
        ListaVendedores();
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o Codigo do Vendedor: "));

        for (Veiculo veiculo : veiculos) {
            if (veiculo.getId() == opt) {
                comprado = veiculo;
                clienteLogado.listaVeiculosComprados.add(comprado);
            }
        }
        for (Vendedor vendedor : vendedores) {
            if (vendedor.getCodigo() == codigo) {
                vendedor.setComissao(vendedor.getComissao() + comprado.getValor() * 0.05f);
                clienteLogado.listaVeiculosComprados.add(comprado);
            }
        }
        JOptionPane.showMessageDialog(null, "Parabéns pela compra do " + comprado.getTipo() + " " + comprado.getModelo());

    }

}
