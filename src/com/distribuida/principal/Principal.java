package com.distribuida.principal;

import java.util.Date;

import com.distribuida.entities.Cliente;
import com.distribuida.entities.DetalleFactura;
import com.distribuida.entities.Factura;
import com.distribuida.entities.Producto;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente cliente =new Cliente();
		cliente.setIdCliente(1);
		cliente.setCedula("1753175214");
		cliente.setNombre("Luis");
		cliente.setApellido("Peralta");
		cliente.setEdad(21);
		cliente.setFechaNacimiento(new Date());
		cliente.setDireccion("Tumbaco");
		cliente.setTelefono("0995547735");
		cliente.setCorreo("luisvps17@gmail.com");
		
		Producto producto = new Producto();
		producto.setIdProducto(1);
		producto.setNombre("Peras");
		producto.setDescripcion("caja de peras");
		producto.setPrecio(14.50);
		producto.setStock(200);
		
		Factura factura=new Factura();
		factura.setIdFactura(1);
		factura.setNumFactura("FAC-001");
		factura.setFecha(new Date());
		factura.setTotalNeto(56.50);
		factura.setIva(0.12);
		factura.setTotal(60.45);
		
		DetalleFactura detalleFactura=new DetalleFactura();
		detalleFactura.setIdFacturaDetalle(1);
		detalleFactura.setCantidad(8);
		detalleFactura.setSubtotal(84.60);
		
		Cliente cliente2 =new Cliente();
		cliente.setIdCliente(1);
		cliente.setCedula("1205784589");
		cliente.setNombre("Dario");
		cliente.setApellido("Cardozo");
		cliente.setEdad(20);
		cliente.setFechaNacimiento(new Date());
		cliente.setDireccion("Tumbaco");
		cliente.setTelefono("0978541262");
		cliente.setCorreo("luisvps17@gmail.com");
		
		Producto producto2 = new Producto();
		producto.setIdProducto(2);
		producto.setNombre("Manzanas");
		producto.setDescripcion("caja de manzanas");
		producto.setPrecio(30.50);
		producto.setStock(60);
		
		Factura factura2=new Factura();
		factura.setIdFactura(2);
		factura.setNumFactura("FAC-002");
		factura.setFecha(new Date());
		factura.setTotalNeto(88.50);
		factura.setIva(0.12);
		factura.setTotal(115.10);
		
		DetalleFactura detalleFactura2=new DetalleFactura();
		detalleFactura.setIdFacturaDetalle(2);
		detalleFactura.setCantidad(7);
		detalleFactura.setSubtotal(94.60);
		
		//inyeccion de dependencia 
		
		factura.setCliente(cliente);
		detalleFactura.setProducto(producto);
		
		
		
		//impresion 
		System.out.println(factura.toString());
		System.out.println(detalleFactura.toString());
}

}
