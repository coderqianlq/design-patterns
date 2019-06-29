package com.qianlq.chain;

import com.qianlq.chain.object.FirstHandler;
import com.qianlq.chain.object.Handler;
import com.qianlq.chain.object.SecondHandler;
import com.qianlq.chain.object.ThirdHandler;

/**
 * @author qianliqing
 * @date 2019-06-28 11:55 PM
 * mail: qianlq0824@gmail.com
 */

public class ChainPatternDemo {

    private static Handler getChainOfHandlers() {

        Handler firstHandler = new FirstHandler();
        Handler secondHandler = new SecondHandler();
        Handler thirdHandler = new ThirdHandler();

        firstHandler.setNextHandler(secondHandler);
        secondHandler.setNextHandler(thirdHandler);
        thirdHandler.setNextHandler(thirdHandler);

        return firstHandler;
    }

    public static void main(String[] args) {
        Handler handler = ChainPatternDemo.getChainOfHandlers();
        handler.handleRequest("handler");
    }
}
