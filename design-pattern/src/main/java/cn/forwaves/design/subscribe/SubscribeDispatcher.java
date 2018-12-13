package cn.forwaves.design.subscribe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * SubscribeDispatcher
 *
 * @author zhanlang
 * @date 2018/12/13 16:06
 */
public class SubscribeDispatcher implements ISubscribeDispatch {

    private List<ISubscribe> subscribers = new ArrayList<ISubscribe>();

    public void addSubscriber(ISubscribe subscriber) {
        if(subscriber == null){
            return;
        }
        subscribers.add(subscriber);
    }

    public void notifySubscriber(ISubscribeMessage message) {
        if(subscribers.isEmpty()){
            return;
        }
        Iterator<ISubscribe> it = subscribers.iterator();
        ISubscribe subscriber = null;
        while(it.hasNext()){
            subscriber = it.next();
            if(subscriber != null){
                subscriber.recieve(message);
            }else{
                subscribers.remove(null);
            }
        }

    }
}
