package kr.co.hivelab.home.controller;

import kr.co.hivelab.home.dto.EventItemDTO;
import kr.co.hivelab.home.dto.PromotionItemDTO;
import kr.co.hivelab.home.service.DetailServiceImpl;
import kr.co.hivelab.home.service.EventItemServiceImpl;
import kr.co.hivelab.home.service.PromotionBannerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    PromotionBannerServiceImpl promo;

    @Autowired
    EventItemServiceImpl event;

    @Autowired
    DetailServiceImpl detail;

    @RequestMapping("/")
    public ModelAndView getMainPage() {
        ModelAndView mav = new ModelAndView();
        List<PromotionItemDTO> pList = promo.getPromitionItem();
        List<EventItemDTO>  eList = event.getEventItem(0);
        mav.addObject("promoItem", pList);
        mav.addObject("eventItem", eList);
        mav.setViewName("main");
        return mav;
    }

    @RequestMapping( value = "/api/categories", method = RequestMethod.GET)
    public @ResponseBody List<EventItemDTO> getEventItems(@RequestParam("id") String id) {
        List<EventItemDTO> eList = event.getEventItem(Integer.parseInt(id));
        return eList;
    }

    // detail
    @RequestMapping("/detail")
    public ModelAndView getDetail(@RequestParam("id") String id) {
        ModelAndView mav = new ModelAndView();
        System.out.println("TEST : " + id);


        mav.setViewName("detail_default");
        return mav;
    }
}