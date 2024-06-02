package AGENCIA;

public class Auto {
    private
    String marca;
    String modelo;
    String color;
    int precio;
    int descuento;
    String caja;
    String maletera;
    int capacidadMotor;
    String tipoCombustible;

    public

    Auto()
    {
    	marca = "Toyota";
    	modelo ="Corolla";
    	color ="Azul";
    	precio = 25000;
    	descuento = 2000;
    	caja = "Manual";
    	maletera = "Grande" ;
    	capacidadMotor = 1800 ;
    	tipoCombustible = "Gasolina" ;
    }

    Auto(int d, int e, String f, String g, int h,String i)
	{
		marca= "Toyota";
		modelo= "Hilux";
		color= "Rojo";
		precio= d;
		descuento= e;
		caja= f;
		maletera= g;
		capacidadMotor = h;
		tipoCombustible = i;
	}

	Auto( String f, String g, int h,String i)
	{
		marca= "Toyota";
		modelo = "RAV-4 Aqya";
		color= "Gris";
		precio= 200000;
		descuento= 15000;
		caja= f;
		maletera= g;
		capacidadMotor = h;
		tipoCombustible = i;
	}

    Auto(String a, String b, String c, int d, int e, String f, String g, int h, String i){
    	marca = a;
    	modelo = b;
    	color = c;
    	precio = d;
    	descuento = e ;
    	caja = f;
    	maletera = g;
    	capacidadMotor = h ;
    	tipoCombustible = i ;
    }

    String obtMarca() {
        return marca;
    }
    String obtModelo() {
        return modelo;
    }
    String obtColor() {
        return color;
    }
    int obtPrecio() {
        return precio;
    }
    int obtDescuento() {
        return descuento;
    }
    String obtCaja() {
        return caja;
    }
    String obtMaletera() {
        return maletera;
    }
    int obtCapacidadMotor() {
        return capacidadMotor;
    }
    String obtTipoCombustible() {
        return tipoCombustible;
    }



    void ponMarca(String a) {
        this.marca = a;
    }
    void ponModelo(String a) {
        this.modelo = a;
    }
    void ponColor(String a) {
        this.color = a;
    }
    void ponPrecio(int a) {
        this.precio = a;
    }
    void ponDescuento(int a) {
        this.descuento = a;
    }
    void ponCaja(String a) {
        this.caja = a;
    }
    void ponMaletera(String a) {
        this.maletera = a;
    }
    void ponCapacidadMotor(int a) {
        this.capacidadMotor = a;
    }
    void ponTipoCombustible(String a) {
        this.tipoCombustible = a;
    }


    void leer() {
        System.out.println("Ingrese la marca del auto: ");
        marca=Leer.dato();
        System.out.println("Ingrese el modelo del auto: ");
        modelo=Leer.dato();
        System.out.println("Ingrese el color del auto: ");
        color=Leer.dato();
        System.out.println("Ingrese el precio del auto: ");
        precio=Leer.datoInt();
        System.out.println("Ingrese el descuento del auto: ");
        descuento=Leer.datoInt();
        System.out.println("Ingrese el tipo de caja del auto: ");
        caja=Leer.dato();
        System.out.println("Ingrese el tipo de maletera del auto: ");
        maletera=Leer.dato();
        System.out.println("Ingrese la capacidad del motor del auto: ");
        capacidadMotor=Leer.datoInt();
        System.out.println("Ingrese el tipo de combustible del auto: ");
        tipoCombustible=Leer.dato();
    }

    void mostrar() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Precio: " + precio);
        System.out.println("Descuento: " + descuento);
        System.out.println("Caja: " + caja);
        System.out.println("Maletera: " + maletera);
        System.out.println("Capacidad del motor: " + capacidadMotor);
        System.out.println("Tipo de combustible: " + tipoCombustible);
    }

    void arrancar() {
        System.out.println("Arrancando el auto...");
    }

    void acelerar() {
        System.out.println("Acelerando el auto...");
    }

    void frenar() {
        System.out.println("Frenando el auto...");
    }

    //METODO A REVISAR
    void mismoPre(Auto A)
	{
		if(precio==A.obtPrecio())
		{System.out.println("Tienen el mismo precio");}
		else {System.out.println("Tienen distintos precio");}
	}

    int PrecioFinal()
	{return precio - descuento;}
    int ObtenerFinal(Auto automovil)
	{return automovil.PrecioFinal();}

}