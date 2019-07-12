package com.qianlq.chain;

import com.qianlq.chain.example.FirstHandler;
import com.qianlq.chain.example.Handler;
import com.qianlq.chain.example.SecondHandler;
import com.qianlq.chain.example.ThirdHandler;

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
