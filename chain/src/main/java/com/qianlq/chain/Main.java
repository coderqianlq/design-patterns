package com.qianlq.chain;

import com.qianlq.chain.example.FirstHandler;
import com.qianlq.chain.example.Handler;
import com.qianlq.chain.example.SecondHandler;
import com.qianlq.chain.example.ThirdHandler;

/**
 * @author CoderQian
 * @date 2019-06-28 11:55 PM
 * @concat <a href="mailto:qianlq0824@gmail.com">qianlq0824@gmail.com</a>
 */

public class Main {

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
        Handler handler = Main.getChainOfHandlers();
        handler.handleRequest("handler");
    }
}
