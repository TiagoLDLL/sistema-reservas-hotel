package repositorio;

import entidades.QuartoLuxo;

public class QuartoLuxoRepositorio extends Repositorio<QuartoLuxo>{
    
    public QuartoLuxoRepositorio(int capacidade){
        super(capacidade);
    }

    public QuartoLuxoRepositorio(){
    }

    public QuartoLuxo buscarViaTamanhoJacuzzi(double tamanhoJacuzzi){
        for(int i=0; i<size(); i++){
            QuartoLuxo quarto = get(i);
            if(quarto.getTamanhoJacuzzi()==tamanhoJacuzzi){
                return quarto;
            }
        }
        return null;
    }

}
