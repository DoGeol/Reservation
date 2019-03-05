package kr.co.hivelab.home.dao;

import kr.co.hivelab.home.dto.EventItemDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class EventItemDAO {

    @Autowired
    SqlSession session;

    public List<EventItemDTO> getEventItemInfoAll(){
        return session.selectList("event.getInfoAll");
    }
    public List<EventItemDTO> getEventItemInfoCategory(int id){
        return session.selectList("event.getInfoCategory", id);
    }

}
