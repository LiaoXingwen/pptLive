package com.lxw.controller;

import com.lxw.dao.UserDao;
import com.lxw.domain.ResponseMessage;
import com.lxw.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import static com.lxw.constant.ResponseMessageConstant.FAILCODE;
import static com.lxw.constant.ResponseMessageConstant.SUCCESS;

/**
 * Created by lxw on 2017/7/24.
 */
@RestController
@RequestMapping(value="user",produces="application/json;charset=UTF-8")
public class UserController {

    @Autowired
    UserDao userDao ;

    @RequestMapping(value = "/register" )
    @ResponseBody
    public String register(@Valid User user , BindingResult result){
        if(result.hasErrors()){
            StringBuilder builder = new StringBuilder();
            for (ObjectError error :result.getAllErrors()){
                builder.append(error.getDefaultMessage()+";") ;
            }
            String msg = builder.toString();
            return new ResponseMessage(FAILCODE ,msg.substring(0, msg.length()-1)).toString() ;
        }
       User u =  userDao.save(user);
       return SUCCESS ;
    }

}
