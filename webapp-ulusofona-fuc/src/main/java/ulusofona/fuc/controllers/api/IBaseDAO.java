package ulusofona.fuc.controllers.api;

public interface IBaseDAO<T> {

	T getById(long id);
	
	T get(T obj);
	
	T insert(T obj);

	boolean update(T obj);

	T delete(T obj);
}
