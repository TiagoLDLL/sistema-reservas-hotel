package servicos;

import main.InputManager;
import repositorio.Repositorio;
import entidades.Cliente;

public class ClienteServicos {
    
    InputManager inputManager = new InputManager();
    Repositorio<Cliente> repositorio = new Repositorio<>();

    public void add(){
        System.out.print("\nDigite seu nome: ");
        String nome = inputManager.getString();
        System.out.print("Digite seu email: ");
        String email = validarEmail();
        System.out.print("Digite seu CPF: ");
        String cpf = validarCPF();

        repositorio.add(new Cliente(nome, email, cpf));
        System.out.print("\nCliente adicionado com sucesso.");
    }

    private String validarCPF(){
        String cpf;
        while(true){
            boolean valid = true;
            cpf = inputManager.getString();
            if(cpf.length() == 11){
                for(int i=0; i<cpf.length(); i++){
                    if(!Character.isDigit(cpf.charAt(i))){
                        valid = false;
                    }
                }
                if(valid){
                    return cpf;
                }
            }
            System.out.print("CPF inválido, tente novamente: ");
        }
    }

    private String validarEmail(){
        String email;
        while(true){
            email = inputManager.getString();
            if(email.contains("@") && email.contains(".com")){
                return email;
            }
            System.out.print("Email inválido, tente novamente: ");
        }
    }

    public void remove(){
        if(repositorio.size() == 0 ){
            System.out.print("\nA lista está vazia.");
            return;
        }
        System.out.println();
        list();
        System.out.print("\nQual cliente você deseja remover?: ");
        while(true){
            int removeClient = inputManager.getInt();
            if(removeClient > 0 && removeClient <= repositorio.size()){
                System.out.print("Tem certeza que deseja remover esse cliente?");
                boolean confirmation = inputManager.getBoolean();
                if(confirmation){
                    repositorio.remove(removeClient-1);
                    System.out.print("\nCliente removido com sucesso.");
                    return;
                } else {
                    System.out.print("\nCancelando...");
                    return;
                }
            }
            System.out.print("Opção inválida, tente novamente: ");
        }
    }

    public void update(){
        if(repositorio.size() == 0 ){
            System.out.print("\nA lista está vazia.");
            return;
        }
        System.out.println();
        list();
        System.out.print("\nQual cliente você deseja modificar?: ");
        while(true){
            int modCliente = inputManager.getInt();
            if(modCliente > 0 && modCliente <= repositorio.size()){
                System.out.println("\n[1]Email   [2]Nome   [3]CPF   [4]Tudo   [0]Cancelar");
                System.out.print("\nSelecione a opção que deseja modificar: ");
                while(true){
                    int modOption = inputManager.getInt();
                    switch(modOption){
                        case 0:
                        System.out.print("\nCancelando...");
                        return;

                        case 1:
                        System.out.print("\nDigite o email: ");
                        String newEmail = validarEmail();
                        repositorio.get(modCliente-1).setEmail(newEmail);
                        System.out.print("\nCliente modificado com sucesso.");
                        return;

                        case 2:
                        System.out.print("\nDigite o nome: ");
                        String newNome = inputManager.getString();
                        repositorio.get(modCliente-1).setNome(newNome);
                        System.out.print("\nCliente modificado com sucesso.");
                        return;

                        case 3:
                        System.out.print("\nDigite o CPF: ");
                        String newCPF = validarCPF();
                        repositorio.get(modCliente-1).setCpf(newCPF);
                        System.out.print("\nCliente modificado com sucesso.");
                        return;

                        case 4:
                        System.out.print("\nDigite seu nome: ");
                        String nome = inputManager.getString();
                        System.out.print("Digite seu email: ");
                        String email = validarEmail();
                        System.out.print("Digite seu CPF: ");
                        String cpf = validarCPF();
                        Cliente newCliente = new Cliente(nome, email, cpf);
                        repositorio.set(modCliente-1, newCliente);
                        System.out.print("\nCliente modificado com sucesso.");
                        return;

                        default:
                        System.out.print("\nOpção inválida, tente novamente: ");
                        break;
                    }
                }
            }
        }
    }

    public void clear(){
        if(repositorio.size() == 0 ){
            System.out.print("\nA lista está vazia.");
            return;
        }
        System.out.print("\nVocê tem certeza que deseja limpar o repositório? [1]Sim   [2]Cancelar: ");
        while(true){
            int opcaoLimpar = inputManager.getInt();
            if(opcaoLimpar == 1){
                repositorio.clear();
                System.out.print("\nRepositório limpo com sucesso.");
                return;
            } else if(opcaoLimpar == 2){
                System.out.print("\nCancelado processamento...");
                return;
            } else {
                System.out.print("\nOpção inválida, tente novamente: ");
            }
        }
    }

    public void getInfo(){
        if(repositorio.size() == 0 ){
            System.out.print("\nA lista está vazia.");
            return;
        }
        System.out.println();
        list();
        System.out.println();
        System.out.print("Qual cliente você deseja ver as informações?: ");
        while(true){
            int infoClient = inputManager.getInt();
            if(infoClient > 0 && infoClient <= repositorio.size()){
                infoClient--;
                System.out.print("\nNome: "+repositorio.get(infoClient).getNome());
                System.out.print("\nEmail: "+repositorio.get(infoClient).getEmail());
                System.out.print("\nCPF: "+repositorio.get(infoClient).getCPF());
                return;
            }
            System.out.print("\nOpção inválida, tente novamente: ");
        }
    }

    public void size(){
        System.out.println("\nO Tamanho da lista de clientes é de: "+repositorio.size()+" Cliente(s).");
    }

    public void list(){
        for(int i=0; i<repositorio.size(); i++){
            System.out.println("["+(i+1)+"] "+repositorio.get(i).getNome());
        }
    }
}
