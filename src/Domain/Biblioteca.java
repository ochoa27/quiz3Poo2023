package Domain;

import Excepciones.VerificarRecursoCopiableExcepcion;
import Excepciones.VerificarRecursoDevolverExcepcion;
import Excepciones.VerificarRecursoPrestarExcepcion;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    List<Recurso>recursos=new ArrayList<>();
    public void addRecurso(Recurso recurso){
        this.recursos.add(recurso);
    }
    public boolean prestarRecurso(Recurso recurso){
        verificarPrestable(recurso);
        ((Prestable)recurso).prestar();
        return true;
    }
    public boolean devolverRecurso(Recurso recurso) {
        verificarDevolver(recurso);
        ((Prestable) recurso).devolver();
        return true;
    }

    public boolean fotocopiarRecurso(Recurso recurso){
        boolean respuestaReturn;
        verificarCopiable(recurso);
        if(recurso.isPrestado()==true){
            respuestaReturn=false;
        } else{
            ((Copiable)recurso).fotocopiar();
            respuestaReturn=true;
        }

        return respuestaReturn;
    }
    public void listarPrestados() {
        List<Recurso>listaprestados=new ArrayList<>();
        for (Recurso item:recursos){
            if (item.isPrestado()==true){
                listaprestados.add(item);
            }
        }
        System.out.println(listaprestados.toString());
    }
    public void listarCopiasPorRecurso(){
       for (Recurso item:recursos){
//           verificarCopiable(item);
           if(item instanceof Copiable){
               System.out.println("el "+item.getNombre()+", se ha fotocopiado "+item.getCopias()+ " veces");
           }
       }
    }

    public List<Recurso> getRecursos() {
        return recursos;
    }

    public void setRecursos(List<Recurso> recursos) {
        this.recursos = recursos;
    }
    public void verificarPrestable(Recurso recurso){
    if (!(recurso instanceof Prestable) || (recurso.isPrestado()==true)){
        throw new VerificarRecursoPrestarExcepcion("este recurso no puede prestar");
        }
    }

    public void verificarDevolver(Recurso recurso){
        if(!(recurso instanceof Prestable)|| (recurso.isPrestado()==false)){
            throw new VerificarRecursoDevolverExcepcion("este recurso no puede ser devuelto");
        }
    }
    public void verificarCopiable(Recurso recurso){
        if(!(recurso instanceof Copiable)){
            throw new VerificarRecursoCopiableExcepcion("este recuerso no es copiable");
        }
    }
}
