package com.soft.hr.controller;

import com.soft.hr.service.IResumeProjectExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @Author WenYaFei
 * @date 2024-06-18 16:37:25
 * @description 项目经验表(ResumeProjectExperience)控制层
 */
@RestController
@RequestMapping("/resumeProjectExperience")
public class ResumeProjectExperienceController {

	/**
	 * 服务对象
	 */
	@Autowired
	private IResumeProjectExperienceService iResumeProjectExperienceService;

}

