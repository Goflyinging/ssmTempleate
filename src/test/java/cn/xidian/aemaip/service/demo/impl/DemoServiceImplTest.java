package cn.xidian.aemaip.service.demo.impl;

import cn.xidian.aemaip.dao.demo.DemoMapper;
import cn.xidian.aemaip.entity.demo.Demo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * DemoServiceImpl Tester.
 *
 * @author <lxing>
 * @version 1.0
 * @since <pre>10/10/2017</pre>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class DemoServiceImplTest {

  @Before
  public void before() throws Exception {
  }

  @After
  public void after() throws Exception {
  }

  @Autowired
  DemoMapper demoMapper;

  /**
   * Method: insert()
   */
  @Test
  public void testInsert() throws Exception {
    Demo demo = new Demo();
    demo.setName("demo");
    demo.setNumber(20);
    demoMapper.insert(demo);
  }


} 
