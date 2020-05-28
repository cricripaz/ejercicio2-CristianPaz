package Ejercicio2.ej2;

import java.util.ArrayList;
import java.util.List;

public class List1 implements IAggregateList {

    List<Empleado> empleados;

    public List1 (){
        empleados = new ArrayList<>();
    }
    public void  add (Empleado value){
        empleados.add(value);
    }
    @Override
    public IteratorList1 iterator() {
        return new IteratorList1(this.empleados);
    }
}
