package com.chigua.cloud.common.result;

/**
 * @ClassName: Result
 * @Description: 统一返回信息
 * @author Mr.zhou
 * @date 2018年10月30日 上午11:03:02
 * 
 * @param <T>
 */
public class Result <T>{
	private int code;//状态码
	 
    private String msg;//信息

    private Object data;//数据

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
    
    
}
