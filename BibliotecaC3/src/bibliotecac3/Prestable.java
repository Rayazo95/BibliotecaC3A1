package bibliotecac3;

import java.util.ArrayList;
import java.util.Scanner;

public interface Prestable{

    Scanner opcion = new Scanner(System.in);
    public static Libro prestar(ArrayList<Libro> listaLib){
        
        Libro.imprimirlistaLibros(listaLib);
        System.out.println("Ingrese el id del libro: ");
        int op = Integer.parseInt(opcion.nextLine());
        listaLib.get(op -1).setPrestado(true);
        return listaLib.get(op -1);
    }
    
    public static Libro devolver(ArrayList<Libro> listaDevolver){
        
        Libro.imprimirlistaLibros(listaDevolver);
        System.out.println("Ingrese la posicion del elemento del libro que desee devolver: \n" + "NOTA: Recuerde que se inicia desde 0, no 1");
        int op = Integer.parseInt(opcion.nextLine());
        return listaDevolver.remove(op);
    }
    
    public static void prestado(ArrayList<Libro> prestados){
        
        String librosPrestados = "";
        for (Libro l: prestados) {
            librosPrestados += "Id: " + l.getId() + "\t" + "Titulo: " + l.getTitulo() + "\t" + "Fecha de publicacion: " + l.getAño() + "\t" + " Codigo de libro: " + l.getCodigo() + "\n";
        }
        System.out.println(librosPrestados);
    }
}
