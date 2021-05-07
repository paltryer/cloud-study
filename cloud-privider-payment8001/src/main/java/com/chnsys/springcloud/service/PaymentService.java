package com.chnsys.springcloud.service;

import com.chnsys.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author W
 * @version 1.0
 * @description TODO
 * @date 2021/5/1 21:35
 */
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(Long id);

}
