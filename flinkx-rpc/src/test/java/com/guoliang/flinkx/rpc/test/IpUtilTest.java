package com.guoliang.flinkx.rpc.test;

import com.guoliang.flinkx.rpc.util.IpUtil;

import java.net.UnknownHostException;

/**
 * @author xuxueli 2018-10-23
 */
public class IpUtilTest  {

    public static void main(String[] args) throws UnknownHostException {
        System.out.println(IpUtil.getIp());
        System.out.println(IpUtil.getIpPort(8080));
    }

}
