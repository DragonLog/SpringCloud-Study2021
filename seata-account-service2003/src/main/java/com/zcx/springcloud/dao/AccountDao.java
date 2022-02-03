package com.zcx.springcloud.dao;

import org.apache.ibatis.annotations.Param;
import java.math.BigDecimal;

public interface AccountDao {

    /**
     * 扣减账户余额
     */
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
