package com.qiuzhidi.service.impl;

import com.github.pagehelper.PageHelper;
import com.qiuzhidi.mapper.CmsRecruitMapper;
import com.qiuzhidi.pojo.CmsRecruit;
import com.qiuzhidi.pojo.CmsRecruitExample;
import com.qiuzhidi.service.CmsRecruitService;
import com.qiuzhidi.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CmsRecruitServiceImpl implements CmsRecruitService {

    @Autowired
    CmsRecruitMapper cmsRecruitMapper;

    /**
     * 根据页号和页面大小查询招聘信息
     * @param pageNum 页号
     * @param pageSize 页面大小
     * @return
     */
    @Override
    public Page information(Integer pageNum, Integer pageSize) {
        Page<CmsRecruit> page = new Page<>();
        page.setPage(pageNum);
        page.setSize(pageSize);
        CmsRecruitExample cmsRecruitExample = new CmsRecruitExample();
        page.setTotal(cmsRecruitMapper.selectByExample(cmsRecruitExample).size());
        PageHelper.startPage(pageNum,pageSize);
        List<CmsRecruit> cmsRecruitList = cmsRecruitMapper.selectByExample(cmsRecruitExample);
        page.setRows(cmsRecruitList);
        return page;
    }
}
