package com.test.work.user.dao.impl;

import com.test.work.base.dao.Impl.BaseDaoImpl;
import com.test.work.user.dao.IUserDao;
import com.test.work.user.model.User;

/**
 * Created by renrunkeji_059 on 2017/3/22.
 */
public class UserDaoImpl extends BaseDaoImpl<User> implements IUserDao {

    public UserDaoImpl(){
        super(User.class);
    }
}
