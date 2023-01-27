package demo;

import javafx.util.Pair;
import redis.clients.jedis.Jedis;

/**
 * @author Aries
 * @date 2021/5/2 13:38
 */
public class JedisTest {
    public static void main(String[] args) {
        // 1.设置IP地址和端口
        Jedis jedis = new Jedis("192.168.126.128", 6379);
        jedis.auth("123456");
        // 2.保存数据
        jedis.set("name", "myimooc");
        // 3.获取数据
        String value = jedis.get("name");

        System.out.println(value);

        // 4.释放资源
        jedis.close();



    }
}
