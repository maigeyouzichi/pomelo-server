package com.pomelo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
        return "coding me";
    }

    @PostMapping("/notify/scanpay")
    public String parseScanPayNotifyResult(String xmlData) {
        log.info("微信支付回调数据:{}", xmlData);
        return xmlData;
    }
}
