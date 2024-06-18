package com.soft.hr.controller;

import com.soft.hr.service.IResumeSkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @Author WenYaFei
 * @date 2024-06-18 16:37:26
 * @description 技能表(ResumeSkill)控制层
 */
@RestController
@RequestMapping("/resumeSkill")
public class ResumeSkillController {

	/**
	 * 服务对象
	 */
	@Autowired
	private IResumeSkillService iResumeSkillService;

}

