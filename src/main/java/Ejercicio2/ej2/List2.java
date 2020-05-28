package Ejercicio2.ej2;


public class List2 implements IAggregateList {

    private int position;
    private Empleado[] empleados;

    public List2(){
        this.position=0;
        empleados = new Empleado[5];
    }

    public void add(Empleado value){
        empleados[position]=value;
        position++;

    }

    @Override
    public IteratorList2 iterator() {
        return new IteratorList2(this.empleados);
    }
}


