package repositorio;

import entidades.QuartoSimples;

public class QuartoSimplesRepositorio extends Repositorio<QuartoSimples>{
    
    public QuartoSimplesRepositorio(int capacidade){
        super(capacidade);
    }

    public QuartoSimplesRepositorio(){
    }

    public QuartoSimples buscarViaTamanhoVentilador(double tamanhoVentilador){
        for(int i=0; i<size(); i++){
            QuartoSimples quarto = get(i);
            if(quarto.getTamanhoVentilador()==tamanhoVentilador){
                return quarto;
            }
        }
        return null;
    }

}
