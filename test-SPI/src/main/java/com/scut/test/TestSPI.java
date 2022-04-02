package com.scut.test;

import com.scut.api.impl.ExtensionLoader;
import com.scut.bs.SpiBs;
import com.scut.commonImpl.Protocol;
import com.scut.commonImpl.Say;

public class TestSPI {

    public static void main(String[] args) {
        ExtensionLoader<Protocol> load = SpiBs.load(Protocol.class);
        Protocol protocol = load.getExtension("tcp");
        protocol.getProtocol();
    }
}
