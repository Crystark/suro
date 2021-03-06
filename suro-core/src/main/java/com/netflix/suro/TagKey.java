/*
 * Copyright 2013 Netflix, Inc.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.netflix.suro;

public class TagKey {
    public static final String APP = "suro.app";
    public static final String DATA_SOURCE = "suro.datasource";
    public static final String SENT_COUNT = "sentMessageCount";
    public static final String RECV_COUNT = "receivedMessageCount";
    public static final String LOST_COUNT = "lostMessageCount";
    public static final String DROPPED_COUNT = "droppedMessageCount";
    public static final String RESTORED_COUNT = "restoredMessageCount";
    public static final String RETRIED_COUNT = "retriedCount";
    public static final String ROUTING_KEY = "routingKey";
    public static final String REJECTED_REASON = "rejectedReason";
}
