package com.naveen.service;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.naveen.dao.MysqlReportDaoImpl;
import com.naveen.dao.OracleReportDaoImpl;
import com.naveen.dao.ReportDao;

@Service
public class ReportService {
	
//	@Autowired
	private OracleReportDaoImpl reportDao1;

	private MysqlReportDaoImpl reportDao2;
	
//	Partial injection is possible in only setter injection, Partial Injection is not possible in CI 
	public void setReportDao1(OracleReportDaoImpl reportDao1) {
		this.reportDao1 = reportDao1;
	}
	
	@Autowired //Partial Injection
	public void setReportDao2(MysqlReportDaoImpl reportDao2) {
		this.reportDao2 = reportDao2;
	}
	
	
//	@Autowired //Field Injection
//	private ReportDao reportDao;

	
	/*
	@Autowired //Field Injection
	private ReportDao reportDao;
	
	
	@Autowired //Setter Injection
//	@Qualifier("oracle")
	public void setReportDao(ReportDao reportDao) {
		System.out.println("setReportDao() method called...");
		this.reportDao = reportDao;
	}
	
	public ReportService() {
		System.out.println("ReportService :: 0 - Param Constructor called...");
	}
	
	@Autowired // Constructor Injection
	public ReportService(ReportDao reportDao) {
		System.out.println("ReportService :: Param Constructor called...");
		this.reportDao = reportDao;
	} */
	

	public void generateReport() {
//		reportDao1.findData(); //for SI & CI
		reportDao2.findData(); // for FI
		System.out.println("generating report....");
	}
}
