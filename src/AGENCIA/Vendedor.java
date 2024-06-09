package AGENCIA;

import java.util.Scanner;

public class Vendedor extends Persona{
    private
    int ID_vendedor;
    int meta;
    int año_ingreso;

    public

    Vendedor()
    {
    	super();
    	ID_vendedor = 12345;
    	meta = 200000;
        año_ingreso = 2001;
    }

    Vendedor(String a, String b, int c, int d)
    {
    	super(a, b, c, d);
    	ID_vendedor = 12345;
    	meta = 500000;
        año_ingreso = 2012;
    }

    Vendedor(String a, String b, int c, int d, int e, int f, int g)
    {
    	super(a, b, c, d);
    	ID_vendedor = e;
    	meta = f;
        año_ingreso = g;
    }

    //getters heredados de persona
    String getNombre()
    {return super.getNombre();}
    String getApellido()
    {return super.getApellido();}
    int getCi()
    {return super.getCi();}
    int getTelefono()
    {return super.getTelefono();}
    //getters de vendedor
    int getID_vendedor()
    {return ID_vendedor;}
    int getMeta()
    {return meta;}
    int getAño_ingreso()
    {return año_ingreso;}

    //setters heredados de persona
    void setNombre(String a)
    {super.setNombre(a);}
    void setApellido(String a)
    {super.setApellido(a);}
    void setCi(int a)
    {super.setCi(a);}
    void setTelefono(int a)
    {super.setTelefono(a);}
    //setters de vendedor
    void setID_vendedor(int a)
    {ID_vendedor = a;}
    void setMeta(int a)
    {meta = a;}
    void setAño_ingreso(int a)
    {año_ingreso = a;}

    void leerV() //puede tener el mismo nombre que en persona, no se confunde de metodo
    {
        super.leer();
        System.out.println("Introduce ID de Vendedor: ");
        ID_vendedor = Leer.datoInt();
        System.out.println("Introduce Meta: ");
        meta = Leer.datoInt();
        System.out.println("Introduce Año de ingreso: ");
        año_ingreso = Leer.datoInt();
    }

    void mostrarV()
    {System.out.println(ID_vendedor + " " + meta);}

    //METODOS REVISAR
    void ofrecer()
    {System.out.println("Quetal, puedo ayudarl@? Le comento que tenemos variedad de modelos");}

    int antiguedad()
    {return 2024 - año_ingreso;}
}
