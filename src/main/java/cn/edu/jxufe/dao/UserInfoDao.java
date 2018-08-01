package cn.edu.jxufe.dao;

import cn.edu.jxufe.entity.Userinfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Author 合众艾特信息技术有限公司-研发部-吴文杰
 * @Date 2018/7/31-15:02
 * @Description
 */
public interface UserInfoDao {

    List<Userinfo> findAll();

    List<Userinfo> findByPage(@Param("start") int startrow,@Param("rowcount") int rowcount);


    List<Userinfo> findByUser(Map userinfo);

    Userinfo findById(Integer uid);

    /**
     * 传入一组ID。然后返回ID相同的这一组用户
     * @param ids
     * @return
     */
    List<Userinfo> findByIds(@Param("ids") Integer[] ids);


    int addUser(Userinfo userinfo);

    int updateUser(Userinfo userinfo);

    int deleteUser(Integer uid);
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
