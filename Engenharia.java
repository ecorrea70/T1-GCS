import Departamentos.Departamento;

public class Engenharia extends Departamento{
    public double getValor() {
        return valor;
    }

    double valor= 60;
    Engenharia(){
        super(60, "Departamento de Engenharia");
    }

}
