package com.currentcad.sdk.drawing;

import com.current.tps.sdk.sdk.SDK;

/**
 * 删除图纸
 */
public class DelDrawing {

    public static void main(String[] args) {
        SDK sdk = new SDK();
        //由公司颁发的账号密码
        sdk.setUsername("xxxxxxxxx");
        sdk.setPassword("xxxxxx");
        //图纸id
        sdk.delDrawing("xxxxxx");
    }
}
