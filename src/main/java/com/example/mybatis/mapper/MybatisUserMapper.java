package com.example.mybatis.mapper;

import com.example.mybatis.entity.MybatisUser;
import com.example.mybatis.page.MybatisUserParam;

import java.util.List;

public interface MybatisUserMapper {
    List<MybatisUser> getAll();

    MybatisUser getOne(long id);

    void insert(MybatisUser user);

    void update(MybatisUser user);

    void delete(Long id);

    List<MybatisUser> getList(MybatisUserParam mybatisUserParam) ;
    int getCount(MybatisUserParam mybatisUserParam) ;

}
