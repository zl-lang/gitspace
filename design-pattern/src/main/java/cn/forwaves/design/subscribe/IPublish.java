package cn.forwaves.design.subscribe;

/**
 * IPublish
 *
 * @author zhanlang
 * @date 2018/12/13 15:42
 */
public interface IPublish {

    /**
     *
     * @param dispatcher
     */
    void register(ISubscribeDispatch dispatcher);

    /**
     *
     * @return
     */
    void sendMsg(ISubscribeMessage message);

}
