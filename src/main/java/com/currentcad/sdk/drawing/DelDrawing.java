package com.currentcad.sdk.drawing;

import com.current.servicemanager.sdk.service.SDKService;

/**
 * 删除图纸
 * @author hp
 */
public class DelDrawing {

    public static void main(String[] args) {
        //由公司颁发的账号密码
        SDKService sdk = new SDKService("xxxxxxxxxx", "xxxxxx", "");
        //图纸id
        sdk.delDrawing("xxxxxx");
    }
}
