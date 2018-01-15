package com.demoProvider.dao;

import org.springframework.stereotype.Repository;

import com.demoApi.domain.Tuser;

@Repository
public interface TUserMapper {
	int deleteByPrimaryKey(Integer id);

    int insert(Tuser record);

    Tuser selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(Tuser record);
}
