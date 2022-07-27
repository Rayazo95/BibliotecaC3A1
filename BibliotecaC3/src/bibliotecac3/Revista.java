package bibliotecac3;

public class Revista{
    String codigo, titulo,año;
    int numero;

    public Revista(String codigo, String titulo, String año, int numero){
        this.codigo = codigo;
        this.titulo = titulo;
        this.año = año;
        this.numero = numero;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return 
        "Revista{" + "codigo='" + codigo + '\'' + ", titulo='" + titulo + '\'' + ", año='" + año + '\'' +", numero=" + numero +'}';
    }
}
