package com.chnsys.springcloud.service.impl;

import com.chnsys.springcloud.dao.PaymentDao;
import com.chnsys.springcloud.entities.Payment;
import com.chnsys.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Wangchao
 * @version 1.0
 * @description
 * @date 2021/5/1 21:35
 */
@Service
public class PaymentServiceImpl implements PaymentService {


    @Resource
    private PaymentDao paymentDao;


    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
