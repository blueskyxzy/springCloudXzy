package com.xzy.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by xzy on 2020/4/2  .
 */

@FeignClient("xzynacos-user")
@RequestMapping("/user")
public interface UserService {

    @GetMapping("/getUser")
    String getUser(@RequestParam("userId") Long userId);

}
