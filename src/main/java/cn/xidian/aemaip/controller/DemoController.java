package cn.xidian.aemaip.controller;

import cn.xidian.aemaip.entity.demo.Demo;
import cn.xidian.aemaip.service.demo.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

  private Logger logger = LoggerFactory.getLogger(this.getClass());
  @Autowired
  DemoService demoService;

  @RequestMapping(value = "/demo")
  @ResponseBody
  public int test(@RequestBody Demo demo) {
    int insert = demoService.insert(demo);
    return insert;
  }
}
