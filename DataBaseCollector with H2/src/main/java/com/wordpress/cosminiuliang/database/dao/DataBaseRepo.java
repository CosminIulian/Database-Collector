package com.wordpress.cosminiuliang.database.dao;

import com.wordpress.cosminiuliang.database.model.DataBase;
import org.springframework.data.repository.CrudRepository;
import java.util.List;


public interface DataBaseRepo extends CrudRepository<DataBase, Integer> {

    List<DataBase> findByfamilyName(String familyName); // customize search

}
