package AGENCIA;

import java.util.Scanner;
public class Factura {
    private
	String vendedor; //Vector?
	String cliente; //Vector?
	String auto; //Vector?
	int fecha;
	String matricula;

	public

	Factura()
	{
		vendedor="Agn. Mario Ortiz Guerra";
		cliente="Manuel Villa Zambrana";
		auto="Toyota Hilux";
		fecha=05/01/2024;
		matricula="H26-6PC";

	}
	Factura(String a, String b, String c, int d, String e)
	{
		vendedor=a;
		cliente=b;
		auto=c;
		fecha=d;
		matricula=e;

	}

	String obtVen()
	{return (vendedor);}
	String obtCli()
	{return (cliente);}

	String obtAuto()
	{return (auto);}
	int obtfe()
	{return (fecha);}
	String obtMat()
	{return (matricula);}

	void ponVen(String a)
	{vendedor = a;}
	void ponCli(String a)
	{cliente = a;}
	void ponAuto(String a)
	{auto = a;}
	void ponFecha(int a)
	{fecha = a;}
	void ponMat(String a)
	{matricula = a;}

	void leer()
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el Vendedor: ");
        vendedor = scanner.nextLine();
        System.out.print("Introduce el Cliente: ");
        cliente = scanner.nextLine();
        System.out.print("Introduce el Auto: ");
        auto = scanner.nextLine();
        System.out.print("Introduce el Matricula: ");
        matricula= scanner.nextLine();
        scanner.nextLine();
        System.out.print("Introduce fecha: ");
        fecha = scanner.nextInt();
    }




	void mostrar()
	{
		System.out.println(vendedor +" "+ cliente +" "+ auto + " "+ fecha +" "+ matricula);
	}

    //Revisar si puede tener mas metodos
	//metodo precio final

}
