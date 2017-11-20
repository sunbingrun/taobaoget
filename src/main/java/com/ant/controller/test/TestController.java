package com.ant.controller.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sunbingrun on 17/11/16.
 */


@Controller
@RequestMapping(value = "/test")
public class TestController {


    @RequestMapping(value="testmain")
    public String testmain(HttpServletRequest request, HttpServletResponse response){
        System.out.println("进来了222");
        return "taobaoget/test/test";
    }

    @RequestMapping(value="testmainjson")
    @ResponseBody
    public Map testmainjson(HttpServletRequest request, HttpServletResponse response){
        System.out.println("进来了吧");
        Map m = new HashMap();
        m.put("success",true);
        m.put("msg","任务审批成功");
        return m;
    }

}
