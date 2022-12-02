/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bigdata.k8s.util;

import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *  logger utils
 */
public class LoggerUtils {

    /**
     * rules for extracting application ID
     */

    /**
     * Task Logger's prefix
     */
    public static final String TASK_LOGGER_INFO_PREFIX = "TASK";

    /**
     * Task Logger Thread's name
     */
    public static final String TASK_LOGGER_THREAD_NAME = "TaskLogInfo";

    /**
     * Task Logger Thread's name
     */
    public static final String TASK_APPID_LOG_FORMAT = "[taskAppId=";

    /**
     * build job id
     *
     * @param affix         Task Logger's prefix
     * @param processDefId  process define id
     * @param processInstId process instance id
     * @param taskId        task id
     * @return task id format
     */
    public static String buildTaskId(String affix,
                                  int processDefId,
                                  int processInstId,
                                  int taskId){
        // - [taskAppId=TASK_79_4084_15210]
        return String.format(" - %s%s-%s-%s-%s]",TASK_APPID_LOG_FORMAT,affix,
                processDefId,
                processInstId,
                taskId);
    }



}