import com.alibaba.fastjson.JSONObject;

import java.io.IOException;

public class Httpurl {
    public static void main(String[] args) throws IOException {
        String ip = "113.57.244.100";
        String url =  "http://api.map.baidu.com/location/ip?ak=32f38c9491f2da9eb61106aaab1e9739&ip="+ip+"&coor=bd09ll";
        JSONObject json = ReadUrlUtil.readUrl(url);
        System.out.println(json.toString());
    }
}
