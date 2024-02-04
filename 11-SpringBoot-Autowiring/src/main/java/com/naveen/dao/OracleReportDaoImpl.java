package com.naveen.dao;

import org.springframework.stereotype.Repository;

@Repository("oracle")
public class OracleReportDaoImpl implements ReportDao{

	public OracleReportDaoImpl() {
		System.out.println("OracleReportDaoImpl :: Constructor");
	}

	@Override
	public String findData() {
		System.out.println("fetching report data from Oracle db...");
		return "Report Data";
	}
}
