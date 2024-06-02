package AGENCIA;

import java.util.Scanner;

public class Cliente extends Persona{
    private
    int ID_Cliente;
    int presupuesto;

    public

    Cliente()
    {
        super ();
    	ID_Cliente=2001;
    	presupuesto=20000;
    }

    Cliente(int a, int b)
    {
        super();
    	ID_Cliente = a;
    	presupuesto = b;
    }

    Cliente(String a , String b, int c,int d, int e)
    {
    	super.ponn(a);
    	super.pona(b);
    	super.ponnc(c);
    	ID_Cliente = d;
    	presupuesto = e;
    }

    int obtIC()
    {return ID_Cliente;}
    int obtp()
    {return presupuesto;}
    void ponIC(int a)
    {ID_Cliente = a;}
    void ponp(int a)
    {presupuesto = a;}

    //Setters de herencia de persona
    void ponNombre(String a)
    {super.ponn(a);}
    void ponApellido(String a)
    {super.pona(a);}
    void ponCi(int a)
    {super.ponnc(a);}

    void leerC()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce ID de Cliente: ");
        ID_Cliente = Leer.datoInt();
        System.out.println("Introduce presupuesto: ");
        presupuesto = Leer.datoInt();
    }

    void mostrarC()
    {
        System.out.println(ID_Cliente + " " + presupuesto);
    }

    //METODOS REVISAR
    void Asesoramiento()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce presupuesto: ");

    }


}
