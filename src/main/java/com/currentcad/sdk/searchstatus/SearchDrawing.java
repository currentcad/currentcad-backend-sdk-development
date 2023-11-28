package com.currentcad.sdk.searchstatus;


import com.current.servicemanager.sdk.entity.Drawing;
import com.current.servicemanager.sdk.service.SDKService;

/**
 * 查询图纸导入状态
 */
public class SearchDrawing {
    public static void main(String[] args) {
        //由公司颁发的账号密码
        SDKService sdk = new SDKService("xxxxxxxxxx", "xxxxxx");
        //查询参数为drawingId/materialCode
        Drawing drawing = sdk.getDrawingStatus("xxxxxx");
        System.out.println(drawing);
    }
}
