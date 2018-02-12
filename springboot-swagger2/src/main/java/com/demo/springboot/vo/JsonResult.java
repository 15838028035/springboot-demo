
package com.demo.springboot.vo;

/**
  * @description:JSON返回数据
 * @author yt.wei
  * @date 2018/2/11 9:03
  * @version 0.1
  */
public class JsonResult {

    private String status;
    
    private Object result;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}

