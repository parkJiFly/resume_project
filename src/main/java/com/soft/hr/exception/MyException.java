package com.soft.hr.exception;

import lombok.Data;

/**
 * @version 1.0
 * @Author WenYaFei
 * @date 2024/6/18 11:16
 * @description 自定义错误类型
 */
@Data
public class MyException extends RuntimeException{
	private int errorCode;
	private String errorMsg;

	public MyException(){
		super();
	}

	public MyException(String errorMsg){
		super(errorMsg);
		this.errorMsg = errorMsg;
	}

	public MyException(int errorCode, String errorMsg){
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}
}
