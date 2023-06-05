package App;

import Domain.*;
import Excepciones.VerificarRecursoCopiableExcepcion;
import Excepciones.VerificarRecursoDevolverExcepcion;
import Excepciones.VerificarRecursoPrestarExcepcion;

public class AppBiblioteca {
    public static void main(String[] args) {
        try{
            Biblioteca biblioteca1 = new Biblioteca();
            Recurso libro1 = new Libro(false, "la rana", 2);
            Recurso libro2 = new Libro(true, "el graduado", 3);
            Recurso tesis1 = new Tesis("la inmobiliaria", 1);
            Recurso tesis2 = new Tesis("la aplicacion", 5);
            Recurso revista1 = new Revista(true, "Qhubo", 55);
            Recurso revista2 = new Revista(false, "elcomercial", 88);
            Recurso revista3 = new Revista(true, "elcomercial2", 78);
            biblioteca1.addRecurso(revista3);
            biblioteca1.addRecurso(libro1);
            biblioteca1.addRecurso(libro2);
            biblioteca1.addRecurso(tesis1);
            biblioteca1.addRecurso(tesis2);
            biblioteca1.addRecurso(revista1);
            biblioteca1.addRecurso(revista2);

            System.out.println("la lista de recursos es::::");

            for (Recurso item : biblioteca1.getRecursos()) {
                System.out.println(item.toString());
            }

//            biblioteca1.prestarRecurso(revista1);

            biblioteca1.prestarRecurso(revista2);
            System.out.println(revista2.isPrestado());
            biblioteca1.devolverRecurso(revista1);
            System.out.println(revista1.isPrestado());
//            biblioteca1.devolverRecurso(revista1);
            biblioteca1.fotocopiarRecurso(tesis1);
            System.out.println("se fotocopio, el numero nuevo de fotocopia es"+tesis1.getCopias());
//            biblioteca1.fotocopiarRecurso(revista1);
            biblioteca1.listarPrestados();
            biblioteca1.listarCopiasPorRecurso();

        } catch (VerificarRecursoCopiableExcepcion excepcion) {
            excepcion.printStackTrace();
            System.out.println(excepcion.getMessage());
        }catch (VerificarRecursoPrestarExcepcion excepcion){
            excepcion.printStackTrace();
            System.out.println(excepcion.getMessage());
        }catch (VerificarRecursoDevolverExcepcion excepcion){
            excepcion.printStackTrace();
            System.out.println(excepcion.getMessage());

        }
    }
}
