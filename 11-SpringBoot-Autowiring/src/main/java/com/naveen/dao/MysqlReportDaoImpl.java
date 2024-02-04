package com.naveen.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("mysql")
@Primary
public class MysqlReportDaoImpl implements ReportDao{

	public MysqlReportDaoImpl() {
		System.out.println("MysqlReportDaoImpl :: Constructor");
	}

	@Override
	public String findData() {
		System.out.println("fetching report data from MySql db...");
		return "Report Data";
	}
}
