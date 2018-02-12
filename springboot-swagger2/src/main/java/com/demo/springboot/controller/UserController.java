package com.demo.springboot.controller;

import com.demo.springboot.vo.JsonResult;
import com.demo.springboot.vo.PageVO;
import com.demo.springboot.vo.UserVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yt.wei
 * @version 0.1
 * @description:用户控制器
 * @date 2018/2/11 9:35
 */
@Api(value = "用户管理API", tags = "用户管理接口", description = "用户管理相关API接口，实现类UserController", produces = "application/json")
@RestController
@RequestMapping("/api/v1/usm/user")
public class UserController {

    /**
     * 日志打印
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @ApiOperation(value = "删除用户接口", notes = "基于用户标识删除用户信息", httpMethod = "DELETE")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户标识", required = true, dataType = "Long", paramType = "path")})
    @DeleteMapping(value = "/{id}")
    public JsonResult delUser(@PathVariable("id") Long id) {
        LOGGER.debug("start del user");
        JsonResult result = new JsonResult();
        result.setStatus("success");
        result.setResult(id);
        LOGGER.debug("delete user successfully.");
        return result;
    }

    @ApiOperation(value = "用户列表", notes = "查询用户列表", httpMethod = "GET")
    @GetMapping(value = "/users")
    public JsonResult queryUserList() {
        JsonResult result = new JsonResult();
        result.setStatus("success");
        List<UserVO> userVOList = new ArrayList<>();
        UserVO userVO = new UserVO();
        userVO.setUserId(100L);
        userVO.setUsername("张三");
        userVOList.add(userVO);
        result.setResult(userVOList);
        return result;
    }

    @ApiOperation(value = "分页查询用户列表", notes = "分页查询用户列表:UserController.queryUserByPage")
    @GetMapping(value = "/userpage")
    public JsonResult queryUserByPage(@RequestParam(value = "pageSize") Integer pageSize,
            @RequestParam(value = "pageNo") Integer pageNo, @RequestParam String userName) {
        JsonResult result = new JsonResult();
        result.setStatus("success");
        PageVO<UserVO> pageVO = new PageVO<>();
        pageVO.setPageSize(pageSize);
        pageVO.setPageNo(pageNo);
        List<UserVO> userVOList = new ArrayList<>();
        UserVO userVO = new UserVO();
        userVO.setUsername(userName);
        userVOList.add(userVO);
        pageVO.setData(userVOList);
        result.setResult(pageVO);
        return result;
    }

    @ApiOperation(value = "分页列表查询-ModelAttribute获取参数", notes = "分页查询用户列表:UserController.queryUserListByPage")
    @GetMapping(value = "/userlistpage")
    public JsonResult queryUserListByPage(@RequestParam(value = "pageSize") Integer pageSize,
            @RequestParam(value = "pageNo") Integer pageNo, @ModelAttribute UserVO userVO) {
        JsonResult result = new JsonResult();
        result.setStatus("success");
        PageVO<UserVO> pageVO = new PageVO<>();
        pageVO.setPageSize(pageSize);
        pageVO.setPageNo(pageNo);
        List<UserVO> userVOList = new ArrayList<>();
        userVOList.add(userVO);
        pageVO.setData(userVOList);
        result.setResult(pageVO);
        return result;
    }

    @ApiOperation(value = "新增用户接口", notes = "新增用户接口，主键自动生成")
    @PostMapping
    public JsonResult addUser(@RequestBody UserVO user) {
        JsonResult result = new JsonResult();
        result.setStatus("success");
        result.setResult(user);
        return result;
    }

    @ApiOperation(value = "修改用户接口", notes = "修改用户基本信息", httpMethod = "PUT")
    @PutMapping
    public JsonResult updateUser(@RequestBody UserVO user) {
        JsonResult result = new JsonResult();
        result.setStatus("success");
        result.setResult(user);
        return result;
    }
}
