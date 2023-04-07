package Chat;

public abstract class Accion {

    protected Programa programa;

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }

    public abstract void EjecutarAccion();

}
