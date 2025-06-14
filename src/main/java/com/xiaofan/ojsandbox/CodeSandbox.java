package com.xiaofan.ojsandbox;


import com.xiaofan.ojsandbox.model.ExecuteCodeRequest;
import com.xiaofan.ojsandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
