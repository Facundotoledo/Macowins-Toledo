class Prenda{
    int precio;
    array tipo;
    Estado estado;
    int descuento;

    int precioPrensa(){
        return estado.precioFinal(precio);
    }
}

class Macowin{
    List ventasHoy;

    void agregarventa(new Venta){
        add Venta -> ventasHoy;
    }

    int gananciasTalDia(fecha){
        return sum(map ventaSegunFecha precio);
    }


}

class Venta{
    FormaDePago medioDePago;
    fecha;
    prendasVendidas[prendaEjemplo(new prenda(...), cant)]

    int precioTotal(){
        return  medioDePago.precioFinal(sum (map prendasVendidas (prenda.precioPrenda * cant)));

    }

}

interface FormaDePago{
    int precioFinal(int precio);
}

class Efectivo implements FormaDePago{
    public int precioFinal(int precio){
        return precio;
    }
}

class TarjetaDeCredito implements FormaDePago{
    int cantidadCuotas;

    public int precioFinal(int precio){
        return cantidadCuotas * precio + precio * 0.1;
    }
}

interface Estado{
    int precioFinal(int precio);
}

class Nuevo implements Estado{
    @java.lang.Override
    public int precioFinal(int precio) {
        return precio;
    }
}

class Promocion implements Estado{
    int descuento;

    @java.lang.Override
    public int precioFinal(int precio) {
        return precio-descuento;
    }
}

class Liquidacion implements Estado{
    @java.lang.Override
    public int precioFinal(int precio) {
        return precio/2;
    }
}