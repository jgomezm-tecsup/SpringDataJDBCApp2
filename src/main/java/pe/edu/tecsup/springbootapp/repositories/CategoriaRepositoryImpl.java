package pe.edu.tecsup.springbootapp.repositories;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import pe.edu.tecsup.springbootapp.entities.Categoria;

@Repository
public class CategoriaRepositoryImpl implements CategoriaRepository {

	private static Logger log = LoggerFactory.getLogger(CategoriaRepositoryImpl.class);
	
	
	@Override
	public List<Categoria> listar() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
