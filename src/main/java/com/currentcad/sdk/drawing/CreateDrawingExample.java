package com.currentcad.sdk.drawing;

import com.current.servicemanager.sdk.entity.Drawing;
import com.current.servicemanager.sdk.service.SDKService;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * CurrentCAD token获取示例
 */
public class CreateDrawingExample {
//    public static void main(String[] args) {
//        //由公司颁发的账号密码
//        SDKService sdk = new SDKService("xxxxxxxxxx", "xxxxxx");
//
//        Drawing drawing = sdk.createDrawing("ysx");
//        System.out.println(drawing);
//    }

    public static void main(String[] args) {
        //由公司颁发的账号密码
        SDKService sdk = new SDKService("xxxxxxxxxx", "xxxxxx");
        //files  需要导入的图纸   projectId   项目id
        List<File> fileList = new ArrayList<>();
        sdk.importDrawings(fileList, "xxxxxx");
    }
}
