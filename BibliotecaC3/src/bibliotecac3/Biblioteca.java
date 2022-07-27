package bibliotecac3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Biblioteca {

    public static void main(String[] args) {
        ArrayList<Libro> listaLibro = new ArrayList<>();
        ArrayList<Revista> listaRevista = new ArrayList<>();
        ArrayList<Libro> libroPrestado = new ArrayList<>();
        
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        
        String codigo,titulo, año;
        int opcion;

        do{
            System.out.println("1.- Crear Libro");
            System.out.println("2.- Crear Revista ");
            System.out.println("3.- Prestar libro");
            System.out.println("4.- Lista de libros prestados");
            System.out.println("5.- Devolver libro");
            System.out.println("6.- Salir");
            opcion = Integer.parseInt(teclado.nextLine());

            switch(opcion){
                
                case 1:
                    System.out.println("Titulo: ");
                    titulo = teclado.nextLine();
                    System.out.println("Fecha de publicacion: ");
                    año = teclado.nextLine();
                    codigo = String.valueOf(random.nextInt());
                    listaLibro.add(new Libro(codigo,titulo,año));
                    break;
                    
                case 2:
                    int numero;
                    System.out.println("Titulo: ");
                    titulo = teclado.nextLine();
                    System.out.println("Fecha de publicacion: ");
                    año = teclado.nextLine();
                    System.out.println("Numero de revista: ");
                    numero = teclado.nextInt();
                    codigo = String.valueOf(random.nextInt());

                    listaRevista.add(new Revista(codigo,titulo,año,numero));
                    break;
                    
                case 3:
                    libroPrestado.add(Prestable.prestar(listaLibro));
                    break;
                    
                case 4:
                    Prestable.prestado(libroPrestado);
                    break;
                    
                case 5:
                    libroPrestado.remove(Prestable.devolver(libroPrestado));
                    break;
                    
                case 6:
                        System.exit(0);
                        break;
                default:
                    System.out.println("El numero de opcion no fue encontrado, por favor intentelo de nuevo");
                    break;
            }

        }while(opcion != 6);
    }
    
}

