package kr.co.hivelab.home.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class DetailDAO {

    @Autowired
    SqlSession session;

    public List< Map<String,String> > getBannerInfo( int id ){
        return session.selectList("detail.getBannerInfo", id);
    }

}
