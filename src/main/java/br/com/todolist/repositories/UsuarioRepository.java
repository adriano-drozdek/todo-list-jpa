package br.com.todolist.repositories;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.todolist.model.Usuario;

public class UsuarioRepository implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager entityMananger;

	public List<Usuario> listatrTudo() {
		return entityMananger.createQuery("from usuario", Usuario.class).getResultList();

	}
}
