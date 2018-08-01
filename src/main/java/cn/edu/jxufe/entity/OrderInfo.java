package cn.edu.jxufe.entity;

import java.io.Serializable;
import java.util.Map;
import java.util.UUID;

/**
 * @Author 合众艾特信息技术有限公司-研发部-吴文杰
 * @Date 2018/7/25-17:22
 * @Description
 */
public class OrderInfo implements Serializable {
    private String orderid;
    private int uid;
    private String address;
    private String phone;
    private String paystatus;
    private int orderPrice;
    private String orderTime;

    private Userinfo userinfo; //订单的买家信息
    private Map<Integer,OrderGoods> goodsInfo; //订单有商品

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPaystatus() {
        return paystatus;
    }

    public void setPaystatus(String paystatus) {
        this.paystatus = paystatus;
    }



    public OrderInfo() {
        orderid= UUID.randomUUID().toString(); //产生一个随机的全球唯一号
    }

    public OrderInfo(String orderTime, int orderPrice) {
        this.orderid =  UUID.randomUUID().toString(); ;
        this.orderTime = orderTime;
        this.orderPrice = orderPrice;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public int getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(int orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Userinfo getUserinfo() {
        return userinfo;
    }

    public void setUserinfo(Userinfo userinfo) {
        this.userinfo = userinfo;
    }

    public Map<Integer, OrderGoods> getGoodsInfo() {
        return goodsInfo;
    }

    public void setGoodsInfo(Map<Integer, OrderGoods> goodsInfo) {
        this.goodsInfo = goodsInfo;
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
