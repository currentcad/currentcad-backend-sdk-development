package com.currentcad.sdk.project;

import com.current.servicemanager.sdk.service.SDKService;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * CreateProject
 *
 * @author hp
 * @version 2023/12/21 10:25
 **/
public class CreateProject {
    public static void main(String[] args) {
        //由公司颁发的账号密码
        SDKService sdk = new SDKService("xxxxxxxxxx", "xxxxxx");
        //files  需要导入的图纸   projectId   项目id
        List<File> fileList = new ArrayList<>();
        sdk.importDrawings(fileList, "xxxxxx");
    }
}

