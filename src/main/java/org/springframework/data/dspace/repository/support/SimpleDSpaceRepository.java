/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.dspace.repository.support;

import java.io.Serializable;

import org.springframework.data.dspace.repository.repository.DSpaceRepository;

/**
 * Base repository implementation for DSpace.
 *
 * @author Andrea Bollini
 */
public class SimpleDSpaceRepository<T, ID extends Serializable> implements DSpaceRepository<T, ID> {

	
	/**
	 * Creates a new {@link SimpleDSpaceRepository}.
	 *
	 * @param entityType must not be {@literal null}.
	 */
	public SimpleDSpaceRepository() {
	}

	public <S extends T> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends T> Iterable<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	public T findOne(ID id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean exists(ID id) {
		// TODO Auto-generated method stub
		return false;
	}

	public Iterable<T> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Iterable<T> findAll(Iterable<ID> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void delete(ID id) {
		// TODO Auto-generated method stub
		
	}

	public void delete(T entity) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Iterable<? extends T> entities) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

}
