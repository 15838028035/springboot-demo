package com.demo.springboot.controller;

import com.demo.springboot.vo.JsonResult;
import com.demo.springboot.vo.OrgVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
  * @description:组织机构接口
  * @author yt.wei
  * @date 2018/2/11 13:46
  * @version 0.1
  */
@Api(tags = {"组织结构接口"})
@RestController
@RequestMapping(value = "/api/v1/usm/org")
public class OrgController {
    /**
     * 日志打印
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(OrgController.class);

    @ApiOperation(value="查询组织机构列表", notes = "查询组织机构")
    @GetMapping(value = "/query")
    public JsonResult queryOrgs(){
        LOGGER.debug("start to call queryOrgs......");
        JsonResult result = new JsonResult();
        result.setStatus("success");
        List<OrgVO> orgVOList = new ArrayList<>();
        OrgVO orgVO = new OrgVO();
        orgVO.setOrgId(1L);
        orgVO.setOrgName("orgname");
        orgVOList.add(orgVO);
        result.setResult(orgVOList);
        return result;
    }
}
