package com.springbatch.demo.itemprocessor;

import org.springframework.batch.item.ItemProcessor;

import com.springbatch.demo.model.Report;

public class CustomItemProcessor implements ItemProcessor<Report, Report>{

	public Report process(Report report) throws Exception {
		System.out.println("Processing... "+report);
		return report;
	}

}
