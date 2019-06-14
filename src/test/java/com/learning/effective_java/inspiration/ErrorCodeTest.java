package com.learning.effective_java.inspiration;

import org.junit.Test;

/**
 * @author kian
 * @date 2019/6/14
 */
public class ErrorCodeTest {

    @Test
    public void testErrorCode(){
        System.out.println(ErrorCode.MONGO_ERROR.errorResponse());
        System.out.println(ErrorCode.PARAMETER_ERROR.errorResponse());
    }
}
