package servicos;

import entidades.QuartoSimples;
import main.InputManager;
import status.StatusQuarto;
import repositorio.Repositorio;

public class QuartoSimplesServico {
    
    InputManager inputManager = new InputManager();
    Repositorio<QuartoSimples> repositorio = new Repositorio<>();

    public void add(){
        System.out.println();
        System.out.print("Insira o hotel: ");
        String hotel = inputManager.getString();
        System.out.print("Insira o andar: ");
        String andar = inputManager.getString();
        System.out.print("Insira o número do quarto: ");
        int numeroQuarto = inputManager.getInt();
        System.out.print("Insira presença de geladeira no quarto.");
        boolean geladeira = inputManager.getBoolean();
        System.out.print("Insira presença de ventilador de teto no quarto.");
        boolean ventiladorDeTeto = inputManager.getBoolean();
        System.out.print("Insira o preço(mês) do quarto: ");
        double preco = inputManager.getDouble();

        System.out.print("Insira se o quarto está disponível.");
        boolean disponivel = inputManager.getBoolean();
        StatusQuarto status;
        if(disponivel){
            status = StatusQuarto.DISPONIVEL;
        } else {
            status = StatusQuarto.RESERVADO;
        }

        repositorio.add(new QuartoSimples(preco, andar, hotel, numeroQuarto, status, geladeira, ventiladorDeTeto));
        System.out.print("\nQuarto adicionado com sucesso.");
    }

    public void remove(){
        if(repositorio.size() == 0 ){
            System.out.print("\nA lista está vazia.");
            return;
        }
        System.out.println();
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

    public void update(){
        if(repositorio.size() == 0 ){
            System.out.print("\nA lista está vazia.");
            return;
        }
        System.out.println();
        list();
        System.out.print("\nQual quarto você deseja modificar?: ");
        while(true){
            int opcaoQuarto = inputManager.getInt();
            if(opcaoQuarto > 0 && opcaoQuarto <= repositorio.size()){
                System.out.print("\n[1] Preço   [2] Andar     [3] Hotel      [4] Número");
                System.out.println("\n[5] Status  [6] Geladeira [7] Ventilador [8] Tudo");
                System.out.print("\nSelecione a opção: ");
                while(true){
                    int opcaoMod = inputManager.getInt();
                    switch(opcaoMod){
                        case 1:
                        System.out.print("\nDigite o preço: ");
                        double newPreco = inputManager.getDouble();
                        repositorio.get(opcaoQuarto-1).setPreco(newPreco);
                        System.out.print("\nQuarto modificado com sucesso.");
                        return;
                        //===== ===== ===== ===== =====
                        case 2:
                        System.out.print("\nDigite o andar: ");
                        String newAndar = inputManager.getString();
                        repositorio.get(opcaoQuarto-1).setAndar(newAndar);
                        System.out.print("\nQuarto modificado com sucesso.");
                        return;
                        //===== ===== ===== ===== =====
                        case 3:
                        System.out.print("\nDigite o Hotel: ");
                        String newHotel = inputManager.getString();
                        repositorio.get(opcaoQuarto-1).setHotel(newHotel);
                        System.out.print("\nQuarto modificado com sucesso.");
                        return;
                        //===== ===== ===== ===== =====
                        case 4:
                        System.out.print("\nDigite o número do quarto: ");
                        int newNumero = inputManager.getInt();
                        repositorio.get(opcaoQuarto-1).setNumeroQuarto(newNumero);
                        System.out.print("\nQuarto modificado com sucesso.");
                        return;
                        //===== ===== ===== ===== =====
                        case 5:
                        System.out.print("\nDigite o status do quarto.");
                        boolean x = inputManager.getBoolean();
                        StatusQuarto newStatus;
                        if(x){
                            newStatus = StatusQuarto.DISPONIVEL;
                        } else {
                            newStatus = StatusQuarto.RESERVADO;
                        }
                        repositorio.get(opcaoQuarto-1).setStatus(newStatus);
                        System.out.print("\nQuarto modificado com sucesso.");
                        return;
                        //===== ===== ===== ===== =====
                        case 6:
                        System.out.print("\nDigite se o quarto tem geladeira.");
                        boolean newGeladeira = inputManager.getBoolean();
                        repositorio.get(opcaoQuarto-1).setGeladeira(newGeladeira);
                        System.out.print("\nQuarto modificado com sucesso.");
                        return;
                        //===== ===== ===== ===== =====
                        case 7:
                        System.out.print("\nDigite se o quarto tem ventilador de teto.");
                        boolean newVentilador = inputManager.getBoolean();
                        repositorio.get(opcaoQuarto-1).setVentiladorDeTeto(newVentilador);
                        System.out.print("\nQuarto modificado com sucesso.");
                        return;
                        //===== ===== ===== ===== =====
                        case 8:
                        System.out.print("\nInsira o hotel: ");
                        String hotel = inputManager.getString();
                        System.out.print("Insira o andar: ");
                        String andar = inputManager.getString();
                        System.out.print("Insira o número do quarto: ");
                        int numeroQuarto = inputManager.getInt();
                        System.out.print("Insira presença de geladeira no quarto.");
                        boolean geladeira = inputManager.getBoolean();
                        System.out.print("Insira presença de ventilador de teto no quarto.");
                        boolean ventiladorDeTeto = inputManager.getBoolean();
                        System.out.print("Insira o preço(mês) do quarto: ");
                        double preco = inputManager.getDouble();
                
                        System.out.print("Insira se o quarto está disponível.");
                        boolean disponivel = inputManager.getBoolean();
                        StatusQuarto status;
                        if(disponivel){
                            status = StatusQuarto.DISPONIVEL;
                        } else {
                            status = StatusQuarto.RESERVADO;
                        }
                        QuartoSimples newQuartoSimples = new QuartoSimples(preco, andar, hotel, numeroQuarto, status, geladeira, ventiladorDeTeto);
                        repositorio.set(opcaoQuarto-1, newQuartoSimples);
                        System.out.print("\nQuarto modificado com sucesso.");
                        return;
                        //===== ===== ===== ===== =====
                        default:
                        System.out.print("Opção inválida, tente novamente:");
                        break;
                    }
                }
            }
            System.out.print("Opção inválida, tente novamente: ");
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
        System.out.print("\nSelecione o quarto que deseja verificar as informações: ");
        while(true){
            int opcaoInfo = inputManager.getInt();
            if(opcaoInfo < 1 || opcaoInfo > repositorio.size()){
                System.out.print("\nOpção inválida, tente novamente: ");
            } else {
                System.out.println();
                opcaoInfo--;
                System.out.println("Hotel: "+repositorio.get(opcaoInfo).getHotel());
                System.out.println("Número: "+repositorio.get(opcaoInfo).getNumeroQuarto());
                System.out.println("Preço: "+repositorio.get(opcaoInfo).getPreco());
                System.out.println("Andar: "+repositorio.get(opcaoInfo).getAndar());
                System.out.println("Geladeira: "+repositorio.get(opcaoInfo).getGeladeira());
                System.out.println("Ventilador de Teto: "+repositorio.get(opcaoInfo).getVentiladorDeTeto());
                System.out.println("Disponibilidade: "+repositorio.get(opcaoInfo).getStatus());
                return;
            }
        }
    }

    public void size(){
        System.out.print("\nQuantidade de quartos: "+repositorio.size());
    }

    public void list(){
        for(int i=0; i<repositorio.size(); i++){
            System.out.println((i+1)+"º: "+repositorio.get(i).getHotel()+" Nº "+repositorio.get(i).getNumeroQuarto());
        }
    }

}
