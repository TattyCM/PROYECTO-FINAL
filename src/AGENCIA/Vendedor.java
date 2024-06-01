package AGENCIA;

import java.util.Scanner;

public class Vendedor extends Persona{
    private
    int ID_vendedor;
    int comision;
    int sueldo;

    public

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

}
