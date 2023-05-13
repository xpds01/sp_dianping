package com.spdp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.spdp.dto.LoginFormDTO;
import com.spdp.dto.Result;
import com.spdp.entity.User;

import javax.servlet.http.HttpSession;

/**
 * <p>
 *  服务类
 * </p>
 *
 */
public interface IUserService extends IService<User> {

    Result sendCode(String phone, HttpSession session);

    Result login(LoginFormDTO loginForm, HttpSession session);

    Result sign();

    Result signCount();

}
