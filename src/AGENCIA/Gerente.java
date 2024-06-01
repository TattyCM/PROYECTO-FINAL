package AGENCIA;

import java.util.Scanner;

public class Gerente {
    private
    int ID_Gerente;
    int comisionG;
    int sueldoG;

    public

    int obtIG()
    {return ID_Gerente;}
    int obtC()
    {return comisionG;}
    int obtS()
    {return sueldoG;}

    void ponI(int a)
    {ID_Gerente = a;}
    void ponC(int a)
    {comisionG = a;}
    void ponS(int a)
    {sueldoG = a;}


    void leerV()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce ID de Vendedor: ");
        ID_Gerente = Leer.datoInt();
        System.out.println("Introduce Comision: ");
        comisionG = Leer.datoInt();
        System.out.println("Introduce sueldo: ");
        sueldoG = Leer.datoInt();
    }

    void mostrarV()
    {
        System.out.println(ID_Gerente + " " + sueldoG + " " + sueldoG);
    }
}
