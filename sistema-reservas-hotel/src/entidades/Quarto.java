package entidades;

public class Quarto {
    
    private double preco;
    private String andar, hotel;
    private int numeroQuarto;
    private boolean reservado;

    Quarto(double preco, String andar, String hotel, int numeroQuarto, boolean reservado){
        this.preco = preco;
        this.andar = andar;
        this.hotel = hotel;
        this.numeroQuarto = numeroQuarto;
        this.reservado = reservado;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void setAndar(String andar){
        this.andar = andar;
    }

    public void setHotel(String hotel){
        this.hotel = hotel;
    }

    public void setNumeroQuarto(int numeroQuarto){
        this.numeroQuarto = numeroQuarto;
    }

    public void setReservado(boolean reservado){
        this.reservado = reservado;
    }

    public double getPreco(){
        return preco;
    }

    public String getAndar(){
        return andar;
    }

    public String getHotel(){
        return hotel;
    }

    public int getNumeroQuarto(){
        return numeroQuarto;
    }

    public boolean getReservado(){
        return reservado;
    }

}
