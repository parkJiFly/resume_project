package com.soft.hr.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.soft.hr.entity.ResumeSkillEntity;
import com.soft.hr.mapper.ResumeSkillMapper;
import com.soft.hr.service.IResumeSkillService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @version 1.0
 * @Author WenYaFei
 * @date 2024-06-18 16:37:26
 * @description 技能表(ResumeSkill)表服务实现类
 */
@Service
@Slf4j
public class ResumeSkillServiceImpl extends ServiceImpl<ResumeSkillMapper, ResumeSkillEntity> implements IResumeSkillService {

	@Autowired
	private ResumeSkillMapper resumeSkillMapper;

}
