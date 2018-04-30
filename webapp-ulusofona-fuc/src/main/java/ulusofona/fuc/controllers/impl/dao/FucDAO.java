package ulusofona.fuc.controllers.impl.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ulusofona.fuc.controllers.api.IFucDAO;
import ulusofona.fuc.controllers.impl.entities.Fuc;
import ulusofona.fuc.controllers.impl.entities.TipoUsuario;
import ulusofona.fuc.controllers.impl.utils.Constants;

public class FucDAO implements IFucDAO {
	
	@Override
	public Fuc getById(long id) {
		EntityManager em = getEntityManager();
		return null;
	}

	@Override
	public Fuc get(Fuc obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Fuc insert(Fuc obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Fuc obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Fuc delete(Fuc obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Fuc> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	protected EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory(Constants.PERSISTENCE_UNIT_NAME).createEntityManager();
	}

	public static void main(String[] args) {
		String query = "From TipoUsuario";
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ModuloFUCPU");
		EntityManager em = emf.createEntityManager();
		List<TipoUsuario> tipoUsuList = em.createQuery(query, TipoUsuario.class).getResultList();

		for (TipoUsuario tipoUsu : tipoUsuList) {
			System.out.println("Tipo:" + tipoUsu.getTipo());
		}
	}
}
