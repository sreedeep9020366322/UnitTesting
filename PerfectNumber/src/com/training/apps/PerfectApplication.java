package com.training.apps;

import com.training.domain.FindPerfectNumber;

public class PerfectApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FindPerfectNumber findPerfectNum = new FindPerfectNumber(24);
		
		System.out.println(findPerfectNum.isPerfect());
	}

}
