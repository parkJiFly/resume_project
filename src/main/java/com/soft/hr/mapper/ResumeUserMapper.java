package com.soft.hr.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.soft.hr.entity.ResumeUserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @version 1.0
 * @Author WenYaFei
 * @date 2024-06-18 16:37:27
 * @description 用户基本信息表(ResumeUser)mapper层
 */
@Mapper
public interface ResumeUserMapper extends BaseMapper<ResumeUserEntity> {

}

