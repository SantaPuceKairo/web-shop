package com.app.dao;

import com.app.model.Catalog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


@Repository
public class CatalogDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Map<String, Object>> showCatalog(){
   //   RowMapper<Catalog> rowMapper  = (rs, rowNumber) -> mapCatalog(rs);
        return jdbcTemplate.queryForList("SELECT * FROM catalog ORDER by id");

    }
/*
    private Catalog mapCatalog (ResultSet rs)  {
      Catalog catalog = new Catalog();

       final int getId = catalog.getId();
       final int getManufacturer_id = catalog.getManufacturer_id();
        final String getName = catalog.getName();
        final double price = catalog.getPrice();
        final int sub_type_id = catalog.getSub_type_id();
        final String description = catalog.getDescription();

        return catalog;
    }

*/

}



