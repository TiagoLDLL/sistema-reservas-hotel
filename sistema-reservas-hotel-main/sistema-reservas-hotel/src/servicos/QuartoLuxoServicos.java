package servicos;

import entidades.QuartoLuxo;
import main.InputManager;
import status.StatusQuarto;
import repositorio.QuartoLuxoRepositorio;

public class QuartoLuxoServicos {
    
    InputManager inputManager = new InputManager();
    QuartoLuxoRepositorio repositorio = new QuartoLuxoRepositorio();

    public void add(){
        System.out.println();
        System.out.print("Insira o hotel: ");
        String hotel = inputManager.getString();
        System.out.print("Insira o andar: ");
        String andar = inputManager.getString();
        System.out.print("Insira o número do quarto: ");
        int numeroQuarto = inputManager.getInt();
        System.out.print("Insira presença de jacuzzi no quarto.");
        boolean jacuzzi = inputManager.getBoolean();
        System.out.print("Insira presença de serviço de quarto no quarto.");
        boolean servicoDeQuarto = inputManager.getBoolean();
        System.out.print("Insira o preço(mês) do quarto: ");
        double preco = inputManager.getDouble();
        double tamanhoJacuzzi;

        if(jacuzzi){
            System.out.print("Insira o tamanho(m²) da jacuzzi: ");
            tamanhoJacuzzi = inputManager.getDouble();
        } else {
            tamanhoJacuzzi = 0;
        }

        System.out.print("Insira se o quarto está disponível.");
        boolean disponivel = inputManager.getBoolean();
        StatusQuarto status;
        if(disponivel){
            status = StatusQuarto.DISPONIVEL;
        } else {
            status = StatusQuarto.RESERVADO;
        }

        repositorio.add(new QuartoLuxo(preco, andar, hotel, numeroQuarto, status, jacuzzi, servicoDeQuarto, tamanhoJacuzzi));
        System.out.print("\nQuarto adicionado com sucesso.");
        inputManager.scanner.nextLine();
    }

    //AKA: buscarQuartoViaTamanhoJacuzzi.
    public void bQVTJ(){
        System.out.print("\nDigite o tamanho(m²) da Jacuzzi: ");
        double tamanhoJacuzzi = inputManager.getDouble();
        QuartoLuxo quarto = repositorio.buscarViaTamanhoJacuzzi(tamanhoJacuzzi);
        if(quarto==null){
            System.out.println("\nNão foi encontrado um quarto com essa jacuzzi.");
            return;
        }
        System.out.println("\n===== ===== Quarto encontrado! ===== =====");
        System.out.println("Hotel: "+quarto.getHotel());
        System.out.println("Andar: "+quarto.getAndar());
        System.out.println("Número: "+quarto.getNumeroQuarto());
        System.out.println("Preço: "+quarto.getPreco());
        System.out.println("Jacuzzi: "+quarto.getTamanhoJacuzzi());
        if(quarto.getServicoDeQuarto()){
            System.out.println("Serviço de Quarto Incluído.");
        }
        System.out.println("Disponibilidade: "+quarto.getStatus());
        System.out.println("===== ===== ===== ===== ===== ===== =====");
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
                System.out.print("\n[1] Preço   [2] Andar     [3] Hotel             [4] Número");
                System.out.println("\n[5] Status  [6] Jacuzzi   [7] Serviço de Quarto [8] Tamanho da Jacuzzi");
                System.out.print("[9] Tudo     Selecione a opção: ");
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
                        System.out.print("\nDigite se o quarto tem jacuzzi.");
                        boolean newJacuzzi = inputManager.getBoolean();
                        repositorio.get(opcaoQuarto-1).setJacuzzi(newJacuzzi);
                        System.out.print("\nQuarto modificado com sucesso.");
                        return;
                        //===== ===== ===== ===== =====
                        case 7:
                        System.out.print("\nDigite se o quarto tem serviço de quarto.");
                        boolean newSevico = inputManager.getBoolean();
                        repositorio.get(opcaoQuarto-1).setServicoDeQuarto(newSevico);
                        System.out.print("\nQuarto modificado com sucesso.");
                        return;
                        //===== ===== ===== ===== =====
                        case 8:
                        if(!repositorio.get(opcaoQuarto-1).getJacuzzi()){
                            System.out.println("\nEste quarto não possui jacuzzi.");
                            return;
                        }
                        System.out.print("\nDigite o tamanho(m²) da jacuzzi: ");
                        double newTamanhoJacuzzi = inputManager.getDouble();
                        repositorio.get(opcaoQuarto-1).setTamanhoJacuzzi(newTamanhoJacuzzi);
                        System.out.print("\nQuarto modificado com sucesso.");
                        return;
                        //===== ===== ===== ===== =====
                        case 9:
                        System.out.print("\nInsira o hotel: ");
                        String hotel = inputManager.getString();
                        System.out.print("Insira o andar: ");
                        String andar = inputManager.getString();
                        System.out.print("Insira o número do quarto: ");
                        int numeroQuarto = inputManager.getInt();
                        System.out.print("Insira presença de jacuzzi no quarto.");
                        boolean jacuzzi = inputManager.getBoolean();
                        System.out.print("Insira presença de serviço de quarto no quarto.");
                        boolean servicoDeQuarto = inputManager.getBoolean();
                        System.out.print("Insira o preço(mês) do quarto: ");
                        double preco = inputManager.getDouble();
                        double tamanhoJacuzzi;

                        if(jacuzzi){
                            System.out.print("Insira o tamanho(m²) da jacuzzi: ");
                            tamanhoJacuzzi = inputManager.getDouble();
                        } else {
                            tamanhoJacuzzi = 0;
                        }
                
                        System.out.print("Insira se o quarto está disponível.");
                        boolean disponivel = inputManager.getBoolean();
                        StatusQuarto status;
                        if(disponivel){
                            status = StatusQuarto.DISPONIVEL;
                        } else {
                            status = StatusQuarto.RESERVADO;
                        }
                        QuartoLuxo newQuartoLuxo = new QuartoLuxo(preco, andar, hotel, numeroQuarto, status, jacuzzi, servicoDeQuarto, tamanhoJacuzzi);
                        repositorio.set(opcaoQuarto-1, newQuartoLuxo);
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
        list();
        System.out.print("\nSelecione o quarto que deseja verificar as informações: ");
        while(true){
            int opcaoInfo = inputManager.getInt();
            if(opcaoInfo < 1 || opcaoInfo > repositorio.size()){
                System.out.print("\nOpção inválida, tente novamente: ");
            } else {
                opcaoInfo--;
                System.out.println("Hotel: "+repositorio.get(opcaoInfo).getHotel());
                System.out.println("Número: "+repositorio.get(opcaoInfo).getNumeroQuarto());
                System.out.println("Preço: "+repositorio.get(opcaoInfo).getPreco());
                System.out.println("Andar: "+repositorio.get(opcaoInfo).getAndar());
                if(repositorio.get(opcaoInfo).getJacuzzi()){
                    System.out.println("Jacuzzi: "+repositorio.get(opcaoInfo).getTamanhoJacuzzi());
                }
                if(repositorio.get(opcaoInfo).getServicoDeQuarto()){
                    System.out.println("Serviço de Quarto Incluído.");
                }
                System.out.print("Disponibilidade: "+repositorio.get(opcaoInfo).getStatus());
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
