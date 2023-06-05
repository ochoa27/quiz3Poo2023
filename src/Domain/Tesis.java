package Domain;

public class Tesis extends Recurso implements Copiable{


    public Tesis(String nombre, int copias) {
        super(nombre, copias);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void fotocopiar() {
    this.setCopias(this.getCopias()+1);
    }

}
