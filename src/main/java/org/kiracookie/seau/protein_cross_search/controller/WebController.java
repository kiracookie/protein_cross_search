package org.kiracookie.seau.protein_cross_search.controller;

import org.kiracookie.seau.protein_cross_search.bean.Activitydata;
import org.kiracookie.seau.protein_cross_search.service.ActivityDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * rootController
 * <p>
 * 路径为项目根路径
 */
@Controller
@RequestMapping("/")
public class WebController {

    /**
     * activity.txt相关数据搜索
     */
    @Autowired
    private ActivityDataService activityDataService;

    @RequestMapping("/search")
    public String search(Model model, @RequestParam("searchKey") String searchKey) {

        List<Activitydata> activitydataList = activityDataService.getActivityData(searchKey);
        model.addAttribute("activitydataList", activitydataList);
        model.addAttribute("searchKey", searchKey);

        return "result";
    }

}