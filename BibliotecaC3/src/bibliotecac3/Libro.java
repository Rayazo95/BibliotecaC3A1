package bibliotecac3;

import java.util.ArrayList;

public class Libro implements Prestable{

    int id;
    String codigo,Titulo,año;
    public static int contador;
    public static boolean prestado;
    
    public Libro(String codigo, String titulo, String año)
    {
        this.codigo = codigo;
        this.Titulo = titulo;
        this.año = año;
        this.prestado = false;
        this.id = ++contador;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public int getId()
    {
        return id;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public static void imprimirlistaLibros(ArrayList<Libro> lista)
    {
        String estanteria = "";

        //Recorrer arreglos
        for (Libro l: lista) {
            estanteria += "Id: " + l.getId() + "\t" + "Titulo: " + l.getTitulo() + "\t" + "Fecha de publicacion: " + l.getAño() + "\t" + " Codigo de libro: " + l.getCodigo() + "\n";
        }
        System.out.println(estanteria);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "codigo='" + codigo + '\'' +
                ", titulo='" + Titulo + '\'' +
                ", año='" + año + '\'' +
                ", prestado=" + prestado +
                '}';
    }
}
