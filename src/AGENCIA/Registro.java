package AGENCIA;
import java.util.Scanner;

public class Registro {
    private
    int ID_reporte;
    Factura F [] = new Factura[20];
    int nfac; //numero de facturas

    public

    Registro() //Constructor por defecto
    {
        ID_reporte = 001;
        F[1] = new Factura();
    }

    Registro(int a) //Constructor por defecto
    {
        ID_reporte = a;
        F[1] = new Factura();
    }

    //Getters de factura
    int getID_reporte()
    {return ID_reporte;}
    int getNfac() //Getter del vector
    {return nfac;}

    //Setters de factura
    void setID_reporte(int a)
    {ID_reporte = a;}


    void leerR()
    {
        int i;
        System.out.println("ID de reporte: ");
        ID_reporte = Leer.datoInt();
        System.out.println("Numero de facturas: ");
        nfac = Leer.datoInt();
        for (i = 1; i <= nfac; i++)
        {
            F[1] = new Factura();
            F[1].leer();
        }
    }

    void mostrarR()
    {
        int i;
        System.out.println("ID Reporte: "+ ID_reporte+"\nTotal de Facturas: "+ nfac);
        for (i = 1; i <= nfac; i++)
        {
            F[1].mostrarF();
        }
    }


    //Factura
    void VendedorActivo()
    {
        int i;
        for (i = 1; i <= nfac;  i++ )
        {}
    }
}
