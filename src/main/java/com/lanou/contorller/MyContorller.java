package com.lanou.contorller;

import com.lanou.dao.Dao;
import com.lanou.dao.FDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class MyContorller {
   @Resource(name = "userService")
    private FDao fd;

    public FDao getFd() {
        return fd;
    }

    public void setFd(FDao fd) {
        this.fd = fd;
    }

    @RequestMapping("aaa")
    public void work1(){
        fd.find();
    }
}
