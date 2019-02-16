package kr.co.hivelab.home.service;

import kr.co.hivelab.home.dao.PromotionItemDAO;
import kr.co.hivelab.home.dto.PromotionItemDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromotionBannerServiceImpl implements PromotionBannerService {

    @Autowired
    PromotionItemDAO promotionItemDAO;

    @Override
    public List<PromotionItemDTO> getPromitionItem() {
        return promotionItemDAO.getPromotionItemInfo();
    }
}
