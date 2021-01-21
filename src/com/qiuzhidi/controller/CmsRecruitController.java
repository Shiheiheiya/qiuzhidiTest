package com.qiuzhidi.controller;

import com.qiuzhidi.pojo.CmsRecruit;
import com.qiuzhidi.service.CmsRecruitService;
import com.qiuzhidi.utils.Page;
import com.qiuzhidi.vo.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 招聘信息管理
 */
@Controller
public class CmsRecruitController {
    @Autowired
    CmsRecruitService cmsRecruitService;

    @RequestMapping(value = "/recruit/information", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<Page> information(@RequestParam(value = "pageNum", required = true) Integer pageNum,
                                          @RequestParam(value = "pageSize", required = true) Integer pageSize){
        Page page = cmsRecruitService.information(pageNum, pageSize);
        CommonResult<Page> commonResult = new CommonResult<>("查询招聘信息成功！",page);
        return commonResult;
    }
}
