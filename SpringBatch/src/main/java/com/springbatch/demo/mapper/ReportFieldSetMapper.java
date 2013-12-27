package com.springbatch.demo.mapper;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.springbatch.demo.model.Report;

public class ReportFieldSetMapper implements FieldSetMapper<Report>{

	public Report mapFieldSet(FieldSet fieldSet) throws BindException {
		Report report = new Report();
		report.setId(fieldSet.readInt(0));
		report.setSales(fieldSet.readBigDecimal(1));
		report.setQuantity(fieldSet.readInt(2));
		report.setStaffName(fieldSet.readString(3));
		String date = fieldSet.readString(4);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			report.setDate(dateFormat.parse(date));
		} catch (ParseException e) {
			e.printStackTrace();
		}
 
		return report;
	}
	
}
