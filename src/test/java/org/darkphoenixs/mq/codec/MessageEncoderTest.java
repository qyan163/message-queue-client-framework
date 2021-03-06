package org.darkphoenixs.mq.codec;

import org.darkphoenixs.mq.exception.MQException;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class MessageEncoderTest {

    @Test
    public void test() throws Exception {

        MessageEncoderImpl encoder = new MessageEncoderImpl();

        Assert.assertArrayEquals("abc".getBytes("UTF-8"), encoder.encode("abc"));
        Assert.assertArrayEquals("哈哈".getBytes("UTF-8"), encoder.encode("哈哈"));

        List<String> list = new ArrayList<String>();
        list.add("啦啦");
        list.add("哈哈");

        Assert.assertArrayEquals("啦啦".getBytes("UTF-8"), encoder.batchEncode(list).get(0));
        Assert.assertArrayEquals("哈哈".getBytes("UTF-8"), encoder.batchEncode(list).get(1));
    }

    private class MessageEncoderImpl extends MQMessageEncoderAdapter<String> {

        @Override
        public byte[] encode(String message) throws MQException {

            try {
                return message.getBytes("UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            return null;
        }
    }
}
