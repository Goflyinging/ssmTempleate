package cn.xidian.aemaip.service.demo.impl;

import cn.xidian.aemaip.dao.demo.DemoMapper;
import cn.xidian.aemaip.entity.demo.Demo;
import cn.xidian.aemaip.service.demo.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/***
 * Created on 2017/10/10 <br>
 * Description: []<br>
 * @author lxing
 * @version 1.0
 */
@Service
public class DemoServiceImpl implements DemoService {

  @Autowired
  DemoMapper demoMapper;

  public int insert(Demo demo) {
    return demoMapper.insert(demo);
  }
}
