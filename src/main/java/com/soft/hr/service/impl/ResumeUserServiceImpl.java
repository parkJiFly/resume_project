package com.soft.hr.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.soft.hr.entity.ResumeUserEntity;
import com.soft.hr.mapper.ResumeUserMapper;
import com.soft.hr.service.IResumeUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @version 1.0
 * @Author WenYaFei
 * @date 2024-06-18 16:37:27
 * @description 用户基本信息表(ResumeUser)表服务实现类
 */
@Service
@Slf4j
public class ResumeUserServiceImpl extends ServiceImpl<ResumeUserMapper, ResumeUserEntity> implements IResumeUserService {

	@Autowired
	private ResumeUserMapper resumeUserMapper;

}
