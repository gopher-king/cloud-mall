package com.boot.data;
/**
 * @author 游政杰
 */
public class layuiJSON {


    private boolean success;
    private String msg;


    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "layuiArticleJSON{" +
                "success=" + success +
                ", msg='" + msg + '\'' +
                '}';
    }
}
