package cn.forwaves.design.subscribe;

/**
 * ISubscribe
 *
 * @author zhanlang
 * @date 2018/12/13 15:50
 */
public interface ISubscribe {

    /**
     *
     * @param dispatcher
     */
    void register(ISubscribeDispatch dispatcher);

    /**
     *
     * @param message
     */
    void recieve(ISubscribeMessage message);

}
