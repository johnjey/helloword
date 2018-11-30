package com.cotx.test;

import com.cotx.client.BridgeConfigClient;
import com.cotx.ovsctl.message.ovsdb.ovs.core.OvsController;
import com.cotx.server.Server;
import com.cotx.service.BridgeConfigImpl;
import org.junit.Test;

public class TestBridgeConfig {

    /**
     * BridgeConfig interface server
     * @throws Exception
     */
    @Test
    public void testBridgeConfig() throws Exception {
        Server.start(new BridgeConfigImpl());
        Server.blockUntilShutDown();
    }

    @Test
    public void testAddController() throws InterruptedException {
        BridgeConfigClient client = new BridgeConfigClient(50051, "127.0.0.1");
        try {
            OvsController.Builder ovsControllerBuilder = OvsController.newBuilder();
            ovsControllerBuilder.setTarget("cotx");
            ovsControllerBuilder.setMaxBackoff(1L);
            OvsController controller = ovsControllerBuilder.build();
            client.addController("bridgeName:br-i",controller);
        }finally {
            client.shutDown();
        }
    }

}
