package com.qa.intermediate;

import java.util.List;

public interface CRUD<T, C> {

	List<T> readAll();

	T create();

	T update();

	C delete();

}
