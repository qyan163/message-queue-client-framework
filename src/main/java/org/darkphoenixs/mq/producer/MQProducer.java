/*
 * Copyright 2015-2016 Dark Phoenixs (Open-Source Organization).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.darkphoenixs.mq.producer;

import org.darkphoenixs.mq.exception.MQException;

/**
 * <p>Title: MQProducer</p>
 * <p>Description: 生产者接口</p>
 *
 * @author Victor.Zxy
 * @version 1.0
 * @since 2015-06-01
 */
public interface MQProducer<T> {

    /**
     * <p>Title: send</p>
     * <p>Description: 发送消息</p>
     *
     * @param message 消息
     * @throws MQException MQ异常
     */
    void send(T message) throws MQException;

    /**
     * <p>Title: getProducerKey</p>
     * <p>Description: 生产者标识</p>
     *
     * @return 生产者标识
     * @throws MQException MQ异常
     */
    String getProducerKey() throws MQException;

}
