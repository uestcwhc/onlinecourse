package com.course.server.service;

import com.course.server.domain.Chapter;
import com.course.server.domain.ChapterExample;
import com.course.server.domain.Test;
import com.course.server.domain.TestExample;
import com.course.server.mapper.ChapterMapper;
import com.course.server.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class ChapterService {
    @Resource
    private ChapterMapper chapterMapper;
    public List<Chapter> list(){
        ChapterExample chapterExample = new ChapterExample();
        chapterExample.setOrderByClause("id desc");
        chapterExample.createCriteria().andIdEqualTo("1");
        return chapterMapper.selectByExample(chapterExample);
    }
}
