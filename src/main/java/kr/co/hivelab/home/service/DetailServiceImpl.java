package kr.co.hivelab.home.service;

import kr.co.hivelab.home.dao.DetailDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DetailServiceImpl implements DetailService {

    @Autowired
    DetailDAO detailDAO;

    @Override
    public List< Map<String,String> > getBannerInfo( int id ) {
        System.out.println("test : " + detailDAO.getBannerInfo( id ));
        return detailDAO.getBannerInfo( id );
    }
}
