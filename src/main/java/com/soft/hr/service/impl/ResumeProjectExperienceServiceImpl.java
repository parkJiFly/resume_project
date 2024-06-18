package com.soft.hr.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.soft.hr.entity.ResumeProjectExperienceEntity;
import com.soft.hr.mapper.ResumeProjectExperienceMapper;
import com.soft.hr.service.IResumeProjectExperienceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @version 1.0
 * @Author WenYaFei
 * @date 2024-06-18 16:37:25
 * @description 项目经验表(ResumeProjectExperience)表服务实现类
 */
@Service
@Slf4j
public class ResumeProjectExperienceServiceImpl extends ServiceImpl<ResumeProjectExperienceMapper, ResumeProjectExperienceEntity> implements IResumeProjectExperienceService {

	@Autowired
	private ResumeProjectExperienceMapper resumeProjectExperienceMapper;

}
