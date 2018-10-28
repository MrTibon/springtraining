package by.tibon.springtraining.services;

import java.util.Set;

public interface CrudService<T, ID> {
	Set<T> findAll();

	T findByID(ID id);

	T save(T obj);

	void delete(T obj);

	void deleteById(ID id);

}