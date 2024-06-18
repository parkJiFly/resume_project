package com.soft.hr.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @version 1.0
 * @Author WenYaFei
 * @date 2024-06-18 16:37:26
 * @description
 */
@Data
@TableName("resume_user")
public class ResumeUserEntity extends BaseEntity implements Serializable {

	/**
	 * 用户姓名
	 */
	@TableField("name")
	private String name;

	/**
	 * 性别标识，M-男，F-女
	 */
	@TableField("sex")
	private String sex;

	/**
	 * 出生日期
	 */
	@TableField("birthday")
	private Date birthday;

	/**
	 * 就职公司名称
	 */
	@TableField("company")
	private String company;

	/**
	 * 入职时间
	 */
	@TableField("hire_date")
	private Date hireDate;

	/**
	 * 学历，1大专 2本科
	 */
	@TableField("degree")
	private Integer degree;

	/**
	 * 毕业院校名称
	 */
	@TableField("school")
	private String school;

	/**
	 * 学习专业
	 */
	@TableField("major")
	private String major;

	/**
	 * 毕业日期
	 */
	@TableField("graduation_date")
	private Date graduationDate;

	/**
	 * 岗位
	 */
	@TableField("post")
	private String post;

}

