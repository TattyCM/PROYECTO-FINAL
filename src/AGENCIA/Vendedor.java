package AGENCIA;

import java.util.Scanner;

public class Vendedor extends Persona{
    private
    int ID_vendedor;
    int comision;
    int sueldo;

    public

    Vendedor()
    {
    	super();
    	ID_vendedor = 12345;
    	comision = 2000;
    }

    Vendedor(int a, int b)
    {
    	super();
    	ID_vendedor = a;
    	comision = b;
    }
    Vendedor(String a , String b, int c,int d, int e){
    	super.ponn(a);
    	super.pona(b);
    	super.ponnc(c);
    	ID_vendedor = d;
    	comision = e;
    }

    int obtI()
    {return ID_vendedor;}
    int obtC()
    {return comision;}
    int obtS()
    {return sueldo;}

    void ponI(int a)
    {ID_vendedor = a;}
    void ponC(int a)
    {comision = a;}
    void ponS(int a)
    {sueldo = a;}
    void ponNombre(String a)
    {super.ponn(a);}
    void ponApellido(String a)
    {super.pona(a);}
    void ponCi(int a)
    {super.ponnc(a);}


    void leerV()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce ID de Vendedor: ");
        ID_vendedor = Leer.datoInt();
        System.out.println("Introduce Comision: ");
        comision = Leer.datoInt();
        System.out.println("Introduce sueldo: ");
        sueldo = Leer.datoInt();
    }

    void mostrarV()
    {
        System.out.println(ID_vendedor + " " + sueldo + " " + sueldo);
    }

    //METODOS REVISAR

}
