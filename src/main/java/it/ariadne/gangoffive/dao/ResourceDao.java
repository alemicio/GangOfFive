package it.ariadne.gangoffive.dao;

import java.util.List;

public interface ResourceDao<T> {

	public List<T> getListOfResources();
	public T updateResource(T t);
	public T deleteResource(T t);
	public T addResource(T t);
	
}
