package Domain;

public class Manga extends Recurso implements Prestable{
    public Manga(boolean prestado, String nombre, int copias) {
        super(prestado, nombre, copias);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void prestar() {this.setPrestado(true);}

    @Override
    public void devolver() {this.setPrestado(false);}
}
