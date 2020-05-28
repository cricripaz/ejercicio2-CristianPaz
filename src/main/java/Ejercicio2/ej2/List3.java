package Ejercicio2.ej2;

import java.util.ArrayList;
import java.util.List;

public class List3  implements IAggregateList{
    List<Empleado> empleados;

    public List3(){
        empleados = new ArrayList<>();
    }

    public void add(Empleado value){
        empleados.add(value);
    }

    @Override
    public IteratorList3 iterator() {
        return new IteratorList3(this.empleados);
    }
}
