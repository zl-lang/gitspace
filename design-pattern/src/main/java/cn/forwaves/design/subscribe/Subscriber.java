package cn.forwaves.design.subscribe;

/**
 * Subscriber
 *
 * @author zhanlang
 * @date 2018/12/13 16:14
 */
public class Subscriber implements ISubscribe {

    public void register(ISubscribeDispatch dispatcher) {
        if(dispatcher == null){
            return;
        }
        dispatcher.addSubscriber(this);
    }

    public void recieve(ISubscribeMessage message) {
        message.printMsg();
    }
}
