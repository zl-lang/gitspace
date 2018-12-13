package cn.forwaves.design.subscribe;

/**
 * SubscribeMessage
 *
 * @author zhanlang
 * @date 2018/12/13 16:34
 */
public class SubscribeMessage implements ISubscribeMessage {

    private String content;

    public SubscribeMessage(String content){
        this.content = content;
    }

    public void printMsg() {
        System.out.println(content);
    }
}
