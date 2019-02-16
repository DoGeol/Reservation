package kr.co.hivelab.home.controller;

import kr.co.hivelab.home.dto.PromotionItemDTO;
import kr.co.hivelab.home.service.PromotionBannerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    PromotionBannerServiceImpl promo;

    @RequestMapping("/")
    public ModelAndView getMainPage() {
        ModelAndView mav = new ModelAndView();
        List<PromotionItemDTO> list = promo.getPromitionItem();
        mav.addObject("promoItem", list);
        mav.setViewName("main");
        return mav;
    }
}