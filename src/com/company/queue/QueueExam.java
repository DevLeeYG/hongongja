package com.company.queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExam {
    public static void main(String[] args) {
        Queue<Message> messageQueue = new LinkedList<>();

        messageQueue.offer(new Message("sendMail","홍길동"));
        messageQueue.offer(new Message("sendSMS","신용권"));
        messageQueue.offer(new Message("sendKakaotalk","홍두께"));


        while (!messageQueue.isEmpty()){
            Message message = messageQueue.poll();
            System.out.println(message.command);
        }



    }


}
