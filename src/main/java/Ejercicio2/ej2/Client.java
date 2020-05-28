package Ejercicio2.ej2;


import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) {

        List1 empresa1 = new List1();

        empresa1.add(new Empleado("pedro" ,"perez"));
        empresa1.add(new Empleado("pedro" ,"perez"));
        empresa1.add(new Empleado("pedro" ,"perez"));

        List2 empresa2 = new List2();

        empresa2.add(new Empleado("marco","salgado"));
        empresa2.add(new Empleado("marco","salgado"));
        empresa2.add(new Empleado("marco","salgado"));

        List3 empresa3 = new List3();

        empresa3.add(new Empleado("alejandro","Murillo"));

        empresa3.add(new Empleado("alejandro","Murillo"));

        empresa3.add(new Empleado("alejandro","Murillo"));

        List4 empresa4 = new List4();

        empresa4.add(new Empleado("alex","perez"));

        empresa4.add(new Empleado("alex","perez"));

        empresa4.add(new Empleado("alex","perez"));


        Map<String , Empleado> sistemaCentralizado = new HashMap<String, Empleado>();

        Iterator iterator;


        iterator = empresa1.iterator();
        while (iterator.hasNext()){
           Empleado tmp= iterator.next();
            sistemaCentralizado.put(tmp.getNombre(), tmp);
        }
        /*
        iterator = empresa2.iterator();
        while (iterator.hasNext()){
            Empleado tmp= iterator.next();
            sistemaCentralizado.put(tmp.getNombre(), tmp);
        }


         */
        iterator = empresa3.iterator();
        while (iterator.hasNext()){
            Empleado tmp= iterator.next();
            sistemaCentralizado.put(tmp.getNombre(), tmp);
        }
        iterator = empresa4.iterator();
        while (iterator.hasNext()){
            Empleado tmp= iterator.next();
            sistemaCentralizado.put(tmp.getNombre(), tmp);
        }


        for (String key:sistemaCentralizado.keySet()) {
            System.out.println("Persona Nombre :"+ sistemaCentralizado.get(key).nombre );
            System.out.println("Persona Apellido:"+ sistemaCentralizado.get(key).apellido );
        }




    }
}
