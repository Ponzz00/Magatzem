package magatzem;

public class Articulo {
private String codigo="";
private String descripcion;
private double precioCompra;
private double precioVenta;
private int stock;



public Articulo(String codigo, String descripcion, double precioCompra, double precioVenta, int stock)
{
	this.codigo = codigo;
	this.descripcion = descripcion;
	this.precioCompra = precioCompra;
	this.precioVenta = precioVenta;
	this.stock = stock;
}
public String getCodigo() {
	return codigo;
}
public void setCodigo(String codigo) {
	this.codigo = codigo;
}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}
public double getPrecioCompra() {
	return precioCompra;
}
public void setPrecioCompra(double precioCompra) {
	this.precioCompra = precioCompra;
}
public double getPrecioVenta() {
	return precioVenta;
}
public void setPrecioVenta(double precioVenta) {
	this.precioVenta = precioVenta;
}
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}
public String toString (){
    String info="El codigo es "+ codigo +"// su Descripcion es: "+ descripcion +"// Tiene un valor de compra de "+ precioCompra +" euros " +
            "// Tiene un valor de venta de "+ precioVenta +" euros "+ "// Stock total de: "+ stock + " unidades ";
    return info;
}
public void setinfo(String codigo, String descripcion, double PrecioCompra, double precioVenta, int stock) {

	
}
}