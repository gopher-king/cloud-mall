package com.boot.controller;

import com.boot.pojo.VersionInfo;
import com.boot.service.VersionInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path = "/versioninfo")
public class VersionInfoController {

    @Autowired
    private VersionInfoService versionInfoService;


    @ResponseBody
    @GetMapping(path = "/selectVersionInfoByPid/{pid}")
    public List<VersionInfo> select(@PathVariable("pid") long pid)
    {
        return versionInfoService.selectVersionInfoByPid(pid);
    }


}
