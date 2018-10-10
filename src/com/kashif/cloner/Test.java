package com.kashif.cloner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.rits.cloning.Cloner;

public class Test {
public static void main(String[] args)  {
		
		Map<String, Object> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		list.add(1);
		map.put("key", list);
		
		Cloner cloner=new Cloner();
		Map<String, Object> clone = cloner.deepClone(map);
		
		
		List<Integer> cloneList = (List<Integer>) clone.get("key");
		cloneList.add(2);
		
		
		System.out.println(map);
		System.out.println(clone);
	}	

}
