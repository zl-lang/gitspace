package cn.forwaves.design.subscribe;

/**
 * Test
 *
 * @author zhanlang
 * @date 2018/12/13 16:36
 */
public class Test {

    public static void main(String[] args){

        SubscribeMessage message1 = new SubscribeMessage("消息1");
        SubscribeMessage message2 = new SubscribeMessage("消息2");

        Publisher publisher1 = new Publisher();
        Publisher publisher2 = new Publisher();

        SubscribeDispatcher dispatcher1 = new SubscribeDispatcher();
        SubscribeDispatcher dispatcher2 = new SubscribeDispatcher();

        Subscriber subscriber1 = new Subscriber();
        Subscriber subscriber2 = new Subscriber();
        Subscriber subscriber3 = new Subscriber();

        publisher1.register(dispatcher1);
        publisher1.register(dispatcher2);
        publisher2.register(dispatcher2);

        subscriber1.register(dispatcher1);
        subscriber1.register(dispatcher2);
        subscriber2.register(dispatcher2);
        subscriber3.register(dispatcher2);

        publisher1.sendMsg(message1);
        publisher2.sendMsg(message2);
    }

}
