package AGENCIA;

import java.util.Scanner;

public class Persona {
    protected //Por ser herencia simple los atributos son protegidos
    String nombre;
    String apellido;
    int ci;

    public

    Persona() //Constructor por defecto
    {
        nombre = "Raul";
        apellido = "Montaño";
        ci = 98324;
    }

    Persona(String a, String b, int c) //Constructor con argumentos
    {
        nombre = a;
        apellido = b;
        ci = c;
    }

    String obtn()
    {return nombre;}
    String obta()
    {return apellido;}
    int obtc()
    {return ci;}

    void ponn(String a)
    {nombre = a; }
    void pona(String a)
    {apellido = a; }
    void ponnc(int a)
    {ci = a; }

    void leer()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nombre: ");
        nombre = sc.next(); //revisar como usar la clase leer
        System.out.println("Introduce apellido: ");
        apellido = sc.next();
        System.out.println("Introduce CI: ");
        ci = sc.nextInt();
    }

    void mostrar()
    {
        System.out.println(nombre + " " + apellido + " " + ci);
    }

}