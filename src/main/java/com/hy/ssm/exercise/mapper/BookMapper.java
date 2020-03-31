package com.hy.ssm.exercise.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hy.ssm.exercise.entity.users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.HashSet;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author mq
 * @since 2020-03-24
 */
@Mapper
public interface BookMapper extends BaseMapper<users> {



    @Select("select r.r_name from users_role u , users uu , role r  where u.u_id=uu. u_id and r.r_id=u.r_id and uu.username=#{value}")
    public HashSet<String> roles(String user);

    @Select("select  j_url from jurisdiction where j_id in (select distinct j_id from role_jurisdiction where r_id in (select  r_id from users_role where u_id=(select u_id from users where username=#{value})))")
    public HashSet<String> users_jurisdiction(String user);

    @Select("select j.j_url from users_jurisdiction u inner join jurisdiction j where u.j_id=j.j_id and u_id=(select u_id from users where username=#{value})")
    public HashSet<String> users_jurisdiction2(String user);
}
