package partner.cn.demo4quartz.demo2;

import lombok.extern.slf4j.Slf4j;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.Trigger;

/**
 * @author qiao.yongxin
 * @date 2015年9月7日
 */
@Slf4j
public class HelloJob implements Job {

    public void execute(JobExecutionContext context) throws JobExecutionException {
        Trigger trigger = context.getTrigger();
        log.info(
                "job triggered,nextFireTime:{},endTime:{},finalFireTime:{},**********",
                new Object[] {trigger.getNextFireTime(), trigger.getEndTime(),
                        trigger.getFinalFireTime()});
    }
}
