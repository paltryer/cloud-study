package com.chnsys.springcloud.controller;

import com.chnsys.springcloud.entities.CommonResult;
import com.chnsys.springcloud.entities.Payment;
import com.chnsys.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author Wangchao
 * @version 1.0
 * @description 支付Controller
 * @date 2021/5/1 21:38
 */

@RestController
@Slf4j
public class PaymentController {

    @Resource
    PaymentService paymentService;


    @PostMapping(value = "/payment/create")
    public CommonResult<?> create(@RequestBody Payment payment) {
        int i = paymentService.create(payment);
        log.info("*****插入结果:" + i);
        if (i > 0) {
            return new CommonResult(200, "插入数据库成功", i);
        }
        return new CommonResult(444, "插入数据库失败");
    }


    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<?> getPaymentById(@PathVariable("id") Long id) {
        Payment paymentById = paymentService.getPaymentById(id);
        if (paymentById != null) {
            return new CommonResult(200, "查询成功", paymentById);
        }
        return new CommonResult(444, "查询失败");
    }

}
