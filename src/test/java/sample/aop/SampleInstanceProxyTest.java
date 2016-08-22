package sample.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sample.aop.service.HelloWorldService;

/**
 * Created by hjpark on 2016. 8. 23..
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SampleInstanceProxyTest {

    @Autowired
    HelloWorldService springInstanceService;

    @Test
    public void instanceProxyTest() {
        String first = springInstanceService.getHelloMessage();

        HelloWorldService newInstance = new HelloWorldService();
        String second = newInstance.getHelloMessage();

        System.out.println("first: " + first + ", second: " + second);
    }

}