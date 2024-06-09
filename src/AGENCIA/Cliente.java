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

    Cliente(String a, String b, int c, int d, String e, int f, int g)
    {
        super(a, b, c, d, e);
    	ID_Cliente = f;
    	presupuesto = g;
    }

    //Getters heredados de persona
    String getNombre()
    {return super.getNombre();}
    String getApellido()
    {return super.getApellido();}
    int getCi()
    {return super.getCi();}
    int getTelefono()
    {return super.getTelefono();}
    String getDireccion()
    {return super.getDireccion();}
    //Getters de cliente
    int getID_Cliente()
    {return ID_Cliente;}
    int getPresupuesto()
    {return presupuesto;}

    //Setters heredados de persona
    void setNombre(String a)
    {super.setNombre(a);}
    void setApellido(String a)
    {super.setApellido(a);}
    void setCi(int a)
    {super.setCi(a);}
    void setTelefono(int a)
    {super.setTelefono(a);}
    //Setters de cliente
    void setID_Cliente(int a)
    {ID_Cliente = a;}
    void setPresupuesto(int a)
    {presupuesto = a;}

    void leerC()
    {
        super.leer();
        System.out.println("Introduce ID de Cliente: ");
        ID_Cliente = Leer.datoInt();
        System.out.println("Introduce presupuesto: ");
        presupuesto = Leer.datoInt();
    }

    void mostrarC()
    {
        super.mostrar();
        System.out.println(ID_Cliente + " " + presupuesto);
    }

    void comprar()
    {System.out.println("Me lo llevo");}

}
