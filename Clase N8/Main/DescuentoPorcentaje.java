package Actividad8;

public class DescuentoPorcentaje extends Descuento {

    public DescuentoPorcentaje(float valor) {
        setValorDesc(valor);
    }

    @Override
    public float valorFinal(float valorInicial) {
        return valorInicial - (valorInicial * this.getValorDesc());
    }

}