package no.hvl.dat110.system.display;

import no.hvl.dat110.TODO;
import no.hvl.dat110.rpc.RPCRemoteImpl;
import no.hvl.dat110.rpc.RPCUtils;
import no.hvl.dat110.rpc.RPCServer;

public class DisplayImpl extends RPCRemoteImpl {

    public DisplayImpl(byte rpcid, RPCServer displayserver) {
        super(rpcid, displayserver);
    }

    public void write(String message) {
        System.out.println("DISPLAY:" + message);
    }

    public byte[] invoke(byte[] param) {

        byte[] returnvall = null;

        // TODO - START:
        // implement unmarshalling, call, and marshall for write RPC method
        // look at how this is done in the SensorImpl class for the read method


        // TODO - END

        String s = RPCUtils.unmarshallString(param);
        write(s);
        returnvall = RPCUtils.marshallVoid();

        //if (true)
          //  throw new UnsupportedOperationException(TODO.method());


        return returnvall;
    }

    public void register(byte rpcid, RPCRemoteImpl rpcRemoteImpl) {
        // TODO Auto-generated method stub

    }
}
