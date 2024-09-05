package entidades;

import status.StatusQuarto;

public class QuartoLuxo extends Quarto {
    
    private boolean jacuzzi, servicoDeQuarto;
    
    public QuartoLuxo(double preco, String andar, String hotel, int numeroQuarto, StatusQuarto status, boolean jacuzzi, boolean servicoDeQuarto){
        super(preco, andar, hotel, numeroQuarto, status);
        this.jacuzzi = jacuzzi;
        this.servicoDeQuarto = servicoDeQuarto;
    }

    public void setJacuzzi(boolean jacuzzi){
        this.jacuzzi = jacuzzi;
    }

    public void setServicoDeQuarto(boolean servicoDeQuarto){
        this.servicoDeQuarto = servicoDeQuarto;
    }

    public boolean getJacuzzi(){
        return jacuzzi;
    }

    public boolean getServicoDeQuarto(){
        return servicoDeQuarto;
    }

}
