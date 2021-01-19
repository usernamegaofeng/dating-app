package pers.feng.sms;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pers.dating.sso.SingleSignOnServiceApplication;
import pers.dating.sso.sms.SmsService;

/**
 * @author Gaofeng
 * @date 2021/1/19 下午9:50
 * @description:
 */
@SpringBootTest(classes = SingleSignOnServiceApplication.class)
@RunWith(SpringRunner.class)
public class SmsTest {

    @Autowired
    private SmsService smsService;

    @Test
    public void test(){
        String result = smsService.sendSms("13164663865");
        System.out.println(result);
    }
}
