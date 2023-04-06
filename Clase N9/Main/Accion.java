package Actividad9;

public abstract class Accion {

    protected Programa programa;

    public Accion(Programa programa) {
        this.programa = programa;
    }

    public abstract void EjecutarAccion();

}