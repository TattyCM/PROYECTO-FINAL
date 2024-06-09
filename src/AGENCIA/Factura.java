package AGENCIA;
import java.util.Scanner;

public class Factura {
    private
	Vendedor Vendedor;
	Cliente Cliente; //El nombre de un cliente puede ir en mas facturas
	Auto Auto;
	int fecha;
	int impuestos;

	public

	Factura()
	{
		fecha = 2023;
		Vendedor V = new Vendedor();
		Cliente C = new Cliente();
		Auto A = new Auto();
		impuestos = 15;
	}

	Factura(int a, int b)
	{
		fecha = a;
		Vendedor V = new Vendedor();
		Cliente C = new Cliente();
		Auto A = new Auto();
		impuestos = b;
	}

	//Getters agregados
	Vendedor getVendedor()
	{return Vendedor;}
	Cliente getCliente()
	{return Cliente;}
	Auto getAuto()
	{return Auto;}
	//Getters de factura
	int getFecha()
	{return fecha;}
	int getImpuestos()
	{return impuestos;}

	//Setters agregados
	void setVendedor(AGENCIA.Vendedor vendedor)
	{Vendedor = vendedor;}
	void setCliente(AGENCIA.Cliente cliente)
	{Cliente = cliente;}
	void setAuto(AGENCIA.Auto auto)
	{Auto = auto;}
	//Setters de factura
	void setFecha(int a)
	{fecha = a;}
	void setImpuestos(int a)
	{impuestos = a;}

	void leer()
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el Vendedor: ");
		Vendedor.leerV();
        System.out.print("Introduce el Cliente: ");
        Cliente.leerC();
        System.out.print("Introduce el Auto: ");
        Auto.leerA();
        System.out.print("Introduce fecha: ");
        fecha = Leer.datoInt();
    }

	void mostrarF()
	{
		Vendedor.mostrarV();
		Cliente.leerC();
		Auto.mostrarA();
		System.out.println(fecha);
	}

	void precioFinal(Auto Auto)
	{
		int pf;
		pf = Auto.precio - Auto.descuento + impuestos;
		System.out.println("Precio final: "+pf);
	}

}
