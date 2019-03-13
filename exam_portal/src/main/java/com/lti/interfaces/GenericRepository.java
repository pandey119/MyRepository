package com.lti.interfaces;

import java.util.List;

public interface GenericRepository {
	public Object save(Object obj);
	public <T> T fetch(Class<T> clazz, Object pk);
	public <T> List<T> fetchAll(Class<T> clazz);
	
}
