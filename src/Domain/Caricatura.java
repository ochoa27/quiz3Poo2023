package Domain;

public class Caricatura extends Recurso implements Copiable{


    public Caricatura(String nombre, int copias) {
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
