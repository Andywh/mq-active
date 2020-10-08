package com.joy.activemq;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.camel.component.ActiveMQConfiguration;

/**
 * Created by Ai Lun on 2020-10-08.
 */
public class Sender {

    public static void main(String[] args) {
        // 1. 获取连接工厂
        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory();

        // 2. 获取一个向ActiveMQ的连接

        // 3. 获取 session

        // 4. 找目的地，获取 destination.
        // 消费端，也会从这个目的地取消息

        // 5. 向目的地写入消息

        // 6. 关闭连接



    }



}
