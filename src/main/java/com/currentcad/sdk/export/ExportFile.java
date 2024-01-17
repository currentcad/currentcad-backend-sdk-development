package com.currentcad.sdk.export;



import com.current.servicemanager.sdk.service.SDKService;

import java.io.File;

/**
 * 导出图纸 dwg，pdf，svg，png
 */
public class ExportFile {
    public static void main(String[] args) {
        //由公司颁发的账号密码,需要链接的环境  如current环境 https://www.currentcad.com
        SDKService sdk = new SDKService("xxxxxxxxxx", "xxxxxx", "");
        //请求参数为图纸id， 导出图纸存放的父级目录：C:\\file
        //导出dwg
        File dwg = sdk.exportDwg("3:8312a695f12c4d989192d7793f2b741e", "D:\\file-test");
        System.out.println(dwg.getName());
//        //导出pdf
//        File pdf = sdk.exportPdf("xxxxx", "xxxx");
//        //导出svg
//        File svg = sdk.exportSvg("xxxx", "xxxxx");
//        //导出png
//        File png = sdk.exportPng("xxxx", "xxxxx");
    }
}
