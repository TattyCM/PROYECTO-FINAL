package AGENCIA;

import java.util.Scanner;

public class Cliente extends Persona{
    private
    int ID_Cliente;
    int presupuesto;

    public

    int obtIC()
    {return ID_Cliente;}
    int obtp()
    {return presupuesto;}
    void ponIC(int a)
    {ID_Cliente = a;}
    void ponp(int a)
    {presupuesto = a;}

    void leerC()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce ID de Cliente: ");
        ID_Cliente = sc.nextInt();
        System.out.println("Introduce presupuesto: ");
        presupuesto = sc.nextInt();
    }

    void mostrarC()
    {
        System.out.println(ID_Cliente + " " + presupuesto);
    }



}
