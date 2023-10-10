package com.currentcad.sdk.export;

import com.current.tps.sdk.sdk.SDK;

import java.io.File;

/**
 * 导出图纸 dwg，pdf，svg，png
 */
public class ExportFile {
    public static void main(String[] args) {
        SDK sdk = new SDK();
        //由公司颁发的账号密码
        sdk.setUsername("xxxxxxxxx");
        sdk.setPassword("xxxxxx");
        //请求参数为图纸id， 导出图纸存放的父级目录：C:\\file
        //导出dwg
        File dwg = sdk.exportDwg("xxxxx", "xxxxxxx");
        //导出pdf
        File pdf = sdk.exportPdf("xxxxx", "xxxx");
        //导出svg
        File svg = sdk.exportSvg("xxxx", "xxxxx");
        //导出png
        File png = sdk.exportPng("xxxx", "xxxxx");
    }
}
