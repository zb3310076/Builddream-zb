package com.zm.dao;

import com.zm.bean.Guanggao;
import com.zm.bean.JieKuan;
import com.zm.bean.Lunbo;
import org.apache.ibatis.annotations.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: Builddream-zb
 * @description: ${description}
 * @author: zb
 * @create: 2018-06-22 11:43
 **/
@Mapper
@Repository
public interface LbDao {

    @Select("select * from lunbo")
    List<Lunbo> querylunbo();
    @Select("select count(*) from lunbo")
    Integer querylunbonum();


    @Insert("INSERT INTO `builddream`.`lunbo`"+
            "(`lbid`,"+
            "`lbname`,"+
            "`lbimage`,"+
            "`lbriqi`,"+
            "`lbstatus`)"+
   " VALUES (#{lbid},"+
                   " #{lbname},"+
                    " #{lbimage},"+
                    " #{lbriqi},"+
                    " #{lbstatus});" )

    void addlunbo(Lunbo lunbo);

    @Delete("delete from lunbo where lbid=#{lbid}")
    void deletelunbo(Integer id);

    @Update("update lunbo set lbstatus=1 where lbid=#{lbid}")
    void updatelunbostatus1(Integer id);

    @Select("update lunbo set lbstatus=2 where lbid=#{lbid}")
    void updatelunbostatus2(Integer id);

    @Select("select * from lunbo where lbstatus=1 order by lbriqi")
    List<Lunbo> querylunboq();

    @Select("SELECT t1.t_jid t_jid,t2.userid userid,t2.username uzhenname,t1.t_jprice t_jprice,t1.t_lixi t_lixi,t1.t_jdate t_jdate,t1.t_hdate t_hdate" +
            "  FROM t_jiekuan t1 LEFT JOIN quser t2 ON t1.userid=t2.userid WHERE t1.status=1 order by t_hdate asc limit 0,2")
    List<JieKuan> queryfangdai();

    @Select("SELECT t1.t_jid t_jid,t2.userid userid,t2.username uzhenname,t1.t_jprice t_jprice,t1.t_lixi t_lixi,t1.t_jdate t_jdate,t1.t_hdate t_hdate" +
            "  FROM t_jiekuan t1 LEFT JOIN quser t2 ON t1.userid=t2.userid WHERE t1.status=2 order by t_hdate asc limit 0,2")
    List<JieKuan> querychedai();

    @Select("SELECT t1.t_jid t_jid,t2.userid userid,t2.username uzhenname,t1.t_jprice t_jprice,t1.t_lixi t_lixi,t1.t_jdate t_jdate,t1.t_hdate t_hdate" +
            "  FROM t_jiekuan t1 LEFT JOIN quser t2 ON t1.userid=t2.userid WHERE t1.status=3 order by t_hdate asc limit 0,2")
    List<JieKuan> querygerendai();

    @Select("select * from guanggao")
    List<Guanggao> queryguanggao();

    @Update("update guanggao set gstatus=2,sendtime=#{sendtime} where gid=#{gid}")
    void updatelunbostatus5(Guanggao guanggao);

    @Select("select * from guanggao WHERE gstatus=2 order by sendtime desc limit 0,9")
    List<Guanggao> queryguanggaoq();

    /*@Update("UPDATE guanggao SET sendtime=#{sendtime} WHERE gid=#{gid}")
    void addlsendtime(String sendtime,Integer id);*/
}
