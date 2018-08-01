package com.hzit.test;

import cn.edu.jxufe.DBTools;
import cn.edu.jxufe.dao.RoleInfoDao;
import cn.edu.jxufe.dao.UserInfoDao;
import cn.edu.jxufe.entity.RoleInfo;
import cn.edu.jxufe.entity.Userinfo;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * @Author 合众艾特信息技术有限公司-研发部-吴文杰
 * @Date 2018/7/31-10:14
 * @Description
 */
public class TestRoleInfo {

    DBTools d=new DBTools();
    RoleInfoDao dao;
    SqlSession session;

    @Before
    public void start(){
        System.out.println("开工");
        session=d.getsession();
         dao=session.getMapper(RoleInfoDao.class);
    }
    @Test
    public void ceshichayige(){
        RoleInfo roleInfo= dao.findroleByRid(1);
        System.out.println("角色名:"+roleInfo.getRoleName());
        List<Userinfo> list= roleInfo.getUserinfoList();
        System.out.println("该角色的用户有:");
        for(Userinfo u : list){
            System.out.println(u.getUname()+u.getPassword());
        }

    }



    @After
    public void shouwei(){
        session.commit();
        session.close();
        System.out.println("收工");
    }
}
/*
代码手中走~佛祖心中留！求永无BUG！
                   _ooOoo_
                  o8888888o
                  88" . "88
                  (| -_- |)
                  O\  =  /O
               ____/`---'\____
             .'  \\|     |//  `.
            /  \\|||  :  |||//  \
           /  _||||| -:- |||||-  \
           |   | \\\  -  /// |   |
           | \_|  ''\---/''  |   |
            \  .-\__  `-`  ___/-. /
          ___`. .'  /--.--\  `. . __
       ."" '<  `.___\_<|>_/___.'  >'"".
      | | :  `- \`.;`\ _ /`;.`/ - ` : | |
      \  \ `-.   \_ __\ /__ _/   .-` /  /
 ======`-.____`-.___\_____/___.-`____.-'======
 */
