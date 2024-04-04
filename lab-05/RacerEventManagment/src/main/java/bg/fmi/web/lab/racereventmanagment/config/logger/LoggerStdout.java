package bg.fmi.web.lab.racereventmanagment.config.logger;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("Local")
@Component
public class LoggerStdout implements Logger{
    @Value("${config.logger.level}")
    private String level;
    private LoggerLevel systemLoggerLevel;

    @PostConstruct
    public void setup(){
        systemLoggerLevel=LoggerLevel.valueOf(level);
    }
    @Override
    public void info(Object toLog) {
        if(LoggerLevel.INFO.getCode().compareTo(systemLoggerLevel.getCode())>=0) {
            System.out.println(toLog);
        }
    }

    @Override
    public void debug(Object toLog) {
        if(LoggerLevel.DEBUG.getCode().compareTo(systemLoggerLevel.getCode())>=0) {
            System.out.println(toLog);
        }
    }

    @Override
    public void trace(Object toLog) {
        if(LoggerLevel.TRACE.getCode().compareTo(systemLoggerLevel.getCode())>=0) {
            System.out.println(toLog);
        }
    }

    @Override
    public void error(Object toLog) {
        if(LoggerLevel.ERROR.getCode().compareTo(systemLoggerLevel.getCode())>=0) {
            System.out.println(toLog);
        }
    }
}
