package Ejercicio2.ej2;

import java.util.Stack;

public class List4 implements IAggregateList{

    Stack<Empleado> empleados;

    public List4 (){
        empleados = new Stack<>();
    }

    public void add (Empleado value ){
        empleados.push(value);

    }

    @Override
    public IteratorList4 iterator() {
        return new IteratorList4(this.empleados);
    }
}
