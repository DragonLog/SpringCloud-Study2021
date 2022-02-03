package com.zcx.springcloud.myHandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.zcx.springcloud.entities.CommonResult;
import com.zcx.springcloud.entities.Payment;

public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(4444, "按客户自定义", new Payment(2020L, "serial003----1"));
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(4444, "按客户自定义", new Payment(2020L, "serial003----2"));
    }

}
