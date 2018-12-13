package cn.forwaves.design.subscribe;

/**
 * ISubscribeDispatch
 *
 * @author zhanlang
 * @date 2018/12/13 15:46
 */
public interface ISubscribeDispatch {

    /**
     *
     * @param subscriber
     */
    void addSubscriber(ISubscribe subscriber);

    /**
     *
     * @param message
     */
    void notifySubscriber(ISubscribeMessage message);

}
