package partner.cn.demo4quartz.demo1;

import static org.quartz.DateBuilder.futureDate;
import static org.quartz.DateBuilder.IntervalUnit.SECOND;
import static org.quartz.JobBuilder.newJob;
import static org.quartz.SimpleScheduleBuilder.simpleSchedule;
import static org.quartz.TriggerBuilder.newTrigger;
import static org.quartz.TriggerKey.triggerKey;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.Trigger;

/**
 * @author qiao.yongxin
 * @date 2015年9月7日
 */
public class Startup {

    public static void main(String[] args) throws Exception {
        SchedulerFactory schedFact = new org.quartz.impl.StdSchedulerFactory();
        Scheduler scheduler = schedFact.getScheduler();
        scheduler.start();
        JobDetail job = newJob(HelloJob.class).withIdentity("myJob").build();
        Trigger trigger =
                newTrigger().withIdentity(triggerKey("myTrigger", "myTriggerGroup"))
                        .withSchedule(simpleSchedule().withIntervalInSeconds(10).repeatForever())
                        .startAt(futureDate(10, SECOND)).build();

        scheduler.scheduleJob(job, trigger);
    }
}
