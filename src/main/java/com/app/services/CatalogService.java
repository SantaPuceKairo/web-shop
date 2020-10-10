package com.app.services;

import com.app.dao.CatalogDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service

public class CatalogService {
    @Autowired
    private CatalogDao catalogDao;

       public List<Map<String, Object>> getCatalogs() {
        if (getCatalogs().size() > 0) {
            System.out.println("YOU REACHED THIS CATALOG");
            return catalogDao.showCatalog();
        }
        return null;
    }
}







