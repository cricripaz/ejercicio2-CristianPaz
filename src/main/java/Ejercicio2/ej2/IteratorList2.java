package Ejercicio2.ej2;

public class IteratorList2 implements Iterator{


    private int position=0;
    private Empleado[] empleados;

    public IteratorList2 (Empleado[] empleados){
        this.empleados=empleados;

    }
    @Override
    public Empleado next()
    {
        return this.empleados[position++];
    }

    @Override
    public boolean hasNext() {

        return this.empleados.length != 0 && position < this.empleados.length;
    }
}
