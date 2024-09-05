package entidades;

import status.StatusQuarto;

public class Quarto {
    
    private double preco;
    private String andar, hotel;
    private int numeroQuarto;
    private StatusQuarto status;
 
    Quarto(double preco, String andar, String hotel, int numeroQuarto, StatusQuarto status){
        this.preco = preco;
        this.andar = andar;
        this.hotel = hotel;
        this.numeroQuarto = numeroQuarto;
        this.status = status;
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

    public void setStatus(StatusQuarto status){
        this.status = status;
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

    public StatusQuarto getStatus(){
        return status;
    }

}
