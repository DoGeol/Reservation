package kr.co.hivelab.home.dao;

import kr.co.hivelab.home.dto.PromotionItemDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PromotionItemDAO {

    @Autowired
    SqlSession session;

    public List<PromotionItemDTO> getPromotionItemInfo(){
        return session.selectList("Promotion.getInfo");
    }

}
