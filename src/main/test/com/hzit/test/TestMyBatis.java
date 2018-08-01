package com.hzit.test;

import cn.edu.jxufe.DBTools;
import cn.edu.jxufe.dao.UserInfoDao;
import cn.edu.jxufe.entity.Userinfo;
import cn.edu.jxufe.tools.StringUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author 合众艾特信息技术有限公司-研发部-吴文杰
 * @Date 2018/7/31-10:14
 * @Description
 */
public class TestMyBatis {

    DBTools d=new DBTools();
    UserInfoDao dao;
    SqlSession session;

    @Before
    public void start(){
        System.out.println("开工");
        session=d.getsession();

         dao=session.getMapper(UserInfoDao.class);
    }

    @Test
    public void ceshisession(){
        SqlSession session= d.getsession();
        System.out.println(session);
    }

    @Test
    public void ceshiChaxun2(){
        Map m=new HashMap<>();
        m.put("uname","邹");
        m.put("password",123);

        List<Userinfo> ulit= dao.findByUser(m);
        for(Userinfo us : ulit){
            System.out.println("用户:"+us);
        }
    }

    @Test
    public void ceshixiugai(){
        Userinfo u=new Userinfo();
        u.setUid(1);
        u.setUname("邹紫倩");
        u.setScore(80);
        dao.updateUser(u);
    }

    @Test
    public void ceshichaxuen4(){
        Integer ids[]={23,43,4,3,45456,788,9};
       dao.findByIds(ids);
    }

@Test
    public void ceshichaxuen3(){

        List<Userinfo> ulit= dao.findByPage(2,5);
        for(Userinfo us : ulit){
            System.out.println("用户:"+us);
        }
    }

    @Test
    public void testNUl(){
        String info="       ";
        boolean b=StringUtils.isNotNull(info);
        System.out.println(b);
    }

    @Test
    public void ceshiChaXun(){
        List<Userinfo> list= dao.findAll();
        for(Userinfo u : list){
            System.out.println("用户是"+u.getUname()+"他的角色名是"+u.getRoleInfo().getRoleName());
        }
    }

    @Test
    public  void testzengjia() {
        Userinfo userinfo=new Userinfo();
        userinfo.setUname("MyBatis");
        userinfo.setRoleid(1);
        userinfo.setPassword("123455");
        userinfo.setScore(800);
        dao.addUser(userinfo);
    }

    @Test
    public void ceshishanchu(){
        dao.deleteUser(76);
    }
    @Test
    public void ceshichayige(){
        Userinfo userinfo= dao.findById(2);
        System.out.println(userinfo);
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
