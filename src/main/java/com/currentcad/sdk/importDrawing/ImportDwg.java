package com.currentcad.sdk.importDrawing;


import com.current.servicemanager.sdk.entity.Drawing;
import com.current.servicemanager.sdk.service.SDKService;

import java.io.File;

/**
 * DWG图纸导入
 */
public class ImportDwg {
    public static void main(String[] args) {
        //由公司颁发的账号密码
        SDKService sdk = new SDKService("xxxxxxxxxx", "xxxxxx");
        File file = new File("C:\\Users\\hp\\Desktop\\三维图档测试文件\\dwg\\行星轮支架.dwg");
        //dwg图纸导入
        Drawing drawing;
        drawing = sdk.importFile(file);
        //dwg携带料号
//        List<String> materialCodes = new ArrayList<>();
//        materialCodes.add("123");
//        drawing = sdk.importFile(file, materialCodes);

        System.out.println(drawing);
    }
}
