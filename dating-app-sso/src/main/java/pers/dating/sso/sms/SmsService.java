package pers.dating.sso.sms;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Gaofeng
 * @date 2021/1/19 下午9:33
 * @description: 短信发送服务
 */
@Service
@Slf4j
public class SmsService {

    private final static ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 发送短信
     *
     * @param mobile 手机号码
     * @return
     */
    public String sendSms(String mobile) {
        String url = "https://open.ucpaas.com/ol/sms/sendsms";
        Map<String, Object> params = new HashMap<>();
        params.put("sid", "2350769580893453d18eaeb229181090");
        params.put("token", "b7d36d433d2064da4a0c58cd5c2cc634");
        params.put("appid", "73dcb7e330514d4bb8ff89c49d797217");
        params.put("templateid", "583675");
        params.put("mobile", mobile);
        //生成4位数验证
        params.put("param", RandomUtils.nextInt(100000, 999999));
        //发起请求
        ResponseEntity<String> responseEntity = this.restTemplate.postForEntity(url, params, String.class);
        String body = responseEntity.getBody();
        JsonNode jsonNode = null;
        try {
            jsonNode = objectMapper.readTree(body);
            if (StringUtils.equals(jsonNode.get("code").textValue(), "000000")) {
                return String.valueOf(params.get("param"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
