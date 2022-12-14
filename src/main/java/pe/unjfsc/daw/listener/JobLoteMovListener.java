package pe.unjfsc.daw.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.stereotype.Component;

@Component
public class JobLoteMovListener extends JobExecutionListenerSupport{
	  private static final Logger LOGGER = LoggerFactory.getLogger(JobLoteMovListener.class);
	   
	  @Override
	  public void afterJob(JobExecution jobExecution) {
	      if (jobExecution.getStatus() == BatchStatus.COMPLETED) {
	          LOGGER.info("JobLoteMovimientos Termino!!!");
	      }
	  }
}