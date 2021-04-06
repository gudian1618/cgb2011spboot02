package com.github.gudian1618.cgb2011spboot02.controller;

import com.github.gudian1618.cgb2011spboot02.pojo.Goods;
import com.github.gudian1618.cgb2011spboot02.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/3/29 9:22 下午
 */

@Controller
@RequestMapping("/goods/")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping("doDeleteById")
    public String doDeleteById(Long id) {
        goodsService.deleteById(id);
        return "redirect:doGoodsUI";
    }

    @RequestMapping("doGoodsUI")
    public String doGoodsUI(Model model) {

        List<Goods> list = goodsService.findGoods();
        // model为springmvc中用于存储数据的对象
        model.addAttribute("goods", list);

        // 返回给调用方,这里是DispatcherServlet
        return "goods";
        // DispatcherServlet会将goods字符串交给视图解析器对象(thymeleaf提供)
        // thymeleaf中的视图解析器会对goods字符串添加前缀和后缀
    }

}
