package Domain;

public abstract class Recurso {
    private boolean prestado;
    private String nombre;
    private int copias;

    public Recurso(boolean prestado, String nombre, int copias) {
        this.prestado = prestado;
        this.nombre = nombre;
        this.copias = copias;
    }

    public Recurso(String nombre, int copias) {
        this.nombre = nombre;
        this.copias = copias;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCopias() {
        return copias;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    @Override
    public String toString() {
        return "Recurso{" +
                "prestado=" + prestado +
                ", nombre='" + nombre + '\'' +
                ", copias=" + copias +
                '}';
    }
}
