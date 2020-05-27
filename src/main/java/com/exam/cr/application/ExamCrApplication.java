package com.exam.cr.application;

import com.rabbitmq.client.Channel;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.*;

@SpringBootApplication(scanBasePackages = "com.exam.cr")
@MapperScan(basePackages = "com.exam.cr.dao")
public class ExamCrApplication {

    private ExecutorService ex= Executors.newFixedThreadPool(10);

    public static void main(String[] args) {
        SpringApplication.run(ExamCrApplication.class, args);
    }

    @RabbitListener(bindings = {
            @QueueBinding(value =@Queue(value = "dead-queue",durable = "ture"),
            exchange = @Exchange(name = "dead-exchange",type = "fanout"))
    })
    public void handle(Channel channel, Message message){
        Callable<Object> callable = new Callable<Object>(){
            @Override
            public Object call() throws Exception {
                Object o = new Object();
                return o;
            }
        };
        FutureTask futureTask = new FutureTask<>(callable);

        ex.submit(futureTask);
        Object o = null;
        try {
            o = futureTask.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        if(o!=null){//这样可以根据判断执行后续的相关操作
            //进行相关操作后
            try {
                //第二个参数true为批量确认，false为该条消息成功
                channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
