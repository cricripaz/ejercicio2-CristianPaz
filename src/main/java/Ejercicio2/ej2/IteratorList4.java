package Ejercicio2.ej2;

import java.util.Stack;

public class IteratorList4 implements Iterator{
    private int position;
    private Stack<Empleado> empleados;

    public IteratorList4(Stack<Empleado> empleados){
        this.position=0;
        this.empleados=empleados;

    }
    @Override
    public Empleado next() {
        return this.empleados.pop();
    }

    @Override
    public boolean hasNext() {
        return this.empleados.empty() && position < this.empleados.size();
    }
}
