package Ficha6;

import java.io.Serializable;
import java.time.LocalDate;

public class Canoagem extends Atividade implements FazMetros, Serializable {
    private String boat;
    private int wind;
    private String direcao;
    private int distancia;
    private int voltas;

    private int pontosPorMetro;


    public Canoagem() {
        super();
        boat = "";
        wind = 0;
        direcao = "";
        distancia = 0;
        voltas = 0;
        pontosPorMetro = 0;
    }

    public Canoagem(String id, String descricao, LocalDate date, int time, String nboat, int nwind, String ndirecao, int ndistancia, int nvoltas, int pontos) {
        super(id, descricao,date,time);
        boat = nboat;
        wind = nwind;
        direcao = ndirecao;
        distancia = ndistancia;
        voltas = nvoltas;
        pontosPorMetro = pontos;
    }

    public Canoagem(Canoagem c) {
        super(c);
        boat = c.getBoat();
        wind = c.getWind();
        direcao = c.getDirecao();
        distancia = c.getDistancia();
        voltas = c.getVoltas();
        pontosPorMetro = c.getPontosPorMetro();
    }

    public String getBoat() {
        return boat;
    }

    public void setBoat(String boat) {
        this.boat = boat;
    }

    public int getWind() {
        return wind;
    }

    public void setWind(int wind) {
        this.wind = wind;
    }
    public String getDirecao() {
        return direcao;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getVoltas() {
        return voltas;
    }

    public void setVoltas(int voltas) {
        this.voltas = voltas;
    }


    @Override
    public int getPontosPorMetro() {
        return pontosPorMetro;
    }

    @Override
    public void setPontosPorMetro(int pontosPorMetro) {
        this.pontosPorMetro = pontosPorMetro;
    }

    @Override
    public int getTotalPontos() {
        return pontosPorMetro * wind * 3 / 2 ;
    }

    @Override
    public Atividade clone() {
        return new Canoagem(this);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || o.getClass() != this.getClass()) return false;
        Canoagem c = (Canoagem) o;
        return (super.equals(c) && boat.equals(c.getBoat()) && wind == c.getWind() && direcao.equals(c.getDirecao()) && distancia == c.getDistancia() && voltas == c.getVoltas() && pontosPorMetro == c.getPontosPorMetro());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Canoagem: {\n").append(super.toString())
                .append("\nEmbarcacao: ").append(boat)
                .append("\nVelocidade do Vento: ").append(wind)
                .append("\nDirecao do vento: ").append(direcao)
                .append("\nDistancia percorrida: ").append(distancia)
                .append("\nNumero de voltas: ").append(voltas)
                .append("\nPontos por metro: ").append(pontosPorMetro).append(" }\n");
        return sb.toString();
    }

    @Override
    public double calorias(Utilizador u) {
        return distancia * this.getTime() * (LocalDate.now().getYear() - u.getBirthdate().getYear()) * 0.25;
    }
}
