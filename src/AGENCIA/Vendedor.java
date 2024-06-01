package AGENCIA;

import java.util.Scanner;

public class Vendedor extends Persona{
    private
    int ID_vendedor;

    public
    int obtI()
    {return ID_vendedor;}

    void leerV()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce ID de Vendedor: ");
        ID_vendedor = sc.nextInt();
    }

    void mostrarV()
    {
        System.out.println(ID_vendedor);
    }

}
