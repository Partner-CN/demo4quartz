package partner.cn.demo4quartz.demo0;

import lombok.extern.slf4j.Slf4j;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @author qiao.yongxin
 * @date 2015年9月7日
 */
@Slf4j
public class HelloJob implements Job {

    public void execute(JobExecutionContext context) throws JobExecutionException {
        log.info("job triggered,**********");
    }

}
