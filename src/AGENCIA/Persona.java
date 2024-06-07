package AGENCIA;

import java.util.Scanner;

public class Persona {
    protected //Por ser herencia simple los atributos son protegidos
    String nombre;
    String apellido;
    int ci;
    String direccion;
    int telefono;
    int fechan;

    public

    Persona() //Constructor por defecto
    {
        nombre = "Raul";
        apellido = "Montaño";
        ci = 98324;
        direccion = "Miraflores";
        telefono = 78965;
        fechan = 2004;
    }

    Persona(String a, String b, int c, String d, int e, int f) //Constructor con argumentos
    {
        nombre = a;
        apellido = b;
        ci = c;
        direccion = d;
        telefono = e;
        fechan = f;
    }

    String getNombre()
    {return nombre;}
    String getApellido()
    {return apellido;}
    int getCi()
    {return ci;}
    String getDireccion ()
    {return direccion;}
    int getTelefono ()
    {return telefono;}
    int getFechan ()
    {return fechan;}

    void setNombre (String a)
    {nombre = a; }
    void setApellido (String a)
    {apellido = a; }
    void setCi (int a)
    {ci = a;}
    void setDireccion (String a)
    {apellido = a;}
    void setTelefono (int a)
    {telefono = a;}
    void setFechan (int a)
    {fechan = a;}

    void leer()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nombre: ");
        nombre = Leer.dato();
        System.out.println("Introduce apellido: ");
        apellido = Leer.dato();
        System.out.println("Introduce CI: ");
        ci = Leer.datoInt();
        System.out.println("Introduce Fecha de nacimiento: ");
        fechan = Leer.datoInt();
        System.out.println("Introduce Direccion: ");
        direccion = Leer.dato();
        System.out.println("Introduce Telefono: ");
        telefono = Leer.datoInt();
    }

    void mostrar()
    {System.out.println(nombre + " " + apellido + " " + ci + " " + direccion + " " + telefono);}

    int edad(Persona X) //Es una funcion, por lo tanto al momento de comparar se le llama como tal
    {return 2024 - fechan;}

}