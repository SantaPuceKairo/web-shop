package com.app.controllers;

import com.app.model.Catalog;
import com.app.services.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class CatalogController {
    @Autowired
    CatalogService catalogService;

    @GetMapping("/catalog")
    public String getCatalogPage(Model model) {
         model.addAttribute("catalog", new Catalog());
          return "catalog";
    }

    @PostMapping("/catalog")
    public String returnCatalogItems(@ModelAttribute Catalog catalog, Model model) {
    catalogService.getCatalogs();
        model.addAttribute("catData", catalog);
                  return "catalog";

    }
}


