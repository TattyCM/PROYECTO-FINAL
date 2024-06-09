package AGENCIA;

public class Auto {
    private
    String marca;
    String modelo;
    String color;
    int año;
    int precio;
    int descuento; //tasa de descuento
    String caja; //tipo de caja automatico, mecanico
    int maletera; //para trabajar con No = 0 y Si = 1
    int capacidad_Motor; //El tamaño del motor se mide en litros
    String tipo_Combustible; //gas, gasolina, diesel, electricos
    String matricula; //la matricula es unica para cada auto

    public

    Auto()
    {
    	marca = "Toyota";
        modelo = "Hilux";
        color = "Rojo";
        año = 2021;
        precio = 200000;
        descuento = 15;
        caja = "automatico";
        maletera = 1;
        capacidad_Motor = 5;
        tipo_Combustible = "gas";
        matricula = "A98h34";
    }

    Auto(String a, String b, String c, int d, int e, int f, String g, int h, int i, String j, String k)
	{
		marca = a;
        modelo = b;
        color = c;
        año = d;
        precio = e;
        descuento = f;
        caja = g;
        maletera = h;
        capacidad_Motor = i;
        tipo_Combustible = j;
        matricula = k;
	}

    //Constructor para la factura
	Auto(String a, String b, String c, int d, int e, int f, String g)
	{
		marca = a;
        modelo = b;
        color = c;
        año = d;
        precio = e;
        descuento = f;
        matricula = g;
	}

    //Getters de auto
    String getMarca()
    {return marca;}
    String getModelo()
    {return modelo;}
    String getColor()
    {return color;}
    int getAño()
    {return año;}
    int getPrecio()
    {return precio;}
    int getDescuento()
    {return descuento;}
    String getCaja()
    {return caja;}
    int getMaletera()
    {return maletera;}
    int getCapacidad_Motor()
    {return capacidad_Motor;}
    String getTipo_Combustible()
    {return tipo_Combustible;}
    String getMatricula()
    {return matricula;}

    //Setters de auto
    void setMarca(String a)
    {marca = a;}
    void setModelo(String a)
    {modelo = a;}
    void setColor(String a)
    {color = a;}
    void setAño(int a)
    {año = a;}
    void setPrecio(int a)
    {precio = a;}
    void setDescuento(int a)
    {descuento = a;}
    void setCaja(String a)
    {caja = a;}
    void setMaletera(int a)
    {maletera = a;}
    void setCapacidad_Motor(int a)
    {capacidad_Motor = a;}
    void setTipo_Combustible(String a)
    {tipo_Combustible = a;}
    void setMatricula(String a)
    {matricula = a;}


    void leerA()
    {
        System.out.println("Marca: ");
        marca = Leer.dato();
        System.out.println("Modelo: ");
        modelo = Leer.dato();
        System.out.println("Color: ");
        color = Leer.dato();
        System.out.println("Año: ");
        año = Leer.datoInt();
        System.out.println("Precio: ");
        precio = Leer.datoInt();
        System.out.println("Descuento: ");
        descuento = Leer.datoInt();
        System.out.println("Caja: ");
        caja = Leer.dato();
        System.out.println("Maletera: ");
        maletera = Leer.datoInt();
        System.out.println("Capacidad del motor: ");
        capacidad_Motor = Leer.datoInt();
        System.out.println("Tipo de combustible: ");
        tipo_Combustible = Leer.dato();
    }

    void mostrarA()
    {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Precio: " + precio);
        System.out.println("Descuento: " + descuento);
        System.out.println("Caja: " + caja);
        System.out.println("Maletera: " + maletera);
        System.out.println("Capacidad del motor: " + capacidad_Motor);
        System.out.println("Tipo de combustible: " + tipo_Combustible);
    }

    void arrancar()
    {System.out.println("Arrancando el auto...");}

    void acelerar()
    {System.out.println("Acelerando el auto...");}

    void frenar()
    {System.out.println("Frenando el auto...");}

    int PrecioFinal()
	{return precio - descuento;}

    //Este metodo puede ir a sala de exhibicion
    void comparaPrecio(Auto A)
	{
		if(precio == A.getPrecio())
		{System.out.println("Tienen el mismo precio");}
		else
        {System.out.println("Tienen distintos precio");}
	}


}