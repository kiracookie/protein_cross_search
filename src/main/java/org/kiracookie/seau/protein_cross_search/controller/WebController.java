package org.kiracookie.seau.protein_cross_search.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class WebController {

    @RequestMapping("/search")
    public String search(@RequestParam("searchKey") String searchKey) {
        System.out.print(searchKey);
        return "gallery";
    }
}