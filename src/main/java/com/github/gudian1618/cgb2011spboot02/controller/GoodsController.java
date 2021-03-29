package com.github.gudian1618.cgb2011spboot02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/3/29 9:22 下午
 */

@Controller
@RequestMapping("/goods")
public class GoodsController {

    @RequestMapping("/doGoodsUI")
    public String doGoodsUI() {
        // 返回给调用方,这里是DispatcherServlet
        return "goods";
        // DispatcherServlet会将goods字符串交给视图解析器对象(thymeleaf提供)
        // thymeleaf中的视图解析器会对goods字符串添加前缀和后缀
    }

}
