package com.lxw.websocket.handler;

import org.springframework.web.socket.*;

/**
 * Created by lxw on 2017/7/24.
 */
public class LiveSocketHandler implements WebSocketHandler {
    @Override
    public void afterConnectionEstablished(WebSocketSession webSocketSession) throws Exception {
        webSocketSession.sendMessage(new TextMessage("加入成功"));

    }

    @Override
    public void handleMessage(WebSocketSession webSocketSession, WebSocketMessage<?> webSocketMessage) throws Exception {

    }

    @Override
    public void handleTransportError(WebSocketSession webSocketSession, Throwable throwable) throws Exception {

    }

    @Override
    public void afterConnectionClosed(WebSocketSession webSocketSession, CloseStatus closeStatus) throws Exception {
        webSocketSession.sendMessage(new TextMessage("离开房间"));
    }

    @Override
    public boolean supportsPartialMessages() {
        return false;
    }
}
