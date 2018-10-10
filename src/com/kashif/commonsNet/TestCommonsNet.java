package com.kashif.commonsNet;

import org.apache.commons.net.util.SubnetUtils;

public class TestCommonsNet {
	
	private static String trustedIPs = "0.0.0.0/0";

	public static void main(String[] args)  {
		
		System.out.println("istrustedIP " + isTrustedIpAddress("27.0.0.1"));
		
	}

	
	private static boolean isTrustedIpAddress(String remoteAddr) {
		if(trustedIPs != null) {
			String[] trustedIps = trustedIPs.split(",");

			for (String ip : trustedIps) {
				SubnetUtils utils = new SubnetUtils(ip);
				utils.setInclusiveHostCount(true);

				if (utils.getInfo().isInRange(remoteAddr)) {
					return  true;
				}
			}
		}
		return false;
	}

}
