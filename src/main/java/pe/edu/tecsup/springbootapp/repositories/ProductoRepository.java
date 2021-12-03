package pe.edu.tecsup.springbootapp.repositories;

import java.util.List;

import pe.edu.tecsup.springbootapp.entities.Producto;

public interface ProductoRepository {

	List<Producto> listar() throws Exception;

	List<Producto> buscarPorNombre(String nombre) throws Exception;

	void registrar(Producto producto) throws Exception;
	
	void eliminar(Long id) throws Exception;

	void actualizar(Long id, String nombreProducto) throws Exception;
}
