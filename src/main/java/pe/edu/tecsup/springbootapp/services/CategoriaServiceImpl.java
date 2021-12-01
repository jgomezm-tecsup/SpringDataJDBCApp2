package pe.edu.tecsup.springbootapp.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import pe.edu.tecsup.springbootapp.entities.Categoria;

@Service
public class CategoriaServiceImpl implements CategoriaService {

	private static Logger log = LoggerFactory.getLogger(CategoriaServiceImpl.class);

	
	@Override
	public List<Categoria> listar() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
