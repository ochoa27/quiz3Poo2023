package Domain;

public class Libro extends Recurso implements Copiable,Prestable{
    public Libro(boolean prestado, String nombre, int copias) {
        super(prestado, nombre, copias);
    }



    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void fotocopiar() {
    this.setCopias(this.getCopias()+1);
    }

    @Override
    public void prestar() {this.setPrestado(true);}

    @Override
    public void devolver() {this.setPrestado(false);}
}
