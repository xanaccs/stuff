package Ficha6;

import java.time.LocalDate;

public class Utilizador {

    private static final int MALE = 0;
    private static final int FEMALE = 1;
    private static final int UNDEFINED = 2;


    private String email;
    private String password;
    private String nome;
    private int genero;
    private int altura;
    private double peso;
    private LocalDate birthdate;
    private String favsport;

    public Utilizador() {
        email = "";
        password = "";
        nome = "";
        genero = UNDEFINED;
        altura = 0;
        peso = 0;
        birthdate = LocalDate.ofEpochDay(0);
        favsport = "";
    }

    public Utilizador(String nemail, String npassword, String newnome, int ngenero, int naltura, double npeso, LocalDate nbirthdate, String nfavsport) {
        email = nemail;
        password = npassword;
        nome = newnome;
        genero = ngenero;
        altura = naltura;
        peso = npeso;
        birthdate = nbirthdate;
        favsport = nfavsport;
    }

    public Utilizador(Utilizador u) {
        email = u.getEmail();
        password = u.getPassword();
        nome = u.getNome();
        genero = u.getGenero();
        altura = u.getAltura();
        peso = u.getPeso();
        birthdate = u.getBirthdate();
        favsport = u.getFavsport();
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getNome() {
        return nome;
    }

    public int getGenero() {
        return genero;
    }

    public int getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public String getFavsport() {
        return favsport;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public void setFavsport(String favsport) {
        this.favsport = favsport;
    }

    @Override
    public String toString() {
        return "Utilizador: {\nEmail: " + email + "\nPassword: " + password + "\nNome: " + nome + "\nGénero: " + (genero == MALE ? "Male" : (genero == FEMALE ? "Female" : "Undefined")) + "\nAltura (cm): " + altura + "\nPeso (kg): " + peso + "\nData de Nascimento: " + birthdate.toString() + "\nDesporto Favorito: " + favsport;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || o.getClass() != this.getClass()) return false;
        Utilizador u = (Utilizador) o;
        return    (email.equals(u.email)
                && password.equals(u.password)
                && nome.equals(u.nome)
                && genero == u.genero
                && altura == u.altura
                && Double.compare(peso, u.peso) == 0
                && birthdate.equals(u.birthdate)
                && favsport.equals(u.favsport));
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Utilizador(this);
    }
}