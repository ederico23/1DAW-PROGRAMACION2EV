package ejercicio4;

import java.util.ArrayList;

public class Tienda {
	//usamos el padre para q coja electronica y ropa
	ArrayList<Productos> inventario;
	
	//constructor
	public Tienda() {
		this.inventario = new ArrayList<>();
	}
	
	//agregar
	public void agregarProducto(Productos p) {
		//metodo de ArrayList para agregar
		inventario.add(p);
	}
	
	//mostrar
	public void mostrarPrecios() {
		//si p es ropa, llama a calcularPRecio ropa, sino al de electronica
		for(Productos p : inventario) {
			double precio = p.calcularPrecioFinal();
			
			System.out.println("producto: " + p.getNombre() +
					" precio: " + precio);
			
			//si queremos usar el descuento, hay q preguntar si ese
			//producto tiene descuento, PORQUE NO TODOS LO TIENEN
			if(p instanceof Descontable) {
				//casteamos para decirle que p puede tener descuento
				Descontable d = (Descontable) p;
				double precioDto = d.aplicarDescuento(20); //20%
				System.out.println("OFERTA: precio con descuento " +
						precioDto + "€");
			}
		}		
	}
	
	//buscamos con las excepciones
	public Productos buscarProducto (String nombreBuscado) throws ProductoNoEncontradoException {
		//recorremos igual que antes TODOS los productos son iguales
		for(Productos p : inventario) {
			//comparamos el nombre
			if (p.getNombre().equalsIgnoreCase(nombreBuscado)) {
				return p; //si lo encuentra devuelve el objeto
			}
		}
		
		throw new ProductoNoEncontradoException("el producto " +
				nombreBuscado + " no existe");
	}
	
	
}
