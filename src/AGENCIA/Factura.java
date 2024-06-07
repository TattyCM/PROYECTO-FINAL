package AGENCIA;
import java.util.Scanner;

public class Factura {
    private
	Vendedor Vendedor;
	Cliente Cliente;
	Auto Auto;
	int fecha;

	public

	Factura()
	{
		fecha = 2023;
		Vendedor V = new Vendedor();
		Cliente C = new Cliente();
		Auto A = new Auto();
	}

	Factura(int a)
	{
		fecha = a;
		Vendedor V = new Vendedor();
		Cliente C = new Cliente();
		Auto A = new Auto();
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
