package com.soft.hr.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @version 1.0
 * @Author WenYaFei
 * @date 2024-06-18 16:37:25
 * @description
 */
@Data
@TableName("resume_project_experience")
public class ResumeProjectExperienceEntity extends BaseEntity implements Serializable {

	private static final long serialVersionUID = -94018180071428941L;


	/**
	 * 外键，关联用户基本信息表
	 */
	@TableField("user_id")
	private String userId;

	/**
	 * 项目名称
	 */
	@TableField("project_name")
	private String projectName;

	/**
	 * 项目开发所使用的工具或环境
	 */
	@TableField("dev_tool")
	private String devTool;

	/**
	 * 项目简要描述
	 */
	@TableField("project_description")
	private String projectDescription;

	/**
	 * 在项目中的角色和贡献
	 */
	@TableField("responsibility")
	private String responsibility;

}

