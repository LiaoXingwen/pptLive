package com.lxw.dao;

import com.lxw.domain.User;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by lxw on 2017/7/25.
 */
@Repository
public class UserRedisDao {

   @Resource(name = "redisTemplate")
   ValueOperations<Integer , User> operations  ;

   public void save(User user){
      operations.set(user.getId() , user);
   }
   public void get(int uid){
      operations.get(uid) ;
   }

}
