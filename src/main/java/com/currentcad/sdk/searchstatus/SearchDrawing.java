package com.currentcad.sdk.searchstatus;


import com.current.servicemanager.sdk.entity.Drawing;
import com.current.servicemanager.sdk.service.SDKService;

/**
 * 查询图纸导入状态
 * @author hp
 */
public class SearchDrawing {
    public static void main(String[] args) {
        //由公司颁发的账号密码,需要链接的环境  如current环境 https://www.currentcad.com
        SDKService sdk = new SDKService("xxxxxx", "xxxxx", "");
        //查询参数为drawingId/materialCode
        Drawing drawing = sdk.getDrawingStatus("3:88f888622ce64e5b92e2538c571c445d");
        System.out.println(drawing);
    }
}
