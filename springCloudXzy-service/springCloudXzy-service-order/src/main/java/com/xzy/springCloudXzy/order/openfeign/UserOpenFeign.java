package com.xzy.springCloudXzy.order.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by xzy on 2020/3/31  .
 */

@FeignClient("xzynacos-user")
public interface UserOpenFeign {

    @GetMapping("/getUser")
    String getUser(@RequestParam("userId") Long userId);

}
