package com.lxw.token;

import com.google.gson.JsonObject;
import com.lxw.domain.User;

/**
 * Created by lxw on 2017/7/25.
 */
public class AppToken {

    /**
     * 对user信息进行基础加密存储，可以解密
     * @param user
     */
    public String baseToken(User user){
        JsonObject object = new JsonObject();
        object.addProperty("id",user.getId());
        object.addProperty("name",user.getName());
        object.addProperty("code",user.getCode());
        return  "";
    }


}
