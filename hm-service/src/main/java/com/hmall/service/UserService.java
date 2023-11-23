package com.hmall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hmall.model.dto.LoginFormDTO;
import com.hmall.model.entity.User;
import com.hmall.model.vo.UserLoginVO;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author 虎哥
 * @since 2023-05-05
 */
public interface UserService extends IService<User> {

    UserLoginVO login(LoginFormDTO loginFormDTO);

    void deductMoney(String pw, Integer totalFee);
}
