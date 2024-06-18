package com.soft.hr.config;


import com.soft.hr.exception.MyException;
import com.soft.hr.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @version 1.0
 * @Author WenYaFei
 * @date 2024/6/5 15:26
 * @description
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {
	/**
	 * 处理业务异常
	 *
	 * @param req
	 * @param e
	 * @return
	 */
	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public Result ExceptionHandler(HttpServletRequest req, Exception e) {
		log.error("发生异常！原因是：{}", e.toString());
		// 注解异常校验
		if (e instanceof MethodArgumentNotValidException) {
			MethodArgumentNotValidException ee = (MethodArgumentNotValidException) e;
			return Result.error(ee.getBindingResult().getAllErrors().stream().findFirst().get().getDefaultMessage());
		}
		// 自定义校验
		if (e instanceof MyException) {
			MyException ee = (MyException) e;
			return Result.error(ee.getErrorMsg());
		}
		return Result.error(e.getMessage());
	}

}
