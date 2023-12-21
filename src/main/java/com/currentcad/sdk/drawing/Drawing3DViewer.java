package com.currentcad.sdk.drawing;

import com.current.servicemanager.sdk.service.SDKService;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Drawing3DViewer
 *
 * @author hp
 * @version 2023/12/21 11:01
 **/
public class Drawing3DViewer {
    public static void main(String[] args) {
        //由公司颁发的账号密码
        SDKService sdk = new SDKService("xxxxxxxxxx", "xxxxxx");
        //drawingId   需要查看的三维图纸id
        String viewUrl = sdk.viewDrawing("xxxx");
        //将返回的url  copy到浏览器
    }
}

