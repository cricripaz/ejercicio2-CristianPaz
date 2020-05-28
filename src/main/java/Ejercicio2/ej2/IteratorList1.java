package Ejercicio2.ej2;

import java.util.List;

public class IteratorList1 implements Iterator{
    private int position;
    private List<Empleado> nombre;


    public IteratorList1(List<Empleado> nombre){
        this.nombre=nombre;
        this.position=0;

    }
    @Override
    public Empleado next() {
        return this.nombre.get(position++);
    }

    @Override
    public boolean hasNext() {
        return this.nombre.size() != 0 && position<this.nombre.size();
    }
}
