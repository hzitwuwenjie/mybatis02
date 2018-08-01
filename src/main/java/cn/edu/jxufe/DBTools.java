package cn.edu.jxufe;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * @Author 合众艾特信息技术有限公司-研发部-吴文杰
 * @Date 2018/7/31-9:39
 * @Description
 */
public class DBTools {

    private static  SqlSessionFactory f;

    static{
        //读取配置。并且通过配置产生SQLSessionFactory
        Reader r= null;
        try {
            r = Resources.getResourceAsReader("cinfig.xml");
            //并且通过配置产生SQLSessionFactory
            f= new SqlSessionFactoryBuilder().build(r);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public SqlSession getsession(){
        SqlSession session=f.openSession();
        return session;
        //输出来和大家见个面
    }
    public void closesession(SqlSession session){
        session.close();
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
