package com.zm.service;

import com.zm.bean.Guanggao;
import com.zm.bean.JieKuan;
import com.zm.bean.Lunbo;

import java.util.List;

/**
 * @program: Builddream-zb
 * @description: ${description}
 * @author: zb
 * @create: 2018-06-22 11:38
 **/
public interface LbService {

    List<Lunbo> querylunbo();
    Integer querylunbonum();

    void addlunbo(Lunbo lunbo);

    void deletelunbo(Integer id);

    void updatelunbostatus1(Integer id);
    void updatelunbostatus2(Integer id);

    List<Lunbo> querylunboq();

    List<JieKuan> queryfangdai();
    List<JieKuan> querychedai();
    List<JieKuan> querygerendai();


    List<Guanggao> queryguanggao();


    void updatelunbostatus5(Integer id);

    List<Guanggao> queryguanggaoq();

}
