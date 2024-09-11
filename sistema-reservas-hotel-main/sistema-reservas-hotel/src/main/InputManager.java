package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputManager {
    
    public final Scanner scanner = new Scanner(System.in);

    public final int getInt(){
        while(true){
            try{
                int number = scanner.nextInt();
                scanner.nextLine();
                return number;
            } catch(InputMismatchException e){
                System.out.print("Entrada inválida, tente novamente: ");
                scanner.nextLine();
            }
        }
    }

    public final String getString(){
        while(true){
            String string = scanner.nextLine().trim();
            if(string.isBlank()){
                System.out.print("Espaço em branco, tente novamente: ");
            } else {
                return string;
            }
        }
    }

    public final double getDouble(){
        while(true){
            try{
                double number = scanner.nextDouble();
                return number;
            } catch(InputMismatchException e){
                System.out.print("Entrada inválida, tente novamente: ");
                scanner.nextLine();
            }
        }
    }

    public final boolean getBoolean(){
        System.out.print("\nInsira [1] para SIM e [2] para NÃO: ");
        while(true){
            try{
                int booleanOption = scanner.nextInt();
                if(booleanOption == 1 || booleanOption == 2){
                    return booleanOption == 1;
                }
                System.out.print("Opção inválida. tente novamente: ");
            } catch(InputMismatchException e){
                System.out.print("Entrada inválida, tente novamente: ");
                scanner.nextLine();
            }
        }
    }

}
