package com.wordpress.cosminiuliang.database.controller;

import com.wordpress.cosminiuliang.database.dao.DataBaseRepo;
import com.wordpress.cosminiuliang.database.model.DataBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;


@Controller
public class DataBaseController {

    @Autowired
    private DataBaseRepo repo;


    @RequestMapping("/")
    public String index() {

        return "index.jsp";
    }

    @RequestMapping("/goToGetData")
    public String goToGetData() {

        return "get_data.jsp";
    }

    @RequestMapping("/getData")
    public String getData(DataBase data) {

        repo.save(data);
        return "register_message.jsp";
    }

    @RequestMapping("goToSearchData")
    public String goToSearchData() {

        return "search_data.jsp";
    }

    @RequestMapping("/searchData")
    public ModelAndView searchData(@RequestParam("familyName") String familyName) {

        ModelAndView mv = new ModelAndView();
        List<DataBase> dataObj = repo.findByfamilyName(familyName); // cauta in baza de date daca exista
        mv.addObject("data", dataObj); // add object to the showAlien.jsp

        mv.setViewName("show_data.jsp");

        return mv;
    }

    @RequestMapping("/listAll")
    public ModelAndView listAll() {

        ModelAndView mv = new ModelAndView();
        List<DataBase> dataObj = (List<DataBase>) repo.findAll();
        mv.addObject("data", dataObj);

        mv.setViewName("show_data.jsp");

        return mv;
    }

}

