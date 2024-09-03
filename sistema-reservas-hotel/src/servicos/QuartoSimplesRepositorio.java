package servicos;

import entidades.QuartoSimples;
import main.InputManager;

public class QuartoSimplesRepositorio {
    
    InputManager inputManager = new InputManager();
    Repositorio<QuartoSimples> repositorio = new Repositorio<>();

    public void add(){
        System.out.print("\nInsira o hotel: ");
        String hotel = inputManager.getString();
        System.out.print("\nInsira o andar: ");
        String andar = inputManager.getString();
        System.out.print("\nInsira o número do quarto: ");
        int numeroQuarto = inputManager.getInt();
        System.out.print("\nInsira presença de geladeira no quarto.");
        boolean geladeira = inputManager.getBoolean();
        System.out.print("\nInsira presença de ventilador de teto no quarto.");
        boolean ventiladorDeTeto = inputManager.getBoolean();
        System.out.print("\nInsira o preço(mês) do quarto.");
        double preco = inputManager.getDouble();
        System.out.print("\nInsira se o quarto já está reservado.");
        boolean reservado = inputManager.getBoolean();

        repositorio.add(new QuartoSimples(preco, andar, hotel, numeroQuarto, reservado, geladeira, ventiladorDeTeto));
        System.out.println("\nQuarto adicionado com sucesso.");
    }

    public void remove(){
        list();
        System.out.print("\nSelecione a opção que deseja remover: ");
        while(true){
            int opcaoRemover = (inputManager.getInt());
            if(opcaoRemover < 1 || opcaoRemover > repositorio.size()){
                System.out.print("\nEste quarto não existe, tente novamente: ");
            } else {
                repositorio.remove(opcaoRemover-1);
                System.out.print("\nQuarto removido com sucesso.");
                return;
            }
        }
    }

    public void set(){
        
    }

    public void clear(){
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
        list();
        System.out.print("\nSelecione o quarto que deseja verificar as informações: ");
        while(true){
            int opcaoInfo = inputManager.getInt();
            if(opcaoInfo < 1 || opcaoInfo > repositorio.size()){
                System.out.print("\nOpção inválida, tente novamente: ");
            } else {
                opcaoInfo--;
                System.out.println("Hotel: "+repositorio.get(opcaoInfo).getHotel());
                System.out.println("Número: ");
                System.out.println("Preço: ");
                System.out.println("Andar: ");
                System.out.println("Geladeira: ");
                System.out.println("Ventilador de Teto: ");
                System.out.println("Reservado: ");
                return;
            }
        }
    }

    public void size(){
        System.out.print("\nQuartos reservados: "+repositorio.size());
    }

    public void list(){
        for(int i=0; i<repositorio.size(); i++){
            System.out.println((i+1)+"º: "+repositorio.get(i).getHotel()+" Nº "+repositorio.get(i).getNumeroQuarto());
        }
    }

}
