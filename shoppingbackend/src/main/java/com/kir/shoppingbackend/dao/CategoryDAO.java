package com.kir.shoppingbackend.dao;

import java.util.List;
import com.kir.shoppingbackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	
	Category get(int id);

}
