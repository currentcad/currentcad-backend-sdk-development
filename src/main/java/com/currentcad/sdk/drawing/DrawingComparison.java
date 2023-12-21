package com.currentcad.sdk.drawing;

import com.current.servicemanager.sdk.service.SDKService;

/**
 * DrawingComparison
 *
 * @author hp
 * @version 2023/12/21 11:05
 **/
public class DrawingComparison {
    public static void main(String[] args) {
        //由公司颁发的账号密码
        SDKService sdk = new SDKService("xxxxxxxxxx", "xxxxxx");
        //aDrawingId bDrawingId  需要对比的两张图纸id
        String comparisonUrl = sdk.drawingComparison("", "");
        //将返回的url  copy到浏览器
    }
}

