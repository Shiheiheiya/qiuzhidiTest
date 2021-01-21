package com.qiuzhidi.controller;

import com.qiuzhidi.pojo.CmsRecruit;
import com.qiuzhidi.service.CmsRecruitService;
import com.qiuzhidi.utils.Page;
import com.qiuzhidi.vo.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 招聘信息管理
 */
@Controller
public class CmsRecruitController {
    @Autowired
    CmsRecruitService cmsRecruitService;

    /**
     * 获取招聘信息
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "/recruit/information", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<Page> information(@RequestParam(value = "pageNum", required = true) Integer pageNum,
                                          @RequestParam(value = "pageSize", required = true) Integer pageSize){
        Page page = cmsRecruitService.information(pageNum, pageSize);
        CommonResult<Page> commonResult = new CommonResult<>("查询招聘信息成功！",page);
        return commonResult;
    }

    /**
     * 根据isClose获取相应招聘信息
     * @param isClose
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "/recruit/getRecruitList",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<Page> getRecruitList(@RequestParam(value = "isClose", required = true)Integer isClose,
                                             @RequestParam(value = "pageNum", required = true) Integer pageNum,
                                             @RequestParam(value = "pageSize", required = true) Integer pageSize){
        Page page = cmsRecruitService.getRecruitList(isClose, pageNum, pageSize);
        CommonResult<Page> commonResult = new CommonResult<>("操作成功！", page);
        return commonResult;
    }

    /**
     * 企业用户发布招聘
     * @param recruit_salary
     * @param recruit_name
     * @param recruit_workspace
     * @param department
     * @param type
     * @param skill_required
     * @param job_description
     * @param companyId
     * @param memberId
     * @param minDegree
     * @param isPositive
     * @param practiceTime
     * @param sellingPoints
     * @param recruitNum
     * @return
     */
    @RequestMapping(value = "/recruit/releaseRecruit", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Object> releaseRecruit(@RequestParam(value = "recruit_salary", required = true)String recruit_salary,
                                       @RequestParam(value = "recruit_name", required = true)String recruit_name,
                                       @RequestParam(value = "recruit_workspace", required = true)String recruit_workspace,
                                       @RequestParam(value = "department", required = false)String department,
                                       @RequestParam(value = "type", required = true)Integer type,
                                       @RequestParam(value = "skill_required", required = true)String skill_required,
                                       @RequestParam(value = "job_description", required = true)String job_description,
                                       @RequestParam(value = "companyId", required = true)Long companyId,
                                       @RequestParam(value = "memberId", required = true)Long memberId,
                                       @RequestParam(value = "minDegree", required = true)String minDegree,
                                       @RequestParam(value = "isPositive", required = true)Integer isPositive,
                                       @RequestParam(value = "practiceTime", required = true)String practiceTime,
                                       @RequestParam(value = "sellingPoints", required = true)String sellingPoints,
                                       @RequestParam(value = "recruitNum", required = true)Integer recruitNum
                                       ){
        CmsRecruit cmsRecruit = new CmsRecruit();
        cmsRecruit.setRecruitSalary(recruit_salary);
        cmsRecruit.setRecruitName(recruit_name);
        cmsRecruit.setRecruitWorkspace(recruit_workspace);
        cmsRecruit.setDepartment(department);
        cmsRecruit.setType(type);
        cmsRecruit.setSkillRequired(skill_required);
        cmsRecruit.setJobDescription(job_description);
        cmsRecruit.setCompanyId(companyId);
        cmsRecruit.setMemberId(memberId);
        cmsRecruit.setMinDegree(minDegree);
        cmsRecruit.setIsPositive(isPositive);
        cmsRecruit.setPracticeTime(practiceTime);
        cmsRecruit.setSellingPoints(sellingPoints);
        cmsRecruit.setRecruitNum(recruitNum);

        CommonResult<Object> commonResult = new CommonResult<>();
        int rows =  cmsRecruitService.releaseRecruit(cmsRecruit);
        if(rows > 0){
            commonResult.setCode(200);
            commonResult.setMessage("添加成功");
        }else {
            commonResult.setCode(201);
            commonResult.setMessage("添加失败");
        }
        return commonResult;
    }

    /**
     * 关闭招聘
     * @param recruitId
     * @return
     */
    @RequestMapping(value = "/recruit/closeRecruitByRecruitId" ,method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Object> closeRecruitByRecruitId(@RequestParam(value = "recruitId",required = true)Long recruitId){
        CommonResult<Object> commonResult = new CommonResult<>();
        int rows = cmsRecruitService.closeRecruitByRecruitId(recruitId);
        if(rows > 0){
            commonResult.setCode(200);
            commonResult.setMessage("关闭成功");
        }else {
            commonResult.setCode(201);
            commonResult.setMessage("关闭失败");
        }
        return commonResult;
    }
}
