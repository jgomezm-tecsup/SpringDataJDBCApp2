package pe.edu.tecsup.springbootapp.services;

// http://hamcrest.org/JavaHamcrest/tutorial
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.tecsup.springbootapp.entities.Categoria;
import pe.edu.tecsup.springbootapp.entities.Producto;

@SpringBootTest
public class ProductoServiceTest {

	private static Logger log 
	= LoggerFactory.getLogger(ProductoServiceTest.class);
	
	@Autowired
	private ProductoService productoService;

	@Test
	public void testListar() throws Exception {
		
		List<Producto> productos = productoService.listar();
	
		assertThat(productos.isEmpty(), is(false));
	
	}
	
	@Test
	public void testBuscarPorNombre() throws Exception {
		
		List<Producto> productos = productoService.buscarPorNombre("AMD");
		
		log.info("Print by productos");
		for(Producto producto : productos) log.info(producto.toString());
		
		assertThat(productos.isEmpty(), is(false));
		
	}

	@Test
	public void testRegistar() throws Exception {
		
		List<Producto> productos = productoService.listar();
		int totalAntes = productos.size();
		
		Producto producto = new Producto();
		producto.setCategorias_id(1L);
		producto.setNombre("AMD");
		producto.setDescripcion("AMD X10");
		producto.setPrecio(280.0);
		producto.setStock(6);
		productoService.registrar(producto);	
		
		productos = productoService.listar();
		int totalDespues = productos.size();
		
		assertThat(totalDespues - totalAntes, is(1));
	}

	@Test
	public void testEliminar() throws Exception {
		
		List<Producto> productos = productoService.listar();
		int totalAntes = productos.size();
		if (productos.isEmpty()) {
			return; // test pass
		}

		Producto ultimoProducto = productos.get(productos.size() - 1);
		productoService.eliminar(ultimoProducto.getId());
		
		productos = productoService.listar();
		int totalDespues = productos.size();
		
		assertThat(totalAntes - totalDespues, is(1));
	}
	
	@Test
	public void testRegistar2() throws Exception {
		
		List<Producto> productos = productoService.listar();
		int totalAntes = productos.size();
		
		Producto producto = new Producto();
		producto.setCategorias_id(2L);
		producto.setNombre("INTEL");
		producto.setDescripcion("Core 9i ");
		producto.setPrecio(280.0);
		producto.setStock(12);
		productoService.registrar(producto);	
		
		productos = productoService.listar();
		int totalDespues = productos.size();
		
		assertThat(totalDespues - totalAntes, is(1));
	}
	
	@Test
	public void testActualizar() throws Exception {
		// TO DO 
		
	}
}
