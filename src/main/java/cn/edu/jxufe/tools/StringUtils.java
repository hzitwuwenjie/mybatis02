package cn.edu.jxufe.tools;

/**
 * @Author 合众艾特信息技术有限公司-研发部-吴文杰
 * @Date 2018/8/1-13:58
 * @Description
 */
public class StringUtils {

    /**
     * 定义个判读传入的字符串是否为空的方法
     * @param info
     * @return
     */
    public static  boolean isNotNull(String info){
            if(info==null || info.equals("")){
                return false;
            }else if(info.trim().equals(""))
            {
                return  false;
            }else
            {
                return  true;
            }
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
