package com.test.work.login.service.impl;

import com.test.work.login.service.ILoginService;
import com.test.work.user.dao.IUserDao;
import com.test.work.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by renrunkeji_059 on 2017/3/22.
 */
@Component
public class LoginServiceImpl  implements ILoginService {

    @Autowired
    private IUserDao userDao;

    public Map<String, Object> login(String username, String password) throws Exception {
        Map<String,Object> returnMap = new HashMap<String,Object>();

        String hql = "from User u where u.username='"+username+"'";
        User user = new User();
        try {
            user = userDao.findOne(hql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(user != null){
            if(user.getPassword().equals(password)){
                returnMap.put("value", user);
                returnMap.put("message", "登录成功");
                returnMap.put("success", true);
            }else{
                returnMap.put("message", "密码错误");
                returnMap.put("success", false);
            }
        }else{
            returnMap.put("message", "该用户不存在!");
            returnMap.put("success", false);
        }
        return returnMap;
    }

    public Map<String, Object> register(String username, String password,String tel,String email) throws Exception {
        Map<String,Object> returnMap = new HashMap<String,Object>();

        String hql = "from User u where u.username='"+username+"'";
        User user = new User();
        if(userDao.findOne(hql) != null){
            returnMap.put("message", "该用户名已存在...");
            returnMap.put("success", false);
            return returnMap;
        }else{
            user.setUsername(username);
            user.setPassword(password);
//            user.setTel(tel);
//            user.setEmail(email);
            user.setCreateTime(new Date());
            user.setIsDelete(false);
            userDao.save(user);
            returnMap.put("value", user);
            returnMap.put("message", "注册成功");
            returnMap.put("success", true);
            return returnMap;
        }
    }

}
