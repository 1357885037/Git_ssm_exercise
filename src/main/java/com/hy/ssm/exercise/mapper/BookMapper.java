package com.hy.ssm.exercise.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hy.ssm.exercise.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author mq
 * @since 2020-03-24
 */
@Mapper
public interface BookMapper extends BaseMapper<Book> {

    @Select("select * from book")
    public List<Book> CZZ();
}
