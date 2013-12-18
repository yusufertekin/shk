package com.deloitte.shk.util;

import java.util.Date;


/**
 * 
 */
public class FuncUtils {
	public static Integer getYilbasindanBeriGecenGun(Date tarih){
		return (tarih.getMonth()+1)*30;
	}
}

