package com.company.exam01;

public class DembCellPhoneExample {
    public static void main(String[] args) {


        DmbCellPhone dmbCellPhone = new DmbCellPhone("iphone","spacegray",10);
        //model

        System.out.println("모델 : " + dmbCellPhone.model );
        System.out.println("색상 : " + dmbCellPhone.color );

        System.out.println("채널 : " + dmbCellPhone.channel);

        dmbCellPhone.powerOn();
        dmbCellPhone.bell();
        dmbCellPhone.sendVoice("여보세요.");
        dmbCellPhone.receiveVoice("안녕하세요! 저는 홍길동입니다");
        dmbCellPhone.sendVoice("넵 안녕하세요ㅋㅋ");
        dmbCellPhone.hangUp();

        dmbCellPhone.turnOnDmb();
        dmbCellPhone.changeChannelDmb(12);
        dmbCellPhone.turnOffDmb();

    }
}
