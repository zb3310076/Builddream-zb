package com.zm.service.impl;

import com.zm.bean.Guanggao;
import com.zm.bean.JieKuan;
import com.zm.bean.Lunbo;
import com.zm.dao.LbDao;
import com.zm.service.LbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @program: Builddream-zb
 * @description: ${description}
 * @author: zb
 * @create: 2018-06-22 11:39
 **/
@Service("LbService")
public class LbServiceImpl implements LbService {

    @Autowired private LbDao lbDao;

    @Override
    public List<Lunbo> querylunbo() {
        List<Lunbo> list= lbDao.querylunbo();
        System.out.println(list);
        return list;
    }

    @Override
    public Integer querylunbonum() {
        return lbDao.querylunbonum();
    }

    @Override
    public void addlunbo(Lunbo lunbo) {
        lbDao.addlunbo(lunbo);
    }

    @Override
    public void deletelunbo(Integer id) {
        lbDao.deletelunbo(id);
    }

    @Override
    public void updatelunbostatus1(Integer id) {
        lbDao.updatelunbostatus1(id);
    }

    @Override
    public void updatelunbostatus2(Integer id) {
        lbDao.updatelunbostatus2(id);
    }

    @Override
    public List<Lunbo> querylunboq() {
        return lbDao.querylunboq();
    }

    @Override
    public List<JieKuan> queryfangdai() {
        return lbDao.queryfangdai();
    }

    @Override
    public List<JieKuan> querychedai() {
        return lbDao.querychedai();
    }

    @Override
    public List<JieKuan> querygerendai() {
        return lbDao.querygerendai();
    }

    @Override
    public List<Guanggao> queryguanggao() {
        List<Guanggao> queryguanggao = lbDao.queryguanggao();
        System.out.println(queryguanggao);
        return queryguanggao;
    }

    @Override
    public void updatelunbostatus5(Integer id) {

        Date date = new Date();
        SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String sendtime = sim.format(date);
         Guanggao guanggao=new Guanggao();
           guanggao.setGid(id);
           guanggao.setSendtime(sendtime);
        lbDao.updatelunbostatus5(guanggao);

       /* lbDao.addlsendtime(sendtime,id);*/
        System.out.println("1111111111111");
    }

    @Override
    public List<Guanggao> queryguanggaoq() {
        return lbDao.queryguanggaoq();
    }
}
