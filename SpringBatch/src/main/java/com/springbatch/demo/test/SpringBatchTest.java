package com.springbatch.demo.test;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBatchTest {

	public static void main(String[] args) {
		String[] springConfig = {"spring/batch/jobs/job-details.xml"};
		
		ApplicationContext context = new ClassPathXmlApplicationContext(springConfig);
		
		JobLauncher launcher = (JobLauncher)context.getBean("jobLauncher");
		Job job = (Job) context.getBean("testSpringBatchJob");
		
		try{
			JobExecution execution = launcher.run(job, new JobParameters());
			System.out.println("Exit Status : " + execution.getStatus());
		}catch (Exception e) {
			e.printStackTrace();
		}
	 
		System.out.println("Done");
	}
		
}
