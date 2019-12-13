package com.example.listasview;

public class contactos {
    private String Nombre;
    private String Mobile;
    private String Home;
    private String Office;
    private String Titulo;
    private String SubTitulo;


    public contactos(String nombre, String mobile, String home, String office) {
        Nombre = nombre;
        Mobile = mobile;
        Home = home;
        Office = office;
    }

    public contactos(String titulo, String subTitulo) {
        Titulo = titulo;
        SubTitulo = subTitulo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getSubTitulo() {
        return SubTitulo;
    }

    public void setSubTitulo(String subTitulo) {
        SubTitulo = subTitulo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public String getHome() {
        return Home;
    }

    public void setHome(String home) {
        Home = home;
    }

    public String getOffice() {
        return Office;
    }

    public void setOffice(String office) {
        Office = office;
    }
}
