package entidades;

public class QuartoSimples extends Quarto {
    
    private boolean geladeira, ventiladorDeTeto;

    public QuartoSimples(double preco, String andar, String hotel, int numeroQuarto, boolean reservado, boolean geladeira, boolean ventiladorDeTeto){
        super(preco, andar, hotel, numeroQuarto, reservado);
        this.geladeira = geladeira;
        this.ventiladorDeTeto = ventiladorDeTeto;
    }

    public void setGeladeira(boolean geladeira){
        this.geladeira = geladeira;
    }

    public void setVentiladorDeTeto(boolean ventiladorDeTeto){
        this.ventiladorDeTeto = ventiladorDeTeto;
    }

    public boolean getGeladeira(){
        return geladeira;
    }

    public boolean getVentiladorDeTeto(){
        return ventiladorDeTeto;
    }

}
