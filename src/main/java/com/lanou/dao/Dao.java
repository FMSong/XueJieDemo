package com.lanou.dao;

import com.lanou.pojo.FUser;
import com.lanou.pojo.prd;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "userService")
public class Dao implements FDao {
    @Resource(name="sessionFactory")
    private SqlSessionFactory sqf;


    public void find() {
        SqlSession session = sqf.openSession();
        FUser fuser = session.getMapper(FUser.class);
        List<prd> p = fuser.getPrd();
        for(prd s:p){
            System.out.println(s);
        }
        session.close();
    }
}
