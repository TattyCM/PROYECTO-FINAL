package AGENCIA;

import java.util.Scanner;

public class Vendedor extends Persona{
    private
    int ID_vendedor;
    int cuota;
    int sueldo;
    int año_ingreso;

    public

    Vendedor()
    {
    	super();
    	ID_vendedor = 12345;
    	cuota = 200000;
        sueldo = 2000;
        año_ingreso = 2001;
    }

    Vendedor(int a, int b, int c, int d)
    {
    	super();
    	ID_vendedor = a;
    	cuota = b;
        sueldo = c;
        año_ingreso = d;
    }

    Vendedor(String a , String b, int c,int d, int e, int f, int g)
    {
    	super.ponn(a);
    	super.pona(b);
    	super.ponnc(c);
    	ID_vendedor = d;
    	cuota = e;
        sueldo = f;
        año_ingreso = g;

    }

    int obtI()
    {return ID_vendedor;}
    int obtC()
    {return cuota;}
    int obtS()
    {return sueldo;}

    void ponI(int a)
    {ID_vendedor = a;}
    void ponC(int a)
    {cuota = a;}
    void ponS(int a)
    {sueldo = a;}
    void ponNombre(String a)
    {super.ponn(a);}
    void ponApellido(String a)
    {super.pona(a);}
    void ponCi(int a)
    {super.ponnc(a);}


    void leerV() //puede tener el mismo nombre que en persona, no se confunde de metodo
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce ID de Vendedor: ");
        ID_vendedor = Leer.datoInt();
        System.out.println("Introduce Comision: ");
        cuota = Leer.datoInt();
        System.out.println("Introduce sueldo: ");
        sueldo = Leer.datoInt();
    }

    void mostrarV()
    {
        System.out.println(ID_vendedor + " " + sueldo + " " + sueldo);
    }

    //METODOS REVISAR

}
