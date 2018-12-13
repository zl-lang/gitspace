package cn.forwaves.design.subscribe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Publisher
 *
 * @author zhanlang
 * @date 2018/12/13 15:51
 */
public class Publisher implements IPublish {

    private List<ISubscribeDispatch> dispatchers = new ArrayList<ISubscribeDispatch>(1);

    public void register(ISubscribeDispatch dispatcher) {
        if(dispatcher == null){
            return;
        }
        dispatchers.add(dispatcher);
    }

    public void sendMsg(ISubscribeMessage message) {

        if(dispatchers.isEmpty()){
            return;
        }
        Iterator<ISubscribeDispatch> it = dispatchers.iterator();
        while(it.hasNext()){
            ISubscribeDispatch dispatcher = it.next();
            if(dispatcher != null){
                dispatcher.notifySubscriber(message);
            }else{
                dispatchers.remove(null);
            }
        }
    }

}
