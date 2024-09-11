package repositorio;

import entidades.Cliente;

public class ClienteRepositorio extends Repositorio<Cliente>{

    public ClienteRepositorio(int capacidade){
        super(capacidade);
    }

    public ClienteRepositorio(){
    }

    public Cliente buscarViaCPF(String cpf){
        for(int i=0; i<size(); i++){
            Cliente cliente = get(i);
            if(cliente.getCpf().equals(cpf)){
                return cliente;
            }
        }
        return null;
    }

}
