package kr.co.hivelab.home.service;


import kr.co.hivelab.home.dto.EventItemDTO;

import java.util.List;

public interface EventItemService {
    public List<EventItemDTO> getEventItem(int id);
}

