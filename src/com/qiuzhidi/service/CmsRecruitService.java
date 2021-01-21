package com.qiuzhidi.service;

import com.qiuzhidi.pojo.CmsRecruit;
import com.qiuzhidi.utils.Page;
import com.qiuzhidi.vo.CommonResult;

import java.util.List;

public interface CmsRecruitService {
    Page information(Integer pageNum, Integer pageSize);

    Page getRecruitList(Integer isClose, Integer pageNum, Integer pageSize);

    int releaseRecruit(CmsRecruit cmsRecruit);

    int closeRecruitByRecruitId(Long recruitId);
}

