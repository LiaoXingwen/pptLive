package com.lxw.websocket.config;

import com.lxw.websocket.handler.LiveSocketHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

/**
 * Created by lxw on 2017/7/24.
 */
@Configuration
@EnableWebMvc
@EnableWebSocket
public class LiveSocketConfig extends WebMvcConfigurerAdapter implements WebSocketConfigurer {


    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry webSocketHandlerRegistry) {
        webSocketHandlerRegistry.addHandler(new LiveSocketHandler(), "/liveSocket").setAllowedOrigins("*") ;
        webSocketHandlerRegistry.addHandler(new LiveSocketHandler(), "/js/liveSocket").setAllowedOrigins("*").withSockJS() ;
    }
}
