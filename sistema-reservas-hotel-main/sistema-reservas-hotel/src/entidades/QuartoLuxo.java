package entidades;

import status.StatusQuarto;

public class QuartoLuxo extends Quarto {
    
    private boolean jacuzzi, servicoDeQuarto;
    private double tamanhoJacuzzi;
    
    public QuartoLuxo(double preco, String andar, String hotel, int numeroQuarto,
    StatusQuarto status, boolean jacuzzi, boolean servicoDeQuarto, double tamanhoJacuzzi){
        super(preco, andar, hotel, numeroQuarto, status);
        this.jacuzzi = jacuzzi;
        this.servicoDeQuarto = servicoDeQuarto;
        this.tamanhoJacuzzi = tamanhoJacuzzi;
    }

    public void setJacuzzi(boolean jacuzzi){
        this.jacuzzi = jacuzzi;
    }

    public void setTamanhoJacuzzi(double tamanhoJacuzzi){
        this.tamanhoJacuzzi = tamanhoJacuzzi;
    }

    public void setServicoDeQuarto(boolean servicoDeQuarto){
        this.servicoDeQuarto = servicoDeQuarto;
    }

    public boolean getJacuzzi(){
        return jacuzzi;
    }

    public double getTamanhoJacuzzi(){
        return tamanhoJacuzzi;
    }

    public boolean getServicoDeQuarto(){
        return servicoDeQuarto;
    }

}
