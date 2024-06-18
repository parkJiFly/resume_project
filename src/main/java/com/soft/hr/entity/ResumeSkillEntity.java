package com.soft.hr.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @version 1.0
 * @Author WenYaFei
 * @date 2024-06-18 16:37:26
 * @description
 */
@Data
@TableName("resume_skill")
public class ResumeSkillEntity extends BaseEntity implements Serializable {

	/**
	 * 外键，关联用户基本信息表
	 */
	@TableField("user_id")
	private String userId;

	/**
	 * 技能或工具名称
	 */
	@TableField("skill_description")
	private String skillDescription;

}

