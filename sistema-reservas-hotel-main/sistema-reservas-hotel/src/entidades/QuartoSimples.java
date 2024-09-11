package entidades;

import status.StatusQuarto;

public class QuartoSimples extends Quarto {
    
    private boolean geladeira, ventiladorDeTeto;
    private double tamanhoVentilador;

    public QuartoSimples(double preco, String andar, String hotel, int numeroQuarto,
    StatusQuarto status, boolean geladeira, boolean ventiladorDeTeto, double tamanhoVentilador){
        super(preco, andar, hotel, numeroQuarto, status);
        this.geladeira = geladeira;
        this.ventiladorDeTeto = ventiladorDeTeto;
        this.tamanhoVentilador = tamanhoVentilador;
    }

    public void setGeladeira(boolean geladeira){
        this.geladeira = geladeira;
    }

    public void setVentiladorDeTeto(boolean ventiladorDeTeto){
        this.ventiladorDeTeto = ventiladorDeTeto;
    }

    public void setTamanhoVentilador(double tamanhoVentilador){
        this.tamanhoVentilador = tamanhoVentilador;
    }

    public double getTamanhoVentilador(){
        return tamanhoVentilador;
    }

    public boolean getGeladeira(){
        return geladeira;
    }

    public boolean getVentiladorDeTeto(){
        return ventiladorDeTeto;
    }

}
