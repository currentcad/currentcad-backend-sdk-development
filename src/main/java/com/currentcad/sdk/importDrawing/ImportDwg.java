package com.currentcad.sdk.importDrawing;


import com.current.servicemanager.sdk.entity.Drawing;
import com.current.servicemanager.sdk.service.SDKService;

import java.io.File;

/**
 * DWG图纸导入
 * @author hp
 */
public class ImportDwg {
    public static void main(String[] args) {
        //由公司颁发的账号密码,需要链接的环境  如current环境 https://www.currentcad.com
        SDKService sdk = new SDKService("xxxxxxxx", "xxxxxxx", "xxxxxx");
        //需要导入的文件
        File file = new File("xxxxxx");
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
