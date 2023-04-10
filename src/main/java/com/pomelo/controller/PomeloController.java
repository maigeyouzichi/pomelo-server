package com.pomelo.controller;

import com.alibaba.fastjson.JSON;
import com.pomelo.controller.req.WxPayNoticeReq;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lihao on 2023/3/19
 */
@RestController
@RequestMapping("/pomelo")
@Slf4j
public class PomeloController {

    @GetMapping
    public String get() {
        return "Hi, i am pomelo-server, build by jenkins !";
    }

    @PostMapping("/notify/scanpay")
    public void parseScanPayNotifyResult(@RequestBody WxPayNoticeReq req) {
        log.info("微信支付回调数据:{}", JSON.toJSONString(req));
    }
}
