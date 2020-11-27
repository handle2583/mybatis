package com.example.mybatis;

import com.example.mybatis.entity.MybatisUser;
import com.example.mybatis.enums.MybatisUserSexEnum;
import com.example.mybatis.mapper.MybatisUserMapper;
import com.example.mybatis.page.MybatisUserParam;
import com.example.mybatis.result.Page;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisUserTest {

    @Resource
    MybatisUserMapper mybatisUserMapper;

    @Test
    public void testInsert() throws Exception {
        MybatisUser mybatisUser = new MybatisUser("miao", "123456", MybatisUserSexEnum.MALE);
        MybatisUser mybatisUser2 = new MybatisUser("jian", "23456", MybatisUserSexEnum.MALE);

        mybatisUserMapper.insert(mybatisUser);
        mybatisUserMapper.insert(mybatisUser2);



    }

    @Test
    public void testUpdate() {
         mybatisUserMapper.update(new MybatisUser(1,"miao","23456" , MybatisUserSexEnum.FEMALE));
    }

    @Test
    public void testGetOne(){

        MybatisUser user = mybatisUserMapper.getOne(1) ;
        System.out.println(user);
    }

    @Test
    public void testGetAll(){

        List<MybatisUser> list = mybatisUserMapper.getAll() ;
        for(MybatisUser user:list){
            System.out.println(user);
        }
    }

    @Test
    public void testPage(){

        MybatisUserParam userParam = new MybatisUserParam() ;
        userParam.setUserName("miao");
        userParam.setUserSex("MALE");
        List<MybatisUser> list = mybatisUserMapper.getList(userParam) ;

        for(MybatisUser user:list){
            System.out.println(user);
        }

        long count  = mybatisUserMapper.getCount(userParam) ;
        Page page = new Page(userParam,count , list);
        System.out.println(page);
    }
}
