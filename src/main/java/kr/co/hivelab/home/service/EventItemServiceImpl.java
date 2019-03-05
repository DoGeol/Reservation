package kr.co.hivelab.home.service;

import kr.co.hivelab.home.dao.EventItemDAO;
import kr.co.hivelab.home.dto.EventItemDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventItemServiceImpl implements EventItemService {

    @Autowired
    EventItemDAO EventItemDAO;

    @Override
    public List<EventItemDTO> getEventItem(int id) {
        return id == 0 ? EventItemDAO.getEventItemInfoAll() : EventItemDAO.getEventItemInfoCategory(id);
    }
//    public List<EventItemDTO> getEventItem(int id) {
//        System.out.println(id);
//        return EventItemDAO.getEventItemInfoAll();
//    }
}
