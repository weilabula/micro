package aaa.microfinance.utils;

import org.springframework.stereotype.Component;

/**
 * @author zhangyi
 * @description ����ͳһ�ش�ʵ����
 * @company AAA���
 * @className QY95
 * 2019��4��9������7:51:26
 */
@Component
public class ReturnModel {
	private int code;
	private boolean status;
	private String message;
	private Object object;
	
	public ReturnModel() {
		super();
	}
	public ReturnModel(int code, boolean status, String message, Object object) {
		super();
		this.code = code;
		this.status = status;
		this.message = message;
		this.object = object;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
	
}
