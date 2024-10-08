package main;

import servicos.QuartoSimplesServico;
import servicos.QuartoLuxoServicos;
import servicos.ClienteServicos;

public class Main {

    static ClienteServicos clienteServicos = new ClienteServicos();
    static QuartoLuxoServicos quartoLuxoServicos = new QuartoLuxoServicos();
    static QuartoSimplesServico quartoSimplesServico = new QuartoSimplesServico();
    static InputManager inputManager = new InputManager();

    public static void extraMenu(){
        System.out.println("\n===== Mais Opções =====");
        System.out.println("[0] Voltar     ");
        System.out.println("\n===== Aba Cliente =====");
        System.out.println("[1]Pesquisar por CPF");
        System.out.println("\n===== Aba Quarto Simples =====");
        System.out.println("[2]Pesquisar por Tamanho do Ventilador de Teto");
        System.out.println("\n===== Aba Quarto Luxo =====");
        System.out.println("[3]Pesquisar por tamanho da jacuzzi");
    }

    public static void menu(){
        System.out.println("\n\n===== Opções =====");
        System.out.print("[0]Desligar     [X]Mais Opções\n");
        System.out.println("\n===== Aba Cliente =====");
        System.out.print("[1]Adicionar    [2]Remover    [3]Atualizar    [4]Verificar    [5]Limpar Lista\n");
        System.out.println("\n===== Aba Quarto Simples =====");
        System.out.print("[6]Adicionar    [7]Remover    [8]Atualizar    [9]Verificar    [10]Limpar Lista\n");
        System.out.println("\n===== Aba Quarto de Luxo =====");
        System.out.print("[11]Adicionar   [12]Remover   [13]Atualizar   [14]Verificar   [15]Limpar Lista\n");
    }

    public static void extraOpcoes(){
        extraMenu();
        while(true){
            System.out.print("\nSelecione a opção: ");
            int opcaoMenu = inputManager.getInt();
            switch(opcaoMenu){
                case 0:
                return;
                //===== ===== ===== ===== =====
                case 1:
                clienteServicos.buscarClienteViaCPF();
                System.out.println();
                extraMenu();
                break;
                //===== ===== ===== ===== =====
                case 2:
                quartoSimplesServico.bQVTDVDT();
                extraMenu();
                break;
                //===== ===== ===== ===== =====
                case 3:
                quartoLuxoServicos.bQVTJ();
                extraMenu();
                break;
                //===== ===== ===== ===== =====
                default:
                System.out.print("Opção inválida, tente novamente.");
                extraMenu();
                break;
            }
        }
    }

    public static void main(String[] args) {

        menu();
        while(true){
            System.out.print("\nSelecione a opção: ");
            String opcaoMenu = inputManager.getString().toUpperCase();
            switch(opcaoMenu){
                case "0":
                System.out.println("\nDesligando...");
                return;
                //===== ===== ===== ===== =====
                case "X":
                extraOpcoes();
                menu();
                break;
                //===== ===== ===== ===== =====
                case "1":
                clienteServicos.add();
                menu();
                break;
                //===== ===== ===== ===== =====
                case "2":
                clienteServicos.remove();
                menu();
                break;
                //===== ===== ===== ===== =====
                case "3":
                clienteServicos.update();
                menu();
                break;
                //===== ===== ===== ===== =====
                case "4":
                clienteServicos.getInfo();
                menu();
                break;
                //===== ===== ===== ===== =====
                case "5":
                clienteServicos.clear();
                menu();
                break;
                //===== ===== ===== ===== =====
                case "6":
                quartoSimplesServico.add();
                menu();
                break;
                //===== ===== ===== ===== =====
                case "7":
                quartoSimplesServico.remove();
                menu();
                break;
                //===== ===== ===== ===== =====
                case "8":
                quartoSimplesServico.update();
                menu();
                break;
                //===== ===== ===== ===== =====
                case "9":
                quartoSimplesServico.getInfo();
                menu();
                break;
                //===== ===== ===== ===== =====
                case "10":
                quartoSimplesServico.clear();
                menu();
                break;
                //===== ===== ===== ===== =====
                case "11":
                quartoLuxoServicos.add();
                menu();
                break;
                //===== ===== ===== ===== =====
                case "12":
                quartoLuxoServicos.remove();
                menu();
                break;
                //===== ===== ===== ===== =====
                case "13":
                quartoLuxoServicos.update();
                menu();
                break;
                //===== ===== ===== ===== =====
                case "14":
                quartoLuxoServicos.getInfo();
                menu();
                break;
                //===== ===== ===== ===== =====
                case "15":
                quartoLuxoServicos.clear();
                menu();
                break;
                //===== ===== ===== ===== =====
                default:
                System.out.print("Opção inválida, tente novamente.");
                break;
            }
        }

    }
}
